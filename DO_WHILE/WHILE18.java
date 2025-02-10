package DO_WHILE;

import java.util.Scanner;

public class WHILE18 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int numero;

            do {
                System.out.print("Digite um número (0 para sair): ");
                numero = sc.nextInt();
                if (numero != 0) {
                    if (numero % 2 == 0) {
                        System.out.println(numero + " é par.");
                    } else {
                        System.out.println(numero + " é ímpar.");
                    }
                }
            } while (numero != 0);

            sc.close();
        }
    }