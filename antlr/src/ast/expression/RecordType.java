package ast.expression;

import ast.AstNode;
import ast.type.Type;

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

	@Override
	public int getLine() {

		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}

}
