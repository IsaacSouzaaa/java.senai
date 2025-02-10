package DO_WHILE;

public class WHILE21 {
        public static void main(String[] args) {
            int count = 0;
            int num = 1;

            System.out.println("Os primeiros 10 números perfeitos são:");
            do {
                int soma = 0;
                for (int i = 1; i < num; i++) {
                    if (num % i == 0) {
                        soma += i;
                    }
                }
                if (soma == num) {
                    System.out.println(num);
                    count++;
                }
                num++;
            } while (count < 10);
        }
    }