package DO_WHILE;

import java.util.Scanner;

public class WHILE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número (0 para sair e ver a soma): ");
            numero = sc.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("A soma dos números digitados é: " + soma);
        sc.close();
    }
}
