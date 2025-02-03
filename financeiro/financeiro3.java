package lista_java.financeiro;

import java.util.Scanner;

public class financeiro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salário: R$ ");
        double salario = sc.nextDouble();

        if (salario >= 3000) {
            System.out.println("Você pode financiar um imóvel.");
        } else {
            System.out.println("Você não pode financiar um imóvel.");
        }

        sc.close();
    }
}