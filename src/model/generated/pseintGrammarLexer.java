// Generated from pseintGrammar.g by ANTLR 4.5.3
package model.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pseintGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, COMMENT=13, LINE_COMMENT=14, WS=15, VAR=16, 
		SET=17, PIZQ=18, PDER=19, ROP=20, SMCOLON=21, MULOP=22, SUMOP=23, DOUBLE=24, 
		ID=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "COMMENT", "LINE_COMMENT", "WS", "VAR", "SET", 
		"PIZQ", "PDER", "ROP", "SMCOLON", "MULOP", "SUMOP", "DOUBLE", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'as'", "'if'", "'then'", "'else'", "'endif'", "'while'", "'do'", 
		"'endwhile'", "'repeat'", "'times'", "'endrepeat'", "'print'", null, null, 
		null, "'var'", "'set'", "'('", "')'", null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "COMMENT", "LINE_COMMENT", "WS", "VAR", "SET", "PIZQ", "PDER", "ROP", 
		"SMCOLON", "MULOP", "SUMOP", "DOUBLE", "ID"
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


	public pseintGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pseintGrammar.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u00cd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\177\n\16\f\16\16\16\u0082"+
		"\13\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u008d\n\17\f"+
		"\17\16\17\u0090\13\17\3\17\3\17\3\20\6\20\u0095\n\20\r\20\16\20\u0096"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00b1\n\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\6\31\u00ba\n\31\r\31\16\31\u00bb\3\31\3"+
		"\31\3\31\6\31\u00c1\n\31\r\31\16\31\u00c2\5\31\u00c5\n\31\3\32\3\32\7"+
		"\32\u00c9\n\32\f\32\16\32\u00cc\13\32\3\u0080\2\33\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\3\2\n\4\2\f\f\17\17\5\2\13\f\17\17\"\""+
		"\4\2,,\61\61\4\2--//\3\2\62;\3\2\60\60\4\2C\\c|\6\2\62;C\\aac|\u00d8\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\58\3\2\2\2\7;\3\2\2\2\t@\3\2\2"+
		"\2\13E\3\2\2\2\rK\3\2\2\2\17Q\3\2\2\2\21T\3\2\2\2\23]\3\2\2\2\25d\3\2"+
		"\2\2\27j\3\2\2\2\31t\3\2\2\2\33z\3\2\2\2\35\u0088\3\2\2\2\37\u0094\3\2"+
		"\2\2!\u009a\3\2\2\2#\u009e\3\2\2\2%\u00a2\3\2\2\2\'\u00a4\3\2\2\2)\u00b0"+
		"\3\2\2\2+\u00b2\3\2\2\2-\u00b4\3\2\2\2/\u00b6\3\2\2\2\61\u00b9\3\2\2\2"+
		"\63\u00c6\3\2\2\2\65\66\7c\2\2\66\67\7u\2\2\67\4\3\2\2\289\7k\2\29:\7"+
		"h\2\2:\6\3\2\2\2;<\7v\2\2<=\7j\2\2=>\7g\2\2>?\7p\2\2?\b\3\2\2\2@A\7g\2"+
		"\2AB\7n\2\2BC\7u\2\2CD\7g\2\2D\n\3\2\2\2EF\7g\2\2FG\7p\2\2GH\7f\2\2HI"+
		"\7k\2\2IJ\7h\2\2J\f\3\2\2\2KL\7y\2\2LM\7j\2\2MN\7k\2\2NO\7n\2\2OP\7g\2"+
		"\2P\16\3\2\2\2QR\7f\2\2RS\7q\2\2S\20\3\2\2\2TU\7g\2\2UV\7p\2\2VW\7f\2"+
		"\2WX\7y\2\2XY\7j\2\2YZ\7k\2\2Z[\7n\2\2[\\\7g\2\2\\\22\3\2\2\2]^\7t\2\2"+
		"^_\7g\2\2_`\7r\2\2`a\7g\2\2ab\7c\2\2bc\7v\2\2c\24\3\2\2\2de\7v\2\2ef\7"+
		"k\2\2fg\7o\2\2gh\7g\2\2hi\7u\2\2i\26\3\2\2\2jk\7g\2\2kl\7p\2\2lm\7f\2"+
		"\2mn\7t\2\2no\7g\2\2op\7r\2\2pq\7g\2\2qr\7c\2\2rs\7v\2\2s\30\3\2\2\2t"+
		"u\7r\2\2uv\7t\2\2vw\7k\2\2wx\7p\2\2xy\7v\2\2y\32\3\2\2\2z{\7\61\2\2{|"+
		"\7,\2\2|\u0080\3\2\2\2}\177\13\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0083\u0084\7,\2\2\u0084\u0085\7\61\2\2\u0085\u0086\3\2\2\2\u0086\u0087"+
		"\b\16\2\2\u0087\34\3\2\2\2\u0088\u0089\7\61\2\2\u0089\u008a\7\61\2\2\u008a"+
		"\u008e\3\2\2\2\u008b\u008d\n\2\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0092\b\17\2\2\u0092\36\3\2\2\2\u0093\u0095\t\3\2"+
		"\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\20\2\2\u0099 \3\2\2\2\u009a"+
		"\u009b\7x\2\2\u009b\u009c\7c\2\2\u009c\u009d\7t\2\2\u009d\"\3\2\2\2\u009e"+
		"\u009f\7u\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7v\2\2\u00a1$\3\2\2\2\u00a2"+
		"\u00a3\7*\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7+\2\2\u00a5(\3\2\2\2\u00a6\u00b1"+
		"\7>\2\2\u00a7\u00a8\7>\2\2\u00a8\u00b1\7?\2\2\u00a9\u00aa\7@\2\2\u00aa"+
		"\u00b1\7?\2\2\u00ab\u00b1\7@\2\2\u00ac\u00ad\7?\2\2\u00ad\u00b1\7?\2\2"+
		"\u00ae\u00af\7#\2\2\u00af\u00b1\7?\2\2\u00b0\u00a6\3\2\2\2\u00b0\u00a7"+
		"\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7=\2\2\u00b3,\3\2\2\2\u00b4"+
		"\u00b5\t\4\2\2\u00b5.\3\2\2\2\u00b6\u00b7\t\5\2\2\u00b7\60\3\2\2\2\u00b8"+
		"\u00ba\t\6\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c4\3\2\2\2\u00bd\u00c5\3\2\2\2\u00be"+
		"\u00c0\t\7\2\2\u00bf\u00c1\t\6\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00bd\3\2\2\2\u00c4\u00be\3\2\2\2\u00c5\62\3\2\2\2\u00c6\u00ca\t\b\2"+
		"\2\u00c7\u00c9\t\t\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\64\3\2\2\2\u00cc\u00ca\3\2\2\2\13\2"+
		"\u0080\u008e\u0096\u00b0\u00bb\u00c2\u00c4\u00ca\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}