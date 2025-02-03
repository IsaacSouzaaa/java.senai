package lista_java.desafios;

import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        if (numero1 > 0 && numero2 > 0) {
            System.out.println("Ambos os números são positivos.");
        } else if (numero1 < 0 && numero2 < 0) {
            System.out.println("Ambos os números são negativos.");
        } else {
            System.out.println("Um número é positivo e o outro é negativo.");
        }

        sc.close();
    }
}