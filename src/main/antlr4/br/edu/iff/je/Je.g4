grammar Je;

PROGRAMA
    : 'põgãma'
    ;

DELIM_LINHA
    : ';'
    ;

DEC_VAR
    : 'vãso'
    ;

PROCEDIMENTO
    : 'posedimẽto'
    ;

EH
    : 'vẽ'
    ;

SEPARADOR
    : ','
    ;

DELIM_CAMPO
    : '.'
    ;

INICIO
    : 'pẽ_jẽg'
    ;

FIM
    : 'kar'
    ;

ESCREVER
    : 'ven'
    ;

LER
    : 'to_ke'
    ;

DENTRO_DE
    : 'kã'
    ;

GUARDAR
    : 'rãg'
    ;

DELIM_INTERVALO
    : '->'
    ;

CONTAR
    : 'nĩkrén'
    ;

RETORNAR
    : 'kyrã'
    ;

FUNCAO
    : 'fũsã'
    ;

ENQUANTO
    : 'myr'
    ;

SENAO
    : 'jo'
    ;

VERDADEIRO
    : 'pẽ'
    ;

FALSO
    : 'pẽ_vó'
    ;

ENTAO
    : 'ge'
    ;

ISTO
    : 'tag'
    ;

IR
    : 'mũ'
    ;

REPETIR
    : 'mãn'
    ;

FAZER
    : 'han'
    ;

PARA
    : 'jé'
    ;

CONTRARIO
    : 'jãvo'
    ;

INTERROMPER
    : 'gáv'
    ;

E_LOGICO
    : '&&'
    ;

OU_LOGICO
    : '||'
    ;

NAO
    : 'tũ'
    ;

EM_FRENTE
    : 'jy'
    ;

INTEIRO
    : 'ĩtelo'
    ;

REAL
    : 'reau'
    ;

TEXTO
    : 'tesetu'
    ;

DIGITO
    : 'djisitu'
    ;

LOGICO
    : 'lósiko'
    ;

A_PAR
    : '('
    ;

F_PAR
    : ')'
    ;

A_COLC
    : '['
    ;

F_COLC
    : ']'
    ;

MULT
    : '*'
    ;

DIV
    : '/'
    ;
SOMA
    : '+'
    ;

SUB
    : '-'
    ;

IGUAL
    : '=='
    ;

DIFERENTE
    : '<>'
    ;

MAIOR
    : '>'
    ;
MENOR
    : '<'
    ;

MAIORIGUAL
    : '>='
    ;

MENORIGUAL
    : '<='
    ;

fragment LETRA 
    : [a-z]
    | [A-Z]
    | 'á' | 'ã' | 'Á' | 'Ã'
    | 'é' | 'ẽ' | 'É' | 'Ẽ'
    | 'ĩ' | 'Ĩ'
    | 'ó' | 'Ó'
    | 'ũ' | 'Ũ'
    | 'ỹ' | 'Ỹ'
    | 'nh' | 'NH'
    | '_'
    ;

fragment NUMERO 
    : [0-9]
    ;

fragment ESCAPE
    : '\\' [btnr"\\]
    ;

CARACTERE
    : '\'' ( ESCAPE | ~['\\\r\n] ) '\''
    ;

CADEIA_CARACT
    : '"' (ESCAPE | ~["\\\r\n])* '"'
    ;

NUMERAL_REAL: NUMERO+ '.' NUMERO+;

NUMERAL_INT: NUMERO+;

ESPACO: (' ' | '\t' | '\r' | '\n') -> skip;

IDENTIFICADOR: LETRA(LETRA | NUMERO)*;

programa
    : PROGRAMA IDENTIFICADOR DELIM_LINHA
      DEC_VAR lista_dec_variaveis
      lista_dec_modulos
    ;

lista_dec_variaveis
    : (dec_variavel)*
    ;
    

dec_variavel
    : tipo IDENTIFICADOR EH DELIM_LINHA
    ;

tipo
    : tipo_primitivo
    | tipo_vetor
    | tipo_matriz
    | IDENTIFICADOR
    ;

tipo_primitivo
    : INTEIRO
    | REAL
    | TEXTO
    | DIGITO
    | LOGICO
    ;

tipo_vetor
    : tipo_primitivo A_COLC NUMERAL_INT F_COLC
    ;

tipo_matriz
    : tipo_primitivo A_COLC NUMERAL_INT SEPARADOR NUMERAL_INT F_COLC
    ;

tipo_registro
    : ISTO IDENTIFICADOR EH lista_campos FIM
    ;

lista_campos
    : (dec_variavel)+ DELIM_LINHA
    ;

lista_dec_modulos
    : (modulo)*
    ;

modulo
    : procedimento
    ;

procedimento 
    : IDENTIFICADOR PROCEDIMENTO EH A_PAR lista_parametros F_PAR DELIM_LINHA
      DEC_VAR lista_dec_variaveis
      INICIO 
      lista_comandos
      FIM
    ;

funcao
    : IDENTIFICADOR tipo FUNCAO EH A_PAR lista_parametros F_PAR DELIM_LINHA
      DEC_VAR lista_dec_variaveis
      INICIO 
      lista_comandos  
      FIM
    ;

lista_parametros
    : (parametro (SEPARADOR lista_parametros)*)?
    ;

parametro
    : tipo IDENTIFICADOR EH
    ;

lista_comandos
    : (comando)*
    ;

comando
    : comando_escrever
    | comando_ler
    | comando_atribuir
    | comando_retornar
    | comando_chamada_modulo
    | comando_repeticao_ir 
    | comando_repeticao_enquanto
    | comando_repeticao_repetir
    | comando_condicional_se
    | comando_condicional_escolher
    | comando_em_frente
    | comando_interromper
    ;

comando_em_frente
    : EM_FRENTE DELIM_LINHA
    ;

comando_interromper
    : INTERROMPER DELIM_LINHA
    ;

comando_condicional_escolher
    : DENTRO_DE A_PAR IDENTIFICADOR F_PAR
        lista_casos
      FIM
    ;

lista_casos
    : (caso)+
      (caso_padrao)?
    ;

caso
    : valor_caso EH lista_comandos FIM
    ;

caso_padrao
    : CONTRARIO lista_comandos FIM
    ;
    

valor_caso
    : NUMERAL_INT
    | CARACTERE
    | intervalo_caso
    ;

intervalo_caso
    : NUMERAL_INT DELIM_INTERVALO NUMERAL_INT
    ;

comando_condicional_se
    : ENTAO A_PAR expressao_relacional F_PAR FAZER
        lista_comandos
      FIM
    | ENTAO A_PAR expressao_relacional F_PAR FAZER
        lista_comandos
      SENAO
        lista_comandos
      FIM
    ;

comando_repeticao_repetir
    : ISTO
        lista_comandos
      FAZER ENQUANTO A_PAR expressao_relacional F_PAR 
    ;

comando_repeticao_enquanto
    : ENQUANTO A_PAR expressao_relacional F_PAR
        lista_comandos
      REPETIR
    ;

comando_repeticao_ir
    : A_PAR 
        NUMERAL_INT DELIM_INTERVALO NUMERAL_INT DELIM_LINHA
        DENTRO_DE IDENTIFICADOR GUARDAR DELIM_LINHA
        NUMERAL_INT CONTAR
      F_PAR IR
         lista_comandos
      FIM
    ;

intervalo
    : expressao_aritmetica DELIM_INTERVALO expressao_aritmetica
    ;
    

comando_chamada_modulo
    : chamada DELIM_LINHA
    ;

comando_escrever
    : expressao ESCREVER DELIM_LINHA
    ;

comando_ler
    : IDENTIFICADOR LER DELIM_LINHA
    ;

comando_atribuir
    : expressao DENTRO_DE IDENTIFICADOR GUARDAR DELIM_LINHA
    | expressao DENTRO_DE campo_registro GUARDAR DELIM_LINHA
    | expressao DENTRO_DE acesso_vetor GUARDAR DELIM_LINHA
    ;

campo_registro
    : (IDENTIFICADOR DELIM_CAMPO IDENTIFICADOR ( DELIM_CAMPO campo_registro)*)
    ;
    
    
comando_retornar
    : RETORNAR DELIM_LINHA
    | expressao RETORNAR DELIM_LINHA;

expressao
    : CADEIA_CARACT
    | NUMERAL_INT
    | NUMERAL_REAL
    | VERDADEIRO
    | FALSO
    | CARACTERE
    | chamada
    | expressao_aritmetica
    | expressao_relacional
    | expressao_criar_vetor
    | IDENTIFICADOR
    | campo_registro
    ;

expressao_aritmetica
    : expressao_aritmetica SOMA termo_aritmetico 
    | expressao_aritmetica SUB termo_aritmetico 
    | termo_aritmetico;

termo_aritmetico
    : termo_aritmetico MULT fator_aritmetico 
    | termo_aritmetico DIV fator_aritmetico 
    | fator_aritmetico;

fator_aritmetico
    : NUMERAL_INT 
    | NUMERAL_REAL 
    | IDENTIFICADOR
    | campo_registro
    | chamada 
    | A_PAR expressao_aritmetica F_PAR
    ;

expressao_criar_vetor : tipo_primitivo A_COLC expressao_aritmetica F_COLC;

acesso_vetor : IDENTIFICADOR A_COLC expressao_aritmetica F_COLC;

expressao_relacional
    : expressao_relacional operador_booleano termo_relacional 
    | termo_relacional;

operador_booleano
    : E_LOGICO 
    | OU_LOGICO
    ; 

termo_relacional: 
    expressao_aritmetica operador_relacional expressao_aritmetica |
    fator_relacional;

fator_relacional
    : VERDADEIRO 
    | FALSO 
    | IDENTIFICADOR 
    | campo_registro
    | chamada
    |  A_PAR expressao_relacional F_PAR;

operador_relacional
    : IGUAL 
    | MAIOR 
    | MAIORIGUAL 
    | MENOR 
    | MENORIGUAL 
    | DIFERENTE
    ;

chamada
    : IDENTIFICADOR A_PAR lista_argumentos F_PAR
    ;

lista_argumentos
    : (argumento)*
    ;

argumento
    : expressao
    ;

