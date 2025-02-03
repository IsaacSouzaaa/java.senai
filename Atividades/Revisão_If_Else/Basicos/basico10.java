package lista_java.Basicos;

import java.util.Scanner;

public class basico10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um número: ");
        int numero = sc.nextInt();


        if (verificarIntervalo(numero)) {
            System.out.println("O número " + numero + " está dentro do intervalo de 100 a 200.");
        } else {
            System.out.println("O número " + numero + " está fora do intervalo de 100 a 200.");
        }
        sc.close();
    }
    public static boolean verificarIntervalo(int numero) {
        return numero >= 100 && numero <= 200;
    }
}