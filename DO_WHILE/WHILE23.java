package DO_WHILE;

public class WHILE23 {
    public static void main(String[] args) {
        int n = 1;
        int termo;

        System.out.println("Números Triangulares até o décimo termo:");

        do {
            termo = (n * (n + 1)) / 2;
            System.out.println(termo);
            n++;
        } while (n <= 10);
    }
}
