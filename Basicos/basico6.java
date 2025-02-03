package lista_java.Basicos;

import java.util.Scanner;

public class basico6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Digite um ano: ");
            int ano = sc.nextInt();


            boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);


            if (bissexto) {
                System.out.println(ano + " é um ano bissexto.");
            } else {
                System.out.println(ano + " não é um ano bissexto.");
            }


            sc.close();
        }
    }