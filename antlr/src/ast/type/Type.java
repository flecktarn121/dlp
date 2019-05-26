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
	
	/**
	 * Get the name of the type
	 * 
	 * @return
	 */
	String getName();
	
	/**
	 * Recieves a type, and returns the result type of performing an arithmetic operation
	 * @param type the type of the second operand
	 * @return the type of the resulting operation, or errortype if it is not correct
	 */
	Type arithmetic(Type type);
	
	/**
	 * Receives a type, and returns the result of performing an array access
	 * 
	 * @param type of the position of the access
	 * @return the type of the resulting access, error if it is not correct
	 */
	Type arrayAccess(Type type);
	
	/**
	 * Whether a type is complex (struct, funcion...) or not
	 * @return
	 */
	boolean isComplex();
	
	/**
	 * Whether a type is a numer (integer, real...) or not
	 * @return
	 */
	boolean isNumber();
	
	/**
	 * Whether a type is a record (struct) or not
	 * @return
	 */
	boolean isRecord();
	
	/**
	 * Whether a type is an error 
	 * @return
	 */
	boolean isError();
	
	/**
	 * Whether a type is an array 
	 * @return
	 */
	boolean isArray();
	
	/**
	 * Whether a type is a function 
	 * @return
	 */
	boolean isFunction();
	
	/**
	 * Return the size in bytes of the type
	 * 
	 * @return
	 */
	int getSizeBytes();
}
