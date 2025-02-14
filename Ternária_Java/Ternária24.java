package Ternária_Java;

import java.util.Scanner;

public class Ternária24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int somaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        if (somaDivisores == numero) {
            System.out.println("Perfeito");
        } else {
            System.out.println("Não perfeito");
        }

        sc.close();
    }
}