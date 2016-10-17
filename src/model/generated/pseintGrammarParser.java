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
		NEGOP=1, ASIGOP=2, COMPOP=3, BINOP=4, MULOP=5, SUMOP=6, RESOP=7, PYC=8, 
		DOSP=9, PARIZQ=10, PARDER=11, CORIZQ=12, CORDER=13, COMA=14, COMMENT=15, 
		LINE_COMMENT=16, WS=17, INT=18, DOUBLE=19, STRING=20, BOOL=21, ALGORITMO=22, 
		FINALGORITMO=23, PROCESO=24, FINPROCESO=25, DEFINIR=26, COMO=27, NUMERO=28, 
		NUMERICO=29, ENTERO=30, CARACTER=31, REAL=32, LOGICO=33, TEXTO=34, CADENA=35, 
		LEER=36, ESCRIBIR=37, DIMENSION=38, PARA=39, HASTA=40, CON=41, PASO=42, 
		HACER=43, FINPARA=44, BORRAR=45, PANTALLA=46, ESPERAR=47, TECLA=48, SEGUNDOS=49, 
		MILISEGUNDOS=50, SI=51, ENTONCES=52, SINO=53, FINSI=54, SEGUN=55, CASO=56, 
		DE=57, OTRO=58, MODO=59, FINSEGUN=60, MIENTRAS=61, FINMIENTRAS=62, REPETIR=63, 
		QUE=64, SUBPROCESO=65, FINSUBPROCESO=66, FUNCION=67, FINFUNCION=68, LIMPIAR=69, 
		MOD=70, NO=71, VERDADERO=72, FALSO=73, ID=74;
	public static final int
		RULE_pseint = 0, RULE_procedimiento = 1, RULE_principal = 2, RULE_comandos = 3, 
		RULE_comando = 4, RULE_bloqueSi = 5, RULE_bloquePara = 6, RULE_bloqueMientras = 7, 
		RULE_bloqueRepetir = 8, RULE_bloqueSegun = 9, RULE_bloqueDeclaracion = 10, 
		RULE_bloqueAsignacion = 11, RULE_bloqueDimension = 12, RULE_bloqueBorrarPantalla = 13, 
		RULE_bloqueEscribir = 14, RULE_bloqueLeer = 15, RULE_bloqueEsperar = 16, 
		RULE_expr = 17, RULE_valor = 18, RULE_exprLista = 19, RULE_idLista = 20, 
		RULE_varArreglo = 21, RULE_tipoDato = 22, RULE_tipoDatoEntero = 23, RULE_tipoDatoReal = 24, 
		RULE_tipoDatoCaracter = 25, RULE_tipoDatoTexto = 26, RULE_tipoDatoLogico = 27;
	public static final String[] ruleNames = {
		"pseint", "procedimiento", "principal", "comandos", "comando", "bloqueSi", 
		"bloquePara", "bloqueMientras", "bloqueRepetir", "bloqueSegun", "bloqueDeclaracion", 
		"bloqueAsignacion", "bloqueDimension", "bloqueBorrarPantalla", "bloqueEscribir", 
		"bloqueLeer", "bloqueEsperar", "expr", "valor", "exprLista", "idLista", 
		"varArreglo", "tipoDato", "tipoDatoEntero", "tipoDatoReal", "tipoDatoCaracter", 
		"tipoDatoTexto", "tipoDatoLogico"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'<-'", null, null, null, null, null, "';'", "':'", "'('", 
		"')'", "'['", "']'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEGOP", "ASIGOP", "COMPOP", "BINOP", "MULOP", "SUMOP", "RESOP", 
		"PYC", "DOSP", "PARIZQ", "PARDER", "CORIZQ", "CORDER", "COMA", "COMMENT", 
		"LINE_COMMENT", "WS", "INT", "DOUBLE", "STRING", "BOOL", "ALGORITMO", 
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUBPROCESO || _la==FUNCION) {
				{
				{
				setState(56);
				procedimiento();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			principal();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUBPROCESO || _la==FUNCION) {
				{
				{
				setState(63);
				procedimiento();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
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
			setState(85);
			_la = _input.LA(1);
			if (_la==PARIZQ) {
				{
				setState(77);
				match(PARIZQ);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(78);
					match(ID);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
				match(PARDER);
				}
			}

			setState(87);
			comandos();
			setState(88);
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
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==ALGORITMO || _la==PROCESO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(91);
			match(ID);
			setState(92);
			comandos();
			setState(93);
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
			setState(99);
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
				setState(95);
				comando();
				setState(96);
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
			setState(113);
			switch (_input.LA(1)) {
			case SI:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				bloqueSi();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				bloquePara();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				bloqueMientras();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				bloqueRepetir();
				}
				break;
			case SEGUN:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				bloqueSegun();
				}
				break;
			case DEFINIR:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				bloqueDeclaracion();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				bloqueAsignacion();
				}
				break;
			case DIMENSION:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				bloqueDimension();
				}
				break;
			case BORRAR:
			case LIMPIAR:
				enterOuterAlt(_localctx, 9);
				{
				setState(109);
				bloqueBorrarPantalla();
				}
				break;
			case ESCRIBIR:
				enterOuterAlt(_localctx, 10);
				{
				setState(110);
				bloqueEscribir();
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 11);
				{
				setState(111);
				bloqueLeer();
				}
				break;
			case ESPERAR:
				enterOuterAlt(_localctx, 12);
				{
				setState(112);
				bloqueEsperar();
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
			setState(115);
			match(SI);
			setState(116);
			expr(0);
			setState(117);
			match(ENTONCES);
			setState(118);
			comandos();
			setState(121);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(119);
				match(SINO);
				setState(120);
				comandos();
				}
			}

			setState(123);
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
			setState(125);
			match(PARA);
			setState(126);
			match(ID);
			setState(131);
			_la = _input.LA(1);
			if (_la==CORIZQ) {
				{
				setState(127);
				match(CORIZQ);
				setState(128);
				exprLista();
				setState(129);
				match(CORDER);
				}
			}

			setState(133);
			match(ASIGOP);
			setState(134);
			expr(0);
			setState(135);
			match(HASTA);
			setState(136);
			expr(0);
			setState(140);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(137);
				match(CON);
				setState(138);
				match(PASO);
				setState(139);
				expr(0);
				}
			}

			setState(142);
			match(HACER);
			setState(143);
			comandos();
			setState(144);
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
			setState(146);
			match(MIENTRAS);
			setState(147);
			expr(0);
			setState(148);
			match(HACER);
			setState(149);
			comandos();
			setState(150);
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
			setState(152);
			match(REPETIR);
			setState(153);
			comandos();
			setState(154);
			match(HASTA);
			setState(155);
			match(QUE);
			setState(156);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode HACER() { return getToken(pseintGrammarParser.HACER, 0); }
		public TerminalNode FINSEGUN() { return getToken(pseintGrammarParser.FINSEGUN, 0); }
		public List<TerminalNode> CASO() { return getTokens(pseintGrammarParser.CASO); }
		public TerminalNode CASO(int i) {
			return getToken(pseintGrammarParser.CASO, i);
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
		public TerminalNode DE() { return getToken(pseintGrammarParser.DE, 0); }
		public TerminalNode OTRO() { return getToken(pseintGrammarParser.OTRO, 0); }
		public TerminalNode MODO() { return getToken(pseintGrammarParser.MODO, 0); }
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
			setState(158);
			match(SEGUN);
			setState(159);
			expr(0);
			setState(160);
			match(HACER);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASO) {
				{
				{
				setState(161);
				match(CASO);
				setState(162);
				expr(0);
				setState(163);
				match(DOSP);
				setState(164);
				comandos();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			_la = _input.LA(1);
			if (_la==DE) {
				{
				setState(171);
				match(DE);
				setState(172);
				match(OTRO);
				setState(173);
				match(MODO);
				setState(174);
				match(DOSP);
				setState(175);
				comandos();
				}
			}

			setState(178);
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
			setState(180);
			match(DEFINIR);
			setState(181);
			idLista();
			setState(182);
			match(COMO);
			setState(183);
			tipoDato();
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
			setState(186);
			match(ID);
			setState(191);
			_la = _input.LA(1);
			if (_la==CORIZQ) {
				{
				setState(187);
				match(CORIZQ);
				setState(188);
				exprLista();
				setState(189);
				match(CORDER);
				}
			}

			setState(193);
			match(ASIGOP);
			setState(194);
			expr(0);
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
			setState(197);
			match(DIMENSION);
			setState(198);
			varArreglo();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(199);
				match(COMA);
				setState(200);
				varArreglo();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
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
			setState(214);
			switch (_input.LA(1)) {
			case BORRAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(BORRAR);
				setState(209);
				match(PANTALLA);
				setState(210);
				match(PYC);
				}
				break;
			case LIMPIAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(LIMPIAR);
				setState(212);
				match(PANTALLA);
				setState(213);
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
			setState(216);
			match(ESCRIBIR);
			setState(217);
			exprLista();
			setState(218);
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
			setState(220);
			match(LEER);
			setState(221);
			idLista();
			setState(222);
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
			setState(232);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(ESPERAR);
				setState(225);
				match(TECLA);
				setState(226);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(ESPERAR);
				setState(228);
				expr(0);
				setState(229);
				_la = _input.LA(1);
				if ( !(_la==SEGUNDOS || _la==MILISEGUNDOS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(230);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode RESOP() { return getToken(pseintGrammarParser.RESOP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode ID() { return getToken(pseintGrammarParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(pseintGrammarParser.PARIZQ, 0); }
		public ExprListaContext exprLista() {
			return getRuleContext(ExprListaContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(pseintGrammarParser.PARDER, 0); }
		public TerminalNode CORIZQ() { return getToken(pseintGrammarParser.CORIZQ, 0); }
		public TerminalNode CORDER() { return getToken(pseintGrammarParser.CORDER, 0); }
		public TerminalNode MULOP() { return getToken(pseintGrammarParser.MULOP, 0); }
		public TerminalNode SUMOP() { return getToken(pseintGrammarParser.SUMOP, 0); }
		public TerminalNode BINOP() { return getToken(pseintGrammarParser.BINOP, 0); }
		public TerminalNode COMPOP() { return getToken(pseintGrammarParser.COMPOP, 0); }
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(235);
				match(RESOP);
				setState(236);
				expr(7);
				}
				break;
			case 2:
				{
				setState(237);
				valor();
				}
				break;
			case 3:
				{
				setState(238);
				match(ID);
				{
				setState(239);
				match(PARIZQ);
				setState(240);
				exprLista();
				setState(241);
				match(PARDER);
				}
				}
				break;
			case 4:
				{
				setState(243);
				match(ID);
				setState(244);
				match(CORIZQ);
				setState(245);
				exprLista();
				setState(246);
				match(CORDER);
				}
				break;
			case 5:
				{
				setState(248);
				match(PARIZQ);
				setState(249);
				expr(0);
				setState(250);
				match(PARDER);
				}
				break;
			case 6:
				{
				setState(252);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(270);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(255);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(256);
						match(MULOP);
						setState(257);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(258);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(259);
						match(SUMOP);
						setState(260);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(261);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(262);
						match(RESOP);
						setState(263);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(264);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(265);
						match(BINOP);
						setState(266);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(268);
						match(COMPOP);
						setState(269);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 36, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		enterRule(_localctx, 38, RULE_exprLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			expr(0);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(278);
				match(COMA);
				setState(279);
				expr(0);
				}
				}
				setState(284);
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
		enterRule(_localctx, 40, RULE_idLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(ID);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(286);
				match(COMA);
				setState(287);
				match(ID);
				}
				}
				setState(292);
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
		enterRule(_localctx, 42, RULE_varArreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(ID);
			setState(294);
			match(CORIZQ);
			setState(295);
			exprLista();
			setState(296);
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
		enterRule(_localctx, 44, RULE_tipoDato);
		try {
			setState(303);
			switch (_input.LA(1)) {
			case NUMERO:
			case NUMERICO:
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				tipoDatoEntero();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				tipoDatoReal();
				}
				break;
			case CARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				tipoDatoCaracter();
				}
				break;
			case TEXTO:
			case CADENA:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				tipoDatoTexto();
				}
				break;
			case LOGICO:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
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
		enterRule(_localctx, 46, RULE_tipoDatoEntero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
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
		enterRule(_localctx, 48, RULE_tipoDatoReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
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
		enterRule(_localctx, 50, RULE_tipoDatoCaracter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
		enterRule(_localctx, 52, RULE_tipoDatoTexto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
		enterRule(_localctx, 54, RULE_tipoDatoLogico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3L\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\3\2\3\3\3\3\3\3\5\3M\n\3\3\3\3\3\3"+
		"\3\7\3R\n\3\f\3\16\3U\13\3\3\3\5\3X\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\5\5f\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6t\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7|\n\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0086\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008f\n\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a9\n\13\f\13\16\13\u00ac\13\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00b3\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u00c2\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\7\16\u00cc\n\16\f\16\16\16\u00cf\13\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00d9\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00eb\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0100\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0111\n\23\f\23\16\23\u0114\13\23"+
		"\3\24\3\24\3\25\3\25\3\25\7\25\u011b\n\25\f\25\16\25\u011e\13\25\3\26"+
		"\3\26\3\26\7\26\u0123\n\26\f\26\16\26\u0126\13\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u0132\n\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\35\2\3$\36\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668\2\n\4\2CCEE\4\2DDFF\4\2\30\30\32\32\4\2\31"+
		"\31\33\33\3\2\63\64\3\2\24\27\3\2\36 \3\2$%\u014b\2=\3\2\2\2\4I\3\2\2"+
		"\2\6\\\3\2\2\2\be\3\2\2\2\ns\3\2\2\2\fu\3\2\2\2\16\177\3\2\2\2\20\u0094"+
		"\3\2\2\2\22\u009a\3\2\2\2\24\u00a0\3\2\2\2\26\u00b6\3\2\2\2\30\u00bc\3"+
		"\2\2\2\32\u00c7\3\2\2\2\34\u00d8\3\2\2\2\36\u00da\3\2\2\2 \u00de\3\2\2"+
		"\2\"\u00ea\3\2\2\2$\u00ff\3\2\2\2&\u0115\3\2\2\2(\u0117\3\2\2\2*\u011f"+
		"\3\2\2\2,\u0127\3\2\2\2.\u0131\3\2\2\2\60\u0133\3\2\2\2\62\u0135\3\2\2"+
		"\2\64\u0137\3\2\2\2\66\u0139\3\2\2\28\u013b\3\2\2\2:<\5\4\3\2;:\3\2\2"+
		"\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@D\5\6\4\2AC\5\4\3"+
		"\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\2\2"+
		"\3H\3\3\2\2\2IL\t\2\2\2JK\7L\2\2KM\7\4\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2"+
		"\2NW\7L\2\2OS\7\f\2\2PR\7L\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"TV\3\2\2\2US\3\2\2\2VX\7\r\2\2WO\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\5\b\5\2"+
		"Z[\t\3\2\2[\5\3\2\2\2\\]\t\4\2\2]^\7L\2\2^_\5\b\5\2_`\t\5\2\2`\7\3\2\2"+
		"\2ab\5\n\6\2bc\5\b\5\2cf\3\2\2\2df\3\2\2\2ea\3\2\2\2ed\3\2\2\2f\t\3\2"+
		"\2\2gt\5\f\7\2ht\5\16\b\2it\5\20\t\2jt\5\22\n\2kt\5\24\13\2lt\5\26\f\2"+
		"mt\5\30\r\2nt\5\32\16\2ot\5\34\17\2pt\5\36\20\2qt\5 \21\2rt\5\"\22\2s"+
		"g\3\2\2\2sh\3\2\2\2si\3\2\2\2sj\3\2\2\2sk\3\2\2\2sl\3\2\2\2sm\3\2\2\2"+
		"sn\3\2\2\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\13\3\2\2\2uv\7\65"+
		"\2\2vw\5$\23\2wx\7\66\2\2x{\5\b\5\2yz\7\67\2\2z|\5\b\5\2{y\3\2\2\2{|\3"+
		"\2\2\2|}\3\2\2\2}~\78\2\2~\r\3\2\2\2\177\u0080\7)\2\2\u0080\u0085\7L\2"+
		"\2\u0081\u0082\7\16\2\2\u0082\u0083\5(\25\2\u0083\u0084\7\17\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\7\4\2\2\u0088\u0089\5$\23\2\u0089\u008a\7*\2\2\u008a"+
		"\u008e\5$\23\2\u008b\u008c\7+\2\2\u008c\u008d\7,\2\2\u008d\u008f\5$\23"+
		"\2\u008e\u008b\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091"+
		"\7-\2\2\u0091\u0092\5\b\5\2\u0092\u0093\7.\2\2\u0093\17\3\2\2\2\u0094"+
		"\u0095\7?\2\2\u0095\u0096\5$\23\2\u0096\u0097\7-\2\2\u0097\u0098\5\b\5"+
		"\2\u0098\u0099\7@\2\2\u0099\21\3\2\2\2\u009a\u009b\7A\2\2\u009b\u009c"+
		"\5\b\5\2\u009c\u009d\7*\2\2\u009d\u009e\7B\2\2\u009e\u009f\5$\23\2\u009f"+
		"\23\3\2\2\2\u00a0\u00a1\79\2\2\u00a1\u00a2\5$\23\2\u00a2\u00aa\7-\2\2"+
		"\u00a3\u00a4\7:\2\2\u00a4\u00a5\5$\23\2\u00a5\u00a6\7\13\2\2\u00a6\u00a7"+
		"\5\b\5\2\u00a7\u00a9\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b2\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u00ae\7;\2\2\u00ae\u00af\7<\2\2\u00af\u00b0\7=\2\2\u00b0\u00b1"+
		"\7\13\2\2\u00b1\u00b3\5\b\5\2\u00b2\u00ad\3\2\2\2\u00b2\u00b3\3\2\2\2"+
		"\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7>\2\2\u00b5\25\3\2\2\2\u00b6\u00b7\7"+
		"\34\2\2\u00b7\u00b8\5*\26\2\u00b8\u00b9\7\35\2\2\u00b9\u00ba\5.\30\2\u00ba"+
		"\u00bb\7\n\2\2\u00bb\27\3\2\2\2\u00bc\u00c1\7L\2\2\u00bd\u00be\7\16\2"+
		"\2\u00be\u00bf\5(\25\2\u00bf\u00c0\7\17\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00bd\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\4"+
		"\2\2\u00c4\u00c5\5$\23\2\u00c5\u00c6\7\n\2\2\u00c6\31\3\2\2\2\u00c7\u00c8"+
		"\7(\2\2\u00c8\u00cd\5,\27\2\u00c9\u00ca\7\20\2\2\u00ca\u00cc\5,\27\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\n\2\2\u00d1"+
		"\33\3\2\2\2\u00d2\u00d3\7/\2\2\u00d3\u00d4\7\60\2\2\u00d4\u00d9\7\n\2"+
		"\2\u00d5\u00d6\7G\2\2\u00d6\u00d7\7\60\2\2\u00d7\u00d9\7\n\2\2\u00d8\u00d2"+
		"\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\35\3\2\2\2\u00da\u00db\7\'\2\2\u00db"+
		"\u00dc\5(\25\2\u00dc\u00dd\7\n\2\2\u00dd\37\3\2\2\2\u00de\u00df\7&\2\2"+
		"\u00df\u00e0\5*\26\2\u00e0\u00e1\7\n\2\2\u00e1!\3\2\2\2\u00e2\u00e3\7"+
		"\61\2\2\u00e3\u00e4\7\62\2\2\u00e4\u00eb\7\n\2\2\u00e5\u00e6\7\61\2\2"+
		"\u00e6\u00e7\5$\23\2\u00e7\u00e8\t\6\2\2\u00e8\u00e9\7\n\2\2\u00e9\u00eb"+
		"\3\2\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e5\3\2\2\2\u00eb#\3\2\2\2\u00ec"+
		"\u00ed\b\23\1\2\u00ed\u00ee\7\t\2\2\u00ee\u0100\5$\23\t\u00ef\u0100\5"+
		"&\24\2\u00f0\u00f1\7L\2\2\u00f1\u00f2\7\f\2\2\u00f2\u00f3\5(\25\2\u00f3"+
		"\u00f4\7\r\2\2\u00f4\u0100\3\2\2\2\u00f5\u00f6\7L\2\2\u00f6\u00f7\7\16"+
		"\2\2\u00f7\u00f8\5(\25\2\u00f8\u00f9\7\17\2\2\u00f9\u0100\3\2\2\2\u00fa"+
		"\u00fb\7\f\2\2\u00fb\u00fc\5$\23\2\u00fc\u00fd\7\r\2\2\u00fd\u0100\3\2"+
		"\2\2\u00fe\u0100\7L\2\2\u00ff\u00ec\3\2\2\2\u00ff\u00ef\3\2\2\2\u00ff"+
		"\u00f0\3\2\2\2\u00ff\u00f5\3\2\2\2\u00ff\u00fa\3\2\2\2\u00ff\u00fe\3\2"+
		"\2\2\u0100\u0112\3\2\2\2\u0101\u0102\f\f\2\2\u0102\u0103\7\7\2\2\u0103"+
		"\u0111\5$\23\r\u0104\u0105\f\13\2\2\u0105\u0106\7\b\2\2\u0106\u0111\5"+
		"$\23\f\u0107\u0108\f\n\2\2\u0108\u0109\7\t\2\2\u0109\u0111\5$\23\13\u010a"+
		"\u010b\f\b\2\2\u010b\u010c\7\6\2\2\u010c\u0111\5$\23\t\u010d\u010e\f\7"+
		"\2\2\u010e\u010f\7\5\2\2\u010f\u0111\5$\23\b\u0110\u0101\3\2\2\2\u0110"+
		"\u0104\3\2\2\2\u0110\u0107\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u010d\3\2"+
		"\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"%\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\t\7\2\2\u0116\'\3\2\2\2\u0117"+
		"\u011c\5$\23\2\u0118\u0119\7\20\2\2\u0119\u011b\5$\23\2\u011a\u0118\3"+
		"\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		")\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0124\7L\2\2\u0120\u0121\7\20\2\2"+
		"\u0121\u0123\7L\2\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125+\3\2\2\2\u0126\u0124\3\2\2\2\u0127"+
		"\u0128\7L\2\2\u0128\u0129\7\16\2\2\u0129\u012a\5(\25\2\u012a\u012b\7\17"+
		"\2\2\u012b-\3\2\2\2\u012c\u0132\5\60\31\2\u012d\u0132\5\62\32\2\u012e"+
		"\u0132\5\64\33\2\u012f\u0132\5\66\34\2\u0130\u0132\58\35\2\u0131\u012c"+
		"\3\2\2\2\u0131\u012d\3\2\2\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132/\3\2\2\2\u0133\u0134\t\b\2\2\u0134\61\3\2\2\2\u0135"+
		"\u0136\7\"\2\2\u0136\63\3\2\2\2\u0137\u0138\7!\2\2\u0138\65\3\2\2\2\u0139"+
		"\u013a\t\t\2\2\u013a\67\3\2\2\2\u013b\u013c\7#\2\2\u013c9\3\2\2\2\30="+
		"DLSWes{\u0085\u008e\u00aa\u00b2\u00c1\u00cd\u00d8\u00ea\u00ff\u0110\u0112"+
		"\u011c\u0124\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}