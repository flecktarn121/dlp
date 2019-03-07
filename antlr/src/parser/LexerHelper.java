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
		char[] chars = text.toCharArray();
		if(chars[1] == '\\'){
			if(chars[2] != 'n' && chars[2] != 't') {
				return (char) Character.getNumericValue(Integer.parseInt(text.substring(2, text.length()-1)));
			}
			else {
				char result = (char) ('\\' + chars[2]);
				return result;
			}
		}
		else {
			return chars[2];
		}
	}


	public static double lexemeToReal(String text) {
		return Double.valueOf(text);
	}

}
