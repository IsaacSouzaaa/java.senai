package Getters_Setter.Atv03_GT;

public class Mandante {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 2000, 500);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Estoque: " + produto.getEstoque() + " unidade");
        produto.adicionarEstoque(250);
        produto.removerEstoque(250);
        System.out.println("Estoque final: " + produto.getEstoque() + " unidade");
    }
}
