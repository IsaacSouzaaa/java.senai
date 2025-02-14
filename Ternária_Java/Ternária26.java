package Ternária_Java;

import java.util.Scanner;

public class Ternária26 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            String resultado = (idade >= 16) ? "Pode votar" : "Não pode votar";
            System.out.println("Resultado: " + resultado);
            sc.close();
        }
    }