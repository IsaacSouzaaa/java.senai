package Ternária_Java;

import java.util.Scanner;

public class Ternária07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        if (numero > 0 && numero % 2 == 0) {
            System.out.println("sim, o numero é positivo e par");
        } else System.out.println("não");
        sc.close();
    }
}