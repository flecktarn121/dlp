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

	public IntegerLiteral(int value, int line, int column) {
		this(value);
		this.line = line;
		this.column = column;
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

	@Override
	public String toString() {
		return "IntegerLiteral [value=" + value + ", line=" + line + ", column=" + column + "]";
	}
}
