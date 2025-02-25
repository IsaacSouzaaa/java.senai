package EAD;

import java.util.ArrayList;
import java.util.Collections;

public class Ex09 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            lista.add(i + 1);
        }
        Collections.reverse(lista);
        System.out.println("Lista na ordem inversa: " + lista);
    }
}
