package Ternária_Java;

import java.util.Scanner;

public class Ternária12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        if (num % 2 == 0 && num > 0) {
            System.out.println("par e positivo");
        } else if (num % 2 == 0 && num < 0) {
            System.out.println("par e negativo");
        } else if (num % 2 == 1 && num > 0) {
            System.out.println("impar e positivo");
        } else System.out.println("impar e negativo");
        sc.close();
    }
}
