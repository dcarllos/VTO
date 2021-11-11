package com.dcarlos.basecamp;

public class Exercicio01{
    public static void main(String[] args) {

        //Exemplos corretos e errôneos de se declarar variáveis
        int i;       //Correto
        //int i;     //Errado, variável já existente
        int I;       //Correto, porém não é boa prática
        //int 1a;    //Errado, começa com número
        int _1a;     //Correto, mas não é boa prática
        int $aq;     //Correto, mas não é boa prática

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        //mais exemplos de declaração de variáveis

        final int j = 10;
        //j = 15;       //Não se pode alterar o valor de uma variável do tipo final (constante)

        int asrn24678md;    //Correto
        //int asrn246 78md;   //Errado, contém espaço
        int asrn2$4678_md;  //Correto, mas não é boa prática
        //int asrn24%678_md;  //Errado, contém caractere especial (%)

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;       //Correto
        //int QuantidadePruduto;            //Correto, mas não é boa prática inicial maiúscula no nome da variável
        final int NUMERO_TENTATIVAS = 5;  //Correto
        //final int numeroTentativas = 5;  //Não é boa prática nome da constante com CamelCase
        int QUANTIDADE_OPCOES = 25;       //Não é boa prática de nome de variável comum
        //int qtdProd;                      //Correto, mas não é boa prática por ser pouco descritiva. "Prod" pode significar muita coisa.

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }
}
