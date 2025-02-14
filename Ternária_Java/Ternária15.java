package Ternária_Java;

import java.util.Scanner;

public class Ternária15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();
        if (num1 % 5 == 0 && num1 % 3 == 0) {
            System.out.println("FizzBuzz");
        } else System.out.println("não é multiplo de 3 e 5 ao mesmo tempo: " + num1);
        sc.close();
    }
}