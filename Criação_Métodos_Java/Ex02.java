package Criação_Métodos_Java;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga 2 numeros:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        String resultado = conjunto(num1, num2);

        showResult(resultado);
    }

    public static String conjunto(int a, int b) {
        String resultado = "";
        if (a % 2 == 0) {
            resultado += "o primeiro numero é par " + a + "\n";
        } else if (a % 2 == 1) {
            resultado += "o primeirop numero é impar " + a + "\n";
        }
        if (b % 2 == 0) {
            resultado += "o segundo numero é par " + b + "\n";
        } else if (b % 2 == 1) {
            resultado += "o segundo numero é impar " + b + "\n";

        }
        return resultado;
    }

    public static void showResult(String value) {
        System.out.println(value);

    }
}