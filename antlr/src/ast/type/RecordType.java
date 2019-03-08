package ast.type;

import ast.AstNode;

public class RecordType implements AstNode, Type {

	private int line;
	private int column;
	private String name;
	private Type type;

	public RecordType(String name, Type type) {
		super();
		this.name = name;
		this.type = type;
	}

	public RecordType(String name, Type type, int line, int column) {
		this(name, type);
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

	@Override
	public String toString() {
		return "RecordType [line=" + line + ", column=" + column + ", name=" + name + ", type=" + type + "]";
	}

}
