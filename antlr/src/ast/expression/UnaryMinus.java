package ast.expression;

import ast.AstNode;

public class UnaryMinus implements AstNode, Expression {

	private Expression operand;
	private int line;
	private int column;

	public UnaryMinus(Expression operand) {
		this.operand = operand;
	}

	public UnaryMinus(Expression operand, int line, int column) {
		this(operand);
		this.line = line;
		this.column = column;
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

	@Override
	public String toString() {
		return "UnaryMinus [operand=" + operand + ", line=" + line + ", column=" + column + "]";
	}

}
