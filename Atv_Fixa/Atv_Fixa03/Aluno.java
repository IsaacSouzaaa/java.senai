package Atv_Fixa.Atv_Fixa03;

    class Aluno {
        String nome;
        double nota1, nota2, nota3;

        double notaFinal() {
            return nota1 + nota2 + nota3;
        }

        boolean aprovado() {
            return notaFinal() >= 60.0;
        }

        double pontosFaltando() {
            if (aprovado()) {
                return 0.0;
            } else {
                return 60.0 - notaFinal();
            }
        }
    }