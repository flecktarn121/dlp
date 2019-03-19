package ast.expression;

import ast.AstNode;
import ast.definition.Definition;
import visitor.Visitor;

public class Variable implements Expression, AstNode {
	private String name;
	private int line;
	private int column;
	private Definition definition;

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
	
	public Definition definition() {
		return definition;
	}
	
	

}
