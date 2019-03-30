package ast.type;

import ast.AstNode;

/**
 * Represents the type of a definition.
 * 
 * @author UO258654
 *
 */
public interface Type extends AstNode {
	/**
	 * Returns whether the given type can be used in a logical operation
	 * 
	 * @return
	 */
	boolean isLogical();
	
	String getName();
	
	/**
	 * Recieves a type, and returns the result type of performing an arithmetic operation
	 * @param type the type of the second operand
	 * @return the type of the resulting operation, or errortype if it is not correct
	 */
	Type arithmetic(Type type);
	
	boolean isComplex();
	
	boolean isNumber();
	
	boolean isRecord();
}
