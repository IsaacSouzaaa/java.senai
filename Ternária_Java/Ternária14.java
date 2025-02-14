package Ternária_Java;

import java.util.Scanner;

public class Ternária14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();
        if (num1 > 10 && num1 < 50) {
            System.out.println("Dentro do intervalo");
        } else System.out.println("Fora do intervalo");
        sc.close();
    }
}