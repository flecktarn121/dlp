package ast;

import visitor.Visitor;

public interface AstNode {
	public int getLine();

	public int getColumn();

	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param);
}
