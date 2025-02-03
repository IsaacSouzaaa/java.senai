package lista_java.String;

import java.util.Scanner;

public class string5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a primeira palavra");
        String palavra1 = sc.nextLine();

        System.out.println("digite a segunda palavra");
        String palavra2 = sc.nextLine();

        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras são iguais");
        } else {
            System.out.println("As palavras são diferentes");
            sc.close();
        }
    }
}
