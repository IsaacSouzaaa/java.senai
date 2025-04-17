package Try_Catch;

import java.util.Scanner;

class DadosInvalidosException extends Exception {
    public DadosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
public class atv06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine().trim();
            if (nome.isEmpty()) {
                throw new DadosInvalidosException("O nome não pode ser vazio.");
            }

            System.out.print("Digite sua idade: ");
            String idadeStr = scanner.nextLine().trim();
            int idade;

            try {
                idade = Integer.parseInt(idadeStr);
            } catch (NumberFormatException e) {
                throw new DadosInvalidosException("A idade deve ser um número inteiro.");
            }

            if (idade < 0) {
                throw new DadosInvalidosException("A idade não pode ser negativa.");
            }

            System.out.println("\nCadastro realizado com sucesso!");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);

        } catch (DadosInvalidosException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }

        scanner.close();
    }
}