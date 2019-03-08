package ast.type;

import java.util.ArrayList;
import java.util.List;

import ast.AstNode;
import ast.definition.VariableDefinition;

public class FunctionType implements Type, AstNode {
	private Type returnType;
	private List<VariableDefinition> paramType;
	private int line;
	private int column;

	public FunctionType(Type returnType, List<VariableDefinition> paramType) {
		super();
		this.returnType = returnType;
		this.paramType = paramType;
	}

	public FunctionType(Type returnType, List<VariableDefinition> paramType, int line, int column) {
		this(returnType, paramType);
		this.line = line;
		this.column = column;
	}

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
		return "FunctionType [returnType=" + returnType + ", paramType=" + paramType + ", line=" + line + ", column="
				+ column + "]";
	}
}
