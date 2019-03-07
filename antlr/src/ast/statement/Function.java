package ast.statement;

import java.util.List;

import ast.AstNode;
import ast.expression.Expression;

public class Function implements AstNode, Statement {

	private int column;
	private int line;
	private String name;
	private List<Expression> parameters;

	public Function(String name, List<Expression> params) {
		this.setName(name);
		this.setParameters(params);
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

	public void setParameters(List<Expression> parameters) {
		this.parameters = parameters;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
