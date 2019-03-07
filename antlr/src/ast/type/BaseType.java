package ast.type;

import ast.AstNode;

public class BaseType implements AstNode, Type {

	private int line;
	private int column;
	private String name;

	public BaseType(String name) {
		this.setName(name);
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
