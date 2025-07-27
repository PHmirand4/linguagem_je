# Je: A Linguagem de Programação Kaingang

![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)
![Versão](https://img.shields.io/badge/versão-conceitual-lightgrey)
![Licença](https://img.shields.io/badge/licença-MIT-blue)

## Sobre o Projeto

"Je" é uma iniciativa inovadora para criar uma linguagem de programação pioneira, fundamentada no idioma Kaingang. O projeto visa proporcionar à comunidade indígena uma ferramenta tecnológica que não apenas facilita o aprendizado de programação, mas também fortalece e preserva sua língua e cultura.

Os Kaingang estão entre os cinco povos indígenas mais populosos do Brasil, com uma população de dezenas de milhares de pessoas distribuídas em mais de 30 Terras Indígenas nos estados de São Paulo, Paraná, Santa Catarina e Rio Grande do Sul. Sua língua pertence à família Jê, do tronco Macro-Jê, e sua cultura milenar se desenvolveu na região dos pinheirais do Sul/Sudeste brasileiro. Um dos traços mais marcantes de sua cultura é a visão de mundo dualista, que divide a sociedade em duas metades — *Kamé* e *Kairu* Essa dualidade, que representa opostos complementares, rege as relações sociais, o casamento, os rituais e a forma como percebem a natureza e o cosmos.

## Sintaxe da Linguagem

A sintaxe da linguagem é baseada em termos Kaingang. Para fins de compilação, termos compostos são unidos por um underscore (`_`).

### Estrutura do Programa

| Conceito | Termo Kaingang | Token (Uso no Código) | Descrição |
| :--- | :--- | :--- | :--- |
| Programa | `põgāma` | `PROGRAMA` | Palavra-chave que define o início de um programa executável. Inspirado na forma como "programa" é falado. |
| Delimitador | `;` | `DEM_FIM_LINHA` | Símbolo que indica o fim de uma instrução ou linha de comando. |
| Separador | `,` | `SEPARADOR` | Símbolo usado para separar múltiplos itens, como parâmetros em uma função. |
| Procedimento | `põsedimēto` | `PROCEDIMENTO` | Define um procedimento ou rotina que não retorna um valor (void). |
| Bloco de Início | `pën_jēg` | `INICIO` | Palavra-chave que marca o início de um bloco de código executável. Deriva do termo Kaingang para "começar". |
| Bloco de Fim | `kar` | `FIM` | Palavra-chave que marca o fim de um bloco de código. Deriva do termo Kaingang para "terminar". |
| Atribuição | `vẽ` | `EH` | Palavra-chave usada em declarações, atuando como um conector. Significa "é". |
| Importar Módulo | `ma_kãtīg` | `IMPORTAR` | Palavra-chave para importar módulos, bibliotecas ou outros arquivos de código. Deriva do termo Kaingang para "trazer". |

### Variáveis e Tipos de Dados

| Conceito | Termo Kaingang | Token (Uso no Código) | Descrição |
| :--- | :--- | :--- | :--- |
| Declarar Variável | `vãso` | `DEC_VAR` | Palavra-chave que inicia um bloco de declaração de variáveis. Deriva do português "declarar". |
| Atribuir Valor | `rãg` | `GUARDA` | Comando utilizado para atribuir um valor a uma variável. A ideia é "guardar" um dado. |
| Inteiro | `ĩtêlo` | `INTEIRO` | Define o tipo de dado para números inteiros. |
| String | `tesetu` | `TEXTO` | Define o tipo de dado para uma sequência de caracteres (texto). |
| Double | `Hêã` | `REAL` | Define o tipo de dado para números de ponto flutuante (reais). |
| Char | `djisitu` | `CARACTERE` | Define o tipo de dado para um único caractere. |
| Lógico | `lôsiko` | `LOGICO` | Define o tipo de dado booleano, que pode ser verdadeiro ou falso. |
| Booleano (Verdadeiro) | `pẽ` | `VERDADEIRO`| Palavra-chave para o valor booleano 'verdadeiro'. |
| Booleano (Falso) | `pẽ_vó` | `FALSO` | Palavra-chave para o valor booleano 'falso'. A tradução literal é "verdadeiro não". |

### Entrada e Saída (I/O)
### Estruturas de Controle
### Operadores
Para os operadores de comparação, a linguagem adota símbolos universais para simplificar a leitura e a escrita do código.

## Exemplos de Código

### Programa: fatorial.je

Este programa calcula o fatorial de um número fornecido pelo usuário.

```je
põgāma fatorial;

vāso
    ītēlo num vẽ;
    ītēlo contador vẽ;
    ītēlo fatorial vẽ;

pën_jēg

    "Informe um número" ven;
    num to_ke;

    1 kā fatorial råg;

    1 -> num kā contador, 1 nīkrén;
        contador * fatorial kā fatorial råg;
    nīkrén kar

    fatorial ven;

kar
```

### Programa: comparar_numeros.je

Este programa compara dois números inseridos pelo usuário e informa qual é maior ou se são iguais.

```je
põgama CompararNumeros;

vāso
    ītēlo numA vẽ;
    ītēlo numB vẽ;

pën_jēg

    "Digite o primeiro número:" ven;
    numA to_ke;

    "Digite o segundo número:" ven;
    numB to_ke;

    // Estrutura condicional
    numA == numB nỹtĩ
        ge
            "Os números são iguais." ven;
    jo
        numA > numB nỹtĩ
            ge
                "O primeiro número é maior." ven;
        jo
            "O segundo número é maior." ven;
        kar 
    kar

kar
```

### Programa: comparar_numeros_usando_vetores.je

Este programa compara dois números informados e exibe qual deles é o maior ou se são iguais.

```je
põgama CompararNumerosUsandoVetores;

vāso
    ītēlo[2] kã numeros rãg;

pën_jēg

    // atribuição manual
    5 kã numeros[0] rãg;
    10 kã numeros[1] rãg;

    // se quiser leitura é só fazer
    // tipo assim: numeros[0] to_ke;

    // Estrutura condicional com os novos tokens
    numeros[0] = numeros[1] nī
        ge
            "Os números são iguais." ven;
    jo
        numeros[0] > numeros[1] nī
            ge
                "O primeiro número é maior." ven;
        jo
            "O segundo número é maior." ven;
        kar
    kar

kar
```

## Fontes

[1] Instituto Socioambiental. Povo Kaingang - Povos Indígenas no Brasil. Disponível em: https://pib.socioambiental.org/pt/Povo:Kaingang

[2] WIESEMANN, Ursula Gojtéj. *Dicionário Kaingang - Português | Português - Kaingang*. 2. ed. Curitiba: Editora Evangélica Esperança, 2011.
