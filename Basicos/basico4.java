package lista_java.Basicos;

import java.util.Scanner;

public class basico4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.println("digite sua idade: ");
            int idade = sc.nextInt();
            if (idade > 15) {
                System.out.println("você pode votar");
            } else {
                System.out.println("você não pode votar");
            }
            sc.close();
        }
    }