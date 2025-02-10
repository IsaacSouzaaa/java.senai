package DO_WHILE;

public class WHILE22 {
        public static void main(String[] args) {
            int count = 0;
            int num = 2;

            System.out.println("Os primeiros 10 números primos são:");
            do {
                boolean ehPrimo = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
                if (ehPrimo) {
                    System.out.println(num);
                    count++;
                }
                num++;
            } while (count < 10);
        }
    }