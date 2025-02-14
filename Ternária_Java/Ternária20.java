package Ternária_Java;

import java.util.Scanner;

public class Ternária20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma nota: ");
        double nota = sc.nextDouble();
        if (nota > 5 && nota < 6.9) {
            System.out.println("recuperação");
        } else if (nota >= 7) {
            System.out.println("aprovado");
        } else System.out.println("reprovado");
        sc.close();
    }
}