package DO_WHILE;

import java.util.Scanner;

public class WHILE15 {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o valor máximo: ");
            int max = sc.nextInt();
            int a = 0, b = 1;

            System.out.println("Sequência de Fibonacci até " + max + ":");
            do {
                System.out.print(a + " ");
                int proximo = a + b;
                a = b;
                b = proximo;
            } while (a <= max);

            System.out.println();
            sc.close();
        }
    }