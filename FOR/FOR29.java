package FOR;

public class FOR29 {
    public static void main(String[] args) {
        int[] numeros = {64, 25, 12, 22, 11};

        for (int i = 0; i < numeros.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int temp = numeros[indiceMinimo];
            numeros[indiceMinimo] = numeros[i];
            numeros[i] = temp;
        }

        System.out.print("Vetor ordenado: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}