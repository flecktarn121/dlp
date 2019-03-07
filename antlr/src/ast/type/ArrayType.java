package ast.type;

import ast.AstNode;
import ast.expression.Expression;

public class ArrayType implements Type, AstNode {
	private Type typeOf;
	private Expression size;
	private int line;
	private int column;

	public ArrayType(Type typeOf, Expression size) {
		this.typeOf = typeOf;
		this.size = size;
	}

	public Type getTypeOf() {
		return typeOf;
	}

	public void setTypeOf(Type typeOf) {
		this.typeOf = typeOf;
	}

	public Expression getSize() {
		return size;
	}

	public void setSize(Expression size) {
		this.size = size;
	}

	@Override
	public int getLine() {

		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}
}
