package lista_java.datas;

import java.util.Scanner;

public class datas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um horário no formato HH:mm: ");
        String horario = sc.nextLine();

        if (isHorarioValido(horario)) {
            System.out.println("O horário " + horario + " é válido.");
        } else {
            System.out.println("O horário " + horario + " é inválido.");
        }

        sc.close();
    }

    public static boolean isHorarioValido(String horario) {
        if (horario == null || !horario.matches("\\d{2}:\\d{2}")) {
            return false;
        }

        String[] partes = horario.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        return (horas >= 0 && horas < 24) && (minutos >= 0 && minutos < 60);
    }
}