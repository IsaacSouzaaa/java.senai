package Criação_Métodos_Java;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 números de 0 a 30. Caso acerte, o número aparecerá na tela. Caso não, uma mensagem de erro aparecerá:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        String resultado = conjunto(num1, num2, num3);
        showResult(resultado);
    }


    public static String conjunto(int a1, int b1, int c1) {
        int numerocerto = 25;

        if (a1 == numerocerto || b1 == numerocerto || c1 == numerocerto) {
            return "Você acertou o número: " + numerocerto;
        } else {
            return "Não acertou o número.";
        }
    }

    public static void showResult(String value) {
        System.out.println(value);
    }
}