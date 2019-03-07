package ast.statement;

import java.util.List;

import ast.AstNode;
import ast.expression.Expression;

public class Write implements AstNode, Statement {
	private int line;
	private int column;
	private List<Expression> arguments;

	public Write(List<Expression> arguments) {
		this.arguments = arguments;
	}

	public List<Expression> getArguments() {
		return arguments;
	}

	public void setArguments(List<Expression> arguments) {
		this.arguments = arguments;
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
