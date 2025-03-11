package Atv_Fixa.Atv_Fixa03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno:");
        aluno.nome = sc.nextLine();
        System.out.println("Digite a primeira nota (valor máximo 30):");
        aluno.nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota (valor máximo 35):");
        aluno.nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota (valor máximo 35):");
        aluno.nota3 = sc.nextDouble();

        System.out.printf("NOTA FINAL = %.2f%n", aluno.notaFinal());

        if (aluno.aprovado()) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
            System.out.printf("FALTAM %.2f PONTOS%n", aluno.pontosFaltando());
        }

        sc.close();
    }
}