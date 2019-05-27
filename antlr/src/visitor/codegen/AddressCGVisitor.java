package visitor.codegen;

import ast.expression.ArrayAccess;
import ast.expression.FieldAccess;
import ast.expression.Variable;
import ast.type.StructType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;
import visitor.Visitor;

/**
 * This class corresponds to the code function address, and each of its methods
 * to the different code templates. It generates the code to get the addresses
 * of lvalues.
 * 
 * @author Ángel García Menéndez
 *
 */
public class AddressCGVisitor extends AbstractVisitor<Void, Void> {
	private Visitor<Void, Void> valueVisitor;

	public void setValueVisitor(Visitor<Void, Void> valueVisitor) {
		this.valueVisitor = valueVisitor;
	}

	@Override
	public Void visit(ArrayAccess e, Void value) {
		StringBuilder code = new StringBuilder();
		// we want the address of the array we are accessing
		e.getArray().accept(this, value);
		code.append(e.getArray().getCode());
		// now the value of the index
		e.getPosition().accept(valueVisitor, value);
		code.append(e.getPosition().getCode());
		// we compute the address of the position
		addInstruction("pushi " + e.getType().getSizeBytes(), code);
		addInstruction("muli", code);
		addInstruction("addi", code);
		e.setCode(code.toString());
		return null;
	}

	@Override
	public Void visit(Variable e, Void value) {
		StringBuilder code = new StringBuilder();
		if (e.getDefinition().getScope() == SymbolTable.GLOBAL_SCOPE) {
			// if it is global, we simply push the address
			addInstruction("pusha " + e.getDefinition().getOffset(), code);
		} else {
			// otherwise we need to use it by means of the bp and the offset
			addInstruction("push bp", code);
			addInstruction("pushi " + e.getDefinition().getOffset(), code);
			addInstruction("addi", code);
		}
		e.setCode(code.toString());

		return null;
	}

	@Override
	public Void visit(FieldAccess e, Void value) {
		StringBuilder code = new StringBuilder();
		// we get the address of the struct
		e.getRecordName().accept(this, value);
		code.append(e.getRecordName().getCode());
		StructType type = (StructType) e.getStruct().getType();
		int offset = type.getOffsetForField(e.getFieldName());
		// we push the offset to sum to the addres of the struct and get the field we
		// want
		addInstruction("pushi " + offset, code);
		addInstruction("addi", code);
		e.setCode(code.toString());

		return null;
	}

	private void addInstruction(String instruction, StringBuilder output) {
		output.append("\t" + instruction + "\n");
	}

}
