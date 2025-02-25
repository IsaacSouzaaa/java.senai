package EAD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lista.add(rand.nextInt(100) + 1);
        }
        System.out.println("Lista original: " + lista);

        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println("lista apos remover os impares: " + lista);
    }
}
