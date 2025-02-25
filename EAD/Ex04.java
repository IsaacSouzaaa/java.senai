package EAD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ex04 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lista.add(rand.nextInt(100) + 1);
        }

        int maior = Collections.max(lista);
        int menor = Collections.min(lista);
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
    }
}