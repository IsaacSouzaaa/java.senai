package lista_java.Basicos;

import java.util.Scanner;

public class basico8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um caractere: ");
        char caractere = sc.next().charAt(0);

        caractere = Character.toLowerCase(caractere);

        if (caractere == 'a' || caractere == 'e' || caractere == 'i' ||
                caractere == 'o' || caractere == 'u') {
            System.out.println(caractere + " é uma vogal.");
        } else {
            System.out.println(caractere + " não é uma vogal.");
        }

        sc.close();
    }
}