package Ternária_Java;

import java.util.Scanner;

public class Ternária09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("o valor " + num1 + " é o maior");
        } else if (num2 > num1) {
            System.out.println("o valor " + num2 + " é o maior");
        } else System.out.println("os numeros sao iguais");
        sc.close(); }
}