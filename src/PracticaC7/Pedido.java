package PracticaC7;

public class Pedido {

    // Atributos de instancia (cada pedido tiene los suyos)
    private int numero;
    private String cliente;
    private double total;
    private String estado;

    // Atributos de clase (compartidos por todos los pedidos)
    private static int contadorPedidos = 0;
    private static double ventasTotales = 0;

    // Constructor: recibe solo cliente y total
    public Pedido(String cliente, double total) {
        contadorPedidos++;
        this.numero = contadorPedidos;
        this.cliente = cliente;
        this.total = total;
        this.estado = "Pendiente";      // valor inicial automático
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }

    public String getEstado() {
        return estado;
    }

    // Desafío: confirmar suma el total a las ventas solo una vez
    public void confirmar() {
        if (estado.equals("Pendiente")) {
            estado = "Confirmado";
            ventasTotales += total;
            System.out.println("Pedido #" + numero + " confirmado.");
        } else {
            System.out.println("Pedido #" + numero + " ya estaba confirmado: no se suma de nuevo.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Pedido #" + numero + " | Cliente: " + cliente
                + " | Total: " + total + " | Estado: " + estado);
    }

    // Métodos static
    public static int getTotalPedidos() {
        return contadorPedidos;
    }

    public static double getVentasTotales() {
        return ventasTotales;
    }
}