package Atv_Fixa.Atv_Fixa01;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Insira a largura e a altura do retângulo:");
            double width = scanner.nextDouble();
            double height = scanner.nextDouble();

            Retangulo retangulo = new Retangulo (width, height);

            System.out.printf("AREA = %.2f%n", retangulo.area());
            System.out.printf("PERIMETER = %.2f%n", retangulo.perimetro());
            System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());

            scanner.close();
        }
    }