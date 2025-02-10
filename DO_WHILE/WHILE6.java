package DO_WHILE;

import java.util.Scanner;

public class WHILE6 {
    public static void main(String[] args) {
        int soma = 0;
        int i = 1;

        do {
            soma += i;
            i++;
        } while (i < 50);

        System.out.println("a soma dos numeros de 1 a 50 é " + soma);
    }
}
