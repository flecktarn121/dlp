package visitor.semantic;

import ast.statement.Assigment;
import ast.statement.Read;
import ast.type.ErrorType;
import parser.ErrorHandler;
import visitor.AbstractVisitor;

/**
 * In theory, and in theory communism works, this visitor should set the lvalues
 * of the expressions. An expression is an lvalue when you can access its memory
 * position to store stuff (arrays, variables, fields...) Basically, what goes
 * on the left side of an assigment.
 * 
 * @author Ángel García Menéndez
 *
 */
public class LValueVisitor extends AbstractVisitor<Void, Void> {
	@Override
	public Void visit(Assigment e, Void param) {
		super.visit(e, param);
		if (!e.getLeft().isLValue()) {
			String mess = "Lvalue missmatch in assigment";

			ErrorHandler.getInstance().addError(new ErrorType(mess, e.getLeft().getLine(), e.getLeft().getColumn()));
		}
		return null;
	}

	@Override
	public Void visit(Read e, Void param) {
		super.visit(e, param);
		e.getArguments().parallelStream().forEach((arg) -> {
			if (!arg.isLValue()) {
				String mess = "Lvalue missmatch in read statement";

				ErrorHandler.getInstance().addError(new ErrorType(mess, e.getLine(), e.getColumn()));
			}
		});

		return null;
	}
}
