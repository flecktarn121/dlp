package visitor.codegen;

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
import ast.type.RecordType;
import ast.type.StructType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;
import visitor.Visitor;

/**
 * This class corresponds to the code function value, which generates the code
 * to get the value of expressions
 * 
 * @author Ángel García Menéndez
 *
 */
public class ValueCGVisitor extends AbstractVisitor<Void, Void> {

	private CodeGenUtils utils = new CodeGenUtils();
	private Visitor<Void, Void> addressVisitor;

	public void setAddressVisitor(Visitor<Void, Void> addressVisitor) {
		this.addressVisitor = addressVisitor;
	}

	@Override
	public Void visit(BooleanNegation e, Void param) {
		StringBuilder code = new StringBuilder();
		super.visit(e, param);
		code.append(e.getOperand().getCode());
		addInstruction("not", code);
		e.setCode(code.toString());
		return null;
	}

	@Override
	public Void visit(BinaryOperation e, Void param) {
		StringBuilder code = new StringBuilder();
		// we get the value of the first expression
		e.getLeft().accept(this, param);
		code.append(e.getLeft().getCode());
		// the value of the second
		e.getRight().accept(this, param);
		code.append(e.getRight().getCode());
		// apply the operation over them
		addInstruction(utils.getOperator(e.getOperation()) + utils.toSuffix(e.getType().getName()), code);
		e.setCode(code.toString());
		return null;
	}

	@Override
	public Void visit(ArrayAccess e, Void value) {
		StringBuilder code = new StringBuilder();
		// we want the address of the array we are accessing
		e.getArray().accept(addressVisitor, value);
		code.append(e.getArray().getCode());
		// now the value of the index
		e.getPosition().accept(this, value);
		code.append(e.getPosition().getCode());
		// we compute the address of the position
		addInstruction("pushi " + e.getType().getSizeBytes(), code);
		addInstruction("muli", code);
		addInstruction("addi", code);
		// finally, if we need the value stored in the address, we load it
		addInstruction("load" + utils.toSuffix(e.getType().getName()), code);
		e.setCode(code.toString());
		return null;
	}

	@Override
	public Void visit(Variable e, Void value) {
		StringBuilder code = new StringBuilder();
		if (e.getDefinition().getScope() == SymbolTable.GLOBAL_SCOPE) {
			addInstruction("pusha " + e.getDefinition().getOffset(), code);
		} else {
			addInstruction("push bp", code);
			addInstruction("pushi " + e.getDefinition().getOffset(), code);
			addInstruction("addi", code);
		}

		addInstruction("load" + utils.toSuffix(e.getType().getName()), code);
		e.setCode(code.toString());

		return null;
	}

	@Override
	public Void visit(Cast e, Void param) {
		StringBuilder code = new StringBuilder();
		super.visit(e, param);
		code.append(e.getOperand().getCode());
		String originalType = utils.toSuffix(e.getOperand().getType().getName());
		String newType = utils.toSuffix(e.getType().getName());
		addInstruction(originalType + "2" + newType, code);
		e.setCode(code.toString());
		return null;
	}

	@Override
	public Void visit(FunctionCall e, Void param) {
		StringBuilder code = new StringBuilder();
		super.visit(e, param);
		e.getParameters().forEach(par -> {
			par.accept(this, param);
			code.append(par.getCode());
		});
		// we get the name of the original function, which has been established in the
		// identification phase
		addInstruction("call " + e.getName().getName(), code);
		e.setCode(code.toString());
		return null;
	}

	@Override
	public Void visit(UnaryMinus e, Void param) {
		StringBuilder code = new StringBuilder();
		e.getOperand().accept(this, param);
		code.append(e.getOperand().getCode());
		addInstruction("not", code);
		e.setCode(code.toString());
		return null;
	}

	@Override
	public Void visit(FieldAccess e, Void value) {
		StringBuilder code = new StringBuilder();
		// we get the address of the struct
		addressVisitor.visit(e.getRecordName(), value);
		code.append(e.getRecordName().getCode());
		StructType type = (StructType) e.getStruct().getType();
		int offset = type.getOffsetForField(e.getFieldName());
		addInstruction("pushi " + offset, code);
		addInstruction("addi", code);
		RecordType field = type.getField(e.getFieldName());
		addInstruction("load" + utils.toSuffix(field.getType().getName()), code);
		e.setCode(code.toString());

		return null;
	}

	/*-------------LITERALS-------------*/
	@Override
	public Void visit(CharacterLiteral e, Void param) {
		StringBuilder code = new StringBuilder();
		addInstruction("pushb " + (int) e.getValue(), code);
		e.setCode(code.toString());
		return null;
	}

	@Override
	public Void visit(RealLiteral e, Void param) {
		StringBuilder code = new StringBuilder();
		addInstruction("pushf " + e.getValue(), code);
		e.setCode(code.toString());
		return null;
	}

	@Override
	public Void visit(IntegerLiteral e, Void param) {
		StringBuilder code = new StringBuilder();
		addInstruction("pushi " + e.getValue(), code);
		e.setCode(code.toString());
		return null;
	}

	private void addInstruction(String instruction, StringBuilder output) {
		output.append("\t" + instruction + "\n");
	}

}
