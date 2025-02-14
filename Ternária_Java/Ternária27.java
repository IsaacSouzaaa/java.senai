package Ternária_Java;

import java.util.Scanner;

public class Ternária27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        String resultado = (numero >= 0) ? "Positivo ou Zero" : "Negativo";
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}