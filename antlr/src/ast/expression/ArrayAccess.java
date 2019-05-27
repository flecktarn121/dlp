package ast.expression;

import ast.AstNode;
import ast.type.Type;
import visitor.Visitor;

public class ArrayAccess implements Expression, AstNode {
	private Expression position;
	private Expression array;
	private int line;
	private int column;
	private Type type;
	private String code;

	public ArrayAccess(Expression array, Expression position) {
		this.position = position;
		this.setArray(array);
	}

	public ArrayAccess(Expression array, Expression position, int line, int column) {
		this(array, position);
		this.line = line;
		this.column = column;
	}

	public Expression getPosition() {
		return position;
	}

	public void setPosition(Expression position) {
		this.position = position;
	}

	@Override
	public int getLine() {

		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}

	@Override
	public String toString() {
		return "ArrayAccess [position=" + position + ", line=" + line + ", column=" + column + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}

	@Override
	public boolean isLValue() {
		return true;
	}

	@Override
	public void setType(Type type) {
		this.type = type;

	}

	@Override
	public Type getType() {
		return type;
	}

	public Expression getArray() {
		return array;
	}

	public void setArray(Expression array) {
		this.array = array;
	}
	
	@Override
	public void setCode(String code) {
		this.code = code;
		
	}

	@Override
	public String getCode() {
		return code;
	}
}
