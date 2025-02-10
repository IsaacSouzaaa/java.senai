package FOR;

public class FOR28 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        double media = (double) soma / numeros.length;
        System.out.println("A média dos números do vetor é: " + media);
    }
}