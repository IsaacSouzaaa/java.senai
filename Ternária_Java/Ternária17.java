package Ternária_Java;

import java.util.Scanner;

public class Ternária17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        if (idade <= 18) {
            System.out.println("Voce é estudante? s/n ");
            char estudante = sc.next().charAt(0);
            if (estudante == 's') {
                System.out.println("voce tem direito ao desconto");
            } else System.out.println("voce nao tem direito ao desconto");

        }
        if (idade > 60) {
            System.out.println("voce tem direito ao desconto ");
        }
        sc.close();
    }
}
