package Software;

public class Main {
    public static void main(String[] args) {

        System.out.println("Total: " + Dispositivo.getTotalCreados());   // 0

        Dispositivo dispositivo1 = new Dispositivo("Laptop", "Computador");
        System.out.println("Total: " + Dispositivo.getTotalCreados());   // 1

        Dispositivo dispositivo2 = new Dispositivo("Router", "Red");
        Dispositivo dispositivo3 = new Dispositivo("Servidor", "Infraestructura");
        System.out.println("Total: " + Dispositivo.getTotalCreados());   // 3

        System.out.println("\n--- Dispositivo 1 ---");
        dispositivo1.mostrarInformacion();
        System.out.println("--- Dispositivo 2 ---");
        dispositivo2.mostrarInformacion();
        System.out.println("--- Dispositivo 3 ---");
        dispositivo3.mostrarInformacion();

        // Cada objeto conserva sus propios datos
        dispositivo1.setActivo(true);
        System.out.println("\nActivo dispositivo 1: " + dispositivo1.isActivo());
        System.out.println("Activo dispositivo 2: " + dispositivo2.isActivo());
    }
}
