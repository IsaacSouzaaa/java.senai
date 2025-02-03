package lista_java.categorias;

import java.util.Scanner;

public class categoria5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = sc.nextDouble();

        if (temperatura < 15) {
            System.out.println("Está frio.");
        } else if (temperatura >= 15 && temperatura <= 25) {
            System.out.println("Está agradável.");
        } else {
            System.out.println("Está quente.");
        }
        sc.close();
    }
}