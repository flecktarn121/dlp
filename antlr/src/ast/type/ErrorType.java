package ast.type;

import ast.AstNode;
import visitor.Visitor;

public class ErrorType implements Type, AstNode {
	private int line;
	private int column;
	private String message;

	public ErrorType(String message) {
		this.message = message;
	}

	public ErrorType(String message, int line, int column) {
		this(message);
		this.line = line;
		this.column = column;
	}

	public String getMessage() {
		return message;
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
		return "Error: " + getMessage() + " line: " + line + " column: " + column;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}

}
