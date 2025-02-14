package Ternária_Java;

import java.util.Scanner;

public class Ternária05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.print("este ano é bissexto");
        }else System.out.print("este ano não é bissexto");


        sc.close();
    }
}
