package Programa_Entrega;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {
        private static Map<String, Pedido> pedidos = new HashMap<>();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            pedidos.put("123ABC", new Pedido("123ABC", StatusPedido.PENDENTE));
            pedidos.put("456DEF", new Pedido("456DEF", StatusPedido.EM_TRANSITO));
            pedidos.put("789GHI", new Pedido("789GHI", StatusPedido.ENTREGUE));
            pedidos.put("101JKL", new Pedido("101JKL", StatusPedido.CANCELADO));

            System.out.print("Digite o código do pedido: ");
            String codigo = scanner.nextLine();

            Pedido pedido = pedidos.get(codigo);

            if (pedido != null) {
                System.out.println("Status do pedido " + codigo + ": " + pedido.getStatus());
            } else {
                System.out.println("Pedido não encontrado!");
            }

            scanner.close();
        }
    }