package lista_java.operações;

import java.util.Scanner;

public class operações2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        double numero1 = sc.nextDouble();

        System.out.println("digite o segundo numero: ");
        double numero2 = sc.nextDouble();

        double diferenca = numero1 - numero2;
        if (diferenca < 0) {
            System.out.println("A diferença entre os numeros é negativa.");
        } else {
            System.out.println("A diferença entre os numeros não e negativa.");
        }

        sc.close();
    }
}
