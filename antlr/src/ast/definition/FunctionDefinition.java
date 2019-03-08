package ast.definition;

import java.util.List;

import ast.AstNode;
import ast.Body;
import ast.type.Type;

public class FunctionDefinition implements AstNode, Definition {
	private String name;
	private Type type;
	private int line;
	private int column;
	private List<Body> body;

	public FunctionDefinition(String name, Type type, List<Body> body) {
		this.name = name;
		this.body = body;
		this.type = type;
	}

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

	public List<Body> getBody() {
		return body;
	}

	public void setBody(List<Body> body) {
		this.body = body;
	}

}
