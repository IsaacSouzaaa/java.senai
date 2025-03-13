package Getters_Setter.Atv02_GT;

public class Principal {
    public static void main(String[] args) {
        Banco conta = new Banco("Isaaaaac", 69);
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: " + conta.getSaldo());
        conta.depositar(100);
        conta.sacar(600);
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
