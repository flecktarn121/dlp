package ast.expression.literal;

import ast.AstNode;
import ast.expression.Expression;

public class IntegerLiteral implements Expression, AstNode {
	private int value;
	private int line;
	private int column;

	public IntegerLiteral(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
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
