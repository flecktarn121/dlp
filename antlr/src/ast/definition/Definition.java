package ast.definition;

import ast.type.Type;

/**
 * Represents a definition (variables and functions)
 * 
 * @author UO258654
 *
 */
public interface Definition {
	public String getName();

	public Type getType();
}
