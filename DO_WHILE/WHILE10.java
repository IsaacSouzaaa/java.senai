package DO_WHILE;

import java.util.Scanner;

public class WHILE10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;

        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = sc.nextInt();
            if (numero != 0) {
                contador++;
            }
        } while (numero != 0);

        System.out.println("Você digitou " + contador + " números.");
        sc.close();
    }
}