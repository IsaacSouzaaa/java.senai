package Getters_Setter.Atv01_GT;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Isaac");
        pessoa.setIdade(17);

        System.out.println("Nome: " + pessoa.setNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}