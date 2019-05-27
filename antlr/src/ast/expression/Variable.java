package ast.expression;

import ast.AstNode;
import ast.definition.Definition;
import ast.type.Type;
import visitor.Visitor;

public class Variable implements Expression, AstNode {
	private String name;
	private int line;
	private int column;
	private Definition definition;
	private Type type;
	private String code;

	public Variable(String name) {
		this.name = name;
	}

	public Variable(String name, int line, int column) {
		this(name);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Variable [name=" + name + ", line=" + line + ", column=" + column + "]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}

	@Override
	public boolean isLValue() {
		return true;
	}
	
	public void setDefinition(Definition definition) {
		this.definition = definition;
	}
	
	public Definition getDefinition() {
		return definition;
	}

	@Override
	public void setType(Type type) {
		this.type = type;
		
	}

	@Override
	public Type getType() {
		return type;
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
