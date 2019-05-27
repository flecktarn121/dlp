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
	/**
	 * Whether this expression is an Lvalue, that is, if its address can be accessed
	 * to store stuff. In English: if it can be on the left side of an assignment
	 * 
	 * @return
	 */
	boolean isLValue();

	/**
	 * Set the type of the expression
	 * @param type
	 */
	void setType(Type type);

	/**
	 * Type of the current expression
	 * @return
	 */
	Type getType();

	/**
	 * MAPL code for the expression
	 * @param code
	 */
	void setCode(String code);

	/**
	 * MAPL code for the current expression
	 * @return
	 */
	String getCode();
}
