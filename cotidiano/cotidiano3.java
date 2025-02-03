package lista_java.cotidiano;

import java.util.Scanner;

public class cotidiano3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        System.out.print("Digite 1 para converter para Fahrenheit ou 2 para Kelvin: ");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit + "°F");
        } else if (escolha == 2) {
            double kelvin = celsius + 273.15;
            System.out.println("Temperatura em Kelvin: " + kelvin + " K");
        } else {
            System.out.println("Escolha inválida.");
        }

        sc.close();
    }
}