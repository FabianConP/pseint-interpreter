grammar pseintGrammar;		

pseint                  : (procedimiento)* principal (procedimiento)* EOF
                        ;

procedimiento           : (FUNCION | SUBPROCESO) (ID ASIGOP)? ID (PARIZQ (ID)* PARDER)? comandos (FINFUNCION | FINSUBPROCESO) ;

principal		: (PROCESO | ALGORITMO) ID comandos (FINPROCESO | FINALGORITMO) ;

comandos                : comando comandos
                        | 
                        ;

comando 	        : bloqueSi
                        | bloquePara
                        | bloqueMientras
                        | bloqueRepetir
                        | bloqueSegun
                        | bloqueDeclaracion
                        | bloqueAsignacion
                        | bloqueDimension
                        | bloqueBorrarPantalla
                        | bloqueEscribir 
                        | bloqueLeer
                        | bloqueEsperar
                        ;
			        
bloqueSi                : SI expr ENTONCES comandos (SINO comandos)? FINSI ;
bloquePara              : PARA ID (CORIZQ exprLista  CORDER)? ASIGOP expr HASTA expr (CON PASO expr)? HACER comandos FINPARA ;
bloqueMientras          : MIENTRAS expr HACER comandos FINMIENTRAS ;
bloqueRepetir           : REPETIR comandos HASTA QUE expr ;
bloqueSegun             : SEGUN expr HACER (CASO expr DOSP comandos)* (DE OTRO MODO DOSP comandos)? FINSEGUN ;
bloqueDeclaracion       : DEFINIR idLista COMO  tipoDato PYC ;
bloqueAsignacion	: ID (CORIZQ exprLista  CORDER)? ASIGOP expr PYC ;
bloqueDimension         : DIMENSION varArreglo (COMA varArreglo)* PYC ;

bloqueBorrarPantalla    : BORRAR PANTALLA PYC
                        | LIMPIAR PANTALLA PYC 
                        ;
bloqueEscribir          : ESCRIBIR exprLista PYC ;
bloqueLeer              : LEER idLista PYC ;
bloqueEsperar           : ESPERAR TECLA PYC
                        | ESPERAR expr (SEGUNDOS | MILISEGUNDOS) PYC
                        ;

expr                    : valor
                        | NEG expr                                    // Negative arithmetic expression
                        | expr MULOP expr
                        | expr SUMOP expr
                        | expr BINOP expr
                        | expr COMPOP expr
                        | NEGOP expr                                            
                        | ID (PARIZQ exprLista PARDER)                          
                        | ID CORIZQ exprLista CORDER                            
                        | PARIZQ expr PARDER
                        | ID
                        ;

operatorUnary           : NEG ;


valor                   : INT
                        | DOUBLE
                        | STRING
                        | BOOL
                        ;

exprLista               : expr (COMA expr)* ;
idLista                 : ID (COMA ID)* ;

varArreglo              : ID CORIZQ exprLista CORDER;


tipoDato		: tipoDatoEntero
                        | tipoDatoReal
                        | tipoDatoCaracter
                        | tipoDatoTexto
                        | tipoDatoLogico
                        ;

tipoDatoEntero		: NUMERO
                        | NUMERICO
                        | ENTERO
                        ;
tipoDatoReal 		: REAL ;
tipoDatoCaracter 	: CARACTER ;
tipoDatoTexto	 	: TEXTO
                        | CADENA
                        ;
tipoDatoLogico 		: LOGICO ;

NEGOP                   : ('~' | NO);
ASIGOP                  : '<-';

COMPOP                  : ('=' | '<>' | '<' | '<=' | '>' | '>=');
BINOP                   : (O | '|' | Y | '&');
MULOP                   : ('/' | '*' | '%' | MOD | '^');
SUMOP                   : ('+' | '-') { _input.LA(1) != ' ' }?;

PYC                     : ';';
DOSP                    : ':';
PARIZQ                  : '(';
PARDER                  : ')';
CORIZQ                  : '[';
CORDER                  : ']';
COMA                    : ',';
NEG                     : '-';

COMMENT                 : '/*' .*? '*/' -> skip ;
LINE_COMMENT            : '//' ~[\r\n]* -> skip ;
WS		        : [ \t\r\n]+ -> skip ;
INT                     : [0-9]+;
DOUBLE                  : [0-9]+[.][0-9]+;
STRING                  : ('\'' | '"') ~['\'"']* ('\'' | '"');
BOOL                    : (VERDADERO | FALSO) ;


// Keywords

ALGORITMO               : A L G O R I T M O;
FINALGORITMO            : F I N A L G O R I T M O;
PROCESO                 : P R O C E S O;
FINPROCESO              : F I N P R O C E S O;
DEFINIR                 : D E F I N I R;
COMO                    : C O M O;
NUMERO                  : N U M E R O;
NUMERICO                : N U M E R I C O;
ENTERO                  : E N T E R O;
CARACTER                : C A R A C T E R;
REAL                    : R E A L;
LOGICO                  : L O G I C O;
TEXTO                   : T E X T O;
CADENA                  : C A D E N A;
LEER                    : L E E R;
ESCRIBIR                : E S C R I B I R;
DIMENSION               : D I M E N S I O N;
PARA                    : P A R A;
HASTA                   : H A S T A;
CON                     : C O N;
PASO                    : P A S O;
HACER                   : H A C E R;
FINPARA                 : F I N P A R A;
BORRAR                  : B O R R A R;
PANTALLA                : P A N T A L L A;
ESPERAR                 : E S P E R A R;
TECLA                   : T E C L A;
SEGUNDOS                : S E G U N D O S;
MILISEGUNDOS            : M I L I S E G U N D O S;
SI                      : S I;
ENTONCES                : E N T O N C E S;
SINO                    : S I N O;
FINSI                   : F I N S I;
SEGUN                   : S E G U N;
CASO                    : C A S O;
DE                      : D E;
OTRO                    : O T R O;
MODO                    : M O D O;
FINSEGUN                : F I N S E G U N;
MIENTRAS                : M I E N T R A S;
FINMIENTRAS             : F I N M I E N T R A S;
REPETIR                 : R E P E T I R;
QUE                     : Q U E;
SUBPROCESO              : S U B P R O C E S O;
FINSUBPROCESO           : F I N S U B P R O C E S O;
FUNCION                 : F U N C I O N;
FINFUNCION              : F I N F U N C I O N;
LIMPIAR                 : L I M P I A R;
MOD                     : M O D;
NO                      : N O;
VERDADERO               : V E R D A D E R O;
FALSO                   : F A L S O;

fragment A: 'a' | 'A' ;
fragment B: 'b' | 'B' ;
fragment C: 'c' | 'C' ;
fragment D: 'd' | 'D' ;
fragment E: 'e' | 'E' ;
fragment F: 'f' | 'F' ;
fragment G: 'g' | 'G' ;
fragment H: 'h' | 'H' ;
fragment I: 'i' | 'I' ;
fragment J: 'j' | 'J' ;
fragment K: 'k' | 'K' ;
fragment L: 'l' | 'L' ;
fragment M: 'm' | 'M' ;
fragment N: 'n' | 'N' ;
fragment O: 'o' | 'O' ;
fragment P: 'p' | 'P' ;
fragment Q: 'q' | 'Q' ;
fragment R: 'r' | 'R' ;
fragment S: 's' | 'S' ;
fragment T: 't' | 'T' ;
fragment U: 'u' | 'U' ;
fragment V: 'v' | 'V' ;
fragment W: 'w' | 'W' ;
fragment X: 'x' | 'X' ;
fragment Y: 'y' | 'Y' ;
fragment Z: 'z' | 'Z' ;

ID 		        : [a-zA-Z][a-zA-Z0-9_]* ;