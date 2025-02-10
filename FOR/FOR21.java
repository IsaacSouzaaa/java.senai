package FOR;

import java.util.Scanner;

public class FOR21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int numero  = sc.nextInt();

        int sum = 0;
        while (numero != 0){
            sum += numero % 10;
            numero /= 10;
        }

        System.out.println("a soma dos digitos é: " + sum);
        sc.close();
    }
}
