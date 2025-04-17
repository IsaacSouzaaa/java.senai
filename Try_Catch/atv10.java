package Try_Catch;
import java.util.Scanner;

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensagem) {
        super(mensagem);
    }
}

class LimiteFatorialExcedidoException extends Exception {
    public LimiteFatorialExcedidoException(String mensagem) {
        super(mensagem);
    }
}

public class atv10 {

    public static long fatorial(int n) throws NumeroNegativoException, LimiteFatorialExcedidoException {
        if (n < 0) {
            throw new NumeroNegativoException("Não é possível calcular o fatorial de um número negativo.");
        }

        if (n > 20) {
            throw new LimiteFatorialExcedidoException("O valor máximo permitido é 20 para evitar estouro de pilha.");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        try {
            long resultado = fatorial(numero);
            System.out.println("Fatorial de " + numero + " é: " + resultado);
        } catch (NumeroNegativoException | LimiteFatorialExcedidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}