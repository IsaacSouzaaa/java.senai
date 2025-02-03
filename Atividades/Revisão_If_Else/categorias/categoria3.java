package lista_java.categorias;

import java.util.Scanner;

public class categoria3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua altura em metros (ex: 1.75): ");
        double altura = sc.nextDouble();

        if (altura < 1.60) {
            System.out.println("Você é considerado baixo.");
        } else if (altura >= 1.60 && altura <= 1.80) {
            System.out.println("Você é considerado de altura média.");
        } else {
            System.out.println("Você é considerado alto.");
        }
        sc.close();
    }
}