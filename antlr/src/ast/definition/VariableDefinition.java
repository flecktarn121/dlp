package ast.definition;

import ast.AstNode;
import ast.type.Type;

public class VariableDefinition implements Definition, AstNode {

	private String name;
	private Type type;
	private int line;
	private int column;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Type getType() {
		return type;
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
