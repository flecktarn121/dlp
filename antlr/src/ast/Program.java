package ast;

import java.util.ArrayList;
import java.util.List;

import ast.definition.Definition;
import visitor.Visitor;

/**
 * Basic element of the AST
 * 
 * @author UO258654
 *
 */
public class Program implements AstNode {

	private int line;
	private int column;
	private List<Definition> definitions;

	public Program(List<Definition> definitions) {
		this.definitions = definitions;
	}

	public Program(List<Definition> definitions, int line, int column) {
		this(definitions);
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

	public List<Definition> getDefinitions() {
		return definitions;
	}

	public void setDefinitions(List<Definition> definitions) {
		this.definitions = new ArrayList<Definition>(definitions);
	}

	@Override
	public String toString() {
		return "Program [line=" + line + ", column=" + column + ", definitions=" + definitions.size() + "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}

}
