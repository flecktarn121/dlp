package ast.expression.literal;

import ast.AstNode;
import ast.expression.Expression;

public class RealLiteral implements Expression, AstNode {
	private double value;
	private int line;
	private int column;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
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
