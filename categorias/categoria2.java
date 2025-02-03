package lista_java.categorias;

import java.util.Scanner;

public class categoria2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero >= 1 && numero <= 10) {
            System.out.println("O número " + numero + " pertence à faixa de classificação A (1 a 10).");
        } else if (numero >= 11 && numero <= 20) {
            System.out.println("O número " + numero + " pertence à faixa de classificação B (11 a 20).");
        } else if (numero >= 21 && numero <= 30) {
            System.out.println("O número " + numero + " pertence à faixa de classificação C (21 a 30).");
        } else {
            System.out.println("O número " + numero + " não pertence a nenhuma faixa de classificação.");
        }
        sc.close();
    }
}