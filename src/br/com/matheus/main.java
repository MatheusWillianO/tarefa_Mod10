package br.com.matheus;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual foi a primeira nota: ");
        int nota1 = s.nextInt();

        System.out.println("Qual foi a segunda nota: ");
        int nota2 = s.nextInt();

        System.out.println("Qual foi a terceira nota: ");
        int nota3 = s.nextInt();

        System.out.println("Qual foi a quarta nota: ");
        int nota4 = s.nextInt();

        int notaFinal = nota1 + nota2 + nota3 + nota4;
        int media = notaFinal / 4;

        if (media >= 7) {
            System.out.println("Sua média foi: " + media + " \nE você está aprovado.");
        } else if (media >= 5) {
            System.out.println("Sua média foi: " + media + " \nE você está em recuperação.");
        } else {
            System.out.println("Sua média foi: " + media + " \nE você está reprovado.");
        }
    }
}
