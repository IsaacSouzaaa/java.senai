package Try_Catch;
import java.util.Scanner;
        public class atv02 {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            boolean numcorreto = true;
            System.out.print("Escreva um numero: ");
            String numero = sc.nextLine();

            try{
                int numeroInt = Integer.parseInt(numero);
            } catch (NumberFormatException ex){
                numcorreto = false;
                System.out.println(ex + "numero incorreto");
            } finally {
                sc.close();
            }
            System.out.println("Seu numero é " + ((numcorreto) ? " válido" : " ínvalido"));
        }
    }