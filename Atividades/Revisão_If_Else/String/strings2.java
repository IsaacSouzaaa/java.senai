package lista_java.String;

import java.util.Scanner;

public class strings2 {
    public static void main(String[] args) {
        String SenhaCorreta = "1234";
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        String resposta = sc.nextLine();

        if (resposta.equals(SenhaCorreta)) {
            System.out.println("Senha correta");
        } else {
            System.out.println("senha incorreta");
        sc.close();
    }
}
}
