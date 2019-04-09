package ast;

import visitor.Visitor;

public interface AstNode {

	/**
	 * The line of the node
	 * 
	 * @return
	 */
	public int getLine();

	/**
	 * The column of the node
	 * 
	 * @return
	 */
	public int getColumn();

	/**
	 * The little trick you need to do to perform a visitor in JAva
	 * 
	 * @param v
	 *            the visitor to use
	 * @param param
	 * @return
	 */
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param);
}
