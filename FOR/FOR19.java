package FOR;

import java.util.Scanner;

public class FOR19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int numero = sc.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++){
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + "é " + fatorial);

        sc.close();
    }
}
