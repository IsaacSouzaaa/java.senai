package EAD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            System.out.print("Informe o " + (i + 1) + "º numero: ");
            lista.add(scanner.nextInt());
        }

        Collections.sort(lista);
        System.out.println("numeros ordenados em ordem crescente: " + lista);
        scanner.close();
    }
}
