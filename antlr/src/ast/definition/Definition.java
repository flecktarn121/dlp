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
}
