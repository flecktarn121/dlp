package ast.statement;

import java.util.List;

import ast.AstNode;
import ast.expression.Expression;
import ast.expression.Variable;
import visitor.Visitor;

public class Function implements AstNode, Statement {

	private int column;
	private int line;
	private Variable name;
	private List<Expression> parameters;
	private String code;

	public Function(Variable name, List<Expression> params) {
		this.setName(name);
		this.setParameters(params);
	}

	public Function(Variable name, List<Expression> params, int line, int column) {
		this(name, params);
		this.line = line;
		this.column = column;
	}

	@Override
	public int getLine() {

		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}

	public List<Expression> getParameters() {
		return parameters;
	}

	public void setParameters(List<Expression> parameters) {
		this.parameters = parameters;
	}

	public Variable getName() {
		return name;
	}

	public void setName(Variable name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Function [column=" + column + ", line=" + line + ", name=" + name + ", parameters=" + parameters.size()
				+ "]";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
		return v.visit(this, param);
	}
	
	@Override
	public void setCode(String code) {
		this.code = code;
		
	}

	@Override
	public String getCode() {
		return code;
	}
}
