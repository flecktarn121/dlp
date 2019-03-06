package ast.definition;

import ast.type.Type;

public class VariableDefinition implements Definition {

	private String name;
	private Type type;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Type getType() {
		return type;
	}

}
