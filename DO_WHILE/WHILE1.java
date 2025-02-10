package DO_WHILE;

import java.util.Scanner;

public class WHILE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

                do {
                    System.out.println("digite um numero (negativo para sair): ");
                    numero = sc.nextInt();
                } while (numero > 0);

        System.out.println("você digitou um numero" + numero);
        sc.close();
    }
}
