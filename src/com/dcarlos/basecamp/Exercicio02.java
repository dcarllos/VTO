package com.dcarlos.basecamp;

public class Exercicio02 {

    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000;  //tamanho ultrapassa o limite do tipo short

        //int i1 = -10000000000; //tamanho é muito abaixo no menor negativo que o tipo inteiro pode suportar
        int i2 = 28500;

        long l1 = 10000000000000000L;
        long l2 = 2004005000500055000L;

        //float f1 = 4.5;    //faltou o "F/f" ao final da variável
        float f2 = 10.68F;   //tanto faz o "f" minúscolo quanto o "F" maiúsculo

        double d1 = 85.69;
        double d2 = 99.04d;  //No caso do double, o "d/D" no final da variável é opcional

        char c1 = 'W';
        //char c2 = 'Tw';      //O char só suporta 1 caractere
        char c3 = '\u0057';  //Outra forma de se declarar o tipo caractere, utilizando o código unicode de um determinado caractere. No caso, o "w"

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgb se se et k JKJKNAKD NINDIWQNI%# ((@#* ";

        //String dt1 = "11/11/2021";  //Para datas, há um tipo específico. Não é recomendado usar o String

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);


    }
}
