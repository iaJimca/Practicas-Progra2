package PracticaC7;

public class Main {
    public static void main(String[] args) {

        // Prueba 1: creación y valores automáticos
        System.out.println("=== Prueba 1: creación de pedidos ===");
        System.out.println("Pedidos antes de crear: " + Pedido.getTotalPedidos());

        Pedido pedido1 = new Pedido("Carlos", 120.50);
        Pedido pedido2 = new Pedido("Lucía", 80.00);
        Pedido pedido3 = new Pedido("Marco", 45.25);

        pedido1.mostrarInformacion();
        pedido2.mostrarInformacion();
        pedido3.mostrarInformacion();
        System.out.println("Total de pedidos: " + Pedido.getTotalPedidos());
        System.out.println("Ventas totales: " + Pedido.getVentasTotales());

        // Prueba 2: confirmar pedidos
        System.out.println("\n=== Prueba 2: confirmar pedidos 1 y 2 ===");
        pedido1.confirmar();
        pedido2.confirmar();
        System.out.println("Ventas totales: " + Pedido.getVentasTotales() + " (120.5 + 80.0)");

        // Prueba 3: no contabilizar dos veces
        System.out.println("\n=== Prueba 3: confirmar de nuevo el pedido 1 ===");
        pedido1.confirmar();
        System.out.println("Ventas totales: " + Pedido.getVentasTotales() + " (sin cambios)");

        System.out.println("\n=== Estado final ===");
        pedido1.mostrarInformacion();
        pedido2.mostrarInformacion();
        pedido3.mostrarInformacion();
    }
}