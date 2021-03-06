package ast.definition;

import java.util.List;

import ast.AstNode;
import ast.Body;
import ast.type.Type;
import visitor.Visitor;

public class FunctionDefinition implements AstNode, Definition {
	private String name;
	private Type type;
	private int line;
	private int column;
	private List<Body> body;
	private int scope;
	private int offset;
	private String code;

	public FunctionDefinition(String name, Type type, List<Body> body) {
		this.name = name;
		this.body = body;
		this.type = type;
	}

	public FunctionDefinition(String name, Type type, List<Body> body, int line, int column) {
		this(name, type, body);
		this.column = column;
		this.line = line;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
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

	@Override
	public String toString() {
		return "FunctionDefinition [name=" + name + ", type=" + type + ", line=" + line + ", column=" + column
				+ ", body elements=" + body.size() + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}

	@Override
	public int getScope() {
		return scope;
	}

	@Override
	public void setScope(int scope) {
		this.scope = scope;
		
	}

	@Override
	public int getOffset() {
		
		return offset;
	}

	@Override
	public void setOffset(int offset) {
		this.offset=offset;
		
	}

	@Override
	public void setCode(String code) {
		this.code = code;
		
	}

	@Override
	public String getCode() {
		return code;
	}

}
