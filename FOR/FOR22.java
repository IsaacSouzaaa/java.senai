package FOR;

import java.util.Scanner;

public class FOR22 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número:");
            int number = sc.nextInt();

            System.out.println("Os divisores de " + number + " são:");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }

            sc.close();
        }
    }