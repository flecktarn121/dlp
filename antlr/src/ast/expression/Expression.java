package ast.expression;

import ast.AstNode;

/**
 * Represents an Expression (+, -, !, ...)
 * 
 * @author UO258654
 *
 */
public interface Expression extends AstNode {
	boolean isLValue();

}
