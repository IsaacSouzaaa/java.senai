package lista_java.Basicos;

import java.util.Scanner;

public class basico2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Digite um número: ");
            int numero = sc.nextInt();


            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par.");
            } else {
                System.out.println("O número " + numero + " é ímpar.");
            }


            sc.close();
        }
    }
