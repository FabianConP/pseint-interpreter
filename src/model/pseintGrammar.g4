grammar pseintGrammar;		

pseint                  : (procedure)* main (procedure)* EOF
                        ;

procedure               : (FUNCION | SUBPROCESO) (ID ASIGOP)? ID (PARIZQ (ID)* PARDER)? commands (FINFUNCION | FINSUBPROCESO) ;

main			: (PROCESO | ALGORITMO) ID commands (FINPROCESO | FINALGORITMO) ;

commands                : command commands
                        | 
                        ;

command 	        : bloqueSi
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
			        
bloqueSi                : SI booleanExpr ENTONCES commands (SINO commands)? FINSI ;
bloquePara              : PARA ID ASIGOP expr HASTA expr (CON PASO expr)? HACER commands FINPARA ;
bloqueMientras          : MIENTRAS booleanExpr HACER commands FINMIENTRAS ;
bloqueRepetir           : REPETIR commands HASTA QUE booleanExpr ;
bloqueSegun             : SEGUN expr HACER (CASO expr DOSP commands)* (DE OTRO MODO DOSP commands)? FINSEGUN ;
bloqueDeclaracion       : DEFINIR ID (COMA ID)* COMO  tipoDato PYC ;
bloqueAsignacion	: ID (CORIZQ expr (COMA expr)*  CORDER)? ASIGOP expr PYC ;
bloqueDimension         : DIMENSION ID (CORIZQ expr (COMA expr)* CORDER) (COMA ID (CORIZQ expr (COMA expr)* CORDER)+)* PYC ;

bloqueBorrarPantalla    : BORRAR PANTALLA PYC
                        | LIMPIAR PANTALLA PYC 
                        ;
bloqueEscribir          : ESCRIBIR expr (COMA expr)* PYC ;
bloqueLeer              : LEER ID (COMA ID)* PYC ;
bloqueEsperar           : ESPERAR TECLA PYC
                        | ESPERAR expr (SEGUNDOS | MILISEGUNDOS) PYC
                        ;

expr                    : expr MULOP expr
                        | expr SUMOP expr
                        | INT
                        | DOUBLE
                        | STRING
                        | BOOL
                        | PARIZQ expr PARDER
                        | ID (PARIZQ expr (COMA expr)* PARDER)?
                        | ID CORIZQ expr (COMA expr)* CORDER
                        ;
    
booleanExpr             : comparisonExpr (BINOP comparisonExpr)*;

comparisonExpr          : expr COMPOP expr
                        | PARIZQ comparisonExpr PARDER
                        | NEGOP comparisonExpr
                        ; 



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

NEGOP                   : ('~' | 'no');
ASIGOP                  : '<-';

COMPOP                  : ('=' | '<>' | '<' | '>' | '<=' | '>=');
BINOP                   : ('o' | 'y' | '|' | '&');
MULOP                   : ('/' | '*' | '%' | 'mod' | '^');
SUMOP                   : ('+' | '-');

PYC                     : ';';
DOSP                    : ':';
PARIZQ                  : '(';
PARDER                  : ')';
CORIZQ                  : '[';
CORDER                  : ']';
COMA                    : ',';

ALGORITMO               : 'algoritmo';
FINALGORITMO            : 'finalgoritmo';
PROCESO                 : 'proceso';
FINPROCESO              : 'finproceso';
DEFINIR                 : 'definir';
COMO                    : 'como';
NUMERO                  : 'numero';
NUMERICO                : 'numerico';
ENTERO                  : 'entero';
CARACTER                : 'caracter';
REAL                    : 'real';
LOGICO                  : 'logico';
TEXTO                   : 'texto';
CADENA                  : 'cadena';
//VERDADERO               : 'verdadero';
//FALSO                   : 'falso';
LEER                    : 'leer';
ESCRIBIR                : 'escribir';
DIMENSION               : 'dimension';
PARA                    : 'para';
HASTA                   : 'hasta';
CON                     : 'con';
PASO                    : 'paso';
HACER                   : 'hacer';
FINPARA                 : 'finpara';
BORRAR                  : 'borrar';
PANTALLA                : 'pantalla';
ESPERAR                 : 'esperar';
TECLA                   : 'tecla';
SEGUNDOS                : 'segundos';
MILISEGUNDOS            : 'milisegundos';
SI                      : 'si';
ENTONCES                : 'entonces';
SINO                    : 'sino';
FINSI                   : 'finsi';
SEGUN                   : 'segun';
CASO                    : 'caso';
DE                      : 'de';
OTRO                    : 'otro';
MODO                    : 'modo';
FINSEGUN                : 'finsegun';
MIENTRAS                : 'mientras';
FINMIENTRAS             : 'finmientras';
REPETIR                 : 'repetir';
QUE                     : 'que';
SUBPROCESO              : 'subproceso';
FINSUBPROCESO           : 'finsubproceso';
FUNCION                 : 'funcion';
FINFUNCION              : 'finfuncion';
LIMPIAR                 : 'limpiar';

COMMENT                 : '/*' .*? '*/' -> skip ;
LINE_COMMENT            : '//' ~[\r\n]* -> skip ;
WS		        : [ \t\r\n]+ -> skip ;
INT                     : ('-')? [0-9]+;
DOUBLE                  : ('-')?[0-9]+[.][0-9]+;
STRING                  : ('\'' | '"') ~['\'"']* ('\'' | '"');
BOOL                    : ('verdadero' | 'falso') ;
ID 		        : [a-zA-Z][a-zA-Z0-9_]* ;
