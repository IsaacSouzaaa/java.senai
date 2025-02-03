package lista_java.financeiro;

import java.util.Scanner;

public class financeiro5 {
    public static void main(String[] args) {
            double valorMinimo = 100.0;
            double valorCompra;

            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o valor da compra: R$ ");
            valorCompra = sc.nextDouble();

            if (valorCompra >= valorMinimo) {
                System.out.println("Parabéns! Você ganhou um brinde!");
            } else {
                System.out.println("Você não atingiu o valor mínimo para ganhar um brinde.");
            }

            sc.close();
        }
    }