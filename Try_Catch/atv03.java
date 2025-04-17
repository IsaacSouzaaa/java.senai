package Try_Catch;

import java.util.Scanner;

public class atv03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean deu = true;
        System.out.print("digite um número: ");
        int numero = sc.nextInt();

        try{
            if (numero < 0){
                throw new IllegalArgumentException("não pode ser numero negativo");
            }

            var result = Math.sqrt(numero);
        }catch(IllegalArgumentException ex){
            deu = false;
            System.out.println(ex);
        } finally {
            sc.close();
        }
        System.out.println((deu) ? "Funcionou" + Math.sqrt(numero) : "Não funcionou" );
    }
}