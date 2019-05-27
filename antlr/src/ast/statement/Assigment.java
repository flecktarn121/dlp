package ast.statement;

import ast.AstNode;
import ast.expression.Expression;
import visitor.Visitor;

public class Assigment implements AstNode, Statement {

	private int line;
	private int column;
	private Expression left;
	private Expression right;
	private String code;

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

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}
	
	@Override
	public void setCode(String code) {
		this.code = code;
		
	}

	@Override
	public String getCode() {
		return code;
	}

}
