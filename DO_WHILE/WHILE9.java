package DO_WHILE;

import java.util.Scanner;

public class WHILE9 {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int numero;

            do {
                System.out.print("Digite um número (negativo para sair): ");
                numero = sc.nextInt();
                if (numero >= 0) {
                    System.out.println("Número positivo: " + numero);
                }
            } while (numero >= 0);

            sc.close();
        }
    }