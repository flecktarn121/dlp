package ast.definition;

import ast.Body;
import ast.type.Type;

/**
 * Represents a definition (variables and functions)
 * 
 * @author UO258654
 *
 */
public interface Definition extends Body {
	/**
	 * Name of the definition
	 * @return
	 */
	public String getName();

	/**
	 * Type of the definition
	 * @return
	 */
	public Type getType();

	/**
	 * Scope of the definition (only 2 levels, local or global)
	 * @return
	 */
	public int getScope();

	/**
	 * Set the current scope
	 * @param scope
	 */
	public void setScope(int scope);

	/**
	 * Offset of the definition
	 * @return
	 */
	public int getOffset();

	/**
	 * Set the current offset
	 * @param offset
	 */
	public void setOffset(int offset);
	
	/**
	 * Set the MAPL code of the definition
	 * @param code
	 */
	public void setCode(String code);

	/**
	 * The MAPL code of the definition
	 */
	public String getCode();
}
