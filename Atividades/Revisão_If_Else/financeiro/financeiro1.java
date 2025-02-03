package lista_java.financeiro;

import java.util.Scanner;

public class financeiro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.print("Digite o valor que deseja sacar: ");
        double saque = sc.nextDouble();

        if (saque <= saldo) {
            System.out.println("Saque realizado com sucesso! Novo saldo: " + (saldo - saque));
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
        sc.close();
    }
}
