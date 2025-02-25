package EAD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o " + (i + 1) + "º nome: ");
            nomes.add(scanner.nextLine());
        }

        Collections.sort(nomes);
        System.out.println("Nomes em ordem alfabetica: " + nomes);
        scanner.close();
    }
}
