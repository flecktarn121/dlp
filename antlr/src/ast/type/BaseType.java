package ast.type;

import ast.AstNode;

public class BaseType implements AstNode, Type {

	private int line;
	private int column;
	private String name;

	public BaseType(String name) {
		this.setName(name);
	}

	public BaseType(String name, int line, int column) {
		this(name);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BaseType [line=" + line + ", column=" + column + ", name=" + name + "]";
	}

}
