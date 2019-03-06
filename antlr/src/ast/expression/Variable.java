package ast.expression;

import ast.AstNode;

public class Variable implements Expression, AstNode {
	private String name;
	private int line;
	private int column;

	public Variable(String name) {
		this.name = name;
	}
	@Override
	public int getLine() {

		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
