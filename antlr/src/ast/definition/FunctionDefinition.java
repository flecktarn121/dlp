package ast.definition;

import java.util.List;

import ast.AstNode;
import ast.statement.Statement;
import ast.type.Type;

public class FunctionDefinition implements AstNode, Definition {
	private String name;
	private Type type;
	private int line;
	private int column;
	private List<Statement> body;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public int getLine() {
		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}

	public List<Statement> getBody() {
		return body;
	}

	public void setBody(List<Statement> body) {
		this.body = body;
	}

}
