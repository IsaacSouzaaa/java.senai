package DO_WHILE;

import java.util.Scanner;

public class WHILE13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        int soma = 0;

        do {
            soma += numero % 10;
            numero /= 10;
        } while (numero > 0);

        System.out.println("A soma dos dígitos é: " + soma);
        sc.close();
    }
}