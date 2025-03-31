package Heranca04;

public class Pagamento {
    public void RealizarPagamento(){
        System.out.println("Processando pagamento");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex){
            Thread.currentThread().interrupt();
            System.out.println("O pagamento foi interrompoido");
        }
        System.out.println("O pagamento foi aprovado");

    }

}