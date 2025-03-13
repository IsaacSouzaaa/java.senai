package Getters_Setter.Atv03_GT;

public class Produto {
    private String Nome;
    private double Preco;
    private int Estoque;

    public Produto(String nome, double preco, int estoque) {
        this.Nome = nome;
        setPreco(preco);
        this.Estoque = estoque;
    }

    public String getNome() {
        return this.Nome;
    }

    public double getPreco() {
        return this.Preco;
    }

    public int getEstoque() {
        return this.Estoque;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.Preco = preco;
        } else {
            System.out.println("Preço deve ser positivo");
        }
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.Estoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao Estoque.");
        } else {
            System.out.println("Quantidade inválida para adicionar.");
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && this.Estoque >= quantidade) {
            this.Estoque -= quantidade;
            System.out.println(quantidade + " unidades removidas do Estoque.");
        } else {
            System.out.println("Quantidade insuficiente ou inválida.");
        }
    }
}
