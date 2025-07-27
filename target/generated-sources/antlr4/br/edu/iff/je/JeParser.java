// Generated from br/edu/iff/je/Je.g4 by ANTLR 4.13.2
package br.edu.iff.je;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, DELIM_LINHA=2, DEC_VAR=3, PROCEDIMENTO=4, EH=5, SEPARADOR=6, 
		DELIM_CAMPO=7, INICIO=8, FIM=9, ESCREVER=10, LER=11, DENTRO_DE=12, GUARDAR=13, 
		DELIM_INTERVALO=14, CONTAR=15, RETORNAR=16, FUNCAO=17, ENQUANTO=18, SENAO=19, 
		VERDADEIRO=20, FALSO=21, ENTAO=22, ISTO=23, IR=24, REPETIR=25, FAZER=26, 
		PARA=27, CONTRARIO=28, INTERROMPER=29, E_LOGICO=30, OU_LOGICO=31, NAO=32, 
		EM_FRENTE=33, INTEIRO=34, REAL=35, TEXTO=36, DIGITO=37, LOGICO=38, A_PAR=39, 
		F_PAR=40, A_COLC=41, F_COLC=42, MULT=43, DIV=44, SOMA=45, SUB=46, IGUAL=47, 
		DIFERENTE=48, MAIOR=49, MENOR=50, MAIORIGUAL=51, MENORIGUAL=52, CARACTERE=53, 
		CADEIA_CARACT=54, NUMERAL_REAL=55, NUMERAL_INT=56, ESPACO=57, IDENTIFICADOR=58;
	public static final int
		RULE_programa = 0, RULE_lista_dec_variaveis = 1, RULE_dec_variavel = 2, 
		RULE_tipo = 3, RULE_tipo_primitivo = 4, RULE_tipo_vetor = 5, RULE_tipo_matriz = 6, 
		RULE_tipo_registro = 7, RULE_lista_campos = 8, RULE_lista_dec_modulos = 9, 
		RULE_modulo = 10, RULE_procedimento = 11, RULE_funcao = 12, RULE_lista_parametros = 13, 
		RULE_parametro = 14, RULE_lista_comandos = 15, RULE_comando = 16, RULE_comando_em_frente = 17, 
		RULE_comando_interromper = 18, RULE_comando_condicional_escolher = 19, 
		RULE_lista_casos = 20, RULE_caso = 21, RULE_caso_padrao = 22, RULE_valor_caso = 23, 
		RULE_intervalo_caso = 24, RULE_comando_condicional_se = 25, RULE_comando_repeticao_repetir = 26, 
		RULE_comando_repeticao_enquanto = 27, RULE_comando_repeticao_ir = 28, 
		RULE_intervalo = 29, RULE_comando_chamada_modulo = 30, RULE_comando_escrever = 31, 
		RULE_comando_ler = 32, RULE_comando_atribuir = 33, RULE_campo_registro = 34, 
		RULE_comando_retornar = 35, RULE_expressao = 36, RULE_expressao_aritmetica = 37, 
		RULE_termo_aritmetico = 38, RULE_fator_aritmetico = 39, RULE_expressao_relacional = 40, 
		RULE_operador_booleano = 41, RULE_termo_relacional = 42, RULE_fator_relacional = 43, 
		RULE_operador_relacional = 44, RULE_chamada = 45, RULE_lista_argumentos = 46, 
		RULE_argumento = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "lista_dec_variaveis", "dec_variavel", "tipo", "tipo_primitivo", 
			"tipo_vetor", "tipo_matriz", "tipo_registro", "lista_campos", "lista_dec_modulos", 
			"modulo", "procedimento", "funcao", "lista_parametros", "parametro", 
			"lista_comandos", "comando", "comando_em_frente", "comando_interromper", 
			"comando_condicional_escolher", "lista_casos", "caso", "caso_padrao", 
			"valor_caso", "intervalo_caso", "comando_condicional_se", "comando_repeticao_repetir", 
			"comando_repeticao_enquanto", "comando_repeticao_ir", "intervalo", "comando_chamada_modulo", 
			"comando_escrever", "comando_ler", "comando_atribuir", "campo_registro", 
			"comando_retornar", "expressao", "expressao_aritmetica", "termo_aritmetico", 
			"fator_aritmetico", "expressao_relacional", "operador_booleano", "termo_relacional", 
			"fator_relacional", "operador_relacional", "chamada", "lista_argumentos", 
			"argumento"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'p\\u00F5g\\u00E3ma'", "';'", "'v\\u00E3so'", "'posedim\\u1EBDto'", 
			"'v\\u1EBD'", "','", "'.'", "'p\\u1EBD_j\\u1EBDg'", "'kar'", "'ven'", 
			"'to_ke'", "'k\\u00E3'", "'r\\u00E3g'", "'->'", "'n\\u0129kr\\u00E9n'", 
			"'kyr\\u00E3'", "'f\\u0169s\\u00E3'", "'myr'", "'jo'", "'p\\u1EBD'", 
			"'p\\u1EBD_v\\u00F3'", "'ge'", "'tag'", "'m\\u0169'", "'m\\u00E3n'", 
			"'han'", "'j\\u00E9'", "'j\\u00E3vo'", "'g\\u00E1v'", "'&&'", "'||'", 
			"'t\\u0169'", "'jy'", "'\\u0129telo'", "'reau'", "'tesetu'", "'djisitu'", 
			"'l\\u00F3siko'", "'('", "')'", "'['", "']'", "'*'", "'/'", "'+'", "'-'", 
			"'=='", "'<>'", "'>'", "'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAMA", "DELIM_LINHA", "DEC_VAR", "PROCEDIMENTO", "EH", "SEPARADOR", 
			"DELIM_CAMPO", "INICIO", "FIM", "ESCREVER", "LER", "DENTRO_DE", "GUARDAR", 
			"DELIM_INTERVALO", "CONTAR", "RETORNAR", "FUNCAO", "ENQUANTO", "SENAO", 
			"VERDADEIRO", "FALSO", "ENTAO", "ISTO", "IR", "REPETIR", "FAZER", "PARA", 
			"CONTRARIO", "INTERROMPER", "E_LOGICO", "OU_LOGICO", "NAO", "EM_FRENTE", 
			"INTEIRO", "REAL", "TEXTO", "DIGITO", "LOGICO", "A_PAR", "F_PAR", "A_COLC", 
			"F_COLC", "MULT", "DIV", "SOMA", "SUB", "IGUAL", "DIFERENTE", "MAIOR", 
			"MENOR", "MAIORIGUAL", "MENORIGUAL", "CARACTERE", "CADEIA_CARACT", "NUMERAL_REAL", 
			"NUMERAL_INT", "ESPACO", "IDENTIFICADOR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Je.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(JeParser.PROGRAMA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(JeParser.IDENTIFICADOR, 0); }
		public TerminalNode DELIM_LINHA() { return getToken(JeParser.DELIM_LINHA, 0); }
		public TerminalNode DEC_VAR() { return getToken(JeParser.DEC_VAR, 0); }
		public Lista_dec_variaveisContext lista_dec_variaveis() {
			return getRuleContext(Lista_dec_variaveisContext.class,0);
		}
		public Lista_dec_modulosContext lista_dec_modulos() {
			return getRuleContext(Lista_dec_modulosContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(PROGRAMA);
			setState(97);
			match(IDENTIFICADOR);
			setState(98);
			match(DELIM_LINHA);
			setState(99);
			match(DEC_VAR);
			setState(100);
			lista_dec_variaveis();
			setState(101);
			lista_dec_modulos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_dec_variaveisContext extends ParserRuleContext {
		public List<Dec_variavelContext> dec_variavel() {
			return getRuleContexts(Dec_variavelContext.class);
		}
		public Dec_variavelContext dec_variavel(int i) {
			return getRuleContext(Dec_variavelContext.class,i);
		}
		public Lista_dec_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_dec_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterLista_dec_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitLista_dec_variaveis(this);
		}
	}

	public final Lista_dec_variaveisContext lista_dec_variaveis() throws RecognitionException {
		Lista_dec_variaveisContext _localctx = new Lista_dec_variaveisContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lista_dec_variaveis);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					dec_variavel();
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_variavelContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(JeParser.IDENTIFICADOR, 0); }
		public TerminalNode EH() { return getToken(JeParser.EH, 0); }
		public TerminalNode DELIM_LINHA() { return getToken(JeParser.DELIM_LINHA, 0); }
		public Dec_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterDec_variavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitDec_variavel(this);
		}
	}

	public final Dec_variavelContext dec_variavel() throws RecognitionException {
		Dec_variavelContext _localctx = new Dec_variavelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			tipo();
			setState(110);
			match(IDENTIFICADOR);
			setState(111);
			match(EH);
			setState(112);
			match(DELIM_LINHA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public Tipo_primitivoContext tipo_primitivo() {
			return getRuleContext(Tipo_primitivoContext.class,0);
		}
		public Tipo_vetorContext tipo_vetor() {
			return getRuleContext(Tipo_vetorContext.class,0);
		}
		public Tipo_matrizContext tipo_matriz() {
			return getRuleContext(Tipo_matrizContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(JeParser.IDENTIFICADOR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				tipo_primitivo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				tipo_vetor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				tipo_matriz();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				match(IDENTIFICADOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_primitivoContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(JeParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(JeParser.REAL, 0); }
		public TerminalNode TEXTO() { return getToken(JeParser.TEXTO, 0); }
		public TerminalNode DIGITO() { return getToken(JeParser.DIGITO, 0); }
		public TerminalNode LOGICO() { return getToken(JeParser.LOGICO, 0); }
		public Tipo_primitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_primitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterTipo_primitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitTipo_primitivo(this);
		}
	}

	public final Tipo_primitivoContext tipo_primitivo() throws RecognitionException {
		Tipo_primitivoContext _localctx = new Tipo_primitivoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo_primitivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 532575944704L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_vetorContext extends ParserRuleContext {
		public Tipo_primitivoContext tipo_primitivo() {
			return getRuleContext(Tipo_primitivoContext.class,0);
		}
		public TerminalNode A_COLC() { return getToken(JeParser.A_COLC, 0); }
		public TerminalNode NUMERAL_INT() { return getToken(JeParser.NUMERAL_INT, 0); }
		public TerminalNode F_COLC() { return getToken(JeParser.F_COLC, 0); }
		public Tipo_vetorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_vetor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterTipo_vetor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitTipo_vetor(this);
		}
	}

	public final Tipo_vetorContext tipo_vetor() throws RecognitionException {
		Tipo_vetorContext _localctx = new Tipo_vetorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo_vetor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			tipo_primitivo();
			setState(123);
			match(A_COLC);
			setState(124);
			match(NUMERAL_INT);
			setState(125);
			match(F_COLC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_matrizContext extends ParserRuleContext {
		public Tipo_primitivoContext tipo_primitivo() {
			return getRuleContext(Tipo_primitivoContext.class,0);
		}
		public TerminalNode A_COLC() { return getToken(JeParser.A_COLC, 0); }
		public List<TerminalNode> NUMERAL_INT() { return getTokens(JeParser.NUMERAL_INT); }
		public TerminalNode NUMERAL_INT(int i) {
			return getToken(JeParser.NUMERAL_INT, i);
		}
		public TerminalNode SEPARADOR() { return getToken(JeParser.SEPARADOR, 0); }
		public TerminalNode F_COLC() { return getToken(JeParser.F_COLC, 0); }
		public Tipo_matrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_matriz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterTipo_matriz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitTipo_matriz(this);
		}
	}

	public final Tipo_matrizContext tipo_matriz() throws RecognitionException {
		Tipo_matrizContext _localctx = new Tipo_matrizContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo_matriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			tipo_primitivo();
			setState(128);
			match(A_COLC);
			setState(129);
			match(NUMERAL_INT);
			setState(130);
			match(SEPARADOR);
			setState(131);
			match(NUMERAL_INT);
			setState(132);
			match(F_COLC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_registroContext extends ParserRuleContext {
		public TerminalNode ISTO() { return getToken(JeParser.ISTO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(JeParser.IDENTIFICADOR, 0); }
		public TerminalNode EH() { return getToken(JeParser.EH, 0); }
		public Lista_camposContext lista_campos() {
			return getRuleContext(Lista_camposContext.class,0);
		}
		public TerminalNode FIM() { return getToken(JeParser.FIM, 0); }
		public Tipo_registroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterTipo_registro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitTipo_registro(this);
		}
	}

	public final Tipo_registroContext tipo_registro() throws RecognitionException {
		Tipo_registroContext _localctx = new Tipo_registroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo_registro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ISTO);
			setState(135);
			match(IDENTIFICADOR);
			setState(136);
			match(EH);
			setState(137);
			lista_campos();
			setState(138);
			match(FIM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_camposContext extends ParserRuleContext {
		public TerminalNode DELIM_LINHA() { return getToken(JeParser.DELIM_LINHA, 0); }
		public List<Dec_variavelContext> dec_variavel() {
			return getRuleContexts(Dec_variavelContext.class);
		}
		public Dec_variavelContext dec_variavel(int i) {
			return getRuleContext(Dec_variavelContext.class,i);
		}
		public Lista_camposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_campos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterLista_campos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitLista_campos(this);
		}
	}

	public final Lista_camposContext lista_campos() throws RecognitionException {
		Lista_camposContext _localctx = new Lista_camposContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lista_campos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				dec_variavel();
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230908727656448L) != 0) );
			setState(145);
			match(DELIM_LINHA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_dec_modulosContext extends ParserRuleContext {
		public List<ModuloContext> modulo() {
			return getRuleContexts(ModuloContext.class);
		}
		public ModuloContext modulo(int i) {
			return getRuleContext(ModuloContext.class,i);
		}
		public Lista_dec_modulosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_dec_modulos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterLista_dec_modulos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitLista_dec_modulos(this);
		}
	}

	public final Lista_dec_modulosContext lista_dec_modulos() throws RecognitionException {
		Lista_dec_modulosContext _localctx = new Lista_dec_modulosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lista_dec_modulos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICADOR) {
				{
				{
				setState(147);
				modulo();
				}
				}
				setState(152);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModuloContext extends ParserRuleContext {
		public ProcedimentoContext procedimento() {
			return getRuleContext(ProcedimentoContext.class,0);
		}
		public ModuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitModulo(this);
		}
	}

	public final ModuloContext modulo() throws RecognitionException {
		ModuloContext _localctx = new ModuloContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_modulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			procedimento();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedimentoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(JeParser.IDENTIFICADOR, 0); }
		public TerminalNode PROCEDIMENTO() { return getToken(JeParser.PROCEDIMENTO, 0); }
		public TerminalNode EH() { return getToken(JeParser.EH, 0); }
		public TerminalNode A_PAR() { return getToken(JeParser.A_PAR, 0); }
		public Lista_parametrosContext lista_parametros() {
			return getRuleContext(Lista_parametrosContext.class,0);
		}
		public TerminalNode F_PAR() { return getToken(JeParser.F_PAR, 0); }
		public TerminalNode DELIM_LINHA() { return getToken(JeParser.DELIM_LINHA, 0); }
		public TerminalNode DEC_VAR() { return getToken(JeParser.DEC_VAR, 0); }
		public Lista_dec_variaveisContext lista_dec_variaveis() {
			return getRuleContext(Lista_dec_variaveisContext.class,0);
		}
		public TerminalNode INICIO() { return getToken(JeParser.INICIO, 0); }
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public TerminalNode FIM() { return getToken(JeParser.FIM, 0); }
		public ProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterProcedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitProcedimento(this);
		}
	}

	public final ProcedimentoContext procedimento() throws RecognitionException {
		ProcedimentoContext _localctx = new ProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_procedimento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(IDENTIFICADOR);
			setState(156);
			match(PROCEDIMENTO);
			setState(157);
			match(EH);
			setState(158);
			match(A_PAR);
			setState(159);
			lista_parametros();
			setState(160);
			match(F_PAR);
			setState(161);
			match(DELIM_LINHA);
			setState(162);
			match(DEC_VAR);
			setState(163);
			lista_dec_variaveis();
			setState(164);
			match(INICIO);
			setState(165);
			lista_comandos();
			setState(166);
			match(FIM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(JeParser.IDENTIFICADOR, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode FUNCAO() { return getToken(JeParser.FUNCAO, 0); }
		public TerminalNode EH() { return getToken(JeParser.EH, 0); }
		public TerminalNode A_PAR() { return getToken(JeParser.A_PAR, 0); }
		public Lista_parametrosContext lista_parametros() {
			return getRuleContext(Lista_parametrosContext.class,0);
		}
		public TerminalNode F_PAR() { return getToken(JeParser.F_PAR, 0); }
		public TerminalNode DELIM_LINHA() { return getToken(JeParser.DELIM_LINHA, 0); }
		public TerminalNode DEC_VAR() { return getToken(JeParser.DEC_VAR, 0); }
		public Lista_dec_variaveisContext lista_dec_variaveis() {
			return getRuleContext(Lista_dec_variaveisContext.class,0);
		}
		public TerminalNode INICIO() { return getToken(JeParser.INICIO, 0); }
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public TerminalNode FIM() { return getToken(JeParser.FIM, 0); }
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IDENTIFICADOR);
			setState(169);
			tipo();
			setState(170);
			match(FUNCAO);
			setState(171);
			match(EH);
			setState(172);
			match(A_PAR);
			setState(173);
			lista_parametros();
			setState(174);
			match(F_PAR);
			setState(175);
			match(DELIM_LINHA);
			setState(176);
			match(DEC_VAR);
			setState(177);
			lista_dec_variaveis();
			setState(178);
			match(INICIO);
			setState(179);
			lista_comandos();
			setState(180);
			match(FIM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_parametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public List<TerminalNode> SEPARADOR() { return getTokens(JeParser.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(JeParser.SEPARADOR, i);
		}
		public List<Lista_parametrosContext> lista_parametros() {
			return getRuleContexts(Lista_parametrosContext.class);
		}
		public Lista_parametrosContext lista_parametros(int i) {
			return getRuleContext(Lista_parametrosContext.class,i);
		}
		public Lista_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterLista_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitLista_parametros(this);
		}
	}

	public final Lista_parametrosContext lista_parametros() throws RecognitionException {
		Lista_parametrosContext _localctx = new Lista_parametrosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lista_parametros);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288230908727656448L) != 0)) {
				{
				setState(182);
				parametro();
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(183);
						match(SEPARADOR);
						setState(184);
						lista_parametros();
						}
						} 
					}
					setState(189);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(JeParser.IDENTIFICADOR, 0); }
		public TerminalNode EH() { return getToken(JeParser.EH, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			tipo();
			setState(193);
			match(IDENTIFICADOR);
			setState(194);
			match(EH);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_comandosContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Lista_comandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterLista_comandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitLista_comandos(this);
		}
	}

	public final Lista_comandosContext lista_comandos() throws RecognitionException {
		Lista_comandosContext _localctx = new Lista_comandosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lista_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 423338923871506432L) != 0)) {
				{
				{
				setState(196);
				comando();
				}
				}
				setState(201);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public Comando_escreverContext comando_escrever() {
			return getRuleContext(Comando_escreverContext.class,0);
		}
		public Comando_lerContext comando_ler() {
			return getRuleContext(Comando_lerContext.class,0);
		}
		public Comando_atribuirContext comando_atribuir() {
			return getRuleContext(Comando_atribuirContext.class,0);
		}
		public Comando_retornarContext comando_retornar() {
			return getRuleContext(Comando_retornarContext.class,0);
		}
		public Comando_chamada_moduloContext comando_chamada_modulo() {
			return getRuleContext(Comando_chamada_moduloContext.class,0);
		}
		public Comando_repeticao_irContext comando_repeticao_ir() {
			return getRuleContext(Comando_repeticao_irContext.class,0);
		}
		public Comando_repeticao_enquantoContext comando_repeticao_enquanto() {
			return getRuleContext(Comando_repeticao_enquantoContext.class,0);
		}
		public Comando_repeticao_repetirContext comando_repeticao_repetir() {
			return getRuleContext(Comando_repeticao_repetirContext.class,0);
		}
		public Comando_condicional_seContext comando_condicional_se() {
			return getRuleContext(Comando_condicional_seContext.class,0);
		}
		public Comando_condicional_escolherContext comando_condicional_escolher() {
			return getRuleContext(Comando_condicional_escolherContext.class,0);
		}
		public Comando_em_frenteContext comando_em_frente() {
			return getRuleContext(Comando_em_frenteContext.class,0);
		}
		public Comando_interromperContext comando_interromper() {
			return getRuleContext(Comando_interromperContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comando);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				comando_escrever();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				comando_ler();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				comando_atribuir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				comando_retornar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				comando_chamada_modulo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				comando_repeticao_ir();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				comando_repeticao_enquanto();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				comando_repeticao_repetir();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(210);
				comando_condicional_se();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(211);
				comando_condicional_escolher();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(212);
				comando_em_frente();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(213);
				comando_interromper();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_em_frenteContext extends ParserRuleContext {
		public TerminalNode EM_FRENTE() { return getToken(JeParser.EM_FRENTE, 0); }
		public TerminalNode DELIM_LINHA() { return getToken(JeParser.DELIM_LINHA, 0); }
		public Comando_em_frenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_em_frente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterComando_em_frente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitComando_em_frente(this);
		}
	}

	public final Comando_em_frenteContext comando_em_frente() throws RecognitionException {
		Comando_em_frenteContext _localctx = new Comando_em_frenteContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comando_em_frente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(EM_FRENTE);
			setState(217);
			match(DELIM_LINHA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_interromperContext extends ParserRuleContext {
		public TerminalNode INTERROMPER() { return getToken(JeParser.INTERROMPER, 0); }
		public TerminalNode DELIM_LINHA() { return getToken(JeParser.DELIM_LINHA, 0); }
		public Comando_interromperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_interromper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterComando_interromper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitComando_interromper(this);
		}
	}

	public final Comando_interromperContext comando_interromper() throws RecognitionException {
		Comando_interromperContext _localctx = new Comando_interromperContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comando_interromper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(INTERROMPER);
			setState(220);
			match(DELIM_LINHA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_condicional_escolherContext extends ParserRuleContext {
		public TerminalNode DENTRO_DE() { return getToken(JeParser.DENTRO_DE, 0); }
		public TerminalNode A_PAR() { return getToken(JeParser.A_PAR, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(JeParser.IDENTIFICADOR, 0); }
		public TerminalNode F_PAR() { return getToken(JeParser.F_PAR, 0); }
		public Lista_casosContext lista_casos() {
			return getRuleContext(Lista_casosContext.class,0);
		}
		public TerminalNode FIM() { return getToken(JeParser.FIM, 0); }
		public Comando_condicional_escolherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_condicional_escolher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterComando_condicional_escolher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitComando_condicional_escolher(this);
		}
	}

	public final Comando_condicional_escolherContext comando_condicional_escolher() throws RecognitionException {
		Comando_condicional_escolherContext _localctx = new Comando_condicional_escolherContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comando_condicional_escolher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(DENTRO_DE);
			setState(223);
			match(A_PAR);
			setState(224);
			match(IDENTIFICADOR);
			setState(225);
			match(F_PAR);
			setState(226);
			lista_casos();
			setState(227);
			match(FIM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_casosContext extends ParserRuleContext {
		public List<CasoContext> caso() {
			return getRuleContexts(CasoContext.class);
		}
		public CasoContext caso(int i) {
			return getRuleContext(CasoContext.class,i);
		}
		public Caso_padraoContext caso_padrao() {
			return getRuleContext(Caso_padraoContext.class,0);
		}
		public Lista_casosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_casos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterLista_casos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitLista_casos(this);
		}
	}

	public final Lista_casosContext lista_casos() throws RecognitionException {
		Lista_casosContext _localctx = new Lista_casosContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lista_casos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(229);
				caso();
				}
				}
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CARACTERE || _la==NUMERAL_INT );
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTRARIO) {
				{
				setState(234);
				caso_padrao();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CasoContext extends ParserRuleContext {
		public Valor_casoContext valor_caso() {
			return getRuleContext(Valor_casoContext.class,0);
		}
		public TerminalNode EH() { return getToken(JeParser.EH, 0); }
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public TerminalNode FIM() { return getToken(JeParser.FIM, 0); }
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitCaso(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_caso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			valor_caso();
			setState(238);
			match(EH);
			setState(239);
			lista_comandos();
			setState(240);
			match(FIM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Caso_padraoContext extends ParserRuleContext {
		public TerminalNode CONTRARIO() { return getToken(JeParser.CONTRARIO, 0); }
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public TerminalNode FIM() { return getToken(JeParser.FIM, 0); }
		public Caso_padraoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso_padrao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterCaso_padrao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitCaso_padrao(this);
		}
	}

	public final Caso_padraoContext caso_padrao() throws RecognitionException {
		Caso_padraoContext _localctx = new Caso_padraoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_caso_padrao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(CONTRARIO);
			setState(243);
			lista_comandos();
			setState(244);
			match(FIM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Valor_casoContext extends ParserRuleContext {
		public TerminalNode NUMERAL_INT() { return getToken(JeParser.NUMERAL_INT, 0); }
		public TerminalNode CARACTERE() { return getToken(JeParser.CARACTERE, 0); }
		public Intervalo_casoContext intervalo_caso() {
			return getRuleContext(Intervalo_casoContext.class,0);
		}
		public Valor_casoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterValor_caso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitValor_caso(this);
		}
	}

	public final Valor_casoContext valor_caso() throws RecognitionException {
		Valor_casoContext _localctx = new Valor_casoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_valor_caso);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(NUMERAL_INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(CARACTERE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				intervalo_caso();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Intervalo_casoContext extends ParserRuleContext {
		public List<TerminalNode> NUMERAL_INT() { return getTokens(JeParser.NUMERAL_INT); }
		public TerminalNode NUMERAL_INT(int i) {
			return getToken(JeParser.NUMERAL_INT, i);
		}
		public TerminalNode DELIM_INTERVALO() { return getToken(JeParser.DELIM_INTERVALO, 0); }
		public Intervalo_casoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterIntervalo_caso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitIntervalo_caso(this);
		}
	}

	public final Intervalo_casoContext intervalo_caso() throws RecognitionException {
		Intervalo_casoContext _localctx = new Intervalo_casoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_intervalo_caso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(NUMERAL_INT);
			setState(252);
			match(DELIM_INTERVALO);
			setState(253);
			match(NUMERAL_INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_condicional_seContext extends ParserRuleContext {
		public TerminalNode ENTAO() { return getToken(JeParser.ENTAO, 0); }
		public TerminalNode A_PAR() { return getToken(JeParser.A_PAR, 0); }
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public TerminalNode F_PAR() { return getToken(JeParser.F_PAR, 0); }
		public TerminalNode FAZER() { return getToken(JeParser.FAZER, 0); }
		public List<Lista_comandosContext> lista_comandos() {
			return getRuleContexts(Lista_comandosContext.class);
		}
		public Lista_comandosContext lista_comandos(int i) {
			return getRuleContext(Lista_comandosContext.class,i);
		}
		public TerminalNode FIM() { return getToken(JeParser.FIM, 0); }
		public TerminalNode SENAO() { return getToken(JeParser.SENAO, 0); }
		public Comando_condicional_seContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_condicional_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterComando_condicional_se(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitComando_condicional_se(this);
		}
	}

	public final Comando_condicional_seContext comando_condicional_se() throws RecognitionException {
		Comando_condicional_seContext _localctx = new Comando_condicional_seContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comando_condicional_se);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(ENTAO);
				setState(256);
				match(A_PAR);
				setState(257);
				expressao_relacional(0);
				setState(258);
				match(F_PAR);
				setState(259);
				match(FAZER);
				setState(260);
				lista_comandos();
				setState(261);
				match(FIM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(ENTAO);
				setState(264);
				match(A_PAR);
				setState(265);
				expressao_relacional(0);
				setState(266);
				match(F_PAR);
				setState(267);
				match(FAZER);
				setState(268);
				lista_comandos();
				setState(269);
				match(SENAO);
				setState(270);
				lista_comandos();
				setState(271);
				match(FIM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_repeticao_repetirContext extends ParserRuleContext {
		public TerminalNode ISTO() { return getToken(JeParser.ISTO, 0); }
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public TerminalNode FAZER() { return getToken(JeParser.FAZER, 0); }
		public TerminalNode ENQUANTO() { return getToken(JeParser.ENQUANTO, 0); }
		public TerminalNode A_PAR() { return getToken(JeParser.A_PAR, 0); }
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public TerminalNode F_PAR() { return getToken(JeParser.F_PAR, 0); }
		public Comando_repeticao_repetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_repeticao_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterComando_repeticao_repetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitComando_repeticao_repetir(this);
		}
	}

	public final Comando_repeticao_repetirContext comando_repeticao_repetir() throws RecognitionException {
		Comando_repeticao_repetirContext _localctx = new Comando_repeticao_repetirContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_comando_repeticao_repetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(ISTO);
			setState(276);
			lista_comandos();
			setState(277);
			match(FAZER);
			setState(278);
			match(ENQUANTO);
			setState(279);
			match(A_PAR);
			setState(280);
			expressao_relacional(0);
			setState(281);
			match(F_PAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_repeticao_enquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(JeParser.ENQUANTO, 0); }
		public TerminalNode A_PAR() { return getToken(JeParser.A_PAR, 0); }
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public TerminalNode F_PAR() { return getToken(JeParser.F_PAR, 0); }
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public TerminalNode REPETIR() { return getToken(JeParser.REPETIR, 0); }
		public Comando_repeticao_enquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_repeticao_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterComando_repeticao_enquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitComando_repeticao_enquanto(this);
		}
	}

	public final Comando_repeticao_enquantoContext comando_repeticao_enquanto() throws RecognitionException {
		Comando_repeticao_enquantoContext _localctx = new Comando_repeticao_enquantoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_comando_repeticao_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(ENQUANTO);
			setState(284);
			match(A_PAR);
			setState(285);
			expressao_relacional(0);
			setState(286);
			match(F_PAR);
			setState(287);
			lista_comandos();
			setState(288);
			match(REPETIR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_repeticao_irContext extends ParserRuleContext {
		public TerminalNode A_PAR() { return getToken(JeParser.A_PAR, 0); }
		public List<TerminalNode> NUMERAL_INT() { return getTokens(JeParser.NUMERAL_INT); }
		public TerminalNode NUMERAL_INT(int i) {
			return getToken(JeParser.NUMERAL_INT, i);
		}
		public TerminalNode DELIM_INTERVALO() { return getToken(JeParser.DELIM_INTERVALO, 0); }
		public List<TerminalNode> DELIM_LINHA() { return getTokens(JeParser.DELIM_LINHA); }
		public TerminalNode DELIM_LINHA(int i) {
			return getToken(JeParser.DELIM_LINHA, i);
		}
		public TerminalNode DENTRO_DE() { return getToken(JeParser.DENTRO_DE, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(JeParser.IDENTIFICADOR, 0); }
		public TerminalNode GUARDAR() { return getToken(JeParser.GUARDAR, 0); }
		public TerminalNode CONTAR() { return getToken(JeParser.CONTAR, 0); }
		public TerminalNode F_PAR() { return getToken(JeParser.F_PAR, 0); }
		public TerminalNode IR() { return getToken(JeParser.IR, 0); }
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public TerminalNode FIM() { return getToken(JeParser.FIM, 0); }
		public Comando_repeticao_irContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_repeticao_ir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterComando_repeticao_ir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitComando_repeticao_ir(this);
		}
	}

	public final Comando_repeticao_irContext comando_repeticao_ir() throws RecognitionException {
		Comando_repeticao_irContext _localctx = new Comando_repeticao_irContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comando_repeticao_ir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(A_PAR);
			setState(291);
			match(NUMERAL_INT);
			setState(292);
			match(DELIM_INTERVALO);
			setState(293);
			match(NUMERAL_INT);
			setState(294);
			match(DELIM_LINHA);
			setState(295);
			match(DENTRO_DE);
			setState(296);
			match(IDENTIFICADOR);
			setState(297);
			match(GUARDAR);
			setState(298);
			match(DELIM_LINHA);
			setState(299);
			match(NUMERAL_INT);
			setState(300);
			match(CONTAR);
			setState(301);
			match(F_PAR);
			setState(302);
			match(IR);
			setState(303);
			lista_comandos();
			setState(304);
			match(FIM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntervaloContext extends ParserRuleContext {
		public List<Expressao_aritmeticaContext> expressao_aritmetica() {
			return getRuleContexts(Expressao_aritmeticaContext.class);
		}
		public Expressao_aritmeticaContext expressao_aritmetica(int i) {
			return getRuleContext(Expressao_aritmeticaContext.class,i);
		}
		public TerminalNode DELIM_INTERVALO() { return getToken(JeParser.DELIM_INTERVALO, 0); }
		public IntervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterIntervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitIntervalo(this);
		}
	}

	public final IntervaloContext intervalo() throws RecognitionException {
		IntervaloContext _localctx = new IntervaloContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			expressao_aritmetica(0);
			setState(307);
			match(DELIM_INTERVALO);
			setState(308);
			expressao_aritmetica(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_chamada_moduloContext extends ParserRuleContext {
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
		}
		public TerminalNode DELIM_LINHA() { return getToken(JeParser.DELIM_LINHA, 0); }
		public Comando_chamada_moduloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_chamada_modulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterComando_chamada_modulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitComando_chamada_modulo(this);
		}
	}

	public final Comando_chamada_moduloContext comando_chamada_modulo() throws RecognitionException {
		Comando_chamada_moduloContext _localctx = new Comando_chamada_moduloContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_comando_chamada_modulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			chamada();
			setState(311);
			match(DELIM_LINHA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_escreverContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ESCREVER() { return getToken(JeParser.ESCREVER, 0); }
		public TerminalNode DELIM_LINHA() { return getToken(JeParser.DELIM_LINHA, 0); }
		public Comando_escreverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_escrever; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterComando_escrever(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitComando_escrever(this);
		}
	}

	public final Comando_escreverContext comando_escrever() throws RecognitionException {
		Comando_escreverContext _localctx = new Comando_escreverContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_comando_escrever);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			expressao();
			setState(314);
			match(ESCREVER);
			setState(315);
			match(DELIM_LINHA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_lerContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(JeParser.IDENTIFICADOR, 0); }
		public TerminalNode LER() { return getToken(JeParser.LER, 0); }
		public TerminalNode DELIM_LINHA() { return getToken(JeParser.DELIM_LINHA, 0); }
		public Comando_lerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_ler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterComando_ler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitComando_ler(this);
		}
	}

	public final Comando_lerContext comando_ler() throws RecognitionException {
		Comando_lerContext _localctx = new Comando_lerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_comando_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(IDENTIFICADOR);
			setState(318);
			match(LER);
			setState(319);
			match(DELIM_LINHA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_atribuirContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode DENTRO_DE() { return getToken(JeParser.DENTRO_DE, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(JeParser.IDENTIFICADOR, 0); }
		public TerminalNode GUARDAR() { return getToken(JeParser.GUARDAR, 0); }
		public TerminalNode DELIM_LINHA() { return getToken(JeParser.DELIM_LINHA, 0); }
		public Campo_registroContext campo_registro() {
			return getRuleContext(Campo_registroContext.class,0);
		}
		public Comando_atribuirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_atribuir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterComando_atribuir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitComando_atribuir(this);
		}
	}

	public final Comando_atribuirContext comando_atribuir() throws RecognitionException {
		Comando_atribuirContext _localctx = new Comando_atribuirContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_comando_atribuir);
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				expressao();
				setState(322);
				match(DENTRO_DE);
				setState(323);
				match(IDENTIFICADOR);
				setState(324);
				match(GUARDAR);
				setState(325);
				match(DELIM_LINHA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				expressao();
				setState(328);
				match(DENTRO_DE);
				setState(329);
				campo_registro();
				setState(330);
				match(GUARDAR);
				setState(331);
				match(DELIM_LINHA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Campo_registroContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(JeParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(JeParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> DELIM_CAMPO() { return getTokens(JeParser.DELIM_CAMPO); }
		public TerminalNode DELIM_CAMPO(int i) {
			return getToken(JeParser.DELIM_CAMPO, i);
		}
		public List<Campo_registroContext> campo_registro() {
			return getRuleContexts(Campo_registroContext.class);
		}
		public Campo_registroContext campo_registro(int i) {
			return getRuleContext(Campo_registroContext.class,i);
		}
		public Campo_registroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterCampo_registro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitCampo_registro(this);
		}
	}

	public final Campo_registroContext campo_registro() throws RecognitionException {
		Campo_registroContext _localctx = new Campo_registroContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_campo_registro);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(335);
			match(IDENTIFICADOR);
			setState(336);
			match(DELIM_CAMPO);
			setState(337);
			match(IDENTIFICADOR);
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(338);
					match(DELIM_CAMPO);
					setState(339);
					campo_registro();
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comando_retornarContext extends ParserRuleContext {
		public TerminalNode RETORNAR() { return getToken(JeParser.RETORNAR, 0); }
		public TerminalNode DELIM_LINHA() { return getToken(JeParser.DELIM_LINHA, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Comando_retornarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_retornar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterComando_retornar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitComando_retornar(this);
		}
	}

	public final Comando_retornarContext comando_retornar() throws RecognitionException {
		Comando_retornarContext _localctx = new Comando_retornarContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_comando_retornar);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETORNAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(RETORNAR);
				setState(346);
				match(DELIM_LINHA);
				}
				break;
			case VERDADEIRO:
			case FALSO:
			case A_PAR:
			case CARACTERE:
			case CADEIA_CARACT:
			case NUMERAL_REAL:
			case NUMERAL_INT:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				expressao();
				setState(348);
				match(RETORNAR);
				setState(349);
				match(DELIM_LINHA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public TerminalNode CADEIA_CARACT() { return getToken(JeParser.CADEIA_CARACT, 0); }
		public TerminalNode NUMERAL_INT() { return getToken(JeParser.NUMERAL_INT, 0); }
		public TerminalNode NUMERAL_REAL() { return getToken(JeParser.NUMERAL_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(JeParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(JeParser.FALSO, 0); }
		public TerminalNode CARACTERE() { return getToken(JeParser.CARACTERE, 0); }
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
		}
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(JeParser.IDENTIFICADOR, 0); }
		public Campo_registroContext campo_registro() {
			return getRuleContext(Campo_registroContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressao);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(CADEIA_CARACT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(NUMERAL_INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(NUMERAL_REAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				match(VERDADEIRO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(357);
				match(FALSO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(358);
				match(CARACTERE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(359);
				chamada();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(360);
				expressao_aritmetica(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(361);
				expressao_relacional(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(362);
				match(IDENTIFICADOR);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(363);
				campo_registro();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_aritmeticaContext extends ParserRuleContext {
		public Termo_aritmeticoContext termo_aritmetico() {
			return getRuleContext(Termo_aritmeticoContext.class,0);
		}
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public TerminalNode SOMA() { return getToken(JeParser.SOMA, 0); }
		public TerminalNode SUB() { return getToken(JeParser.SUB, 0); }
		public Expressao_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterExpressao_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitExpressao_aritmetica(this);
		}
	}

	public final Expressao_aritmeticaContext expressao_aritmetica() throws RecognitionException {
		return expressao_aritmetica(0);
	}

	private Expressao_aritmeticaContext expressao_aritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expressao_aritmeticaContext _localctx = new Expressao_aritmeticaContext(_ctx, _parentState);
		Expressao_aritmeticaContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expressao_aritmetica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(367);
			termo_aritmetico(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(375);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new Expressao_aritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao_aritmetica);
						setState(369);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(370);
						match(SOMA);
						setState(371);
						termo_aritmetico(0);
						}
						break;
					case 2:
						{
						_localctx = new Expressao_aritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao_aritmetica);
						setState(372);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(373);
						match(SUB);
						setState(374);
						termo_aritmetico(0);
						}
						break;
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_aritmeticoContext extends ParserRuleContext {
		public Fator_aritmeticoContext fator_aritmetico() {
			return getRuleContext(Fator_aritmeticoContext.class,0);
		}
		public Termo_aritmeticoContext termo_aritmetico() {
			return getRuleContext(Termo_aritmeticoContext.class,0);
		}
		public TerminalNode MULT() { return getToken(JeParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(JeParser.DIV, 0); }
		public Termo_aritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterTermo_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitTermo_aritmetico(this);
		}
	}

	public final Termo_aritmeticoContext termo_aritmetico() throws RecognitionException {
		return termo_aritmetico(0);
	}

	private Termo_aritmeticoContext termo_aritmetico(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Termo_aritmeticoContext _localctx = new Termo_aritmeticoContext(_ctx, _parentState);
		Termo_aritmeticoContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_termo_aritmetico, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(381);
			fator_aritmetico();
			}
			_ctx.stop = _input.LT(-1);
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(389);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new Termo_aritmeticoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termo_aritmetico);
						setState(383);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(384);
						match(MULT);
						setState(385);
						fator_aritmetico();
						}
						break;
					case 2:
						{
						_localctx = new Termo_aritmeticoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termo_aritmetico);
						setState(386);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(387);
						match(DIV);
						setState(388);
						fator_aritmetico();
						}
						break;
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fator_aritmeticoContext extends ParserRuleContext {
		public TerminalNode NUMERAL_INT() { return getToken(JeParser.NUMERAL_INT, 0); }
		public TerminalNode NUMERAL_REAL() { return getToken(JeParser.NUMERAL_REAL, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(JeParser.IDENTIFICADOR, 0); }
		public Campo_registroContext campo_registro() {
			return getRuleContext(Campo_registroContext.class,0);
		}
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
		}
		public TerminalNode A_PAR() { return getToken(JeParser.A_PAR, 0); }
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public TerminalNode F_PAR() { return getToken(JeParser.F_PAR, 0); }
		public Fator_aritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterFator_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitFator_aritmetico(this);
		}
	}

	public final Fator_aritmeticoContext fator_aritmetico() throws RecognitionException {
		Fator_aritmeticoContext _localctx = new Fator_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_fator_aritmetico);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(NUMERAL_INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(NUMERAL_REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				match(IDENTIFICADOR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(397);
				campo_registro();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(398);
				chamada();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(399);
				match(A_PAR);
				setState(400);
				expressao_aritmetica(0);
				setState(401);
				match(F_PAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_relacionalContext extends ParserRuleContext {
		public Termo_relacionalContext termo_relacional() {
			return getRuleContext(Termo_relacionalContext.class,0);
		}
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public Operador_booleanoContext operador_booleano() {
			return getRuleContext(Operador_booleanoContext.class,0);
		}
		public Expressao_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterExpressao_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitExpressao_relacional(this);
		}
	}

	public final Expressao_relacionalContext expressao_relacional() throws RecognitionException {
		return expressao_relacional(0);
	}

	private Expressao_relacionalContext expressao_relacional(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expressao_relacionalContext _localctx = new Expressao_relacionalContext(_ctx, _parentState);
		Expressao_relacionalContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_expressao_relacional, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(406);
			termo_relacional();
			}
			_ctx.stop = _input.LT(-1);
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expressao_relacionalContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressao_relacional);
					setState(408);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(409);
					operador_booleano();
					setState(410);
					termo_relacional();
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Operador_booleanoContext extends ParserRuleContext {
		public TerminalNode E_LOGICO() { return getToken(JeParser.E_LOGICO, 0); }
		public TerminalNode OU_LOGICO() { return getToken(JeParser.OU_LOGICO, 0); }
		public Operador_booleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterOperador_booleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitOperador_booleano(this);
		}
	}

	public final Operador_booleanoContext operador_booleano() throws RecognitionException {
		Operador_booleanoContext _localctx = new Operador_booleanoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_operador_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_la = _input.LA(1);
			if ( !(_la==E_LOGICO || _la==OU_LOGICO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_relacionalContext extends ParserRuleContext {
		public List<Expressao_aritmeticaContext> expressao_aritmetica() {
			return getRuleContexts(Expressao_aritmeticaContext.class);
		}
		public Expressao_aritmeticaContext expressao_aritmetica(int i) {
			return getRuleContext(Expressao_aritmeticaContext.class,i);
		}
		public Operador_relacionalContext operador_relacional() {
			return getRuleContext(Operador_relacionalContext.class,0);
		}
		public Fator_relacionalContext fator_relacional() {
			return getRuleContext(Fator_relacionalContext.class,0);
		}
		public Termo_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterTermo_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitTermo_relacional(this);
		}
	}

	public final Termo_relacionalContext termo_relacional() throws RecognitionException {
		Termo_relacionalContext _localctx = new Termo_relacionalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_termo_relacional);
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				expressao_aritmetica(0);
				setState(420);
				operador_relacional();
				setState(421);
				expressao_aritmetica(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				fator_relacional();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fator_relacionalContext extends ParserRuleContext {
		public TerminalNode VERDADEIRO() { return getToken(JeParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(JeParser.FALSO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(JeParser.IDENTIFICADOR, 0); }
		public Campo_registroContext campo_registro() {
			return getRuleContext(Campo_registroContext.class,0);
		}
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
		}
		public TerminalNode A_PAR() { return getToken(JeParser.A_PAR, 0); }
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public TerminalNode F_PAR() { return getToken(JeParser.F_PAR, 0); }
		public Fator_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterFator_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitFator_relacional(this);
		}
	}

	public final Fator_relacionalContext fator_relacional() throws RecognitionException {
		Fator_relacionalContext _localctx = new Fator_relacionalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fator_relacional);
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(VERDADEIRO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(FALSO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				match(IDENTIFICADOR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(429);
				campo_registro();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(430);
				chamada();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(431);
				match(A_PAR);
				setState(432);
				expressao_relacional(0);
				setState(433);
				match(F_PAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Operador_relacionalContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(JeParser.IGUAL, 0); }
		public TerminalNode MAIOR() { return getToken(JeParser.MAIOR, 0); }
		public TerminalNode MAIORIGUAL() { return getToken(JeParser.MAIORIGUAL, 0); }
		public TerminalNode MENOR() { return getToken(JeParser.MENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(JeParser.MENORIGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(JeParser.DIFERENTE, 0); }
		public Operador_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterOperador_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitOperador_relacional(this);
		}
	}

	public final Operador_relacionalContext operador_relacional() throws RecognitionException {
		Operador_relacionalContext _localctx = new Operador_relacionalContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8866461766385664L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChamadaContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(JeParser.IDENTIFICADOR, 0); }
		public TerminalNode A_PAR() { return getToken(JeParser.A_PAR, 0); }
		public Lista_argumentosContext lista_argumentos() {
			return getRuleContext(Lista_argumentosContext.class,0);
		}
		public TerminalNode F_PAR() { return getToken(JeParser.F_PAR, 0); }
		public ChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitChamada(this);
		}
	}

	public final ChamadaContext chamada() throws RecognitionException {
		ChamadaContext _localctx = new ChamadaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_chamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(IDENTIFICADOR);
			setState(440);
			match(A_PAR);
			setState(441);
			lista_argumentos();
			setState(442);
			match(F_PAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_argumentosContext extends ParserRuleContext {
		public List<ArgumentoContext> argumento() {
			return getRuleContexts(ArgumentoContext.class);
		}
		public ArgumentoContext argumento(int i) {
			return getRuleContext(ArgumentoContext.class,i);
		}
		public Lista_argumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterLista_argumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitLista_argumentos(this);
		}
	}

	public final Lista_argumentosContext lista_argumentos() throws RecognitionException {
		Lista_argumentosContext _localctx = new Lista_argumentosContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_lista_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 423338914731786240L) != 0)) {
				{
				{
				setState(444);
				argumento();
				}
				}
				setState(449);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).enterArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JeListener ) ((JeListener)listener).exitArgumento(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_argumento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			expressao();
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
		case 37:
			return expressao_aritmetica_sempred((Expressao_aritmeticaContext)_localctx, predIndex);
		case 38:
			return termo_aritmetico_sempred((Termo_aritmeticoContext)_localctx, predIndex);
		case 40:
			return expressao_relacional_sempred((Expressao_relacionalContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_aritmetica_sempred(Expressao_aritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean termo_aritmetico_sempred(Termo_aritmeticoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressao_relacional_sempred(Expressao_relacionalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u01c5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		"i\b\u0001\n\u0001\f\u0001l\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003w\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\b\u008e"+
		"\b\b\u000b\b\f\b\u008f\u0001\b\u0001\b\u0001\t\u0005\t\u0095\b\t\n\t\f"+
		"\t\u0098\t\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00ba\b\r\n\r\f\r\u00bd\t\r"+
		"\u0003\r\u00bf\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0005\u000f\u00c6\b\u000f\n\u000f\f\u000f\u00c9\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00d7\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0004\u0014\u00e7\b\u0014\u000b\u0014"+
		"\f\u0014\u00e8\u0001\u0014\u0003\u0014\u00ec\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00fa"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0112"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!"+
		"\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u014e\b!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u0155\b\"\n\"\f\"\u0158\t\""+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0160\b#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u016d\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0005%\u0178\b%\n%\f%\u017b\t%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0005&\u0186\b&\n&\f&\u0189\t&\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0194"+
		"\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u019d\b("+
		"\n(\f(\u01a0\t(\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u01a9\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0003+\u01b4\b+\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		".\u0005.\u01be\b.\n.\f.\u01c1\t.\u0001/\u0001/\u0001/\u0000\u0003JLP0"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^\u0000\u0003\u0001\u0000"+
		"\"&\u0001\u0000\u001e\u001f\u0001\u0000/4\u01cb\u0000`\u0001\u0000\u0000"+
		"\u0000\u0002j\u0001\u0000\u0000\u0000\u0004m\u0001\u0000\u0000\u0000\u0006"+
		"v\u0001\u0000\u0000\u0000\bx\u0001\u0000\u0000\u0000\nz\u0001\u0000\u0000"+
		"\u0000\f\u007f\u0001\u0000\u0000\u0000\u000e\u0086\u0001\u0000\u0000\u0000"+
		"\u0010\u008d\u0001\u0000\u0000\u0000\u0012\u0096\u0001\u0000\u0000\u0000"+
		"\u0014\u0099\u0001\u0000\u0000\u0000\u0016\u009b\u0001\u0000\u0000\u0000"+
		"\u0018\u00a8\u0001\u0000\u0000\u0000\u001a\u00be\u0001\u0000\u0000\u0000"+
		"\u001c\u00c0\u0001\u0000\u0000\u0000\u001e\u00c7\u0001\u0000\u0000\u0000"+
		" \u00d6\u0001\u0000\u0000\u0000\"\u00d8\u0001\u0000\u0000\u0000$\u00db"+
		"\u0001\u0000\u0000\u0000&\u00de\u0001\u0000\u0000\u0000(\u00e6\u0001\u0000"+
		"\u0000\u0000*\u00ed\u0001\u0000\u0000\u0000,\u00f2\u0001\u0000\u0000\u0000"+
		".\u00f9\u0001\u0000\u0000\u00000\u00fb\u0001\u0000\u0000\u00002\u0111"+
		"\u0001\u0000\u0000\u00004\u0113\u0001\u0000\u0000\u00006\u011b\u0001\u0000"+
		"\u0000\u00008\u0122\u0001\u0000\u0000\u0000:\u0132\u0001\u0000\u0000\u0000"+
		"<\u0136\u0001\u0000\u0000\u0000>\u0139\u0001\u0000\u0000\u0000@\u013d"+
		"\u0001\u0000\u0000\u0000B\u014d\u0001\u0000\u0000\u0000D\u014f\u0001\u0000"+
		"\u0000\u0000F\u015f\u0001\u0000\u0000\u0000H\u016c\u0001\u0000\u0000\u0000"+
		"J\u016e\u0001\u0000\u0000\u0000L\u017c\u0001\u0000\u0000\u0000N\u0193"+
		"\u0001\u0000\u0000\u0000P\u0195\u0001\u0000\u0000\u0000R\u01a1\u0001\u0000"+
		"\u0000\u0000T\u01a8\u0001\u0000\u0000\u0000V\u01b3\u0001\u0000\u0000\u0000"+
		"X\u01b5\u0001\u0000\u0000\u0000Z\u01b7\u0001\u0000\u0000\u0000\\\u01bf"+
		"\u0001\u0000\u0000\u0000^\u01c2\u0001\u0000\u0000\u0000`a\u0005\u0001"+
		"\u0000\u0000ab\u0005:\u0000\u0000bc\u0005\u0002\u0000\u0000cd\u0005\u0003"+
		"\u0000\u0000de\u0003\u0002\u0001\u0000ef\u0003\u0012\t\u0000f\u0001\u0001"+
		"\u0000\u0000\u0000gi\u0003\u0004\u0002\u0000hg\u0001\u0000\u0000\u0000"+
		"il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000k\u0003\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0003"+
		"\u0006\u0003\u0000no\u0005:\u0000\u0000op\u0005\u0005\u0000\u0000pq\u0005"+
		"\u0002\u0000\u0000q\u0005\u0001\u0000\u0000\u0000rw\u0003\b\u0004\u0000"+
		"sw\u0003\n\u0005\u0000tw\u0003\f\u0006\u0000uw\u0005:\u0000\u0000vr\u0001"+
		"\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vu\u0001\u0000\u0000\u0000w\u0007\u0001\u0000\u0000\u0000xy\u0007\u0000"+
		"\u0000\u0000y\t\u0001\u0000\u0000\u0000z{\u0003\b\u0004\u0000{|\u0005"+
		")\u0000\u0000|}\u00058\u0000\u0000}~\u0005*\u0000\u0000~\u000b\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0003\b\u0004\u0000\u0080\u0081\u0005)\u0000"+
		"\u0000\u0081\u0082\u00058\u0000\u0000\u0082\u0083\u0005\u0006\u0000\u0000"+
		"\u0083\u0084\u00058\u0000\u0000\u0084\u0085\u0005*\u0000\u0000\u0085\r"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0017\u0000\u0000\u0087\u0088"+
		"\u0005:\u0000\u0000\u0088\u0089\u0005\u0005\u0000\u0000\u0089\u008a\u0003"+
		"\u0010\b\u0000\u008a\u008b\u0005\t\u0000\u0000\u008b\u000f\u0001\u0000"+
		"\u0000\u0000\u008c\u008e\u0003\u0004\u0002\u0000\u008d\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0005\u0002\u0000\u0000\u0092\u0011\u0001\u0000"+
		"\u0000\u0000\u0093\u0095\u0003\u0014\n\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0013\u0001\u0000\u0000"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009a\u0003\u0016\u000b"+
		"\u0000\u009a\u0015\u0001\u0000\u0000\u0000\u009b\u009c\u0005:\u0000\u0000"+
		"\u009c\u009d\u0005\u0004\u0000\u0000\u009d\u009e\u0005\u0005\u0000\u0000"+
		"\u009e\u009f\u0005\'\u0000\u0000\u009f\u00a0\u0003\u001a\r\u0000\u00a0"+
		"\u00a1\u0005(\u0000\u0000\u00a1\u00a2\u0005\u0002\u0000\u0000\u00a2\u00a3"+
		"\u0005\u0003\u0000\u0000\u00a3\u00a4\u0003\u0002\u0001\u0000\u00a4\u00a5"+
		"\u0005\b\u0000\u0000\u00a5\u00a6\u0003\u001e\u000f\u0000\u00a6\u00a7\u0005"+
		"\t\u0000\u0000\u00a7\u0017\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005:"+
		"\u0000\u0000\u00a9\u00aa\u0003\u0006\u0003\u0000\u00aa\u00ab\u0005\u0011"+
		"\u0000\u0000\u00ab\u00ac\u0005\u0005\u0000\u0000\u00ac\u00ad\u0005\'\u0000"+
		"\u0000\u00ad\u00ae\u0003\u001a\r\u0000\u00ae\u00af\u0005(\u0000\u0000"+
		"\u00af\u00b0\u0005\u0002\u0000\u0000\u00b0\u00b1\u0005\u0003\u0000\u0000"+
		"\u00b1\u00b2\u0003\u0002\u0001\u0000\u00b2\u00b3\u0005\b\u0000\u0000\u00b3"+
		"\u00b4\u0003\u001e\u000f\u0000\u00b4\u00b5\u0005\t\u0000\u0000\u00b5\u0019"+
		"\u0001\u0000\u0000\u0000\u00b6\u00bb\u0003\u001c\u000e\u0000\u00b7\u00b8"+
		"\u0005\u0006\u0000\u0000\u00b8\u00ba\u0003\u001a\r\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00b6\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u001b\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0003\u0006\u0003\u0000\u00c1\u00c2\u0005"+
		":\u0000\u0000\u00c2\u00c3\u0005\u0005\u0000\u0000\u00c3\u001d\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c6\u0003 \u0010\u0000\u00c5\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u001f\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00d7\u0003>\u001f\u0000"+
		"\u00cb\u00d7\u0003@ \u0000\u00cc\u00d7\u0003B!\u0000\u00cd\u00d7\u0003"+
		"F#\u0000\u00ce\u00d7\u0003<\u001e\u0000\u00cf\u00d7\u00038\u001c\u0000"+
		"\u00d0\u00d7\u00036\u001b\u0000\u00d1\u00d7\u00034\u001a\u0000\u00d2\u00d7"+
		"\u00032\u0019\u0000\u00d3\u00d7\u0003&\u0013\u0000\u00d4\u00d7\u0003\""+
		"\u0011\u0000\u00d5\u00d7\u0003$\u0012\u0000\u00d6\u00ca\u0001\u0000\u0000"+
		"\u0000\u00d6\u00cb\u0001\u0000\u0000\u0000\u00d6\u00cc\u0001\u0000\u0000"+
		"\u0000\u00d6\u00cd\u0001\u0000\u0000\u0000\u00d6\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d6\u00cf\u0001\u0000\u0000\u0000\u00d6\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d1\u0001\u0000\u0000\u0000\u00d6\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7!\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0005!\u0000\u0000\u00d9\u00da\u0005\u0002\u0000\u0000\u00da"+
		"#\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u001d\u0000\u0000\u00dc\u00dd"+
		"\u0005\u0002\u0000\u0000\u00dd%\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"\f\u0000\u0000\u00df\u00e0\u0005\'\u0000\u0000\u00e0\u00e1\u0005:\u0000"+
		"\u0000\u00e1\u00e2\u0005(\u0000\u0000\u00e2\u00e3\u0003(\u0014\u0000\u00e3"+
		"\u00e4\u0005\t\u0000\u0000\u00e4\'\u0001\u0000\u0000\u0000\u00e5\u00e7"+
		"\u0003*\u0015\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00ec\u0003"+
		",\u0016\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec)\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003.\u0017\u0000"+
		"\u00ee\u00ef\u0005\u0005\u0000\u0000\u00ef\u00f0\u0003\u001e\u000f\u0000"+
		"\u00f0\u00f1\u0005\t\u0000\u0000\u00f1+\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0005\u001c\u0000\u0000\u00f3\u00f4\u0003\u001e\u000f\u0000\u00f4"+
		"\u00f5\u0005\t\u0000\u0000\u00f5-\u0001\u0000\u0000\u0000\u00f6\u00fa"+
		"\u00058\u0000\u0000\u00f7\u00fa\u00055\u0000\u0000\u00f8\u00fa\u00030"+
		"\u0018\u0000\u00f9\u00f6\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa/\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u00058\u0000\u0000\u00fc\u00fd\u0005\u000e\u0000\u0000"+
		"\u00fd\u00fe\u00058\u0000\u0000\u00fe1\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0005\u0016\u0000\u0000\u0100\u0101\u0005\'\u0000\u0000\u0101\u0102\u0003"+
		"P(\u0000\u0102\u0103\u0005(\u0000\u0000\u0103\u0104\u0005\u001a\u0000"+
		"\u0000\u0104\u0105\u0003\u001e\u000f\u0000\u0105\u0106\u0005\t\u0000\u0000"+
		"\u0106\u0112\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u0016\u0000\u0000"+
		"\u0108\u0109\u0005\'\u0000\u0000\u0109\u010a\u0003P(\u0000\u010a\u010b"+
		"\u0005(\u0000\u0000\u010b\u010c\u0005\u001a\u0000\u0000\u010c\u010d\u0003"+
		"\u001e\u000f\u0000\u010d\u010e\u0005\u0013\u0000\u0000\u010e\u010f\u0003"+
		"\u001e\u000f\u0000\u010f\u0110\u0005\t\u0000\u0000\u0110\u0112\u0001\u0000"+
		"\u0000\u0000\u0111\u00ff\u0001\u0000\u0000\u0000\u0111\u0107\u0001\u0000"+
		"\u0000\u0000\u01123\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u0017\u0000"+
		"\u0000\u0114\u0115\u0003\u001e\u000f\u0000\u0115\u0116\u0005\u001a\u0000"+
		"\u0000\u0116\u0117\u0005\u0012\u0000\u0000\u0117\u0118\u0005\'\u0000\u0000"+
		"\u0118\u0119\u0003P(\u0000\u0119\u011a\u0005(\u0000\u0000\u011a5\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0005\u0012\u0000\u0000\u011c\u011d\u0005"+
		"\'\u0000\u0000\u011d\u011e\u0003P(\u0000\u011e\u011f\u0005(\u0000\u0000"+
		"\u011f\u0120\u0003\u001e\u000f\u0000\u0120\u0121\u0005\u0019\u0000\u0000"+
		"\u01217\u0001\u0000\u0000\u0000\u0122\u0123\u0005\'\u0000\u0000\u0123"+
		"\u0124\u00058\u0000\u0000\u0124\u0125\u0005\u000e\u0000\u0000\u0125\u0126"+
		"\u00058\u0000\u0000\u0126\u0127\u0005\u0002\u0000\u0000\u0127\u0128\u0005"+
		"\f\u0000\u0000\u0128\u0129\u0005:\u0000\u0000\u0129\u012a\u0005\r\u0000"+
		"\u0000\u012a\u012b\u0005\u0002\u0000\u0000\u012b\u012c\u00058\u0000\u0000"+
		"\u012c\u012d\u0005\u000f\u0000\u0000\u012d\u012e\u0005(\u0000\u0000\u012e"+
		"\u012f\u0005\u0018\u0000\u0000\u012f\u0130\u0003\u001e\u000f\u0000\u0130"+
		"\u0131\u0005\t\u0000\u0000\u01319\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0003J%\u0000\u0133\u0134\u0005\u000e\u0000\u0000\u0134\u0135\u0003J"+
		"%\u0000\u0135;\u0001\u0000\u0000\u0000\u0136\u0137\u0003Z-\u0000\u0137"+
		"\u0138\u0005\u0002\u0000\u0000\u0138=\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0003H$\u0000\u013a\u013b\u0005\n\u0000\u0000\u013b\u013c\u0005\u0002"+
		"\u0000\u0000\u013c?\u0001\u0000\u0000\u0000\u013d\u013e\u0005:\u0000\u0000"+
		"\u013e\u013f\u0005\u000b\u0000\u0000\u013f\u0140\u0005\u0002\u0000\u0000"+
		"\u0140A\u0001\u0000\u0000\u0000\u0141\u0142\u0003H$\u0000\u0142\u0143"+
		"\u0005\f\u0000\u0000\u0143\u0144\u0005:\u0000\u0000\u0144\u0145\u0005"+
		"\r\u0000\u0000\u0145\u0146\u0005\u0002\u0000\u0000\u0146\u014e\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0003H$\u0000\u0148\u0149\u0005\f\u0000\u0000"+
		"\u0149\u014a\u0003D\"\u0000\u014a\u014b\u0005\r\u0000\u0000\u014b\u014c"+
		"\u0005\u0002\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u0141"+
		"\u0001\u0000\u0000\u0000\u014d\u0147\u0001\u0000\u0000\u0000\u014eC\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0005:\u0000\u0000\u0150\u0151\u0005\u0007"+
		"\u0000\u0000\u0151\u0156\u0005:\u0000\u0000\u0152\u0153\u0005\u0007\u0000"+
		"\u0000\u0153\u0155\u0003D\"\u0000\u0154\u0152\u0001\u0000\u0000\u0000"+
		"\u0155\u0158\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0001\u0000\u0000\u0000\u0157E\u0001\u0000\u0000\u0000\u0158"+
		"\u0156\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u0010\u0000\u0000\u015a"+
		"\u0160\u0005\u0002\u0000\u0000\u015b\u015c\u0003H$\u0000\u015c\u015d\u0005"+
		"\u0010\u0000\u0000\u015d\u015e\u0005\u0002\u0000\u0000\u015e\u0160\u0001"+
		"\u0000\u0000\u0000\u015f\u0159\u0001\u0000\u0000\u0000\u015f\u015b\u0001"+
		"\u0000\u0000\u0000\u0160G\u0001\u0000\u0000\u0000\u0161\u016d\u00056\u0000"+
		"\u0000\u0162\u016d\u00058\u0000\u0000\u0163\u016d\u00057\u0000\u0000\u0164"+
		"\u016d\u0005\u0014\u0000\u0000\u0165\u016d\u0005\u0015\u0000\u0000\u0166"+
		"\u016d\u00055\u0000\u0000\u0167\u016d\u0003Z-\u0000\u0168\u016d\u0003"+
		"J%\u0000\u0169\u016d\u0003P(\u0000\u016a\u016d\u0005:\u0000\u0000\u016b"+
		"\u016d\u0003D\"\u0000\u016c\u0161\u0001\u0000\u0000\u0000\u016c\u0162"+
		"\u0001\u0000\u0000\u0000\u016c\u0163\u0001\u0000\u0000\u0000\u016c\u0164"+
		"\u0001\u0000\u0000\u0000\u016c\u0165\u0001\u0000\u0000\u0000\u016c\u0166"+
		"\u0001\u0000\u0000\u0000\u016c\u0167\u0001\u0000\u0000\u0000\u016c\u0168"+
		"\u0001\u0000\u0000\u0000\u016c\u0169\u0001\u0000\u0000\u0000\u016c\u016a"+
		"\u0001\u0000\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016dI\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0006%\uffff\uffff\u0000\u016f\u0170\u0003"+
		"L&\u0000\u0170\u0179\u0001\u0000\u0000\u0000\u0171\u0172\n\u0003\u0000"+
		"\u0000\u0172\u0173\u0005-\u0000\u0000\u0173\u0178\u0003L&\u0000\u0174"+
		"\u0175\n\u0002\u0000\u0000\u0175\u0176\u0005.\u0000\u0000\u0176\u0178"+
		"\u0003L&\u0000\u0177\u0171\u0001\u0000\u0000\u0000\u0177\u0174\u0001\u0000"+
		"\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017aK\u0001\u0000\u0000"+
		"\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u017d\u0006&\uffff\uffff"+
		"\u0000\u017d\u017e\u0003N\'\u0000\u017e\u0187\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\n\u0003\u0000\u0000\u0180\u0181\u0005+\u0000\u0000\u0181"+
		"\u0186\u0003N\'\u0000\u0182\u0183\n\u0002\u0000\u0000\u0183\u0184\u0005"+
		",\u0000\u0000\u0184\u0186\u0003N\'\u0000\u0185\u017f\u0001\u0000\u0000"+
		"\u0000\u0185\u0182\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000"+
		"\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000"+
		"\u0000\u0188M\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000"+
		"\u018a\u0194\u00058\u0000\u0000\u018b\u0194\u00057\u0000\u0000\u018c\u0194"+
		"\u0005:\u0000\u0000\u018d\u0194\u0003D\"\u0000\u018e\u0194\u0003Z-\u0000"+
		"\u018f\u0190\u0005\'\u0000\u0000\u0190\u0191\u0003J%\u0000\u0191\u0192"+
		"\u0005(\u0000\u0000\u0192\u0194\u0001\u0000\u0000\u0000\u0193\u018a\u0001"+
		"\u0000\u0000\u0000\u0193\u018b\u0001\u0000\u0000\u0000\u0193\u018c\u0001"+
		"\u0000\u0000\u0000\u0193\u018d\u0001\u0000\u0000\u0000\u0193\u018e\u0001"+
		"\u0000\u0000\u0000\u0193\u018f\u0001\u0000\u0000\u0000\u0194O\u0001\u0000"+
		"\u0000\u0000\u0195\u0196\u0006(\uffff\uffff\u0000\u0196\u0197\u0003T*"+
		"\u0000\u0197\u019e\u0001\u0000\u0000\u0000\u0198\u0199\n\u0002\u0000\u0000"+
		"\u0199\u019a\u0003R)\u0000\u019a\u019b\u0003T*\u0000\u019b\u019d\u0001"+
		"\u0000\u0000\u0000\u019c\u0198\u0001\u0000\u0000\u0000\u019d\u01a0\u0001"+
		"\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001"+
		"\u0000\u0000\u0000\u019fQ\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a2\u0007\u0001\u0000\u0000\u01a2S\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a4\u0003J%\u0000\u01a4\u01a5\u0003X,\u0000\u01a5\u01a6"+
		"\u0003J%\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7\u01a9\u0003V"+
		"+\u0000\u01a8\u01a3\u0001\u0000\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a9U\u0001\u0000\u0000\u0000\u01aa\u01b4\u0005\u0014\u0000\u0000"+
		"\u01ab\u01b4\u0005\u0015\u0000\u0000\u01ac\u01b4\u0005:\u0000\u0000\u01ad"+
		"\u01b4\u0003D\"\u0000\u01ae\u01b4\u0003Z-\u0000\u01af\u01b0\u0005\'\u0000"+
		"\u0000\u01b0\u01b1\u0003P(\u0000\u01b1\u01b2\u0005(\u0000\u0000\u01b2"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b3\u01aa\u0001\u0000\u0000\u0000\u01b3"+
		"\u01ab\u0001\u0000\u0000\u0000\u01b3\u01ac\u0001\u0000\u0000\u0000\u01b3"+
		"\u01ad\u0001\u0000\u0000\u0000\u01b3\u01ae\u0001\u0000\u0000\u0000\u01b3"+
		"\u01af\u0001\u0000\u0000\u0000\u01b4W\u0001\u0000\u0000\u0000\u01b5\u01b6"+
		"\u0007\u0002\u0000\u0000\u01b6Y\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005"+
		":\u0000\u0000\u01b8\u01b9\u0005\'\u0000\u0000\u01b9\u01ba\u0003\\.\u0000"+
		"\u01ba\u01bb\u0005(\u0000\u0000\u01bb[\u0001\u0000\u0000\u0000\u01bc\u01be"+
		"\u0003^/\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000"+
		"\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c0]\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0003H$\u0000\u01c3_\u0001\u0000\u0000\u0000\u0019"+
		"jv\u008f\u0096\u00bb\u00be\u00c7\u00d6\u00e8\u00eb\u00f9\u0111\u014d\u0156"+
		"\u015f\u016c\u0177\u0179\u0185\u0187\u0193\u019e\u01a8\u01b3\u01bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}