grammar Cmm;	

program: 
       ;
       
fragment
LETTER: [a-zA-Z]
		;
	
fragment
DIGIT: [0-9]
	;
	
fragment
SPECIAL_CHARS: ('\\n'|'\\t')
				;
fragment
SYMBOLS: ('.'|'~'|'-')
		;
fragment
ASCII_RANGE: '\\'(DIGIT|[1-9]DIGIT|'1'[0-2]DIGIT)
			;

fragment
EXPONENT:	('e'|'E')(('+'|'-')?)([1-9]DIGIT*)
			;
			
fragment
INTEGER:	[1-9]DIGIT*|'0'
			;

WHITESPACES:	('\r'|'\n'|'\t'|' ')+ -> skip
				;

ID: (LETTER|'_')|(LETTER|'_'|DIGIT)+
	;
  		 
INT_CONSTANT: INTEGER
            ;
            
CHAR_CONSTANT: '\''(LETTER|SYMBOLS|ASCII_RANGE|SPECIAL_CHARS)+ '\''
				;
				
REAL_CONSTANT:	INTEGER*'.'DIGIT+
				|INTEGER+'.'DIGIT*
				|INTEGER+(('.'DIGIT+)?)(EXPONENT?)
				;				
				
SINGLE_COMMENT: '//'.*?('\r'|'\n'|EOF)+
				-> skip
				;
				
MULTIPLE_COMMENT: '/*'.*?'*/'
				-> skip
				;
