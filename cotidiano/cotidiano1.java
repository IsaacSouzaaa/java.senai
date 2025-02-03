package lista_java.cotidiano;

import java.util.Scanner;

public class cotidiano1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da placa do veículo (apenas números): ");
        String placa = sc.nextLine();

        if (placa.isEmpty() || !placa.matches("\\d+")) {
            System.out.println("Placa inválida. Por favor, insira apenas números.");
        } else {
            char ultimoDigito = placa.charAt(placa.length() - 1);
            int numeroUltimoDigito = Character.getNumericValue(ultimoDigito);

            if (numeroUltimoDigito % 2 == 0) {
                System.out.println("O veículo pode passar no pedágio (placa termina em número par).");
            } else {
                System.out.println("O veículo não pode passar no pedágio (placa termina em número ímpar).");
            }
        }

        sc.close();
    }
}