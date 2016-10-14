// Generated from pseintGrammar.g by ANTLR 4.5.1
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
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCION=1, SUBPROCESO=2, ID=3, ASIGOP=4, PARIZQ=5, PARDER=6, FINFUNCION=7, 
		FINSUBPROCESO=8, PROCESO=9, ALGORITMO=10, FINPROCESO=11, FINALGORITMO=12, 
		SI=13, ENTONCES=14, SINO=15, FINSI=16, PARA=17, OP_ASIG=18, HASTA=19, 
		CON=20, PASO=21, HACER=22, FINPARA=23, MIENTRAS=24, FINMIENTRAS=25, REPETIR=26, 
		QUE=27, SEGUN=28, CASO=29, DOSP=30, DE=31, OTRO=32, MODO=33, FINSEGUN=34, 
		DEFINIR=35, COMA=36, COMO=37, PYC=38, DIMENSION=39, CORIZQ=40, CORDER=41, 
		BORRAR=42, PANTALLA=43, LIMPIAR=44, ESCRIBIR=45, LEER=46, ESPERAR=47, 
		TECLA=48, SEGUNDOS=49, MILISEGUNDOS=50, INTEGER=51, DOUBLE=52, MULOP=53, 
		SUMOP=54, BINOP=55, COMPOP=56, NEGOP=57, NUMERO=58, NUMERICO=59, ENTERO=60, 
		REAL=61, CARACTER=62, TEXTO=63, CADENA=64, LOGICO=65;
	public static final int
		RULE_pseint = 0, RULE_procedure = 1, RULE_main = 2, RULE_commands = 3, 
		RULE_command = 4, RULE_bloqueSi = 5, RULE_bloquePara = 6, RULE_bloqueMientras = 7, 
		RULE_bloqueRepetir = 8, RULE_bloqueSegun = 9, RULE_bloqueDeclaracion = 10, 
		RULE_bloqueAsignacion = 11, RULE_bloqueDimension = 12, RULE_bloqueBorrarPantalla = 13, 
		RULE_bloqueEscribir = 14, RULE_bloqueLeer = 15, RULE_bloqueEsperar = 16, 
		RULE_expr = 17, RULE_booleanExpr = 18, RULE_comparisonExpr = 19, RULE_tipoDato = 20, 
		RULE_tipoDatoEntero = 21, RULE_tipoDatoReal = 22, RULE_tipoDatoCaracter = 23, 
		RULE_tipoDatoTexto = 24, RULE_tipoDatoLogico = 25;
	public static final String[] ruleNames = {
		"pseint", "procedure", "main", "commands", "command", "bloqueSi", "bloquePara", 
		"bloqueMientras", "bloqueRepetir", "bloqueSegun", "bloqueDeclaracion", 
		"bloqueAsignacion", "bloqueDimension", "bloqueBorrarPantalla", "bloqueEscribir", 
		"bloqueLeer", "bloqueEsperar", "expr", "booleanExpr", "comparisonExpr", 
		"tipoDato", "tipoDatoEntero", "tipoDatoReal", "tipoDatoCaracter", "tipoDatoTexto", 
		"tipoDatoLogico"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FUNCION", "SUBPROCESO", "ID", "ASIGOP", "PARIZQ", "PARDER", "FINFUNCION", 
		"FINSUBPROCESO", "PROCESO", "ALGORITMO", "FINPROCESO", "FINALGORITMO", 
		"SI", "ENTONCES", "SINO", "FINSI", "PARA", "OP_ASIG", "HASTA", "CON", 
		"PASO", "HACER", "FINPARA", "MIENTRAS", "FINMIENTRAS", "REPETIR", "QUE", 
		"SEGUN", "CASO", "DOSP", "DE", "OTRO", "MODO", "FINSEGUN", "DEFINIR", 
		"COMA", "COMO", "PYC", "DIMENSION", "CORIZQ", "CORDER", "BORRAR", "PANTALLA", 
		"LIMPIAR", "ESCRIBIR", "LEER", "ESPERAR", "TECLA", "SEGUNDOS", "MILISEGUNDOS", 
		"INTEGER", "DOUBLE", "MULOP", "SUMOP", "BINOP", "COMPOP", "NEGOP", "NUMERO", 
		"NUMERICO", "ENTERO", "REAL", "CARACTER", "TEXTO", "CADENA", "LOGICO"
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
	public String getGrammarFileName() { return "pseintGrammar.g"; }

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
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCION || _la==SUBPROCESO) {
				{
				{
				setState(52);
				procedure();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			main();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCION || _la==SUBPROCESO) {
				{
				{
				setState(59);
				procedure();
				}
				}
				setState(64);
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

	public static class ProcedureContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pseintGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pseintGrammarParser.ID, i);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode FUNCION() { return getToken(pseintGrammarParser.FUNCION, 0); }
		public TerminalNode SUBPROCESO() { return getToken(pseintGrammarParser.SUBPROCESO, 0); }
		public TerminalNode FINFUNCION() { return getToken(pseintGrammarParser.FINFUNCION, 0); }
		public TerminalNode FINSUBPROCESO() { return getToken(pseintGrammarParser.FINSUBPROCESO, 0); }
		public TerminalNode ASIGOP() { return getToken(pseintGrammarParser.ASIGOP, 0); }
		public TerminalNode PARIZQ() { return getToken(pseintGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(pseintGrammarParser.PARDER, 0); }
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !(_la==FUNCION || _la==SUBPROCESO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(68);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(66);
				match(ID);
				setState(67);
				match(ASIGOP);
				}
				break;
			}
			setState(70);
			match(ID);
			setState(79);
			_la = _input.LA(1);
			if (_la==PARIZQ) {
				{
				setState(71);
				match(PARIZQ);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(72);
					match(ID);
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				match(PARDER);
				}
			}

			setState(81);
			commands();
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==FINFUNCION || _la==FINSUBPROCESO) ) {
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pseintGrammarParser.ID, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode PROCESO() { return getToken(pseintGrammarParser.PROCESO, 0); }
		public TerminalNode ALGORITMO() { return getToken(pseintGrammarParser.ALGORITMO, 0); }
		public TerminalNode FINPROCESO() { return getToken(pseintGrammarParser.FINPROCESO, 0); }
		public TerminalNode FINALGORITMO() { return getToken(pseintGrammarParser.FINALGORITMO, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !(_la==PROCESO || _la==ALGORITMO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(85);
			match(ID);
			setState(86);
			commands();
			setState(87);
			_la = _input.LA(1);
			if ( !(_la==FINPROCESO || _la==FINALGORITMO) ) {
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

	public static class CommandsContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_commands);
		try {
			setState(93);
			switch (_input.LA(1)) {
			case ID:
			case SI:
			case PARA:
			case MIENTRAS:
			case REPETIR:
			case SEGUN:
			case DEFINIR:
			case DIMENSION:
			case BORRAR:
			case LIMPIAR:
			case ESCRIBIR:
			case LEER:
			case ESPERAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				command();
				setState(90);
				commands();
				}
				break;
			case FINFUNCION:
			case FINSUBPROCESO:
			case FINPROCESO:
			case FINALGORITMO:
			case SINO:
			case FINSI:
			case HASTA:
			case FINPARA:
			case FINMIENTRAS:
			case CASO:
			case DE:
			case FINSEGUN:
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

	public static class CommandContext extends ParserRuleContext {
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
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_command);
		try {
			setState(107);
			switch (_input.LA(1)) {
			case SI:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				bloqueSi();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				bloquePara();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				bloqueMientras();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				bloqueRepetir();
				}
				break;
			case SEGUN:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				bloqueSegun();
				}
				break;
			case DEFINIR:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				bloqueDeclaracion();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				bloqueAsignacion();
				}
				break;
			case DIMENSION:
				enterOuterAlt(_localctx, 8);
				{
				setState(102);
				bloqueDimension();
				}
				break;
			case BORRAR:
			case LIMPIAR:
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				bloqueBorrarPantalla();
				}
				break;
			case ESCRIBIR:
				enterOuterAlt(_localctx, 10);
				{
				setState(104);
				bloqueEscribir();
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 11);
				{
				setState(105);
				bloqueLeer();
				}
				break;
			case ESPERAR:
				enterOuterAlt(_localctx, 12);
				{
				setState(106);
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
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
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
			setState(109);
			match(SI);
			setState(110);
			expr(0);
			setState(111);
			match(ENTONCES);
			setState(112);
			commands();
			setState(115);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(113);
				match(SINO);
				setState(114);
				commands();
				}
			}

			setState(117);
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
		public TerminalNode OP_ASIG() { return getToken(pseintGrammarParser.OP_ASIG, 0); }
		public TerminalNode HASTA() { return getToken(pseintGrammarParser.HASTA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode HACER() { return getToken(pseintGrammarParser.HACER, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode FINPARA() { return getToken(pseintGrammarParser.FINPARA, 0); }
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
			setState(119);
			match(PARA);
			setState(120);
			match(ID);
			setState(121);
			match(OP_ASIG);
			setState(122);
			match(HASTA);
			setState(123);
			expr(0);
			setState(127);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(124);
				match(CON);
				setState(125);
				match(PASO);
				setState(126);
				expr(0);
				}
			}

			setState(129);
			match(HACER);
			setState(130);
			commands();
			setState(131);
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
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public TerminalNode HACER() { return getToken(pseintGrammarParser.HACER, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
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
			setState(133);
			match(MIENTRAS);
			setState(134);
			booleanExpr();
			setState(135);
			match(HACER);
			setState(136);
			commands();
			setState(137);
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
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode HASTA() { return getToken(pseintGrammarParser.HASTA, 0); }
		public TerminalNode QUE() { return getToken(pseintGrammarParser.QUE, 0); }
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
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
			setState(139);
			match(REPETIR);
			setState(140);
			commands();
			setState(141);
			match(HASTA);
			setState(142);
			match(QUE);
			setState(143);
			booleanExpr();
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
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
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
			setState(145);
			match(SEGUN);
			setState(146);
			expr(0);
			setState(147);
			match(HACER);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASO) {
				{
				{
				setState(148);
				match(CASO);
				setState(149);
				expr(0);
				setState(150);
				match(DOSP);
				setState(151);
				commands();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			_la = _input.LA(1);
			if (_la==DE) {
				{
				setState(158);
				match(DE);
				setState(159);
				match(OTRO);
				setState(160);
				match(MODO);
				setState(161);
				match(DOSP);
				setState(162);
				commands();
				}
			}

			setState(165);
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
		public List<TerminalNode> ID() { return getTokens(pseintGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pseintGrammarParser.ID, i);
		}
		public TerminalNode COMO() { return getToken(pseintGrammarParser.COMO, 0); }
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public TerminalNode PYC() { return getToken(pseintGrammarParser.PYC, 0); }
		public List<TerminalNode> COMA() { return getTokens(pseintGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pseintGrammarParser.COMA, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(DEFINIR);
			setState(168);
			match(ID);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(169);
				match(COMA);
				setState(170);
				match(ID);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(COMO);
			setState(177);
			tipoDato();
			setState(178);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ID);
			setState(181);
			match(ASIGOP);
			setState(182);
			expr(0);
			setState(183);
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
		public List<TerminalNode> ID() { return getTokens(pseintGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pseintGrammarParser.ID, i);
		}
		public TerminalNode PYC() { return getToken(pseintGrammarParser.PYC, 0); }
		public List<TerminalNode> CORIZQ() { return getTokens(pseintGrammarParser.CORIZQ); }
		public TerminalNode CORIZQ(int i) {
			return getToken(pseintGrammarParser.CORIZQ, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CORDER() { return getTokens(pseintGrammarParser.CORDER); }
		public TerminalNode CORDER(int i) {
			return getToken(pseintGrammarParser.CORDER, i);
		}
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
			setState(185);
			match(DIMENSION);
			setState(186);
			match(ID);
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				match(CORIZQ);
				setState(188);
				expr(0);
				setState(189);
				match(CORDER);
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CORIZQ );
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(195);
				match(COMA);
				setState(196);
				match(ID);
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(197);
					match(CORIZQ);
					setState(198);
					expr(0);
					setState(199);
					match(CORDER);
					}
					}
					setState(203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CORIZQ );
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
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
			setState(218);
			switch (_input.LA(1)) {
			case BORRAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(BORRAR);
				setState(213);
				match(PANTALLA);
				setState(214);
				match(PYC);
				}
				break;
			case LIMPIAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(LIMPIAR);
				setState(216);
				match(PANTALLA);
				setState(217);
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
		public TerminalNode PYC() { return getToken(pseintGrammarParser.PYC, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(ESCRIBIR);
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				expr(0);
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << PARIZQ) | (1L << INTEGER) | (1L << DOUBLE))) != 0) );
			setState(226);
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
		public TerminalNode PYC() { return getToken(pseintGrammarParser.PYC, 0); }
		public List<TerminalNode> ID() { return getTokens(pseintGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pseintGrammarParser.ID, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(LEER);
			setState(230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(229);
				match(ID);
				}
				}
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(234);
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
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(ESPERAR);
				setState(237);
				match(TECLA);
				setState(238);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(ESPERAR);
				setState(240);
				expr(0);
				setState(241);
				_la = _input.LA(1);
				if ( !(_la==SEGUNDOS || _la==MILISEGUNDOS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(242);
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
		public TerminalNode INTEGER() { return getToken(pseintGrammarParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(pseintGrammarParser.DOUBLE, 0); }
		public TerminalNode PARIZQ() { return getToken(pseintGrammarParser.PARIZQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PARDER() { return getToken(pseintGrammarParser.PARDER, 0); }
		public TerminalNode ID() { return getToken(pseintGrammarParser.ID, 0); }
		public TerminalNode MULOP() { return getToken(pseintGrammarParser.MULOP, 0); }
		public TerminalNode SUMOP() { return getToken(pseintGrammarParser.SUMOP, 0); }
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(247);
				match(INTEGER);
				}
				break;
			case DOUBLE:
				{
				setState(248);
				match(DOUBLE);
				}
				break;
			case PARIZQ:
				{
				setState(249);
				match(PARIZQ);
				setState(250);
				expr(0);
				setState(251);
				match(PARDER);
				}
				break;
			case ID:
				{
				setState(253);
				match(ID);
				setState(262);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(254);
					match(PARIZQ);
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << PARIZQ) | (1L << INTEGER) | (1L << DOUBLE))) != 0)) {
						{
						{
						setState(255);
						expr(0);
						}
						}
						setState(260);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(261);
					match(PARDER);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(272);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(266);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(267);
						match(MULOP);
						setState(268);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(270);
						match(SUMOP);
						setState(271);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class BooleanExprContext extends ParserRuleContext {
		public List<ComparisonExprContext> comparisonExpr() {
			return getRuleContexts(ComparisonExprContext.class);
		}
		public ComparisonExprContext comparisonExpr(int i) {
			return getRuleContext(ComparisonExprContext.class,i);
		}
		public List<TerminalNode> BINOP() { return getTokens(pseintGrammarParser.BINOP); }
		public TerminalNode BINOP(int i) {
			return getToken(pseintGrammarParser.BINOP, i);
		}
		public BooleanExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitBooleanExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExprContext booleanExpr() throws RecognitionException {
		BooleanExprContext _localctx = new BooleanExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_booleanExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			comparisonExpr();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BINOP) {
				{
				{
				setState(278);
				match(BINOP);
				setState(279);
				comparisonExpr();
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

	public static class ComparisonExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMPOP() { return getToken(pseintGrammarParser.COMPOP, 0); }
		public TerminalNode PARIZQ() { return getToken(pseintGrammarParser.PARIZQ, 0); }
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(pseintGrammarParser.PARDER, 0); }
		public TerminalNode NEGOP() { return getToken(pseintGrammarParser.NEGOP, 0); }
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseintGrammarListener ) ((pseintGrammarListener)listener).exitComparisonExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseintGrammarVisitor ) return ((pseintGrammarVisitor<? extends T>)visitor).visitComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comparisonExpr);
		try {
			setState(295);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				expr(0);
				setState(286);
				match(COMPOP);
				setState(287);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(PARIZQ);
				setState(290);
				comparisonExpr();
				setState(291);
				match(PARDER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(NEGOP);
				setState(294);
				comparisonExpr();
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
		enterRule(_localctx, 40, RULE_tipoDato);
		try {
			setState(302);
			switch (_input.LA(1)) {
			case NUMERO:
			case NUMERICO:
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				tipoDatoEntero();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				tipoDatoReal();
				}
				break;
			case CARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				tipoDatoCaracter();
				}
				break;
			case TEXTO:
			case CADENA:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				tipoDatoTexto();
				}
				break;
			case LOGICO:
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
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
		enterRule(_localctx, 42, RULE_tipoDatoEntero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
		enterRule(_localctx, 44, RULE_tipoDatoReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
		enterRule(_localctx, 46, RULE_tipoDatoCaracter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
		enterRule(_localctx, 48, RULE_tipoDatoTexto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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
		enterRule(_localctx, 50, RULE_tipoDatoLogico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
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
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3C\u013d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\7\2?\n\2\f\2"+
		"\16\2B\13\2\3\3\3\3\3\3\5\3G\n\3\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3"+
		"\3\5\3R\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5`\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6n\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7v\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0082"+
		"\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u009c\n\13\f\13\16\13\u009f"+
		"\13\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a6\n\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\7\f\u00ae\n\f\f\f\16\f\u00b1\13\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u00c2\n\16\r\16\16\16\u00c3\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\6\16\u00cc\n\16\r\16\16\16\u00cd\7\16\u00d0"+
		"\n\16\f\16\16\16\u00d3\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u00dd\n\17\3\20\3\20\6\20\u00e1\n\20\r\20\16\20\u00e2\3\20\3\20\3"+
		"\21\3\21\6\21\u00e9\n\21\r\21\16\21\u00ea\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00f7\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u0103\n\23\f\23\16\23\u0106\13\23\3\23\5\23\u0109"+
		"\n\23\5\23\u010b\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0113\n\23\f"+
		"\23\16\23\u0116\13\23\3\24\3\24\3\24\7\24\u011b\n\24\f\24\16\24\u011e"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u012a\n"+
		"\25\3\26\3\26\3\26\3\26\3\26\5\26\u0131\n\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\2\3$\34\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\2\t\3\2\3\4\3\2\t\n\3\2\13\f\3\2\r\16\3\2\63"+
		"\64\3\2<>\3\2AB\u014d\29\3\2\2\2\4C\3\2\2\2\6V\3\2\2\2\b_\3\2\2\2\nm\3"+
		"\2\2\2\fo\3\2\2\2\16y\3\2\2\2\20\u0087\3\2\2\2\22\u008d\3\2\2\2\24\u0093"+
		"\3\2\2\2\26\u00a9\3\2\2\2\30\u00b6\3\2\2\2\32\u00bb\3\2\2\2\34\u00dc\3"+
		"\2\2\2\36\u00de\3\2\2\2 \u00e6\3\2\2\2\"\u00f6\3\2\2\2$\u010a\3\2\2\2"+
		"&\u0117\3\2\2\2(\u0129\3\2\2\2*\u0130\3\2\2\2,\u0132\3\2\2\2.\u0134\3"+
		"\2\2\2\60\u0136\3\2\2\2\62\u0138\3\2\2\2\64\u013a\3\2\2\2\668\5\4\3\2"+
		"\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<@\5"+
		"\6\4\2=?\5\4\3\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\3\3\2\2\2B@"+
		"\3\2\2\2CF\t\2\2\2DE\7\5\2\2EG\7\6\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2H"+
		"Q\7\5\2\2IM\7\7\2\2JL\7\5\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2"+
		"NP\3\2\2\2OM\3\2\2\2PR\7\b\2\2QI\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\5\b\5\2"+
		"TU\t\3\2\2U\5\3\2\2\2VW\t\4\2\2WX\7\5\2\2XY\5\b\5\2YZ\t\5\2\2Z\7\3\2\2"+
		"\2[\\\5\n\6\2\\]\5\b\5\2]`\3\2\2\2^`\3\2\2\2_[\3\2\2\2_^\3\2\2\2`\t\3"+
		"\2\2\2an\5\f\7\2bn\5\16\b\2cn\5\20\t\2dn\5\22\n\2en\5\24\13\2fn\5\26\f"+
		"\2gn\5\30\r\2hn\5\32\16\2in\5\34\17\2jn\5\36\20\2kn\5 \21\2ln\5\"\22\2"+
		"ma\3\2\2\2mb\3\2\2\2mc\3\2\2\2md\3\2\2\2me\3\2\2\2mf\3\2\2\2mg\3\2\2\2"+
		"mh\3\2\2\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\13\3\2\2\2op\7\17"+
		"\2\2pq\5$\23\2qr\7\20\2\2ru\5\b\5\2st\7\21\2\2tv\5\b\5\2us\3\2\2\2uv\3"+
		"\2\2\2vw\3\2\2\2wx\7\22\2\2x\r\3\2\2\2yz\7\23\2\2z{\7\5\2\2{|\7\24\2\2"+
		"|}\7\25\2\2}\u0081\5$\23\2~\177\7\26\2\2\177\u0080\7\27\2\2\u0080\u0082"+
		"\5$\23\2\u0081~\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\7\30\2\2\u0084\u0085\5\b\5\2\u0085\u0086\7\31\2\2\u0086\17\3\2"+
		"\2\2\u0087\u0088\7\32\2\2\u0088\u0089\5&\24\2\u0089\u008a\7\30\2\2\u008a"+
		"\u008b\5\b\5\2\u008b\u008c\7\33\2\2\u008c\21\3\2\2\2\u008d\u008e\7\34"+
		"\2\2\u008e\u008f\5\b\5\2\u008f\u0090\7\25\2\2\u0090\u0091\7\35\2\2\u0091"+
		"\u0092\5&\24\2\u0092\23\3\2\2\2\u0093\u0094\7\36\2\2\u0094\u0095\5$\23"+
		"\2\u0095\u009d\7\30\2\2\u0096\u0097\7\37\2\2\u0097\u0098\5$\23\2\u0098"+
		"\u0099\7 \2\2\u0099\u009a\5\b\5\2\u009a\u009c\3\2\2\2\u009b\u0096\3\2"+
		"\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a5\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7!\2\2\u00a1\u00a2\7\""+
		"\2\2\u00a2\u00a3\7#\2\2\u00a3\u00a4\7 \2\2\u00a4\u00a6\5\b\5\2\u00a5\u00a0"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7$\2\2\u00a8"+
		"\25\3\2\2\2\u00a9\u00aa\7%\2\2\u00aa\u00af\7\5\2\2\u00ab\u00ac\7&\2\2"+
		"\u00ac\u00ae\7\5\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b3\7\'\2\2\u00b3\u00b4\5*\26\2\u00b4\u00b5\7(\2\2\u00b5\27\3\2\2\2"+
		"\u00b6\u00b7\7\5\2\2\u00b7\u00b8\7\6\2\2\u00b8\u00b9\5$\23\2\u00b9\u00ba"+
		"\7(\2\2\u00ba\31\3\2\2\2\u00bb\u00bc\7)\2\2\u00bc\u00c1\7\5\2\2\u00bd"+
		"\u00be\7*\2\2\u00be\u00bf\5$\23\2\u00bf\u00c0\7+\2\2\u00c0\u00c2\3\2\2"+
		"\2\u00c1\u00bd\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00d1\3\2\2\2\u00c5\u00c6\7&\2\2\u00c6\u00cb\7\5\2\2\u00c7"+
		"\u00c8\7*\2\2\u00c8\u00c9\5$\23\2\u00c9\u00ca\7+\2\2\u00ca\u00cc\3\2\2"+
		"\2\u00cb\u00c7\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00c5\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\u00d5\7(\2\2\u00d5\33\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7\u00d8"+
		"\7-\2\2\u00d8\u00dd\7(\2\2\u00d9\u00da\7.\2\2\u00da\u00db\7-\2\2\u00db"+
		"\u00dd\7(\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dd\35\3\2\2\2"+
		"\u00de\u00e0\7/\2\2\u00df\u00e1\5$\23\2\u00e0\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\7(\2\2\u00e5\37\3\2\2\2\u00e6\u00e8\7\60\2\2\u00e7\u00e9\7\5\2"+
		"\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7(\2\2\u00ed!\3\2\2\2\u00ee\u00ef"+
		"\7\61\2\2\u00ef\u00f0\7\62\2\2\u00f0\u00f7\7(\2\2\u00f1\u00f2\7\61\2\2"+
		"\u00f2\u00f3\5$\23\2\u00f3\u00f4\t\6\2\2\u00f4\u00f5\7(\2\2\u00f5\u00f7"+
		"\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f7#\3\2\2\2\u00f8"+
		"\u00f9\b\23\1\2\u00f9\u010b\7\65\2\2\u00fa\u010b\7\66\2\2\u00fb\u00fc"+
		"\7\7\2\2\u00fc\u00fd\5$\23\2\u00fd\u00fe\7\b\2\2\u00fe\u010b\3\2\2\2\u00ff"+
		"\u0108\7\5\2\2\u0100\u0104\7\7\2\2\u0101\u0103\5$\23\2\u0102\u0101\3\2"+
		"\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\7\b\2\2\u0108\u0100\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u00f8\3\2\2\2\u010a"+
		"\u00fa\3\2\2\2\u010a\u00fb\3\2\2\2\u010a\u00ff\3\2\2\2\u010b\u0114\3\2"+
		"\2\2\u010c\u010d\f\b\2\2\u010d\u010e\7\67\2\2\u010e\u0113\5$\23\t\u010f"+
		"\u0110\f\7\2\2\u0110\u0111\78\2\2\u0111\u0113\5$\23\b\u0112\u010c\3\2"+
		"\2\2\u0112\u010f\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115%\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u011c\5(\25\2"+
		"\u0118\u0119\79\2\2\u0119\u011b\5(\25\2\u011a\u0118\3\2\2\2\u011b\u011e"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\'\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0120\5$\23\2\u0120\u0121\7:\2\2\u0121\u0122\5$\23"+
		"\2\u0122\u012a\3\2\2\2\u0123\u0124\7\7\2\2\u0124\u0125\5(\25\2\u0125\u0126"+
		"\7\b\2\2\u0126\u012a\3\2\2\2\u0127\u0128\7;\2\2\u0128\u012a\5(\25\2\u0129"+
		"\u011f\3\2\2\2\u0129\u0123\3\2\2\2\u0129\u0127\3\2\2\2\u012a)\3\2\2\2"+
		"\u012b\u0131\5,\27\2\u012c\u0131\5.\30\2\u012d\u0131\5\60\31\2\u012e\u0131"+
		"\5\62\32\2\u012f\u0131\5\64\33\2\u0130\u012b\3\2\2\2\u0130\u012c\3\2\2"+
		"\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131+"+
		"\3\2\2\2\u0132\u0133\t\7\2\2\u0133-\3\2\2\2\u0134\u0135\7?\2\2\u0135/"+
		"\3\2\2\2\u0136\u0137\7@\2\2\u0137\61\3\2\2\2\u0138\u0139\t\b\2\2\u0139"+
		"\63\3\2\2\2\u013a\u013b\7C\2\2\u013b\65\3\2\2\2\359@FMQ_mu\u0081\u009d"+
		"\u00a5\u00af\u00c3\u00cd\u00d1\u00dc\u00e2\u00ea\u00f6\u0104\u0108\u010a"+
		"\u0112\u0114\u011c\u0129\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}