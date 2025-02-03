package lista_java.operações;

import java.util.Scanner;

public class operações4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro numero");
        double numero1 = sc.nextDouble();
        System.out.println("digite o segundo numero");
        double numero2 = sc.nextDouble();
        System.out.println("digite o terceiro numero");
        double numero3 = sc.nextDouble();

        if (podemFormarTriangulo(numero1, numero2, numero3)) {
            System.out.println("os numeros formam um triangulo");
        } else {
            System.out.println("os numeros não formam um triangulo");
        }
        sc.close();
    }

    public static boolean podemFormarTriangulo(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
