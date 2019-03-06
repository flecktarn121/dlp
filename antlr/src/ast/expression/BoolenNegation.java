package ast.expression;

import ast.AstNode;

public class BoolenNegation implements Expression, AstNode {
	private Expression operand;
	private int line;
	private int column;

	public Expression getOperand() {
		return operand;
	}

	public void setOperand(Expression operand) {
		this.operand = operand;
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
