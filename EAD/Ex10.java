package EAD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        List<Integer> lista3 = new ArrayList<>();
        System.out.println("Digite 5 numeros para a primeira lista:");
        for (int i = 0; i < 5; i++) {
            lista1.add(sc.nextInt());
        }

        System.out.println("Digite 5 numeros para a segunda lista:");
        for (int i = 0; i < 5; i++) {
            lista2.add(sc.nextInt());
        }
        lista3.addAll(lista1);
        lista3.addAll(lista2);
        System.out.println("A lista resultante é: " + lista3);
    }
}
