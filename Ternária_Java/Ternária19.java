package Ternária_Java;

import java.util.Scanner;

public class Ternária19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0 || numero % 3 == 0) {
            System.out.println("Divisivel");
        } else System.out.println("nao divisivel");
        sc.close();
    }
}