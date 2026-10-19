package PracticaC1;

public class Producto {

    // Atributos public
    public String nombre;
    public double precio;

    // Atributos con acceso por defecto (sin modificador)
    String categoria;
    boolean disponible;

    // Métodos public
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Categoría: " + categoria);
        System.out.println("Disponible: " + disponible);
    }

    public void cambiarDisponibilidad(boolean nuevaDisponibilidad) {
        disponible = nuevaDisponibilidad;
    }

    // Métodos con acceso por defecto
    void mostrarPrecio() {
        System.out.println("Precio: " + precio);
    }

    void mostrarDisponibilidad() {
        if (disponible) {
            System.out.println(nombre + " se encuentra disponible.");
        } else {
            System.out.println(nombre + " NO se encuentra disponible.");
        }
    }
}
