package lista_java.Notas;

import java.util.Scanner;

public class notas4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a nota da primeira disciplina: ");
            double nota1 = sc.nextDouble();

            System.out.print("Digite a nota da segunda disciplina: ");
            double nota2 = sc.nextDouble();

            double mediaMinima = 7.0;

            boolean aprovadoDisciplina1 = nota1 >= mediaMinima;
            boolean aprovadoDisciplina2 = nota2 >= mediaMinima;

            if (aprovadoDisciplina1 && aprovadoDisciplina2) {
                System.out.println("O aluno foi aprovado em ambas as disciplinas.");
            } else if (aprovadoDisciplina1) {
                System.out.println("O aluno foi aprovado na primeira disciplina, mas reprovado na segunda.");
            } else if (aprovadoDisciplina2) {
                System.out.println("O aluno foi aprovado na segunda disciplina, mas reprovado na primeira.");
            } else {
                System.out.println("O aluno foi reprovado em ambas as disciplinas.");
            }

            sc.close();
        }
}