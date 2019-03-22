package visitor.semantic;

import ast.definition.FunctionDefinition;
import ast.statement.Assigment;
import ast.statement.Read;
import ast.type.ErrorType;
import parser.ErrorHandler;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class LValueVisitor extends AbstractVisitor<Void, Void> {
    @Override
    public Void visit(Assigment e, Void param) {
	super.visit(e, param);
	if (!e.getLeft().isLValue()) {
	    String mess = "Lvalue missmatch in assigment";

	    ErrorHandler.getInstance().addError(new ErrorType(mess, e.getLine(), e.getColumn()));
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
