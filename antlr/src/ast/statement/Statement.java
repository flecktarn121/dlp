package ast.statement;

import ast.Body;

/**
 * Represents an statement (if, while, read...)
 * 
 * @author UO258654
 *
 */
public interface Statement extends Body {
	/**
	 * Set the MAPL code for the current statement
	 * @param string
	 */
	void setCode(String string);

	/**
	 * The MAPL code for the current statement
	 */
	String getCode();
}
