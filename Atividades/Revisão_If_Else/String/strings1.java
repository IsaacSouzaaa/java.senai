package lista_java.String;

import java.util.Scanner;

public class strings1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite 'Sim' ou 'Não': ");
            String resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("Sim")) {
                System.out.println("Você digitou 'Sim'.");
            } else if (resposta.equalsIgnoreCase("Não")) {
                System.out.println("Você digitou 'Não'.");
            } else {
                System.out.println("Resposta inválida. Por favor, digite 'Sim' ou 'Não'.");
            }

            sc.close();
        }
    }