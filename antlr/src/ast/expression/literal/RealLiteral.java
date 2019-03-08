package ast.expression.literal;

import ast.AstNode;
import ast.expression.Expression;

public class RealLiteral implements Expression, AstNode {
	private double value;
	private int line;
	private int column;

	public RealLiteral(double value) {
		this.value = value;
	}

	public RealLiteral(double value, int line, int column) {
		this(value);
		this.line = line;
		this.column = column;
	}

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

	@Override
	public String toString() {
		return "RealLiteral [value=" + value + ", line=" + line + ", column=" + column + "]";
	}
}
