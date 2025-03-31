package Heranca03;

public class Main {
        public static void main(String[] args) {
            Funcionario funcionario = new Funcionario("Jão", 3000.00);
            Gerente gerente = new Gerente("benaldo", 4000.00, 1500.00);
            Desenvolvedor desenvolvedor = new Desenvolvedor("Carlinhos", 3500.00);

            System.out.println(funcionario.getNome() + " - salario: " + funcionario.calcularSalario());
            System.out.println(gerente.getNome() + " - salario: " + gerente.calcularSalario());
            System.out.println(desenvolvedor.getNome() + " - salario: " + desenvolvedor.calcularSalario());
        }
    }
