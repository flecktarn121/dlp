package visitor.codegen;

import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.type.StructType;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Void, Void> {
	
	private int golbalVarsSize
	
	@Override
	public Void visit(FunctionDefinition e, Void param) {
		
		return super.visit(e, param);
	}

	@Override
	public Void visit(VariableDefinition e, Void param) {
		// TODO Auto-generated method stub
		return super.visit(e, param);
	}
	

}
