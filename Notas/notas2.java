package lista_java.Notas;

import java.util.Scanner;

public class notas2 {
        public static void main(String[] args) {
            System.out.println("digite a nota do aluno:");
            Scanner sc = new Scanner(System.in);
            int valor = sc.nextInt();
            if (valor >= 5) {
                System.out.println("o aluno foi aprovado");
            }else if (valor <= 7) {
                System.out.println("o aluno foi reprovado");
            }
        }
    }