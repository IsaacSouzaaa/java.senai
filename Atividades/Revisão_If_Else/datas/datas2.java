package lista_java.datas;

import java.util.Scanner;

public class datas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um mês (1-12): ");
        int mes = sc.nextInt();

        if (mes >= 1 && mes <= 12) {
            System.out.println("O mês " + mes + " é válido.");
        } else {
            System.out.println("O mês " + mes + " é inválido.");
        }

        sc.close();
    }
}