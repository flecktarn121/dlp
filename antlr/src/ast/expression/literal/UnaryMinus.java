package ast.expression.literal;

import ast.AstNode;
import ast.expression.Expression;

public class UnaryMinus implements AstNode, Expression {

	private Expression operand;
	private int line;
	private int column;

	public UnaryMinus(Expression operand) {
		this.operand = operand;
	}

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
