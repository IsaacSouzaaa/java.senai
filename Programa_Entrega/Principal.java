package Programa_Entrega;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {
        private static Map<String, Pedido> pedidos = new HashMap<>();
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            pedidos.put("123", new Pedido("123", StatusPedido.PENDENTE));
            pedidos.put("456", new Pedido("456", StatusPedido.EM_TRANSITO));
            pedidos.put("789", new Pedido("789", StatusPedido.ENTREGUE));
            pedidos.put("101", new Pedido("101", StatusPedido.CANCELADO));
            System.out.print("Digite o codigo do pedido: ");
            String codigo = scanner.nextLine();

            Pedido pedido = pedidos.get(codigo);
            if (pedido != null) {
                System.out.println("Status do pedido " + codigo + ": " + pedido.getStatus());
            } else {
                System.out.println("Pedido nao encontrado");
            }
            scanner.close();
        }
    }