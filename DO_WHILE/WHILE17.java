package DO_WHILE;

import java.util.Scanner;

public class WHILE17 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            int i = 2;
            boolean ePrimo = true;

            if (numero < 2) {
                ePrimo = false;
            } else {
                do {
                    if (numero % i == 0) {
                        ePrimo = false;
                        break;
                    }
                    i++;
                } while (i <= Math.sqrt(numero));
            }

            if (ePrimo) {
                System.out.println(numero + " é primo.");
            } else {
                System.out.println(numero + " não é primo.");
            }

            sc.close();
        }
    }