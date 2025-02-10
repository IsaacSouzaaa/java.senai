package DO_WHILE;

import java.util.Scanner;

public class WHILE12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = sc.nextLine();
        int i = str.length() - 1;

        do {
            System.out.print(str.charAt(i));
            i--;
        } while (i >= 0);

        System.out.println();
        sc.close();
    }
}