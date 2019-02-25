package parser;

public class LexerHelper {

	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String text) {
		String[] lexeme = text.split("'");
		if(!lexeme[0].equalsIgnoreCase("\\")) {
			System.out.println(lexeme[0]);
			return lexeme[0].charAt(0);
		}else {
			return convetToSpecilaChar(text);
		}
	}

	private static char convetToSpecilaChar(String text) {
		String[] lexeme = text.split("'");
		if(lexeme[1].equals("t")) {
			return '\t';
		}else if (lexeme[1].equals("n")) {
			return '\n';
		}else if (lexeme[1].equals("r")) {
			return '\r';
		}else if (lexeme[1].equals(" ")) {
			return ' ';
		}else {
			String ascciCode = "";
			for(String value: lexeme) {
				if(!value.equals("\t")) {
					ascciCode += value;
				}
			}
			int intCode = Integer.parseInt(ascciCode);
			return (char) intCode;
		}
	}

	public static double lexemeToReal(String text) {
		return Double.valueOf(text);
	}

}
