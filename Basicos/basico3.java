package lista_java.Basicos;

import java.util.Scanner;

public class basico3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.println("digite o primeiro numero: ");
            int numero1 = sc.nextInt();


            System.out.print("Digite o segundo número: ");
            int numero2 = sc.nextInt();


            if (numero1 > numero2) {
                System.out.println("O maior número é: " + numero1);
            } else if (numero2 > numero1) {
                System.out.println("O maior número é: " + numero2);
            } else {
                System.out.println("Os números são iguais.");
            }


            sc.close();
        }
    }
