package lista_java.financeiro;

import java.util.Scanner;

public class financeiro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorTotal = sc.nextDouble();

        double desconto = 0;

        if (valorTotal > 500) {
            desconto = valorTotal * 0.10;
        }

        double valorFinal = valorTotal - desconto;

        System.out.printf("Valor total: R$ %.2f%n", valorTotal);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);

        sc.close();
    }
}