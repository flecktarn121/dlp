package ast.statement;

import ast.AstNode;
import ast.expression.Expression;

public class Assigment implements AstNode, Statement {

	private int line;
	private int column;
	private Expression left;
	private Expression right;

	public Assigment(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public Assigment(Expression left, Expression right, int line, int column) {
		this(left, right);
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

	public Expression getLeft() {
		return left;
	}

	public void setLeft(Expression left) {
		this.left = left;
	}

	public Expression getRight() {
		return right;
	}

	public void setRight(Expression right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Assigment [line=" + line + ", column=" + column + ", left=" + left + ", right=" + right + "]";
	}

}
