package lista_java.String;

import java.util.Scanner;

public class strings4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavraDigitada = sc.nextLine();

        palavraDigitada.replace(" ", "");

        if (palavraDigitada.length() > 5) {
            System.out.println("A palavra contém mais de 5 caracteres.");
        } else {
            System.out.println("A palavra não contém mais de 5 caracteres.");
        }
        sc.close();
    }
}