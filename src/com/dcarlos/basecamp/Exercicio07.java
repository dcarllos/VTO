package com.dcarlos.basecamp;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        int mes;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número do mês do ano: ");
        mes = scan.nextInt();

        if (mes == 1){
                System.out.println("O mês " + mes + " é Janeiro!");
            }else if (mes == 2) {
                System.out.println("O mês " + mes + " é Fevereiro!");
            }else if (mes == 3){
                System.out.println("O mês " + mes + " é Março!");
            }else if (mes == 4){
                System.out.println("O mês " + mes + " é Abril!");
            }else if (mes == 5){
                System.out.println("O mês " + mes + " é Maio!");
            }else if (mes == 6){
                System.out.println("O mês " + mes + " é Junho!");
            }else if (mes == 7){
                System.out.println("O mês " + mes + " é Julho!");
            }else if (mes == 8){
                System.out.println("O mês " + mes + " é Agosto!");
            }else if (mes == 9){
                System.out.println("O mês " + mes + " é Setembro!");
            }else if (mes == 10){
                System.out.println("O mês " + mes + " é Outubro!");
            }else if (mes == 11){
                System.out.println("O mês " + mes + " é Novembro!");
            }else if (mes == 12){
                System.out.println("O mês " + mes + " é Dezembro!");
        }else {
            System.out.println("Por favor, digite um mês válido!");
        }
}
}
