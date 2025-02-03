package lista_java.Basicos;

import java.util.Scanner;

public class basico9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um número: ");
        int numero = sc.nextInt();


        if (verificarIntervalo(numero)) {
            System.out.println("O número " + numero + " está dentro do intervalo de 10 a 50.");
        } else {
            System.out.println("O número " + numero + " está fora do intervalo de 10 a 50.");
        }


        sc.close();
    }
    public static boolean verificarIntervalo(int numero) {
        return numero >= 10 && numero <= 50;
    }
}