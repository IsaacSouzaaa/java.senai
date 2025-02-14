package Ternária_Java;

import java.util.Scanner;

public class Ternária21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        if (num % 2 == 0 && num > 0) {
            System.out.println("O numero é par e positivo");
        } else if (num % 2 == 0 && num < 0) {
            System.out.println("O numero é par e negativo");
        } else if (num % 2 == 1 && num > 0) {
            System.out.println("O numero é impar e positivo");
        } else if (num % 2 == -1 && num < 0) {
            System.out.println("o numero é impar e negativo");
        } else System.out.println("O número zero é par, mas não é positivo");

        sc.close();
    }
}