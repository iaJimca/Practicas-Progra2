package PracticaC9;

public class Main {
    public static void main(String[] args) {

        // Prueba 1: caso del documento (4 enlaces, 3 activos)
        System.out.println("=== Prueba 1: cuatro enlaces, tres activos ===");
        Enlace enlace1 = new Enlace("Quito", "Guayaquil", 1000);
        Enlace enlace2 = new Enlace("Quito", "Cuenca", 500);
        Enlace enlace3 = new Enlace("Guayaquil", "Manta", 300);
        Enlace enlace4 = new Enlace("Cuenca", "Loja", 200);

        enlace1.activar();
        enlace2.activar();
        enlace3.activar();

        enlace1.mostrarInformacion();
        enlace2.mostrarInformacion();
        enlace3.mostrarInformacion();
        enlace4.mostrarInformacion();
        System.out.println("Total de enlaces: " + Enlace.getTotalEnlaces());
        System.out.println("Enlaces activos: " + Enlace.getEnlacesActivos());

        // Prueba 2: activar dos veces el mismo enlace
        System.out.println("\n=== Prueba 2: activar de nuevo el enlace 1 ===");
        enlace1.activar();
        System.out.println("Enlaces activos: " + Enlace.getEnlacesActivos() + " (esperado: 3)");

        // Prueba 3: desactivar
        System.out.println("\n=== Prueba 3: desactivar enlaces ===");
        enlace2.desactivar();
        enlace4.desactivar();   // ya estaba inactivo: no debe restar
        System.out.println("Enlaces activos: " + Enlace.getEnlacesActivos() + " (esperado: 2)");
        System.out.println("Total de enlaces: " + Enlace.getTotalEnlaces() + " (esperado: 4)");
    }
}
