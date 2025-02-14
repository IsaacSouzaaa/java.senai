package Ternária_Java;

import java.util.Scanner;

public class Ternária08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota = sc.nextDouble();
        if (nota >= 7) {
            System.out.println("aprovado");
        } else System.out.println("Reprovado");

        sc.close();
    }
}