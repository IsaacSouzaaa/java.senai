package FOR;

import java.util.Scanner;

public class FOR18 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite uma string:");
            String input = sc.nextLine();

            boolean isPalindrome = true;
            int length = input.length();

            for (int i = 0; i < length / 2; i++) {
                if (input.charAt(i) != input.charAt(length - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("A string é um palíndromo.");
            } else {
                System.out.println("A string não é um palíndromo.");
            }

            sc.close();
        }
    }