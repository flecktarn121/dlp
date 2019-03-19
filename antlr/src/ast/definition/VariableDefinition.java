package ast.definition;

import ast.AstNode;
import ast.type.Type;
import visitor.Visitor;

public class VariableDefinition implements Definition, AstNode {

	private String name;
	private Type type;

	public VariableDefinition(String name, Type type) {
		super();
		this.name = name;
		this.type = type;
	}

	public VariableDefinition(String name, Type type, int line, int column) {
		this(name, type);
		this.line = line;
		this.column = column;
	}

	private int line;
	private int column;
	private int scope;

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

	@Override
	public String toString() {
		return "VariableDefinition [name=" + name + ", type=" + type + ", line=" + line + ", column=" + column + "]";
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
}
