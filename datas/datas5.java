package lista_java.datas;

import java.util.Scanner;

public class datas5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a data a ser verificada (dd/MM/yyyy): ");
        String dataVerificadaStr = sc.nextLine();
        String[] partesDataVerificada = dataVerificadaStr.split("/");
        int diaVerificado = Integer.parseInt(partesDataVerificada[0]);
        int mesVerificado = Integer.parseInt(partesDataVerificada[1]);
        int anoVerificado = Integer.parseInt(partesDataVerificada[2]);

        System.out.print("Digite a data de início do período (dd/MM/yyyy): ");
        String dataInicioStr = sc.nextLine();
        String[] partesDataInicio = dataInicioStr.split("/");
        int diaInicio = Integer.parseInt(partesDataInicio[0]);
        int mesInicio = Integer.parseInt(partesDataInicio[1]);
        int anoInicio = Integer.parseInt(partesDataInicio[2]);

        System.out.print("Digite a data de fim do período (dd/MM/yyyy): ");
        String dataFimStr = sc.nextLine();
        String[] partesDataFim = dataFimStr.split("/");
        int diaFim = Integer.parseInt(partesDataFim[0]);
        int mesFim = Integer.parseInt(partesDataFim[1]);
        int anoFim = Integer.parseInt(partesDataFim[2]);

        boolean dentroDoPeriodo = (anoVerificado > anoInicio || (anoVerificado == anoInicio && (mesVerificado > mesInicio || (mesVerificado == mesInicio && diaVerificado >= diaInicio))))
                && (anoVerificado < anoFim || (anoVerificado == anoFim && (mesVerificado < mesFim || (mesVerificado == mesFim && diaVerificado <= diaFim))));

        if (dentroDoPeriodo) {
            System.out.println("A data " + dataVerificadaStr + " está dentro do período.");
        } else {
            System.out.println("A data " + dataVerificadaStr + " está fora do período.");
        }

        sc.close();
    }
}