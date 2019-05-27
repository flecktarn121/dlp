package visitor.codegen;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.ArrayAccess;
import ast.expression.BooleanNegation;
import ast.expression.Cast;
import ast.expression.FieldAccess;
import ast.expression.FunctionCall;
import ast.expression.UnaryMinus;
import ast.expression.Variable;
import ast.expression.binary.BinaryOperation;
import ast.expression.literal.CharacterLiteral;
import ast.expression.literal.IntegerLiteral;
import ast.expression.literal.RealLiteral;
import ast.statement.Assigment;
import ast.statement.Function;
import ast.statement.If;
import ast.statement.Read;
import ast.statement.Return;
import ast.statement.While;
import ast.statement.Write;
import ast.type.FunctionType;
import ast.type.RecordType;
import ast.type.StructType;
import ast.type.VoidType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class CodeGenerationVisitor extends AbstractVisitor<Boolean, Void> {
	private String source;
	private StringBuilder output = new StringBuilder();
	private CodeGenUtils utils = new CodeGenUtils();
	private int cg = 0;
	private FunctionDefinition currentFunction = null; // small hack, when we enter a function, we will store it here so
														// we could access it from the return

	public CodeGenerationVisitor(String source) {
		this.source = source;
	}

	public CodeGenerationVisitor(String source, StringBuilder out) {
		this.source = source;
		this.output = out;
	}

	@Override
	public Void visit(Program e, Boolean param) {
		output.append("#source \"" + source + "\"\n");
		addInstruction("call main");
		addInstruction("halt");
		super.visit(e, param);
		return null;
	}

	/*-------------DEFINITIONS-------------*/

	@Override
	public Void visit(FunctionDefinition e, Boolean param) {
		FunctionType type = (FunctionType) e.getType();
		currentFunction = e;
		addInstruction(e.getName() + ":"); // we set the name of the function
		writeComment("Parameters");
		type.getParamType().forEach(p -> {
			writeComment(p.getType().getName() + " " + e.getName() + "(offset " + e.getOffset() + ")");
		});
		writeComment("Local Variables");

		addInstruction("enter " + type.getLocalVarsSize()); // allocate memory for its local variables
		e.getBody().forEach(element -> element.accept(this, param)); // we iterate the body
		if (type.getReturnType().getSizeBytes() == 0) {
			// no explicit return statement
			String instruction = "ret " + type.getReturnType().getSizeBytes() + ", " + type.getLocalVarsSize() + ", "
					+ type.getSizeParams();
			addInstruction(instruction);
		}
		return null;
	}

	@Override
	public Void visit(VariableDefinition e, Boolean param) {
		writeComment(e.getType().getName() + " " + e.getName() + "(offset " + e.getOffset() + ")");
		super.visit(e, param);
		return null;
	}

	/*-------------STATEMENTS-------------*/

	@Override
	public Void visit(Assigment e, Boolean param) {
		writeLine(e.getLeft().getLine());
		// on the left we need the address
		e.getLeft().accept(this, false);
		// and on the right the value
		e.getRight().accept(this, true);
		addInstruction("store" + utils.toSuffix(e.getLeft().getType().getName()));
		return null;
	}

	@Override
	public Void visit(Read e, Boolean param) {
		writeLine(e.getArguments().get(0).getLine());
		e.getArguments().forEach(arg -> {
			arg.accept(this, false);// we need the addresses, not the values, as we will store the input+
			addInstruction("in" + utils.toSuffix(arg.getType().getName()));
			addInstruction("store" + utils.toSuffix(arg.getType().getName()));
		});
		return null;
	}

	@Override
	public Void visit(Return e, Boolean param) {
		writeLine(e.getValue().getLine());
		super.visit(e, true); // we need the value to return
		FunctionType funcType = (FunctionType) currentFunction.getType();
		int bytesReturn = funcType.getReturnType().getSizeBytes();
		int bytesLocals = funcType.getLocalVarsSize();
		int bytesParams = funcType.getSizeParams();
		String instruction = "ret " + bytesReturn + ", " + bytesLocals + ", " + bytesParams;
		addInstruction(instruction);
		return null;
	}

	@Override
	public Void visit(While e, Boolean param) {
		writeLine(e.getCondition().getLine());
		int labelNumber = cg;
		cg += 2;
		addInstruction("label" + labelNumber + ":");
		e.getCondition().accept(this, true);// we get the value of the condition
		addInstruction("jz label" + (labelNumber + 1));
		e.getBody().forEach(element -> element.accept(this, param));
		addInstruction("jmp label" + labelNumber);
		addInstruction("label" + (labelNumber + 1) + ":");
		return null;
	}

	@Override
	public Void visit(Write e, Boolean param) {
		writeLine(e.getArguments().get(0).getLine());
		// we iterate each of the arguments and output them
		e.getArguments().forEach(arg -> {
			arg.accept(this, true);
			addInstruction("out" + utils.toSuffix(arg.getType().getName()));
		});
		return null;
	}

	@Override
	public Void visit(If e, Boolean param) {
		writeLine(e.getCondition().getLine());
		int labelNumber = cg;// we get the current available number tag
		cg += 2;// we will need 2, so we increase in 2 the counter
		e.getCondition().accept(this, true);// we examine the condition
		addInstruction("jz label" + labelNumber);// if it is not met jump to the else label
		e.getThenBody().forEach(element -> element.accept(this, param)); // if it is met, execute the statements
		addInstruction("jmp label" + (labelNumber + 1));// jump to the end of the ifelse statement
		addInstruction("label" + labelNumber + ":");// else label
		e.getElseBody().forEach(element -> element.accept(this, param)); // execute the else (if it does not have one,
																			// the list will be empty
		addInstruction("label" + (labelNumber + 1) + ":");// label for the end of the ifelse statement
		return null;
	}

	@Override
	public Void visit(Function e, Boolean param) {
		writeLine(e.getLine());
		// we traverse the function, storing the values of the parameters
		super.visit(e, true);
		addInstruction("call " + e.getName().getName());
		boolean isVoid = ((FunctionType) e.getName().getType()).getReturnType().getName().equals(VoidType.NAME);
		if (!isVoid) {
			addInstruction("pop" + utils.toSuffix(((FunctionType) e.getName().getType()).getReturnType().getName()));
		}
		return super.visit(e, param);
	}

	/*-------------EXPRESSIONS-------------*/
	@Override
	public Void visit(BooleanNegation e, Boolean param) {
		super.visit(e, param);
		addInstruction("not");
		return null;
	}

	@Override
	public Void visit(BinaryOperation e, Boolean param) {
		// we get the value of the first expression
		e.getLeft().accept(this, true);
		// the value of the second
		e.getRight().accept(this, true);
		// apply the operation over them
		addInstruction(utils.getOperator(e.getOperation()) + utils.toSuffix(e.getType().getName()));
		return null;
	}

	@Override
	public Void visit(ArrayAccess e, Boolean value) {
		// we want the address of the array we are accessing
		e.getArray().accept(this, false);
		// now the value of the index
		e.getPosition().accept(this, true);
		// we compute the address of the position
		addInstruction("pushi " + e.getType().getSizeBytes());
		addInstruction("muli");
		addInstruction("addi");
		// finally, if we need the value stored in the address, we load it
		if (value) {
			addInstruction("load" + utils.toSuffix(e.getType().getName()));
		}
		return null;
	}

	@Override
	public Void visit(Variable e, Boolean value) {
		if (e.getDefinition().getScope() == SymbolTable.GLOBAL_SCOPE) {
			addInstruction("pusha " + e.getDefinition().getOffset());
		} else {
			addInstruction("push bp");
			addInstruction("pushi " + e.getDefinition().getOffset());
			addInstruction("addi");
		}
		// if we need the value
		if (value) {
			addInstruction("load" + utils.toSuffix(e.getType().getName()));
		}
		return null;
	}

	@Override
	public Void visit(Cast e, Boolean param) {
		super.visit(e, param);
		String originalType = utils.toSuffix(e.getOperand().getType().getName());
		String newType = utils.toSuffix(e.getType().getName());
		addInstruction(originalType + "2" + newType);
		return null;
	}

	@Override
	public Void visit(FunctionCall e, Boolean param) {
		super.visit(e, param);
		// we get the name of the original function, which has been established in the
		// identification phase
		addInstruction("call " + e.getName().getName());
		return null;
	}

	@Override
	public Void visit(UnaryMinus e, Boolean param) {
		super.visit(e, param);
		addInstruction("not");
		return null;
	}

	@Override
	public Void visit(FieldAccess e, Boolean value) {
		super.visit(e, false);
		StructType type = (StructType) e.getStruct().getType();
		int offset = type.getOffsetForField(e.getFieldName());
		addInstruction("pushi " + offset);
		addInstruction("addi");
		if (value) {
			RecordType field = type.getField(e.getFieldName());
			addInstruction("load" + utils.toSuffix(field.getType().getName()));
		}
		return null;
	}

	/*-------------LITERALS-------------*/
	@Override
	public Void visit(CharacterLiteral e, Boolean param) {
		addInstruction("pushb " + (int) e.getValue());
		return null;
	}

	@Override
	public Void visit(RealLiteral e, Boolean param) {
		addInstruction("pushf " + e.getValue());
		return null;
	}

	@Override
	public Void visit(IntegerLiteral e, Boolean param) {
		addInstruction("pushi " + e.getValue());
		return null;
	}

	private void addInstruction(String instruction) {
		output.append("\t" + instruction + "\n");
	}

	private void writeComment(String comment) {
		output.append("\t\' * " + comment + "\n");
	}

	private void writeLine(int line) {
		output.append("#line " + line + "\n");
	}

}
