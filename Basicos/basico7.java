package lista_java.Basicos;

import java.util.Scanner;

public class basico7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        if (numero % 5 == 0) {
            System.out.println(numero + " é multiplo de 5");
        } else {
            System.out.println(numero + " não é multiplo de 5");
        }
        sc.close();
    }
}