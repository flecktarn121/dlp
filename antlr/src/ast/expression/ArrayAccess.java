package ast.expression;

import ast.AstNode;

public class ArrayAccess implements Expression, AstNode {
	private Expression position;
	private int line;
	private int column;

	public ArrayAccess(Expression position) {
		this.position = position;
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
}
