package ast.type;

import java.util.ArrayList;
import java.util.List;

import ast.definition.VariableDefinition;
import visitor.Visitor;

public class FunctionType extends AbsractType {
	private Type returnType;
	private List<VariableDefinition> paramType;
	private int line;
	private int column;
	private int localVarsSize = 0;

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

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}

	@Override
	public String getName() {

		return "Function";
	}

	@Override
	public boolean isFunction() {
		return true;
	}

	@Override
	public int getSizeBytes() {
		int sizeReturnType = this.returnType.getSizeBytes();
		int sizeParams = getSizeParams();

		return localVarsSize + sizeParams + sizeReturnType;
	}

	public int getLocalVarsSize() {
		return localVarsSize;
	}

	public int getSizeParams() {
		return paramType.stream().mapToInt(param -> param.getType().getSizeBytes()).sum();
	}

	public void setLocalVarsSize(int localVarsSize) {
		this.localVarsSize = localVarsSize;
	}

}
