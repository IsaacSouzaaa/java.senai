package Ternária_Java;

import java.util.Scanner;

public class Ternária18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 3 angulos: ");
        double angulo1 = sc.nextDouble();
        double angulo2 = sc.nextDouble();
        double angulo3 = sc.nextDouble();

        if (angulo1 == angulo2 && angulo2 == angulo3) {
            System.out.println("triangulo equilatero");
        } else if (angulo1 == angulo2 && angulo2 != angulo3 || angulo2 == angulo3 && angulo3 != angulo1) {
            System.out.println("triangulo isosceles");
        } else System.out.println("triangulo escaleno");
        sc.close();
    }
}