package Heranca02;

public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = {new Veiculo(), new Bicicleta()};
        for (Veiculo v : veiculos) {
            v.mover();
        }
    }
}