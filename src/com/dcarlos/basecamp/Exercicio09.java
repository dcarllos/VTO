package com.dcarlos.basecamp;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        int v;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor inteiro entre 1 e 3: ");
        v = scan.nextInt();

        switch (v){
            case 1:
                System.out.println("Certo");
                break;
            case 2:
                System.out.println("Certo");
                break;
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
        }


    }
}
