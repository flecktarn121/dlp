package ast.definition;

import java.util.List;

import ast.AstNode;
import ast.type.Type;

public class MultipleVarDefinition implements Definition, AstNode {

	private int line;
	private int column;
	private Type type;
	private List<VariableDefinition> definitions;

	public MultipleVarDefinition(Type type, List<VariableDefinition> definitions) {
		this.type = type;
		this.definitions = definitions;
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
	public String getName() {
		return "";
	}

	@Override
	public Type getType() {

		return type;
	}

}
