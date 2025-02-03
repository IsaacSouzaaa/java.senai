package lista_java.Notas;

import java.util.Scanner;

public class notas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("digite  nota do aluno: ");
        int nota = sc.nextInt();

        if (nota > 7) {
            System.out.println("o aluno foi aprovado: ");
        } else if (nota < 7) {
            System.out.println("o aluno não foi aprovado: ");



            sc.close();
        }
    }
}