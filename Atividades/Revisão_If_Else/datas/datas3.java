package lista_java.datas;

import java.util.Scanner;

public class datas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o mês (1-12): ");
        int mes = sc.nextInt();

        System.out.print("Digite o dia: ");
        int dia = sc.nextInt();

        boolean diaValido = false;

        if (mes >= 1 && mes <= 12) {
            if (dia >= 1) {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    diaValido = dia <= 31;
                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    diaValido = dia <= 30;
                } else if (mes == 2) {
                    diaValido = dia <= 28;
                }
            }
        }

        if (diaValido) {
            System.out.println("O dia " + dia + " é válido para o mês " + mes + ".");
        } else {
            System.out.println("O dia " + dia + " é inválido para o mês " + mes + ".");
        }

        sc.close();
    }
}