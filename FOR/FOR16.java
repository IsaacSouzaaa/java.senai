package FOR;

import java.util.Scanner;

public class FOR16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva alguma palavra: ");
        String texto = sc.nextLine();

        for (int i = 0; i < texto.length();i++){
            System.out.print(texto.charAt(i) + " ");
        }
        sc.close();
    }
}
