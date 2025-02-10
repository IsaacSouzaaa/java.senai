package DO_WHILE;

import java.util.Scanner;

public class WHILE24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;

        do {
            System.out.print("Digite um número (negativo para sair): ");
            numero = sc.nextDouble();
            if (numero >= 0) {
                System.out.println("A raiz quadrada de " + numero + " é: " + Math.sqrt(numero));
            }
        } while (numero >= 0);

        System.out.println("Programa encerrado.");
        sc.close();
    }
}