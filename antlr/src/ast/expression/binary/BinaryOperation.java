package ast.expression.binary;

import ast.AstNode;
import ast.expression.Expression;

public class BinaryOperation implements AstNode, Expression {
	private int line;
	private int column;
	private String operation;
	private Expression left;
	private Expression right;

	public BinaryOperation(String operation, Expression left, Expression right) {
		this.operation = operation;
		this.left = left;
		this.right = right;
	}

	public BinaryOperation(String operation, Expression left, Expression right, int line, int column) {
		this(operation, left, right);
		this.line = line;
		this.column = column;
	}

	@Override
	public int getLine() {

		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Expression getRight() {
		return right;
	}

	public void setRight(Expression right) {
		this.right = right;
	}

	public Expression getLeft() {
		return left;
	}

	public void setLeft(Expression left) {
		this.left = left;
	}

	@Override
	public String toString() {
		return "BinaryOperation [line=" + line + ", column=" + column + ", operation=" + operation + ", left=" + left
				+ ", right=" + right + "]";
	}
}
