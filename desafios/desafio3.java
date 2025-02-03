package lista_java.desafios;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número secreto (entre 1 e 100): ");
        int numeroSecreto = sc.nextInt();

        if (numeroSecreto < 1 || numeroSecreto > 100) {
            System.out.println("O número secreto deve estar entre 1 e 100.");
            sc.close();
            return;
        }

        int tentativas = 0;
        int palpite = 0;

        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");

        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número secreto em " + tentativas + " tentativas.");
            }
        }

        sc.close();
    }
}