package visitor.codegen;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.statement.Assigment;
import ast.statement.Function;
import ast.statement.If;
import ast.statement.Read;
import ast.statement.Return;
import ast.statement.While;
import ast.statement.Write;
import ast.type.FunctionType;
import ast.type.VoidType;
import visitor.AbstractVisitor;
import visitor.Visitor;

/**
 * This class corresponds to the code function execute, which generates the code
 * to execute statements and definitions.
 * 
 * @author Ángel García Menéndez
 *
 */
public class ExecuteCGVisitor extends AbstractVisitor<Void, Void> {

	private String source;
	private Visitor<Void, Void> addressVisitor;
	private Visitor<Void, Void> valueVisitor;
	private CodeGenUtils utils = new CodeGenUtils();
	private int cg = 0;
	private FunctionDefinition currentFunction = null; // small hack, when we enter a function, we will store it here so
														// we could access it from the return
	/**
	 * 
	 * @param source: name of the source file to compile
	 */
	public ExecuteCGVisitor(String source) {
		this.source = source;
	}
	
	/**
	 * Set the address visitor to implement the address code function
	 * @param addressVisitor
	 */
	public void setAddressVisitor(Visitor<Void, Void> addressVisitor) {
		this.addressVisitor = addressVisitor;
	}
	/**
	 * Set the value visitor to implement the value code function
	 * 
	 * @param valueVisitor
	 */
	public void setValueVisitor(Visitor<Void, Void> valueVisitor) {
		this.valueVisitor = valueVisitor;
	}

	@Override
	public Void visit(Program e, Void param) {
		StringBuilder code = new StringBuilder();
		code.append("#source \"" + source + "\"\n");
		//we have guaranteed that there exists a main function from the semantic phase
		addInstruction("call main", code);
		//once everything is done, stop
		addInstruction("halt", code);
		//iterate the definitions and generate its code
		e.getDefinitions().forEach(def -> {
			def.accept(this, param);
			code.append(def.getCode());
		});
		e.setCode(code.toString());
		return null;
	}

	/*-------------DEFINITIONS-------------*/

	@Override
	public Void visit(FunctionDefinition e, Void param) {
		StringBuilder code = new StringBuilder();
		FunctionType type = (FunctionType) e.getType();
		currentFunction = e;
		addInstruction(e.getName() + ":", code); // we set the name of the function
		writeComment("Parameters", code);
		type.getParamType().forEach(p -> {
			writeComment(p.getType().getName() + " " + e.getName() + "(offset " + e.getOffset() + ")", code);
		});
		writeComment("Local Variables", code);

		addInstruction("enter " + type.getLocalVarsSize(), code); // allocate memory for its local variables
		e.getBody().forEach(element -> {
			element.accept(this, param);
			code.append(element.getCode());
		}); // we iterate the body
		if (type.getReturnType().getSizeBytes() == 0) {
			// no explicit return statement
			String instruction = "ret " + type.getReturnType().getSizeBytes() + ", " + type.getLocalVarsSize() + ", "
					+ type.getSizeParams();
			addInstruction(instruction, code);
		}
		e.setCode(code.toString());
		return null;
	}

	@Override
	public Void visit(VariableDefinition e, Void param) {
		//MAPL already takes care of this for us. Nonetheless, comments are important
		StringBuilder code = new StringBuilder();
		writeComment(e.getType().getName() + " " + e.getName() + "(offset " + e.getOffset() + ")", code);
		e.setCode(code.toString());
		return null;
	}

	/*-------------STATEMENTS-------------*/

	@Override
	public Void visit(Assigment e, Void param) {
		StringBuilder code = new StringBuilder();
		writeLine(e.getLeft().getLine(), code);
		// on the left we need the address
		e.getLeft().accept(addressVisitor, param);
		code.append(e.getLeft().getCode());
		// and on the right the value
		e.getRight().accept(valueVisitor, param);
		code.append(e.getRight().getCode());
		addInstruction("store" + utils.toSuffix(e.getLeft().getType().getName()), code);
		e.setCode(code.toString());
		return null;
	}

	@Override
	public Void visit(Read e, Void param) {
		StringBuilder code = new StringBuilder();
		writeLine(e.getArguments().get(0).getLine(), code);
		e.getArguments().forEach(arg -> {
			arg.accept(addressVisitor, param);// we need the addresses, not the values, as we will store the input+
			code.append(arg.getCode());
			addInstruction("in" + utils.toSuffix(arg.getType().getName()), code);
			addInstruction("store" + utils.toSuffix(arg.getType().getName()), code);
		});
		e.setCode(code.toString());
		return null;
	}

	@Override
	public Void visit(Return e, Void param) {
		StringBuilder code = new StringBuilder();
		writeLine(e.getValue().getLine(), code);
		e.getValue().accept(valueVisitor, param); // we need the value to return
		code.append(e.getValue().getCode());
		FunctionType funcType = (FunctionType) currentFunction.getType();
		int bytesReturn = funcType.getReturnType().getSizeBytes();
		int bytesLocals = funcType.getLocalVarsSize();
		int bytesParams = funcType.getSizeParams();
		String instruction = "ret " + bytesReturn + ", " + bytesLocals + ", " + bytesParams;
		addInstruction(instruction, code);
		e.setCode(code.toString());
		return null;
	}

	@Override
	public Void visit(While e, Void param) {
		StringBuilder code = new StringBuilder();
		writeLine(e.getCondition().getLine(), code);
		int labelNumber = cg;
		cg += 2;
		addInstruction("label" + labelNumber + ":", code);
		e.getCondition().accept(valueVisitor, param);// we get the value of the condition
		code.append(e.getCondition().getCode());
		addInstruction("jz label" + (labelNumber + 1), code);
		e.getBody().forEach(element -> {
			element.accept(this, param);
			code.append(element.getCode());
		});
		addInstruction("jmp label" + labelNumber, code);
		addInstruction("label" + (labelNumber + 1) + ":", code);
		e.setCode(code.toString());
		return null;
	}

	@Override
	public Void visit(Write e, Void param) {
		StringBuilder code = new StringBuilder();
		writeLine(e.getArguments().get(0).getLine(), code);
		// we iterate each of the arguments and output them
		e.getArguments().forEach(arg -> {
			arg.accept(valueVisitor, param);
			code.append(arg.getCode());
			addInstruction("out" + utils.toSuffix(arg.getType().getName()), code);
		});
		e.setCode(code.toString());
		return null;
	}

	@Override
	public Void visit(If e, Void param) {
		StringBuilder code = new StringBuilder();
		writeLine(e.getCondition().getLine(), code);
		int labelNumber = cg;// we get the current available number tag
		cg += 2;// we will need 2, so we increase in 2 the counter
		e.getCondition().accept(valueVisitor, param);// we examine the condition
		code.append(e.getCondition().getCode());
		addInstruction("jz label" + labelNumber, code);// if it is not met jump to the else label
		e.getThenBody().forEach(element -> {
			element.accept(this, param);
			code.append(element.getCode());
		}); // if it is met, execute the statements
		addInstruction("jmp label" + (labelNumber + 1), code);// jump to the end of the ifelse statement
		addInstruction("label" + labelNumber + ":", code);// else label
		e.getElseBody().forEach(element -> {
			element.accept(this, param);
			code.append(element.getCode());
		}); // execute the else (if it does not have one,
			// the list will be empty
		addInstruction("label" + (labelNumber + 1) + ":", code);// label for the end of the ifelse statement
		e.setCode(code.toString());
		return null;
	}

	@Override
	public Void visit(Function e, Void param) {
		StringBuilder code = new StringBuilder();
		writeLine(e.getLine(), code);
		// we traverse the function, storing the values of the parameters
		e.getParameters().forEach(p -> {
			p.accept(valueVisitor, param);
			code.append(p.getCode());
		});
		addInstruction("call " + e.getName().getName(), code);
		boolean isVoid = ((FunctionType) e.getName().getType()).getReturnType().getName().equals(VoidType.NAME);
		if (!isVoid) {
			addInstruction("pop" + utils.toSuffix(((FunctionType) e.getName().getType()).getReturnType().getName()),
					code);
		}
		e.setCode(code.toString());
		return null;
	}

	private void addInstruction(String instruction, StringBuilder output) {
		output.append("\t" + instruction + "\n");
	}

	private void writeComment(String comment, StringBuilder output) {
		output.append("\t\' * " + comment + "\n");
	}

	private void writeLine(int line, StringBuilder output) {
		output.append("#line " + line + "\n");
	}
}
