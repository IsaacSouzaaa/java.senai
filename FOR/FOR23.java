package FOR;

import java.util.Scanner;

public class FOR23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("Divisores de " + numero + ":");

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}