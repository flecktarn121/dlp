package ast.expression.literal;

import ast.AstNode;
import ast.expression.Expression;

public class CharacterLiteral implements Expression, AstNode{
	private char value;
	private int line;
	private int column;

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}
	
	@Override
	public int getLine() {

		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}
}
