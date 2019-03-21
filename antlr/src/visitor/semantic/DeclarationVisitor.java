package visitor.semantic;

import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.FunctionCall;
import ast.expression.Variable;
import ast.type.ErrorType;
import parser.ErrorHandler;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class DeclarationVisitor extends AbstractVisitor<Void, Void> {

	@Override
	public Void visit(FunctionDefinition e, Void param) {
		
		super.visit(e, param);
		if (!SymbolTable.getInstance().insert(e)) {
			ErrorHandler.getInstance()
					.addError(new ErrorType("Function already declared in current scope", e.getLine(), e.getColumn()));
		}
		return null;
	}

	@Override
	public Void visit(VariableDefinition e, Void param) {
		super.visit(e, param);
		if (!SymbolTable.getInstance().insert(e)) {
			ErrorHandler.getInstance()
					.addError(new ErrorType("Variable already declared in current scope", e.getLine(), e.getColumn()));
		}
		return null;
	}

	@Override
	public Void visit(FunctionCall e, Void param) {
		super.visit(e, param);
		if (!SymbolTable.getInstance().find(e.getName().getName()).equals(e.getName())) {
			ErrorHandler.getInstance().addError(
					new ErrorType("Function " + e.getName().getName() + " is undeclared", e.getLine(), e.getColumn()));
		}
		return null;
	}

	@Override
	public Void visit(Variable e, Void param) {
		super.visit(e, param);
		if (!SymbolTable.getInstance().find(e.getName()).equals(e)) {
			ErrorHandler.getInstance().addError(
					new ErrorType("Variable " + e.getName() + " is undeclared", e.getLine(), e.getColumn()));
		}
		return null;
	}

}
