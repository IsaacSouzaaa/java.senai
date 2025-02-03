package lista_java.Basicos;

import java.util.Scanner;

public class basico5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();


        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();


        System.out.print("Digite o terceiro número: ");
        int numero3 = sc.nextInt();


        int maior;


        if (numero1 >= numero2 && numero1 >= numero3) {
            maior = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            maior = numero2;
        } else {
            maior = numero3;
        }


        System.out.println("O maior número é: " + maior);


        sc.close();
    }
}