package ast.expression;

import java.util.List;

import ast.AstNode;
import ast.type.Type;
import visitor.Visitor;

public class FunctionCall implements Expression, AstNode {
	private int column;
	private int line;
	private Variable name;
	public Variable getName() {
		return name;
	}

	public void setName(Variable name) {
		this.name = name;
	}

	private List<Expression> parameters;
	private Type type;

	public FunctionCall(Variable name, List<Expression> params) {
		this.name = name;
		this.parameters = params;
	}

	public FunctionCall(Variable name, List<Expression> params, int line, int column) {
		this(name, params);
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

	public List<Expression> getParameters() {
		return parameters;
	}

	@Override
	public String toString() {
		return "FunctionCall [column=" + column + ", line=" + line + ", name=" + name + ", parameters="
				+ parameters.size() + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}

	@Override
	public boolean isLValue() {
		return false;
	}
	
	@Override
	public void setType(Type type) {
		this.type = type;
		
	}

	@Override
	public Type getType() {
		return type;
	}
	
	
}
