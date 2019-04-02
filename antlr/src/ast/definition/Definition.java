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
	public String getName();

	public Type getType();

	public int getScope();

	public void setScope(int scope);

	public int getOffset();

	public void setOffset(int offset);
}
