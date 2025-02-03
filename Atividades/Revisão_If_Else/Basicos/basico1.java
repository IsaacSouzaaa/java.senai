package lista_java.Basicos;

import java.util.Scanner;

public class basico1 {
        public static void main(String[] args) {
            System.out.println("digite um número:");
            Scanner sc = new Scanner(System.in);
            int valor = sc.nextInt();


            if (valor >= 0) {
                System.out.println("este valor é positivo");
            }else if (valor <= -1) {
                System.out.println("este valor é negativo");
            }


        }
    }
