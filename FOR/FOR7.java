package FOR;

public class FOR7 {
    public static void main(String[] args) {
        int soma = 0;

        for (int numero = 1; numero < 100; numero++) {
            if (numero % 2 != 0) {
                soma += numero;
            }
        }
        System.out.println("A soma dos numeros ímpares é: " + soma);
    }
}