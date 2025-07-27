grammar Je;

// Regra inicial do parser
programa: PROGRAMA IDENTIFICADOR DELIM_LINHA dec_variaveis? corpo_programa;

dec_variaveis: DEC_VAR declaracao+;
declaracao:
      tipo IDENTIFICADOR EH DELIM_LINHA
    | tipo A_COLC expressao F_COLC DENTRO_DE IDENTIFICADOR GUARDAR DELIM_LINHA
    ;

tipo: TIPO_INTEIRO | TIPO_TEXTO | TIPO_REAL;

corpo_programa: INICIO comando+ FIM;

comando:
      cmd_atribuicao
    | cmd_escrever
    | cmd_ler
    | cmd_loop
    | cmd_condicional
    | cmd_retorno
    | cmd_chamada_func
    ;

cmd_atribuicao: expressao DENTRO_DE variavel GUARDAR DELIM_LINHA;
variavel: IDENTIFICADOR | IDENTIFICADOR A_COLC expressao F_COLC;

cmd_escrever: expressao ESCREVER DELIM_LINHA;
cmd_ler: variavel LER DELIM_LINHA;

cmd_loop: expressao DELIM_INTERVALO expressao DENTRO_DE IDENTIFICADOR SEPARADOR expressao CONTAR DELIM_LINHA comando+ CONTAR FIM;

cmd_condicional: expressao_relacional CONDICIONAL ENTAO comando+ (SENAO comando+)? FIM;

cmd_retorno: KYRA expressao? DELIM_LINHA;

cmd_chamada_func: IDENTIFICADOR A_PAR (expressao (SEPARADOR expressao)*)? F_PAR DELIM_LINHA;


expressao: expressao_aritmetica;

expressao_aritmetica:
      termo_aritmetico ( (SOMA | SUB) termo_aritmetico)*
    ;

termo_aritmetico:
      fator_aritmetico ( (MULT | DIV) fator_aritmetico)*
    ;

fator_aritmetico:
      variavel
    | NUMERAL_INT
    | CADEIA_CARACT
    | A_PAR expressao F_PAR
    ;

expressao_relacional:
    expressao_aritmetica ( (IGUAL | MAIOR | MENOR | MAIOR_IGUAL | MENOR_IGUAL | DIFERENTE) expressao_aritmetica)+
    ;

// LEXER

// Palavras-chave
PROGRAMA: 'põgãma';
DEC_VAR: 'vãso' | 'vāso';
INICIO: 'pën_jēg';
FIM: 'kar';
EH: 'vẽ';
GUARDAR: 'rãg' | 'råg';
ESCREVER: 'ven';
LER: 'to_ke';
DENTRO_DE: 'kã';
DELIM_INTERVALO: '->';
CONTAR: 'nīkrén';
KYRA: 'kyrã';
FUNCAO: 'fũsã';
PROCEDIMENTO: 'põsedimēto';
ENQUANTO: 'myr';
CONDICIONAL: 'nỹtĩ' | 'nī';
ENTAO: 'ge';
SENAO: 'jo';
TIPO_INTEIRO: 'ītēlo' | 'ĩtêlo';
TIPO_TEXTO: 'tesetu';
TIPO_REAL: 'Hêã';
VERDADEIRO: 'pẽ';
FALSO: 'pẽ_vó';


// Operadores e Delimitadores
E_LOGICO: '&&';
OU_LOGICO: '||';
IGUAL: '==' | '=';
MAIOR: '>';
MENOR: '<';
MAIOR_IGUAL: '>=';
MENOR_IGUAL: '<=';
DIFERENTE: '<>';
MULT: '*';
DIV: '/';
SOMA: '+';
SUB: '-';
A_PAR: '(';
F_PAR: ')';
A_COLC: '[';
F_COLC: ']';
DELIM_LINHA: ';';
SEPARADOR: ',';

// Tokens Gerais
IDENTIFICADOR: [a-zA-Z_] [a-zA-Z0-9_]*;
NUMERAL_INT: [0-9]+;
CADEIA_CARACT: '"' ( ~["] | '""' )* '"';

// Ignorar espaços em branco
ESPACO: [ \t\r\n]+ -> skip;
