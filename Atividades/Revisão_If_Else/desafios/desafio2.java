package lista_java.desafios;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        if (numero1 > 2 * numero2) {
            System.out.println("O primeiro número é maior que o dobro do segundo número.");
        } else {
            System.out.println("O primeiro número não é maior que o dobro do segundo número.");
        }

        sc.close();
    }
}