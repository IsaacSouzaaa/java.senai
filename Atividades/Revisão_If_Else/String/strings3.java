package lista_java.String;

import java.util.Scanner;

public class strings3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nomeDigitado = sc.nextLine();

        if (nomeDigitado.startsWith("A") || nomeDigitado.startsWith("a")) {
            System.out.println("O nome começa com a letra 'A'.");
        } else {
            System.out.println("O nome não começa com a letra 'A'.");
        }
        sc.close();
    }
}