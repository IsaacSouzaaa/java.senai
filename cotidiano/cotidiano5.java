package lista_java.cotidiano;

import java.util.Scanner;

public class cotidiano5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "usuario123";
        String senhaCorreta = "senha123";

        System.out.print("Digite o nome de usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado. Usuário ou senha incorretos.");
        }

        sc.close();
    }
}