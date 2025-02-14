package Ternária_Java;

import java.util.Scanner;

public class Ternária16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor booleano (true/false): ");
        boolean valor = sc.nextBoolean();

        String resultado = valor ? "Sim" : "Não";

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
