package Ternária_Java;

import java.util.Scanner;

public class Ternária10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();
        if (num1 > 100) {
            System.out.println("alto");
        } else System.out.println("Baixo");
        sc.close();}
}