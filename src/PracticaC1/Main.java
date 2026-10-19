package PracticaC1;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto();
        Producto producto2 = new Producto();
        Producto producto3 = new Producto();

        producto1.nombre = "Audífonos Bluetooth";
        producto1.precio = 32.50;
        producto1.categoria = "Tecnología";
        producto1.disponible = true;

        producto2.nombre = "Camiseta Deportiva";
        producto2.precio = 15.99;
        producto2.categoria = "Ropa";
        producto2.disponible = true;

        producto3.nombre = "Libro de Java";
        producto3.precio = 45.00;
        producto3.categoria = "Educación";
        producto3.disponible = false;

        System.out.println("=== Estado inicial ===");
        producto1.mostrarInformacion();
        System.out.println();
        producto2.mostrarInformacion();
        System.out.println();
        producto3.mostrarInformacion();

        // Solo se modifica el producto 1
        producto1.cambiarDisponibilidad(false);

        System.out.println("\n=== Después de cambiar la disponibilidad del producto 1 ===");
        producto1.mostrarDisponibilidad();
        producto2.mostrarDisponibilidad();
        producto3.mostrarDisponibilidad();

        System.out.println("\n=== Precios ===");
        producto1.mostrarPrecio();
        producto2.mostrarPrecio();
        producto3.mostrarPrecio();
    }
}
