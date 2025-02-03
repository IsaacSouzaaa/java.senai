package lista_java.Notas;

import java.util.Scanner;

public class notas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();


        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();


        System.out.print("Digite a terceiro nota: ");
        double nota3 = sc.nextDouble();

        double maiorNota = nota1;
        double menorNota = nota1;

        if (nota2 > maiorNota) {
            maiorNota = nota2;
        }
        if (nota3 > maiorNota) {
            maiorNota = nota3;
        }

        if (nota2 < menorNota) {
            menorNota = nota2;
        }
        if (nota3 < menorNota) {
            menorNota = nota3;
        }

        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);

        sc.close();
    }
}