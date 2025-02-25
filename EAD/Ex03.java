package EAD;
import java.util.ArrayList;
import java.util.Scanner;

    public class Ex03 {
        public static void main(String[] args) {
            ArrayList<Integer> numeros = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite 6 números:");
            for (int i = 0; i < 6; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                int numero = sc.nextInt();
                numeros.add(numero);
            }

            int soma = 0;
            for (int numero : numeros) {
                soma += numero;
            }

            double media = soma / 6.0;
            System.out.println("A média dos números é: " + media);
            sc.close();
        }
    }