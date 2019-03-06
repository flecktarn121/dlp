package ast.type;

import java.util.ArrayList;
import java.util.List;

import ast.definition.VariableDefinition;

public class FunctionType implements Type {
	private Type returnType;
	private List<VariableDefinition> paramType;

	public Type getReturnType() {
		return returnType;
	}

	public void setReturnType(Type returnType) {
		this.returnType = returnType;
	}

	public List<VariableDefinition> getParamType() {
		return paramType;
	}

	public void setParamType(List<VariableDefinition> paramType) {
		this.paramType = new ArrayList<VariableDefinition>(paramType);
	}
}
