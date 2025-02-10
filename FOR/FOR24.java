package FOR;

public class FOR24 {
    public static void main(String[] args) {
        System.out.println("Números entre 1 e 200 que são divisíveis por 4:");

        for (int i = 1; i <= 200; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}