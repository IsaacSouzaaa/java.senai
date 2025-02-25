package EAD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            lista.add(rand.nextInt(100) + 1);
        }

        int maior = Collections.max(lista);
        int menor = Collections.min(lista);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        System.out.print("Informe um numero para verificar se está na lista: ");
        int numero = scanner.nextInt();
        if (lista.contains(numero)) {
            System.out.println("O numero " + numero + " está na lista.");
        } else {
            System.out.println("O numero " + numero + " não está na lista.");
        }
        scanner.close();
    }
}