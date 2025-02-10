package DO_WHILE;

import java.util.Random;

public class WHILE19 {
        public static void main(String[] args) {
            Random random = new Random();
            String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            StringBuilder senha = new StringBuilder();
            int i = 0;

            do {
                int indice = random.nextInt(caracteres.length());
                senha.append(caracteres.charAt(indice));
                i++;
            } while (i < 6);

            System.out.println("Senha aleatória gerada: " + senha.toString());
        }
    }