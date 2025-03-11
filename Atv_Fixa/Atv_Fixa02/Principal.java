package Atv_Fixa.Atv_Fixa02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Imposto: ");
        double imposto = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);

        System.out.println("\n" + funcionario);

        System.out.print("\nQual a porcentagem para aumentar o salário? ");
        double porcentagem = scanner.nextDouble();
        funcionario.aumentarSalario(porcentagem);

        System.out.println("\nDados atualizados: " + funcionario);

        scanner.close();
    }
}
