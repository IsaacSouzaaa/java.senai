package EAD;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 numeros: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("numero " + (i + 1) + ": ");
            int numero = sc.nextInt();
            numeros.add(numero);
        }
        System.out.println("\nNumeros digitados:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        sc.close();
    }
}
