package DO_WHILE;

import java.util.Scanner;

public class WHILE20 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String senhaCorreta = "senha123";
            String senha;

            do {
                System.out.print("Digite a senha: ");
                senha = sc.nextLine();
            } while (!senha.equals(senhaCorreta));

            System.out.println("Senha correta! Acesso concedido.");
            sc.close();
        }
}