package Criação_Métodos_Java;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga 3 idades:");

        int idade1 = sc.nextInt();
        int idade2 = sc.nextInt();
        int idade3 = sc.nextInt();

        String resultado = conjunto(idade1, idade2, idade3);

        showResult(resultado);
    }

    public static String conjunto(int id1, int id2, int id3) {
        String resultado = "";
        if (id1 > 60) {
            resultado += "A idade do primeiro número equivale à terceira idade: " + id1 + "\n";
        } else if (id1 > 18 && id1 < 60) {
            resultado += "A idade do primeiro número equivale à idade adulta: " + id1 + "\n";
        } else if (id1 < 18) {
            resultado += "A idade do primeiro número equivale à idade jovem: " + id1 + "\n";
        }

        if (id2 > 60) {
            resultado += "A idade do segundo número equivale à terceira idade: " + id2 + "\n";
        } else if (id2 > 18 && id2 < 60) {
            resultado += "A idade do segundo número equivale à idade adulta: " + id2 + "\n";
        } else if (id2 < 18) {
            resultado += "A idade do segundo número equivale à idade jovem: " + id2 + "\n";
        }

        if (id3 > 60) {
            resultado += "A idade do terceiro número equivale à terceira idade: " + id3 + "\n";
        } else if (id3 > 18 && id3 < 60) {
            resultado += "A idade do terceiro número equivale à idade adulta: " + id3 + "\n";
        } else if (id3 < 18) {
            resultado += "A idade do terceiro número equivale à idade jovem: " + id3 + "\n";
        }

        return resultado;
    }


    public static void showResult(String value) {
        System.out.println(value);
    }
}
}
