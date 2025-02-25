package EAD;

import java.util.ArrayList;

public class Ex25 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("João");
        nomes.add("Luana");
        nomes.add("Isaac");
        nomes.add("Luis");
        nomes.add("Vitor");


        for (String nome : nomes) {
            System.out.println("Olá, " + nome + "!");
        }
    }
}
