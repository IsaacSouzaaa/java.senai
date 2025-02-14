package Ternária_Java;

import java.util.Scanner;

public class Ternária06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Possui carteira de motorista? (S/N)");
        sc.nextLine();
        String PossuiCarteira = sc.nextLine();

        if (idade >= 18 && PossuiCarteira.equalsIgnoreCase("S")) {
            System.out.println("você pode dirigir");
        } else {
            System.out.println("você não pode dirigir");

            sc.close();
        }
    }
}
