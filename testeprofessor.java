package lista_java;

import java.util.Locale;

public class testeprofessor {
    public static void main(String[] args) {
        String produto1 = ("computer");
        String produto2 = ("office desk");

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", produto1, price1);
        System.out.printf("%s, which price is $ %.2f%n", produto2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println();
        System.out.printf("measue with eight decimal places: %.8f%n", measure);
        System.out.printf("rouded (three decimal places): %.3f%n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}
