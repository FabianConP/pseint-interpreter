// Generated from pseintGrammar.g4 by ANTLR 4.5
package model.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pseintGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEGOP=1, ASIGOP=2, COMPOP=3, BINOP=4, MULOP=5, POTOP=6, SUMOP=7, RESOP=8, 
		PYC=9, DOSP=10, PARIZQ=11, PARDER=12, CORIZQ=13, CORDER=14, COMA=15, COMMENT=16, 
		LINE_COMMENT=17, WS=18, INT=19, DOUBLE=20, STRING=21, BOOL=22, ALGORITMO=23, 
		FINALGORITMO=24, PROCESO=25, FINPROCESO=26, DEFINIR=27, COMO=28, NUMERO=29, 
		NUMERICO=30, ENTERO=31, CARACTER=32, REAL=33, LOGICO=34, TEXTO=35, CADENA=36, 
		LEER=37, ESCRIBIR=38, DIMENSION=39, PARA=40, HASTA=41, CON=42, PASO=43, 
		HACER=44, FINPARA=45, BORRAR=46, PANTALLA=47, ESPERAR=48, TECLA=49, SEGUNDOS=50, 
		MILISEGUNDOS=51, SI=52, ENTONCES=53, SINO=54, FINSI=55, SEGUN=56, CASO=57, 
		DE=58, OTRO=59, MODO=60, FINSEGUN=61, MIENTRAS=62, FINMIENTRAS=63, REPETIR=64, 
		QUE=65, SUBPROCESO=66, FINSUBPROCESO=67, FUNCION=68, FINFUNCION=69, LIMPIAR=70, 
		MOD=71, NO=72, VERDADERO=73, FALSO=74, ID=75;
	public static final int
		RULE_pseint = 0, RULE_procedimiento = 1, RULE_principal = 2, RULE_comandos = 3, 
		RULE_comando = 4, RULE_bloqueSi = 5, RULE_bloquePara = 6, RULE_bloqueMientras = 7, 
		RULE_bloqueRepetir = 8, RULE_bloqueSegun = 9, RULE_bloqueDeclaracion = 10, 
		RULE_bloqueAsignacion = 11, RULE_bloqueDimension = 12, RULE_bloqueBorrarPantalla = 13, 
		RULE_bloqueEscribir = 14, RULE_bloqueLeer = 15, RULE_bloqueEsperar = 16, 
		RULE_bloqueLlamarFuncion = 17, RULE_expr = 18, RULE_valor = 19, RULE_exprLista = 20, 
		RULE_idLista = 21, RULE_casoLista = 22, RULE_llamarFuncion = 23, RULE_varArreglo = 24, 
		RULE_tipoDato = 25, RULE_tipoDatoEntero = 26, RULE_tipoDatoReal = 27, 
		RULE_tipoDatoCaracter = 28, RULE_tipoDatoTexto = 29, RULE_tipoDatoLogico = 30;
	public static final String[] ruleNames = {
		"pseint", "procedimiento", "principal", "comandos", "comando", "bloqueSi", 
		"bloquePara", "bloqueMientras", "bloqueRepetir", "bloqueSegun", "bloqueDeclaracion", 
		"bloqueAsignacion", "bloqueDimension", "bloqueBorrarPantalla", "bloqueEscribir", 
		"bloqueLeer", "bloqueEsperar", "bloqueLlamarFuncion", "expr", "valor", 
		"exprLista", "idLista", "casoLista", "llamarFuncion", "varArreglo", "tipoDato", 
		"tipoDatoEntero", "tipoDatoReal", "tipoDatoCaracter", "tipoDatoTexto", 
		"tipoDatoLogico"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'<-'", null, null, null, null, null, null, "';'", "':'", 
		"'('", "')'", "'['", "']'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEGOP", "ASIGOP", "COMPOP", "BINOP", "MULOP", "POTOP", "SUMOP", 
		"RESOP", "PYC", "DOSP", "PARIZQ", "PARDER", "CORIZQ", "CORDER", "COMA", 
		"COMMENT", "LINE_COMMENT", "WS", "INT", "DOUBLE", "STRING", "BOOL", "ALGORITMO", 
		"FINALGORITMO", "PROCESO", "FINPROCESO", "DEFINIR", "COMO", "NUMERO", 
		"NUMERICO", "ENTERO", "CARACTER", "REAL", "LOGICO", "TEXTO", "CADENA", 
		"LEER", "ESCRIBIR", "DIMENSION", "PARA", "HASTA", "CON", "PASO", "HACER", 
		"FINPARA", "BORRAR", "PANTALLA", "ESPERAR", "TECLA", "SEGUNDOS", "MILISEGUNDOS", 
		"SI", "ENTONCES", "SINO", "FINSI", "SEGUN", "CASO", "DE", "OTRO", "MODO", 
		"FINSEGUN", "MIENTRAS", "FINMIENTRAS", "REPETIR", "QUE", "SUBPROCESO", 
		"FINSUBPROCESO", "FUNCION", "FINFUNCION", "LIMPIAR", "MOD", "NO", "VERDADERO", 
		"FALSO", "ID"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "pseintGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pseintGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PseintContext extends ParserRuleContext {
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(pseintGrammarParser.EOF, 0); }
		public List<ProcedimientoContext> procedimiento() {
			return getRuleContexts(ProcedimientoContext.class);
		}
		public ProcedimientoContext procedimiento(int i) {
			return getRuleContext(ProcedimientoContext.class,i);
		}
		public PseintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterPseint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitPseint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitPseint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseintContext pseint() throws RecognitionException {
		PseintContext _localctx = new PseintContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pseint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUBPROCESO || _la==FUNCION) {
				{
				{
				setState(62);
				procedimiento();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			principal();
			setState(69);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedimientoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pseintGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pseintGrammarParser.ID, i);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FUNCION() { return getToken(pseintGrammarParser.FUNCION, 0); }
		public TerminalNode SUBPROCESO() { return getToken(pseintGrammarParser.SUBPROCESO, 0); }
		public TerminalNode FINFUNCION() { return getToken(pseintGrammarParser.FINFUNCION, 0); }
		public TerminalNode FINSUBPROCESO() { return getToken(pseintGrammarParser.FINSUBPROCESO, 0); }
		public TerminalNode ASIGOP() { return getToken(pseintGrammarParser.ASIGOP, 0); }
		public TerminalNode PARIZQ() { return getToken(pseintGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(pseintGrammarParser.PARDER, 0); }
		public IdListaContext idLista() {
			return getRuleContext(IdListaContext.class,0);
		}
		public ProcedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimiento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterProcedimiento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitProcedimiento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitProcedimiento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedimientoContext procedimiento() throws RecognitionException {
		ProcedimientoContext _localctx = new ProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_procedimiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==SUBPROCESO || _la==FUNCION) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(72);
				match(ID);
				setState(73);
				match(ASIGOP);
				}
				break;
			}
			setState(76);
			match(ID);
			setState(82);
			_la = _input.LA(1);
			if (_la==PARIZQ) {
				{
				setState(77);
				match(PARIZQ);
				setState(79);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(78);
					idLista();
					}
				}

				setState(81);
				match(PARDER);
				}
			}

			setState(84);
			comandos();
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==FINSUBPROCESO || _la==FINFUNCION) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrincipalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pseintGrammarParser.ID, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode PROCESO() { return getToken(pseintGrammarParser.PROCESO, 0); }
		public TerminalNode ALGORITMO() { return getToken(pseintGrammarParser.ALGORITMO, 0); }
		public TerminalNode FINPROCESO() { return getToken(pseintGrammarParser.FINPROCESO, 0); }
		public TerminalNode FINALGORITMO() { return getToken(pseintGrammarParser.FINALGORITMO, 0); }
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_principal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !(_la==ALGORITMO || _la==PROCESO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(88);
			match(ID);
			setState(89);
			comandos();
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==FINALGORITMO || _la==FINPROCESO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comandos);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case DEFINIR:
			case LEER:
			case ESCRIBIR:
			case DIMENSION:
			case PARA:
			case BORRAR:
			case ESPERAR:
			case SI:
			case SEGUN:
			case MIENTRAS:
			case REPETIR:
			case LIMPIAR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				comando();
				setState(93);
				comandos();
				}
				break;
			case FINALGORITMO:
			case FINPROCESO:
			case HASTA:
			case FINPARA:
			case SINO:
			case FINSI:
			case CASO:
			case DE:
			case FINSEGUN:
			case FINMIENTRAS:
			case FINSUBPROCESO:
			case FINFUNCION:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public BloqueSiContext bloqueSi() {
			return getRuleContext(BloqueSiContext.class,0);
		}
		public BloqueParaContext bloquePara() {
			return getRuleContext(BloqueParaContext.class,0);
		}
		public BloqueMientrasContext bloqueMientras() {
			return getRuleContext(BloqueMientrasContext.class,0);
		}
		public BloqueRepetirContext bloqueRepetir() {
			return getRuleContext(BloqueRepetirContext.class,0);
		}
		public BloqueSegunContext bloqueSegun() {
			return getRuleContext(BloqueSegunContext.class,0);
		}
		public BloqueDeclaracionContext bloqueDeclaracion() {
			return getRuleContext(BloqueDeclaracionContext.class,0);
		}
		public BloqueAsignacionContext bloqueAsignacion() {
			return getRuleContext(BloqueAsignacionContext.class,0);
		}
		public BloqueDimensionContext bloqueDimension() {
			return getRuleContext(BloqueDimensionContext.class,0);
		}
		public BloqueBorrarPantallaContext bloqueBorrarPantalla() {
			return getRuleContext(BloqueBorrarPantallaContext.class,0);
		}
		public BloqueEscribirContext bloqueEscribir() {
			return getRuleContext(BloqueEscribirContext.class,0);
		}
		public BloqueLeerContext bloqueLeer() {
			return getRuleContext(BloqueLeerContext.class,0);
		}
		public BloqueEsperarContext bloqueEsperar() {
			return getRuleContext(BloqueEsperarContext.class,0);
		}
		public BloqueLlamarFuncionContext bloqueLlamarFuncion() {
			return getRuleContext(BloqueLlamarFuncionContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comando);
		try {
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				bloqueSi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				bloquePara();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				bloqueMientras();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				bloqueRepetir();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				bloqueSegun();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				bloqueDeclaracion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(104);
				bloqueAsignacion();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(105);
				bloqueDimension();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(106);
				bloqueBorrarPantalla();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(107);
				bloqueEscribir();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(108);
				bloqueLeer();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(109);
				bloqueEsperar();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(110);
				bloqueLlamarFuncion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueSiContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(pseintGrammarParser.SI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(pseintGrammarParser.ENTONCES, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public TerminalNode FINSI() { return getToken(pseintGrammarParser.FINSI, 0); }
		public TerminalNode SINO() { return getToken(pseintGrammarParser.SINO, 0); }
		public BloqueSiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueSi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterBloqueSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitBloqueSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitBloqueSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueSiContext bloqueSi() throws RecognitionException {
		BloqueSiContext _localctx = new BloqueSiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloqueSi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(SI);
			setState(114);
			expr(0);
			setState(115);
			match(ENTONCES);
			setState(116);
			comandos();
			setState(119);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(117);
				match(SINO);
				setState(118);
				comandos();
				}
			}

			setState(121);
			match(FINSI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(pseintGrammarParser.PARA, 0); }
		public TerminalNode ID() { return getToken(pseintGrammarParser.ID, 0); }
		public TerminalNode ASIGOP() { return getToken(pseintGrammarParser.ASIGOP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode HASTA() { return getToken(pseintGrammarParser.HASTA, 0); }
		public TerminalNode HACER() { return getToken(pseintGrammarParser.HACER, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FINPARA() { return getToken(pseintGrammarParser.FINPARA, 0); }
		public TerminalNode CORIZQ() { return getToken(pseintGrammarParser.CORIZQ, 0); }
		public ExprListaContext exprLista() {
			return getRuleContext(ExprListaContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(pseintGrammarParser.CORDER, 0); }
		public TerminalNode CON() { return getToken(pseintGrammarParser.CON, 0); }
		public TerminalNode PASO() { return getToken(pseintGrammarParser.PASO, 0); }
		public BloqueParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloquePara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterBloquePara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitBloquePara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitBloquePara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueParaContext bloquePara() throws RecognitionException {
		BloqueParaContext _localctx = new BloqueParaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloquePara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(PARA);
			setState(124);
			match(ID);
			setState(129);
			_la = _input.LA(1);
			if (_la==CORIZQ) {
				{
				setState(125);
				match(CORIZQ);
				setState(126);
				exprLista();
				setState(127);
				match(CORDER);
				}
			}

			setState(131);
			match(ASIGOP);
			setState(132);
			expr(0);
			setState(133);
			match(HASTA);
			setState(134);
			expr(0);
			setState(138);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(135);
				match(CON);
				setState(136);
				match(PASO);
				setState(137);
				expr(0);
				}
			}

			setState(140);
			match(HACER);
			setState(141);
			comandos();
			setState(142);
			match(FINPARA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueMientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(pseintGrammarParser.MIENTRAS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode HACER() { return getToken(pseintGrammarParser.HACER, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FINMIENTRAS() { return getToken(pseintGrammarParser.FINMIENTRAS, 0); }
		public BloqueMientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueMientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterBloqueMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitBloqueMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitBloqueMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueMientrasContext bloqueMientras() throws RecognitionException {
		BloqueMientrasContext _localctx = new BloqueMientrasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloqueMientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(MIENTRAS);
			setState(145);
			expr(0);
			setState(146);
			match(HACER);
			setState(147);
			comandos();
			setState(148);
			match(FINMIENTRAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueRepetirContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(pseintGrammarParser.REPETIR, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode HASTA() { return getToken(pseintGrammarParser.HASTA, 0); }
		public TerminalNode QUE() { return getToken(pseintGrammarParser.QUE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BloqueRepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueRepetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterBloqueRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitBloqueRepetir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitBloqueRepetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueRepetirContext bloqueRepetir() throws RecognitionException {
		BloqueRepetirContext _localctx = new BloqueRepetirContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloqueRepetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(REPETIR);
			setState(151);
			comandos();
			setState(152);
			match(HASTA);
			setState(153);
			match(QUE);
			setState(154);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueSegunContext extends ParserRuleContext {
		public TerminalNode SEGUN() { return getToken(pseintGrammarParser.SEGUN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode HACER() { return getToken(pseintGrammarParser.HACER, 0); }
		public CasoListaContext casoLista() {
			return getRuleContext(CasoListaContext.class,0);
		}
		public TerminalNode FINSEGUN() { return getToken(pseintGrammarParser.FINSEGUN, 0); }
		public TerminalNode DE() { return getToken(pseintGrammarParser.DE, 0); }
		public TerminalNode OTRO() { return getToken(pseintGrammarParser.OTRO, 0); }
		public TerminalNode MODO() { return getToken(pseintGrammarParser.MODO, 0); }
		public TerminalNode DOSP() { return getToken(pseintGrammarParser.DOSP, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public BloqueSegunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueSegun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterBloqueSegun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitBloqueSegun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitBloqueSegun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueSegunContext bloqueSegun() throws RecognitionException {
		BloqueSegunContext _localctx = new BloqueSegunContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloqueSegun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(SEGUN);
			setState(157);
			expr(0);
			setState(158);
			match(HACER);
			setState(159);
			casoLista();
			setState(165);
			_la = _input.LA(1);
			if (_la==DE) {
				{
				setState(160);
				match(DE);
				setState(161);
				match(OTRO);
				setState(162);
				match(MODO);
				setState(163);
				match(DOSP);
				setState(164);
				comandos();
				}
			}

			setState(167);
			match(FINSEGUN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueDeclaracionContext extends ParserRuleContext {
		public TerminalNode DEFINIR() { return getToken(pseintGrammarParser.DEFINIR, 0); }
		public IdListaContext idLista() {
			return getRuleContext(IdListaContext.class,0);
		}
		public TerminalNode COMO() { return getToken(pseintGrammarParser.COMO, 0); }
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public TerminalNode PYC() { return getToken(pseintGrammarParser.PYC, 0); }
		public BloqueDeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueDeclaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterBloqueDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitBloqueDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitBloqueDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueDeclaracionContext bloqueDeclaracion() throws RecognitionException {
		BloqueDeclaracionContext _localctx = new BloqueDeclaracionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloqueDeclaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(DEFINIR);
			setState(170);
			idLista();
			setState(171);
			match(COMO);
			setState(172);
			tipoDato();
			setState(173);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueAsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pseintGrammarParser.ID, 0); }
		public TerminalNode ASIGOP() { return getToken(pseintGrammarParser.ASIGOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PYC() { return getToken(pseintGrammarParser.PYC, 0); }
		public TerminalNode CORIZQ() { return getToken(pseintGrammarParser.CORIZQ, 0); }
		public ExprListaContext exprLista() {
			return getRuleContext(ExprListaContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(pseintGrammarParser.CORDER, 0); }
		public BloqueAsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueAsignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterBloqueAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitBloqueAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitBloqueAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueAsignacionContext bloqueAsignacion() throws RecognitionException {
		BloqueAsignacionContext _localctx = new BloqueAsignacionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloqueAsignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ID);
			setState(180);
			_la = _input.LA(1);
			if (_la==CORIZQ) {
				{
				setState(176);
				match(CORIZQ);
				setState(177);
				exprLista();
				setState(178);
				match(CORDER);
				}
			}

			setState(182);
			match(ASIGOP);
			setState(183);
			expr(0);
			setState(184);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueDimensionContext extends ParserRuleContext {
		public TerminalNode DIMENSION() { return getToken(pseintGrammarParser.DIMENSION, 0); }
		public List<VarArregloContext> varArreglo() {
			return getRuleContexts(VarArregloContext.class);
		}
		public VarArregloContext varArreglo(int i) {
			return getRuleContext(VarArregloContext.class,i);
		}
		public TerminalNode PYC() { return getToken(pseintGrammarParser.PYC, 0); }
		public List<TerminalNode> COMA() { return getTokens(pseintGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pseintGrammarParser.COMA, i);
		}
		public BloqueDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueDimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterBloqueDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitBloqueDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitBloqueDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueDimensionContext bloqueDimension() throws RecognitionException {
		BloqueDimensionContext _localctx = new BloqueDimensionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bloqueDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(DIMENSION);
			setState(187);
			varArreglo();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(188);
				match(COMA);
				setState(189);
				varArreglo();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueBorrarPantallaContext extends ParserRuleContext {
		public TerminalNode BORRAR() { return getToken(pseintGrammarParser.BORRAR, 0); }
		public TerminalNode PANTALLA() { return getToken(pseintGrammarParser.PANTALLA, 0); }
		public TerminalNode PYC() { return getToken(pseintGrammarParser.PYC, 0); }
		public TerminalNode LIMPIAR() { return getToken(pseintGrammarParser.LIMPIAR, 0); }
		public BloqueBorrarPantallaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueBorrarPantalla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterBloqueBorrarPantalla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitBloqueBorrarPantalla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitBloqueBorrarPantalla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueBorrarPantallaContext bloqueBorrarPantalla() throws RecognitionException {
		BloqueBorrarPantallaContext _localctx = new BloqueBorrarPantallaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bloqueBorrarPantalla);
		try {
			setState(203);
			switch (_input.LA(1)) {
			case BORRAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(BORRAR);
				setState(198);
				match(PANTALLA);
				setState(199);
				match(PYC);
				}
				break;
			case LIMPIAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(LIMPIAR);
				setState(201);
				match(PANTALLA);
				setState(202);
				match(PYC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueEscribirContext extends ParserRuleContext {
		public TerminalNode ESCRIBIR() { return getToken(pseintGrammarParser.ESCRIBIR, 0); }
		public ExprListaContext exprLista() {
			return getRuleContext(ExprListaContext.class,0);
		}
		public TerminalNode PYC() { return getToken(pseintGrammarParser.PYC, 0); }
		public BloqueEscribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueEscribir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterBloqueEscribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitBloqueEscribir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitBloqueEscribir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueEscribirContext bloqueEscribir() throws RecognitionException {
		BloqueEscribirContext _localctx = new BloqueEscribirContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bloqueEscribir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ESCRIBIR);
			setState(206);
			exprLista();
			setState(207);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueLeerContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(pseintGrammarParser.LEER, 0); }
		public IdListaContext idLista() {
			return getRuleContext(IdListaContext.class,0);
		}
		public TerminalNode PYC() { return getToken(pseintGrammarParser.PYC, 0); }
		public BloqueLeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueLeer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterBloqueLeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitBloqueLeer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitBloqueLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueLeerContext bloqueLeer() throws RecognitionException {
		BloqueLeerContext _localctx = new BloqueLeerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bloqueLeer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(LEER);
			setState(210);
			idLista();
			setState(211);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueEsperarContext extends ParserRuleContext {
		public TerminalNode ESPERAR() { return getToken(pseintGrammarParser.ESPERAR, 0); }
		public TerminalNode TECLA() { return getToken(pseintGrammarParser.TECLA, 0); }
		public TerminalNode PYC() { return getToken(pseintGrammarParser.PYC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEGUNDOS() { return getToken(pseintGrammarParser.SEGUNDOS, 0); }
		public TerminalNode MILISEGUNDOS() { return getToken(pseintGrammarParser.MILISEGUNDOS, 0); }
		public BloqueEsperarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueEsperar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterBloqueEsperar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitBloqueEsperar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitBloqueEsperar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueEsperarContext bloqueEsperar() throws RecognitionException {
		BloqueEsperarContext _localctx = new BloqueEsperarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bloqueEsperar);
		int _la;
		try {
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(ESPERAR);
				setState(214);
				match(TECLA);
				setState(215);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(ESPERAR);
				setState(217);
				expr(0);
				setState(218);
				_la = _input.LA(1);
				if ( !(_la==SEGUNDOS || _la==MILISEGUNDOS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(219);
				match(PYC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueLlamarFuncionContext extends ParserRuleContext {
		public LlamarFuncionContext llamarFuncion() {
			return getRuleContext(LlamarFuncionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(pseintGrammarParser.PYC, 0); }
		public BloqueLlamarFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueLlamarFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterBloqueLlamarFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitBloqueLlamarFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitBloqueLlamarFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueLlamarFuncionContext bloqueLlamarFuncion() throws RecognitionException {
		BloqueLlamarFuncionContext _localctx = new BloqueLlamarFuncionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bloqueLlamarFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			llamarFuncion();
			setState(224);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode RESOP() { return getToken(pseintGrammarParser.RESOP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEGOP() { return getToken(pseintGrammarParser.NEGOP, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public LlamarFuncionContext llamarFuncion() {
			return getRuleContext(LlamarFuncionContext.class,0);
		}
		public VarArregloContext varArreglo() {
			return getRuleContext(VarArregloContext.class,0);
		}
		public TerminalNode PARIZQ() { return getToken(pseintGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(pseintGrammarParser.PARDER, 0); }
		public TerminalNode ID() { return getToken(pseintGrammarParser.ID, 0); }
		public TerminalNode POTOP() { return getToken(pseintGrammarParser.POTOP, 0); }
		public TerminalNode MULOP() { return getToken(pseintGrammarParser.MULOP, 0); }
		public TerminalNode SUMOP() { return getToken(pseintGrammarParser.SUMOP, 0); }
		public TerminalNode COMPOP() { return getToken(pseintGrammarParser.COMPOP, 0); }
		public TerminalNode BINOP() { return getToken(pseintGrammarParser.BINOP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(227);
				match(RESOP);
				setState(228);
				expr(8);
				}
				break;
			case 2:
				{
				setState(229);
				match(NEGOP);
				setState(230);
				expr(7);
				}
				break;
			case 3:
				{
				setState(231);
				valor();
				}
				break;
			case 4:
				{
				setState(232);
				llamarFuncion();
				}
				break;
			case 5:
				{
				setState(233);
				varArreglo();
				}
				break;
			case 6:
				{
				setState(234);
				match(PARIZQ);
				setState(235);
				expr(0);
				setState(236);
				match(PARDER);
				}
				break;
			case 7:
				{
				setState(238);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(259);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(242);
						match(POTOP);
						setState(243);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(245);
						match(MULOP);
						setState(246);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(248);
						match(RESOP);
						setState(249);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(251);
						match(SUMOP);
						setState(252);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(254);
						match(COMPOP);
						setState(255);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(257);
						match(BINOP);
						setState(258);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(pseintGrammarParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(pseintGrammarParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(pseintGrammarParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(pseintGrammarParser.BOOL, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListaContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(pseintGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pseintGrammarParser.COMA, i);
		}
		public ExprListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterExprLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitExprLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitExprLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListaContext exprLista() throws RecognitionException {
		ExprListaContext _localctx = new ExprListaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			expr(0);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(267);
				match(COMA);
				setState(268);
				expr(0);
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdListaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pseintGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pseintGrammarParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(pseintGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pseintGrammarParser.COMA, i);
		}
		public IdListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterIdLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitIdLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitIdLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListaContext idLista() throws RecognitionException {
		IdListaContext _localctx = new IdListaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_idLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(ID);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(275);
				match(COMA);
				setState(276);
				match(ID);
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasoListaContext extends ParserRuleContext {
		public List<TerminalNode> CASO() { return getTokens(pseintGrammarParser.CASO); }
		public TerminalNode CASO(int i) {
			return getToken(pseintGrammarParser.CASO, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> DOSP() { return getTokens(pseintGrammarParser.DOSP); }
		public TerminalNode DOSP(int i) {
			return getToken(pseintGrammarParser.DOSP, i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public CasoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casoLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterCasoLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitCasoLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitCasoLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoListaContext casoLista() throws RecognitionException {
		CasoListaContext _localctx = new CasoListaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_casoLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASO) {
				{
				{
				setState(282);
				match(CASO);
				setState(283);
				expr(0);
				setState(284);
				match(DOSP);
				setState(285);
				comandos();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LlamarFuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pseintGrammarParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(pseintGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(pseintGrammarParser.PARDER, 0); }
		public ExprListaContext exprLista() {
			return getRuleContext(ExprListaContext.class,0);
		}
		public LlamarFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamarFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterLlamarFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitLlamarFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitLlamarFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamarFuncionContext llamarFuncion() throws RecognitionException {
		LlamarFuncionContext _localctx = new LlamarFuncionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_llamarFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(ID);
			setState(293);
			match(PARIZQ);
			setState(295);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEGOP) | (1L << RESOP) | (1L << PARIZQ) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL))) != 0) || _la==ID) {
				{
				setState(294);
				exprLista();
				}
			}

			setState(297);
			match(PARDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarArregloContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pseintGrammarParser.ID, 0); }
		public TerminalNode CORIZQ() { return getToken(pseintGrammarParser.CORIZQ, 0); }
		public ExprListaContext exprLista() {
			return getRuleContext(ExprListaContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(pseintGrammarParser.CORDER, 0); }
		public VarArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varArreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterVarArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitVarArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitVarArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarArregloContext varArreglo() throws RecognitionException {
		VarArregloContext _localctx = new VarArregloContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_varArreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(ID);
			setState(300);
			match(CORIZQ);
			setState(301);
			exprLista();
			setState(302);
			match(CORDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoDatoContext extends ParserRuleContext {
		public TipoDatoEnteroContext tipoDatoEntero() {
			return getRuleContext(TipoDatoEnteroContext.class,0);
		}
		public TipoDatoRealContext tipoDatoReal() {
			return getRuleContext(TipoDatoRealContext.class,0);
		}
		public TipoDatoCaracterContext tipoDatoCaracter() {
			return getRuleContext(TipoDatoCaracterContext.class,0);
		}
		public TipoDatoTextoContext tipoDatoTexto() {
			return getRuleContext(TipoDatoTextoContext.class,0);
		}
		public TipoDatoLogicoContext tipoDatoLogico() {
			return getRuleContext(TipoDatoLogicoContext.class,0);
		}
		public TipoDatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterTipoDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitTipoDato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitTipoDato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoDatoContext tipoDato() throws RecognitionException {
		TipoDatoContext _localctx = new TipoDatoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tipoDato);
		try {
			setState(309);
			switch (_input.LA(1)) {
			case NUMERO:
			case NUMERICO:
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				tipoDatoEntero();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				tipoDatoReal();
				}
				break;
			case CARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				tipoDatoCaracter();
				}
				break;
			case TEXTO:
			case CADENA:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				tipoDatoTexto();
				}
				break;
			case LOGICO:
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				tipoDatoLogico();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoDatoEnteroContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(pseintGrammarParser.NUMERO, 0); }
		public TerminalNode NUMERICO() { return getToken(pseintGrammarParser.NUMERICO, 0); }
		public TerminalNode ENTERO() { return getToken(pseintGrammarParser.ENTERO, 0); }
		public TipoDatoEnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDatoEntero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterTipoDatoEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitTipoDatoEntero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitTipoDatoEntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoDatoEnteroContext tipoDatoEntero() throws RecognitionException {
		TipoDatoEnteroContext _localctx = new TipoDatoEnteroContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tipoDatoEntero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NUMERICO) | (1L << ENTERO))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoDatoRealContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(pseintGrammarParser.REAL, 0); }
		public TipoDatoRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDatoReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterTipoDatoReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitTipoDatoReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitTipoDatoReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoDatoRealContext tipoDatoReal() throws RecognitionException {
		TipoDatoRealContext _localctx = new TipoDatoRealContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tipoDatoReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoDatoCaracterContext extends ParserRuleContext {
		public TerminalNode CARACTER() { return getToken(pseintGrammarParser.CARACTER, 0); }
		public TipoDatoCaracterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDatoCaracter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterTipoDatoCaracter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitTipoDatoCaracter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitTipoDatoCaracter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoDatoCaracterContext tipoDatoCaracter() throws RecognitionException {
		TipoDatoCaracterContext _localctx = new TipoDatoCaracterContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tipoDatoCaracter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(CARACTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoDatoTextoContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(pseintGrammarParser.TEXTO, 0); }
		public TerminalNode CADENA() { return getToken(pseintGrammarParser.CADENA, 0); }
		public TipoDatoTextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDatoTexto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterTipoDatoTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitTipoDatoTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitTipoDatoTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoDatoTextoContext tipoDatoTexto() throws RecognitionException {
		TipoDatoTextoContext _localctx = new TipoDatoTextoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tipoDatoTexto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !(_la==TEXTO || _la==CADENA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoDatoLogicoContext extends ParserRuleContext {
		public TerminalNode LOGICO() { return getToken(pseintGrammarParser.LOGICO, 0); }
		public TipoDatoLogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDatoLogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterTipoDatoLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitTipoDatoLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitTipoDatoLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoDatoLogicoContext tipoDatoLogico() throws RecognitionException {
		TipoDatoLogicoContext _localctx = new TipoDatoLogicoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tipoDatoLogico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(LOGICO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3M\u0144\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3M\n\3\3\3\3\3\3\3"+
		"\5\3R\n\3\3\3\5\3U\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\5\5c\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6r\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7z\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0084\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008d\n\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00a8\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00b7\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\7\16\u00c1\n\16\f\16\16\16\u00c4\13\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00ce\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e0\n\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f2"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u0106\n\24\f\24\16\24\u0109\13\24\3\25"+
		"\3\25\3\26\3\26\3\26\7\26\u0110\n\26\f\26\16\26\u0113\13\26\3\27\3\27"+
		"\3\27\7\27\u0118\n\27\f\27\16\27\u011b\13\27\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u0122\n\30\f\30\16\30\u0125\13\30\3\31\3\31\3\31\5\31\u012a\n\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u0138"+
		"\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \2\3&!\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\n\4\2DDFF\4\2"+
		"EEGG\4\2\31\31\33\33\4\2\32\32\34\34\3\2\64\65\3\2\25\30\3\2\37!\3\2%"+
		"&\u0151\2C\3\2\2\2\4I\3\2\2\2\6Y\3\2\2\2\bb\3\2\2\2\nq\3\2\2\2\fs\3\2"+
		"\2\2\16}\3\2\2\2\20\u0092\3\2\2\2\22\u0098\3\2\2\2\24\u009e\3\2\2\2\26"+
		"\u00ab\3\2\2\2\30\u00b1\3\2\2\2\32\u00bc\3\2\2\2\34\u00cd\3\2\2\2\36\u00cf"+
		"\3\2\2\2 \u00d3\3\2\2\2\"\u00df\3\2\2\2$\u00e1\3\2\2\2&\u00f1\3\2\2\2"+
		"(\u010a\3\2\2\2*\u010c\3\2\2\2,\u0114\3\2\2\2.\u0123\3\2\2\2\60\u0126"+
		"\3\2\2\2\62\u012d\3\2\2\2\64\u0137\3\2\2\2\66\u0139\3\2\2\28\u013b\3\2"+
		"\2\2:\u013d\3\2\2\2<\u013f\3\2\2\2>\u0141\3\2\2\2@B\5\4\3\2A@\3\2\2\2"+
		"BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\5\6\4\2GH\7\2\2\3"+
		"H\3\3\2\2\2IL\t\2\2\2JK\7M\2\2KM\7\4\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2"+
		"NT\7M\2\2OQ\7\r\2\2PR\5,\27\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2SU\7\16\2\2"+
		"TO\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\5\b\5\2WX\t\3\2\2X\5\3\2\2\2YZ\t\4\2"+
		"\2Z[\7M\2\2[\\\5\b\5\2\\]\t\5\2\2]\7\3\2\2\2^_\5\n\6\2_`\5\b\5\2`c\3\2"+
		"\2\2ac\3\2\2\2b^\3\2\2\2ba\3\2\2\2c\t\3\2\2\2dr\5\f\7\2er\5\16\b\2fr\5"+
		"\20\t\2gr\5\22\n\2hr\5\24\13\2ir\5\26\f\2jr\5\30\r\2kr\5\32\16\2lr\5\34"+
		"\17\2mr\5\36\20\2nr\5 \21\2or\5\"\22\2pr\5$\23\2qd\3\2\2\2qe\3\2\2\2q"+
		"f\3\2\2\2qg\3\2\2\2qh\3\2\2\2qi\3\2\2\2qj\3\2\2\2qk\3\2\2\2ql\3\2\2\2"+
		"qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\13\3\2\2\2st\7\66\2\2tu\5&\24"+
		"\2uv\7\67\2\2vy\5\b\5\2wx\78\2\2xz\5\b\5\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2"+
		"\2{|\79\2\2|\r\3\2\2\2}~\7*\2\2~\u0083\7M\2\2\177\u0080\7\17\2\2\u0080"+
		"\u0081\5*\26\2\u0081\u0082\7\20\2\2\u0082\u0084\3\2\2\2\u0083\177\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\4\2\2\u0086"+
		"\u0087\5&\24\2\u0087\u0088\7+\2\2\u0088\u008c\5&\24\2\u0089\u008a\7,\2"+
		"\2\u008a\u008b\7-\2\2\u008b\u008d\5&\24\2\u008c\u0089\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7.\2\2\u008f\u0090\5\b\5\2\u0090"+
		"\u0091\7/\2\2\u0091\17\3\2\2\2\u0092\u0093\7@\2\2\u0093\u0094\5&\24\2"+
		"\u0094\u0095\7.\2\2\u0095\u0096\5\b\5\2\u0096\u0097\7A\2\2\u0097\21\3"+
		"\2\2\2\u0098\u0099\7B\2\2\u0099\u009a\5\b\5\2\u009a\u009b\7+\2\2\u009b"+
		"\u009c\7C\2\2\u009c\u009d\5&\24\2\u009d\23\3\2\2\2\u009e\u009f\7:\2\2"+
		"\u009f\u00a0\5&\24\2\u00a0\u00a1\7.\2\2\u00a1\u00a7\5.\30\2\u00a2\u00a3"+
		"\7<\2\2\u00a3\u00a4\7=\2\2\u00a4\u00a5\7>\2\2\u00a5\u00a6\7\f\2\2\u00a6"+
		"\u00a8\5\b\5\2\u00a7\u00a2\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00aa\7?\2\2\u00aa\25\3\2\2\2\u00ab\u00ac\7\35\2\2\u00ac\u00ad"+
		"\5,\27\2\u00ad\u00ae\7\36\2\2\u00ae\u00af\5\64\33\2\u00af\u00b0\7\13\2"+
		"\2\u00b0\27\3\2\2\2\u00b1\u00b6\7M\2\2\u00b2\u00b3\7\17\2\2\u00b3\u00b4"+
		"\5*\26\2\u00b4\u00b5\7\20\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b2\3\2\2\2"+
		"\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\4\2\2\u00b9\u00ba"+
		"\5&\24\2\u00ba\u00bb\7\13\2\2\u00bb\31\3\2\2\2\u00bc\u00bd\7)\2\2\u00bd"+
		"\u00c2\5\62\32\2\u00be\u00bf\7\21\2\2\u00bf\u00c1\5\62\32\2\u00c0\u00be"+
		"\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\13\2\2\u00c6\33\3\2\2"+
		"\2\u00c7\u00c8\7\60\2\2\u00c8\u00c9\7\61\2\2\u00c9\u00ce\7\13\2\2\u00ca"+
		"\u00cb\7H\2\2\u00cb\u00cc\7\61\2\2\u00cc\u00ce\7\13\2\2\u00cd\u00c7\3"+
		"\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\35\3\2\2\2\u00cf\u00d0\7(\2\2\u00d0\u00d1"+
		"\5*\26\2\u00d1\u00d2\7\13\2\2\u00d2\37\3\2\2\2\u00d3\u00d4\7\'\2\2\u00d4"+
		"\u00d5\5,\27\2\u00d5\u00d6\7\13\2\2\u00d6!\3\2\2\2\u00d7\u00d8\7\62\2"+
		"\2\u00d8\u00d9\7\63\2\2\u00d9\u00e0\7\13\2\2\u00da\u00db\7\62\2\2\u00db"+
		"\u00dc\5&\24\2\u00dc\u00dd\t\6\2\2\u00dd\u00de\7\13\2\2\u00de\u00e0\3"+
		"\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00da\3\2\2\2\u00e0#\3\2\2\2\u00e1\u00e2"+
		"\5\60\31\2\u00e2\u00e3\7\13\2\2\u00e3%\3\2\2\2\u00e4\u00e5\b\24\1\2\u00e5"+
		"\u00e6\7\n\2\2\u00e6\u00f2\5&\24\n\u00e7\u00e8\7\3\2\2\u00e8\u00f2\5&"+
		"\24\t\u00e9\u00f2\5(\25\2\u00ea\u00f2\5\60\31\2\u00eb\u00f2\5\62\32\2"+
		"\u00ec\u00ed\7\r\2\2\u00ed\u00ee\5&\24\2\u00ee\u00ef\7\16\2\2\u00ef\u00f2"+
		"\3\2\2\2\u00f0\u00f2\7M\2\2\u00f1\u00e4\3\2\2\2\u00f1\u00e7\3\2\2\2\u00f1"+
		"\u00e9\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00ec\3\2"+
		"\2\2\u00f1\u00f0\3\2\2\2\u00f2\u0107\3\2\2\2\u00f3\u00f4\f\16\2\2\u00f4"+
		"\u00f5\7\b\2\2\u00f5\u0106\5&\24\17\u00f6\u00f7\f\r\2\2\u00f7\u00f8\7"+
		"\7\2\2\u00f8\u0106\5&\24\16\u00f9\u00fa\f\f\2\2\u00fa\u00fb\7\n\2\2\u00fb"+
		"\u0106\5&\24\r\u00fc\u00fd\f\13\2\2\u00fd\u00fe\7\t\2\2\u00fe\u0106\5"+
		"&\24\f\u00ff\u0100\f\b\2\2\u0100\u0101\7\5\2\2\u0101\u0106\5&\24\t\u0102"+
		"\u0103\f\7\2\2\u0103\u0104\7\6\2\2\u0104\u0106\5&\24\b\u0105\u00f3\3\2"+
		"\2\2\u0105\u00f6\3\2\2\2\u0105\u00f9\3\2\2\2\u0105\u00fc\3\2\2\2\u0105"+
		"\u00ff\3\2\2\2\u0105\u0102\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\'\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b"+
		"\t\7\2\2\u010b)\3\2\2\2\u010c\u0111\5&\24\2\u010d\u010e\7\21\2\2\u010e"+
		"\u0110\5&\24\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112+\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0119"+
		"\7M\2\2\u0115\u0116\7\21\2\2\u0116\u0118\7M\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a-\3\2\2\2"+
		"\u011b\u0119\3\2\2\2\u011c\u011d\7;\2\2\u011d\u011e\5&\24\2\u011e\u011f"+
		"\7\f\2\2\u011f\u0120\5\b\5\2\u0120\u0122\3\2\2\2\u0121\u011c\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124/\3\2\2\2"+
		"\u0125\u0123\3\2\2\2\u0126\u0127\7M\2\2\u0127\u0129\7\r\2\2\u0128\u012a"+
		"\5*\26\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012c\7\16\2\2\u012c\61\3\2\2\2\u012d\u012e\7M\2\2\u012e\u012f\7\17\2"+
		"\2\u012f\u0130\5*\26\2\u0130\u0131\7\20\2\2\u0131\63\3\2\2\2\u0132\u0138"+
		"\5\66\34\2\u0133\u0138\58\35\2\u0134\u0138\5:\36\2\u0135\u0138\5<\37\2"+
		"\u0136\u0138\5> \2\u0137\u0132\3\2\2\2\u0137\u0133\3\2\2\2\u0137\u0134"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\65\3\2\2\2\u0139"+
		"\u013a\t\b\2\2\u013a\67\3\2\2\2\u013b\u013c\7#\2\2\u013c9\3\2\2\2\u013d"+
		"\u013e\7\"\2\2\u013e;\3\2\2\2\u013f\u0140\t\t\2\2\u0140=\3\2\2\2\u0141"+
		"\u0142\7$\2\2\u0142?\3\2\2\2\30CLQTbqy\u0083\u008c\u00a7\u00b6\u00c2\u00cd"+
		"\u00df\u00f1\u0105\u0107\u0111\u0119\u0123\u0129\u0137";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}