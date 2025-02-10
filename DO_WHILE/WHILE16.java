package DO_WHILE;

import java.util.Scanner;

public class WHILE16 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            int i = 1;

            System.out.println("Os primeiros 10 múltiplos de " + numero + ":");
            do {
                System.out.println(numero * i);
                i++;
            } while (i <= 10);

            sc.close();
        }
    }