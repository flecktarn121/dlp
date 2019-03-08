package ast.expression;

import java.util.List;

import ast.AstNode;

public class FunctionCall implements Expression, AstNode {
	private int column;
	private int line;
	private String name;
	private List<Expression> parameters;

	public FunctionCall(String name, List<Expression> params) {
		this.name = name;
		this.parameters = params;
	}

	public FunctionCall(String name, List<Expression> params, int line, int column) {
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

	@Override
	public String toString() {
		return "FunctionCall [column=" + column + ", line=" + line + ", name=" + name + ", parameters="
				+ parameters.size() + "]";
	}
}
