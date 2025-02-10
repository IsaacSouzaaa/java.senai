package FOR;

import java.util.Scanner;

public class FOR17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva algo: ");
        String texto = sc.nextLine();

        for (int i = texto.length() -1; i >=0; i--){
            System.out.print(texto.charAt(i));
        }
    }
}
