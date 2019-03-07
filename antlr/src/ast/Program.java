package ast;

import java.util.ArrayList;
import java.util.List;

import ast.definition.Definition;

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

}
