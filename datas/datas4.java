package lista_java.datas;

import java.util.Scanner;

public class datas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um horário no formato HH:mm: ");
        String horario = sc.nextLine();

        String[] partes = horario.split(":");
        if (partes.length != 2) {
            System.out.println("Formato de horário inválido.");
            sc.close();
            return;
        }

        int horas;
        int minutos;

        try {
            horas = Integer.parseInt(partes[0]);
            minutos = Integer.parseInt(partes[1]);
        } catch (NumberFormatException e) {
            System.out.println("Formato de horário inválido.");
            sc.close();
            return;
        }

        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
            System.out.println("Horário inválido.");
        } else if (horas >= 6 && horas < 12) {
            System.out.println("Período da manhã.");
        } else if (horas >= 12 && horas < 18) {
            System.out.println("Período da tarde.");
        } else {
            System.out.println("Período da noite.");
        }

        sc.close();
    }
}