package lista_java.categorias;

import java.util.Scanner;

public class categoria4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a pressão arterial sistólica (mmHg): ");
        int sistolica = sc.nextInt();

        System.out.print("Digite a pressão arterial diastólica (mmHg): ");
        int diastolica = sc.nextInt();

        if (sistolica < 120 && diastolica < 80) {
            System.out.println("Pressão arterial: Normal.");
        } else if ((sistolica >= 120 && sistolica <= 139) || (diastolica >= 80 && diastolica <= 89)) {
            System.out.println("Pressão arterial: Moderado.");
        } else {
            System.out.println("Pressão arterial: Alto.");
        }
        sc.close();
    }
}