package Ternária_Java;

import java.util.Scanner;

public class Ternária22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorpr = sc.nextDouble();
        if (valorpr >= 100.00) {
            System.out.println("Seu produto tem frete gratis");
        } else System.out.println("O seu produto não tem frete gratis");
        sc.close();
    }
}