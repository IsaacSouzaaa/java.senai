package DO_WHILE;

import java.util.Scanner;

public class WHILE5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = sc.nextInt();
        int i = 1;

        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);

        sc.close();
    }
}