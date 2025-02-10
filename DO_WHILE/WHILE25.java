package DO_WHILE;

public class WHILE25 {
    public static void main(String[] args) {
        int linhas = 1;

        System.out.println("Triângulo de Números com base 5:");

        do {
            int numero = 1;
            int colunas = 1;

            do {
                System.out.print(numero + " ");
                numero++;
                colunas++;
            } while (colunas <= linhas);

            System.out.println();
            linhas++;
        } while (linhas <= 5);
    }
}