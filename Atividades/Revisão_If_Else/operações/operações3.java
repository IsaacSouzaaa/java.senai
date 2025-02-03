package lista_java.operações;

import java.util.Scanner;

public class operações3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        double numero1 = sc.nextDouble();
        System.out.println("digite o segundo numero: ");
        double numero2 = sc.nextDouble();

        if (numero1 % numero2 == 0) {
            System.out.println("o numero é divisível por " + numero2);
        } else {
        System.out.println("o numero é divisível por " + numero1);
        }
    }
}
