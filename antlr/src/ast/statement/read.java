package ast.statement;

import java.util.List;

import ast.AstNode;
import ast.expression.Expression;

public class read implements AstNode, Statement {

	private int line;
	private int column;
	private List<Expression> arguments;

	public read(List<Expression> arguments) {
		this.arguments = arguments;
	}

	public read(List<Expression> arguments, int line, int column) {
		this(arguments);
		this.line = line;
		this.column = column;
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

	@Override
	public String toString() {
		return "read [line=" + line + ", column=" + column + ", arguments=" + arguments.size() + "]";
	}
}
