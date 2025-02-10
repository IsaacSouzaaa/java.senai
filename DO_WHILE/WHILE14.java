package DO_WHILE;

import java.util.Scanner;

public class WHILE14 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("digite um numero: ");
            int numero = sc.nextInt();
            int i = 1;

            System.out.println("divisores de " + numero + ":");
            do {
                if (numero % i == 0) {
                    System.out.println(i);
                }
                i++;
            } while (i <= numero);

            sc.close();
        }
    }