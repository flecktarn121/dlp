
import parser.*;
import visitor.Visitor;
import visitor.semantic.IdentificationVisitor;
import visitor.semantic.LValueVisitor;

import org.antlr.v4.runtime.*;

import ast.Program;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;

public class Main {

	public static void main(String... args) throws Exception {
//		   if (args.length<1) {
//		        System.err.println("Please, pass me the input file.");
//		        return;
//		    }

		// create a lexer that feeds off of input CharStream

		CharStream input = CharStreams.fromFileName("input/input-wrong.txt");
		CmmLexer lexer = new CmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CmmParser parser = new CmmParser(tokens);
		Program ast = parser.program().ast;

		// * The AST is shown
		IntrospectorModel model = new IntrospectorModel("Program", ast);
		new IntrospectorTree("Introspector", model);

		// We visit the ast
		Visitor<Void, Void> visitor = new LValueVisitor();
		ast.accept(visitor, null);
		if (ErrorHandler.getInstance().anyError()) {
			ErrorHandler.getInstance().showErrors(System.err);
		} else {
			System.out.println("The program has no LValue errors.");
		}
		
		visitor = new IdentificationVisitor();
		ast.accept(visitor, null);
		if (ErrorHandler.getInstance().anyError()) {
			ErrorHandler.getInstance().showErrors(System.err);
		} else {
			System.out.println("The program has no identification errors.");
		}
	}
}
