package lista_java.cotidiano;

import java.util.Scanner;

public class cotidiano2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoAcesso = 1234;

        System.out.print("Digite o código de acesso: ");
        int codigoInserido = sc.nextInt();

        if (codigoInserido == codigoAcesso) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado. Código incorreto.");
        }

        sc.close();
    }
}