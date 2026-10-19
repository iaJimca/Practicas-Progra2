package Negocios_Digitales;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto();
        Producto producto2 = new Producto();

        producto1.nombre = "Mouse";
        producto1.precio = 20;
        producto1.categoria = "Tecnología";

        producto2.nombre = "Curso Java";
        producto2.precio = 75;
        producto2.categoria = "Educación";

        System.out.println("--- Producto 1 ---");
        producto1.mostrarInformacion();
        producto1.mostrarCategoria();

        System.out.println("--- Producto 2 ---");
        producto2.mostrarInformacion();
        producto2.mostrarCategoria();

        // Modificar solo el primer objeto
        producto1.precio = 25;

        System.out.println("\n=== Después de cambiar el precio del producto 1 ===");
        System.out.println("--- Producto 1 ---");
        producto1.mostrarInformacion();
        System.out.println("--- Producto 2 ---");
        producto2.mostrarInformacion();

        producto1.mostrarPrecio();
    }
}
