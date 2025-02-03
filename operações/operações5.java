package lista_java.operações;

import java.util.Scanner;

public class operações5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int numero = sc.nextInt();

        if (numero * numero < 0) {
            System.out.println("não é um quadrado perfeito");
        } else {
            System.out.println("é um quadrado perfeito");
        }
    }
}
