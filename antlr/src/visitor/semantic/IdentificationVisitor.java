package visitor.semantic;

import ast.definition.Definition;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.FunctionCall;
import ast.expression.Variable;
import ast.statement.Function;
import ast.type.ErrorType;
import parser.ErrorHandler;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

    @Override
    public Void visit(FunctionDefinition e, Void param) {
	if (!SymbolTable.getInstance().insert(e)) {
	    ErrorHandler.getInstance().addError(new ErrorType(
		    "Function " + e.getName() + " already declared in current scope", e.getLine(), e.getColumn()));
	}
	SymbolTable.getInstance().set();
	super.visit(e, param);
	SymbolTable.getInstance().reset();
	return null;
    }

    @Override
    public Void visit(VariableDefinition e, Void param) {

	if (!SymbolTable.getInstance().insert(e)) {
	    ErrorHandler.getInstance().addError(new ErrorType(
		    "Variable " + e.getName() + " already declared in current scope", e.getLine(), e.getColumn()));
	}
	super.visit(e, param);
	return null;
    }

    @Override
    public Void visit(FunctionCall e, Void param) {
	Definition originalDefinition = SymbolTable.getInstance().find(e.getName().getName());
	if (originalDefinition == null) {
	    ErrorHandler.getInstance().addError(
		    new ErrorType("Function " + e.getName().getName() + " is undeclared", e.getLine(), e.getColumn()));
	}
	e.getName().setDefinition(originalDefinition);
	super.visit(e, param);
	return null;
    }
    

    @Override
    public Void visit(Function e, Void param) {
	Definition originalDefinition = SymbolTable.getInstance().find(e.getName().getName());
	if (originalDefinition == null) {
	    ErrorHandler.getInstance().addError(
		    new ErrorType("Function " + e.getName().getName() + " is undeclared", e.getLine(), e.getColumn()));
	}
	e.getName().setDefinition(originalDefinition);
	super.visit(e, param);
	return null;
    }


    @Override
    public Void visit(Variable e, Void param) {
	Definition originalDefinition = SymbolTable.getInstance().find(e.getName());
	if (originalDefinition == null) {
	    ErrorHandler.getInstance()
		    .addError(new ErrorType("Variable " + e.getName() + " is undeclared", e.getLine(), e.getColumn()));
	}
	e.setDefinition(originalDefinition);
	super.visit(e, param);
	return null;
    }

}
