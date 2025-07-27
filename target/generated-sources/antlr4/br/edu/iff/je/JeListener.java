// Generated from br/edu/iff/je/Je.g4 by ANTLR 4.13.2
package br.edu.iff.je;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JeParser}.
 */
public interface JeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JeParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(JeParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(JeParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#lista_dec_variaveis}.
	 * @param ctx the parse tree
	 */
	void enterLista_dec_variaveis(JeParser.Lista_dec_variaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#lista_dec_variaveis}.
	 * @param ctx the parse tree
	 */
	void exitLista_dec_variaveis(JeParser.Lista_dec_variaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#dec_variavel}.
	 * @param ctx the parse tree
	 */
	void enterDec_variavel(JeParser.Dec_variavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#dec_variavel}.
	 * @param ctx the parse tree
	 */
	void exitDec_variavel(JeParser.Dec_variavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(JeParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(JeParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#tipo_primitivo}.
	 * @param ctx the parse tree
	 */
	void enterTipo_primitivo(JeParser.Tipo_primitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#tipo_primitivo}.
	 * @param ctx the parse tree
	 */
	void exitTipo_primitivo(JeParser.Tipo_primitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#tipo_vetor}.
	 * @param ctx the parse tree
	 */
	void enterTipo_vetor(JeParser.Tipo_vetorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#tipo_vetor}.
	 * @param ctx the parse tree
	 */
	void exitTipo_vetor(JeParser.Tipo_vetorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#tipo_matriz}.
	 * @param ctx the parse tree
	 */
	void enterTipo_matriz(JeParser.Tipo_matrizContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#tipo_matriz}.
	 * @param ctx the parse tree
	 */
	void exitTipo_matriz(JeParser.Tipo_matrizContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#tipo_registro}.
	 * @param ctx the parse tree
	 */
	void enterTipo_registro(JeParser.Tipo_registroContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#tipo_registro}.
	 * @param ctx the parse tree
	 */
	void exitTipo_registro(JeParser.Tipo_registroContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#lista_campos}.
	 * @param ctx the parse tree
	 */
	void enterLista_campos(JeParser.Lista_camposContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#lista_campos}.
	 * @param ctx the parse tree
	 */
	void exitLista_campos(JeParser.Lista_camposContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#lista_dec_modulos}.
	 * @param ctx the parse tree
	 */
	void enterLista_dec_modulos(JeParser.Lista_dec_modulosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#lista_dec_modulos}.
	 * @param ctx the parse tree
	 */
	void exitLista_dec_modulos(JeParser.Lista_dec_modulosContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#modulo}.
	 * @param ctx the parse tree
	 */
	void enterModulo(JeParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#modulo}.
	 * @param ctx the parse tree
	 */
	void exitModulo(JeParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#procedimento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimento(JeParser.ProcedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#procedimento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimento(JeParser.ProcedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(JeParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(JeParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#lista_parametros}.
	 * @param ctx the parse tree
	 */
	void enterLista_parametros(JeParser.Lista_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#lista_parametros}.
	 * @param ctx the parse tree
	 */
	void exitLista_parametros(JeParser.Lista_parametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(JeParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(JeParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#lista_comandos}.
	 * @param ctx the parse tree
	 */
	void enterLista_comandos(JeParser.Lista_comandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#lista_comandos}.
	 * @param ctx the parse tree
	 */
	void exitLista_comandos(JeParser.Lista_comandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(JeParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(JeParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#comando_em_frente}.
	 * @param ctx the parse tree
	 */
	void enterComando_em_frente(JeParser.Comando_em_frenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#comando_em_frente}.
	 * @param ctx the parse tree
	 */
	void exitComando_em_frente(JeParser.Comando_em_frenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#comando_interromper}.
	 * @param ctx the parse tree
	 */
	void enterComando_interromper(JeParser.Comando_interromperContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#comando_interromper}.
	 * @param ctx the parse tree
	 */
	void exitComando_interromper(JeParser.Comando_interromperContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#comando_condicional_escolher}.
	 * @param ctx the parse tree
	 */
	void enterComando_condicional_escolher(JeParser.Comando_condicional_escolherContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#comando_condicional_escolher}.
	 * @param ctx the parse tree
	 */
	void exitComando_condicional_escolher(JeParser.Comando_condicional_escolherContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#lista_casos}.
	 * @param ctx the parse tree
	 */
	void enterLista_casos(JeParser.Lista_casosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#lista_casos}.
	 * @param ctx the parse tree
	 */
	void exitLista_casos(JeParser.Lista_casosContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(JeParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(JeParser.CasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#caso_padrao}.
	 * @param ctx the parse tree
	 */
	void enterCaso_padrao(JeParser.Caso_padraoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#caso_padrao}.
	 * @param ctx the parse tree
	 */
	void exitCaso_padrao(JeParser.Caso_padraoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#valor_caso}.
	 * @param ctx the parse tree
	 */
	void enterValor_caso(JeParser.Valor_casoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#valor_caso}.
	 * @param ctx the parse tree
	 */
	void exitValor_caso(JeParser.Valor_casoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#intervalo_caso}.
	 * @param ctx the parse tree
	 */
	void enterIntervalo_caso(JeParser.Intervalo_casoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#intervalo_caso}.
	 * @param ctx the parse tree
	 */
	void exitIntervalo_caso(JeParser.Intervalo_casoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#comando_condicional_se}.
	 * @param ctx the parse tree
	 */
	void enterComando_condicional_se(JeParser.Comando_condicional_seContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#comando_condicional_se}.
	 * @param ctx the parse tree
	 */
	void exitComando_condicional_se(JeParser.Comando_condicional_seContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#comando_repeticao_repetir}.
	 * @param ctx the parse tree
	 */
	void enterComando_repeticao_repetir(JeParser.Comando_repeticao_repetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#comando_repeticao_repetir}.
	 * @param ctx the parse tree
	 */
	void exitComando_repeticao_repetir(JeParser.Comando_repeticao_repetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#comando_repeticao_enquanto}.
	 * @param ctx the parse tree
	 */
	void enterComando_repeticao_enquanto(JeParser.Comando_repeticao_enquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#comando_repeticao_enquanto}.
	 * @param ctx the parse tree
	 */
	void exitComando_repeticao_enquanto(JeParser.Comando_repeticao_enquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#comando_repeticao_ir}.
	 * @param ctx the parse tree
	 */
	void enterComando_repeticao_ir(JeParser.Comando_repeticao_irContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#comando_repeticao_ir}.
	 * @param ctx the parse tree
	 */
	void exitComando_repeticao_ir(JeParser.Comando_repeticao_irContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#intervalo}.
	 * @param ctx the parse tree
	 */
	void enterIntervalo(JeParser.IntervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#intervalo}.
	 * @param ctx the parse tree
	 */
	void exitIntervalo(JeParser.IntervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#comando_chamada_modulo}.
	 * @param ctx the parse tree
	 */
	void enterComando_chamada_modulo(JeParser.Comando_chamada_moduloContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#comando_chamada_modulo}.
	 * @param ctx the parse tree
	 */
	void exitComando_chamada_modulo(JeParser.Comando_chamada_moduloContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#comando_escrever}.
	 * @param ctx the parse tree
	 */
	void enterComando_escrever(JeParser.Comando_escreverContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#comando_escrever}.
	 * @param ctx the parse tree
	 */
	void exitComando_escrever(JeParser.Comando_escreverContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#comando_ler}.
	 * @param ctx the parse tree
	 */
	void enterComando_ler(JeParser.Comando_lerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#comando_ler}.
	 * @param ctx the parse tree
	 */
	void exitComando_ler(JeParser.Comando_lerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#comando_atribuir}.
	 * @param ctx the parse tree
	 */
	void enterComando_atribuir(JeParser.Comando_atribuirContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#comando_atribuir}.
	 * @param ctx the parse tree
	 */
	void exitComando_atribuir(JeParser.Comando_atribuirContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#campo_registro}.
	 * @param ctx the parse tree
	 */
	void enterCampo_registro(JeParser.Campo_registroContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#campo_registro}.
	 * @param ctx the parse tree
	 */
	void exitCampo_registro(JeParser.Campo_registroContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#comando_retornar}.
	 * @param ctx the parse tree
	 */
	void enterComando_retornar(JeParser.Comando_retornarContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#comando_retornar}.
	 * @param ctx the parse tree
	 */
	void exitComando_retornar(JeParser.Comando_retornarContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(JeParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(JeParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_aritmetica(JeParser.Expressao_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_aritmetica(JeParser.Expressao_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#termo_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_aritmetico(JeParser.Termo_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#termo_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_aritmetico(JeParser.Termo_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#fator_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFator_aritmetico(JeParser.Fator_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#fator_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFator_aritmetico(JeParser.Fator_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_relacional(JeParser.Expressao_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_relacional(JeParser.Expressao_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#operador_booleano}.
	 * @param ctx the parse tree
	 */
	void enterOperador_booleano(JeParser.Operador_booleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#operador_booleano}.
	 * @param ctx the parse tree
	 */
	void exitOperador_booleano(JeParser.Operador_booleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#termo_relacional}.
	 * @param ctx the parse tree
	 */
	void enterTermo_relacional(JeParser.Termo_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#termo_relacional}.
	 * @param ctx the parse tree
	 */
	void exitTermo_relacional(JeParser.Termo_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#fator_relacional}.
	 * @param ctx the parse tree
	 */
	void enterFator_relacional(JeParser.Fator_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#fator_relacional}.
	 * @param ctx the parse tree
	 */
	void exitFator_relacional(JeParser.Fator_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperador_relacional(JeParser.Operador_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperador_relacional(JeParser.Operador_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#chamada}.
	 * @param ctx the parse tree
	 */
	void enterChamada(JeParser.ChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#chamada}.
	 * @param ctx the parse tree
	 */
	void exitChamada(JeParser.ChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#lista_argumentos}.
	 * @param ctx the parse tree
	 */
	void enterLista_argumentos(JeParser.Lista_argumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#lista_argumentos}.
	 * @param ctx the parse tree
	 */
	void exitLista_argumentos(JeParser.Lista_argumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link JeParser#argumento}.
	 * @param ctx the parse tree
	 */
	void enterArgumento(JeParser.ArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JeParser#argumento}.
	 * @param ctx the parse tree
	 */
	void exitArgumento(JeParser.ArgumentoContext ctx);
}