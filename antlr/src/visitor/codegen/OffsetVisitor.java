package visitor.codegen;

import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.type.FunctionType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Boolean, Void> {
	
	private int golbalVarsSize = 0;
	private int localVarsSize = 0;
	private int paramSize = 0;
		
	@Override
	public Void visit(FunctionDefinition e, Boolean isParameter) {
		localVarsSize = 0;
		paramSize = 4;
		//we set the offset of the variable definitions that serve as parameters
		e.getType().accept(this, true);
		//now the rest
		e.getBody().forEach(element -> element.accept(this, false));
		((FunctionType) e.getType()).setLocalVarsSize(localVarsSize);
		return null;
	}

	@Override
	public Void visit(VariableDefinition e, Boolean isParameter) {
		super.visit(e, isParameter);
		if(e.getScope() == SymbolTable.GLOBAL_SCOPE) {
			e.setOffset(golbalVarsSize);
			golbalVarsSize += e.getType().getSizeBytes();
		}else {
			if(isParameter) {
				e.setOffset(paramSize);
				paramSize += e.getType().getSizeBytes();
			}else {
				localVarsSize += e.getType().getSizeBytes();
				e.setOffset(-localVarsSize);
			}
		}
		return null;
	}
	
	
	

}
