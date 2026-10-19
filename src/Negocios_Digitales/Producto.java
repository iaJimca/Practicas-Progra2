package Negocios_Digitales;

public class Producto {

    // Atributos
    public String nombre;
    public double precio;
    String categoria;          // acceso por defecto (sin modificador)

    // Métodi Publico
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Categoría: " + categoria);
    }

    // Método con acceso por defecto
    void mostrarCategoria() {
        System.out.println("Categoría: " + categoria);
    }

    // Desafío adicional
    public void mostrarPrecio() {
        System.out.println("El precio de " + nombre + " es: $" + precio);
    }
}