package com.dcarlos.basecamp;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        String numberDay;
        Scanner day = new Scanner(System.in);
        System.out.println("Escreva o nome do dia da semana: ");
        numberDay = day.next();

        switch (numberDay){
            case "Segunda":
                System.out.println("Dia 1!");
                break;
            case "Terça":
                System.out.println("Dia 2!");
                break;
            case "Quarta":
                System.out.println("Dia 3!");
                break;
            case "Quinta":
                System.out.println("Dia 4!");
                break;
            case "Sexta":
                System.out.println("Dia 5!");
                break;
            case "Sábado":
                System.out.println("Dia 7!");
                break;
            case "Domingo":
                System.out.println("Dia 8!");
                break;

            default:
                System.out.println("Por favor, escreva um dia válido.");
        }

    }
}
