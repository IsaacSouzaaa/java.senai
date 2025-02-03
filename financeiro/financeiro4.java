package lista_java.financeiro;

import java.util.Scanner;

public class financeiro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salário: R$ ");
        double salario = sc.nextDouble();

        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = sc.nextDouble();

        System.out.print("Digite o número de parcelas: ");
        int numeroParcelas = sc.nextInt();

        double valorParcela = valorProduto / numeroParcelas;

        if (valorParcela <= (salario * 0.10)) {
            System.out.println("Você pode comprar o produto parcelado.");
        } else {
            System.out.println("Você não pode comprar o produto parcelado.");
        }
        sc.close();
    }
}