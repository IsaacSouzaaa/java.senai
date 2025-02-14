package Ternária_Java;

import java.util.Scanner;

public class Ternária01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();
            if (numero % 2 == 0){
                System.out.print("o número " + numero + " é par");
            } else System.out.print("o numero " + numero + " é ímpar");
            sc.close(); }
    }