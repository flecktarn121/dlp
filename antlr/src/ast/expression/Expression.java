package ast.expression;

import ast.AstNode;
import ast.type.Type;

/**
 * Represents an Expression (+, -, !, ...)
 * 
 * @author UO258654
 *
 */
public interface Expression extends AstNode {
	boolean isLValue();

	void setType(Type type);

	Type getType();

}
