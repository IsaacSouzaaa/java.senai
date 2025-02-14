package Ternária_Java;

import java.util.Scanner;

public class Ternária03 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Digite um número: ");
                int numero = sc.nextInt();

                String resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Zero";
                System.out.println("O número é: " + resultado);

                sc.close();
            }
        }
