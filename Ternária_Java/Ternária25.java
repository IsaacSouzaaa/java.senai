package Ternária_Java;

import java.util.Scanner;

public class Ternária25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segunda_feira = 1;
        int terça_feira = 2;
        int quarta_feira = 3;
        int quinta_feira = 4;
        int sexta_feira = 5;
        int sabado = 6;
        int domingo = 7;

        System.out.print("Digite um número de 1 a 7 de acordo com osm dias daz semana: ");
        int dia = sc.nextInt();
        if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5) {
            System.out.println("Dia util");
        }else if (dia == 6 || dia == 7) {
            System.out.println("Final de semana");
        } else System.out.println("dia invalido");
        sc.close();
    }
}