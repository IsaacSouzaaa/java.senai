package lista_java.operações;

import java.util.Scanner;

public class operações1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int numero1 = sc.nextInt();

        System.out.println("digite o segundo numero");
        int numero2 = sc.nextInt();

        int soma = numero1 + numero2;
        if (soma>100) {
            System.out.println("a soma é maior que 100");
        } else {
            System.out.println("a soma nao é maior que 100");
            sc.close();
        }
    }
}
