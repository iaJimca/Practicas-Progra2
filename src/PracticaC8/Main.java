package PracticaC8;

public class Main {
    public static void main(String[] args) {

        // Prueba 1: todos los servidores inician apagados
        System.out.println("=== Prueba 1: creación de servidores ===");
        Servidor servidor1 = new Servidor("ServidorWeb", "192.168.1.20");
        Servidor servidor2 = new Servidor("ServidorBD", "192.168.1.21");
        Servidor servidor3 = new Servidor("ServidorCorreo", "192.168.1.22");

        servidor1.mostrarInformacion();
        servidor2.mostrarInformacion();
        servidor3.mostrarInformacion();
        System.out.println("Total de servidores: " + Servidor.getTotalServidores());
        System.out.println("Servidores activos: " + Servidor.getServidoresActivos());

        // Prueba 2: activar servidores
        System.out.println("\n=== Prueba 2: activar servidores 1 y 2 ===");
        servidor1.activar();
        servidor2.activar();
        System.out.println("Servidores activos: " + Servidor.getServidoresActivos() + " (esperado: 2)");

        // Prueba 3: activar dos veces no debe contar dos veces
        System.out.println("\n=== Prueba 3: activar de nuevo el servidor 1 ===");
        servidor1.activar();
        System.out.println("Servidores activos: " + Servidor.getServidoresActivos() + " (esperado: 2)");

        // Prueba 4: desactivar
        System.out.println("\n=== Prueba 4: desactivar ===");
        servidor2.desactivar();
        servidor3.desactivar();   // ya estaba apagado: no debe restar
        System.out.println("Servidores activos: " + Servidor.getServidoresActivos() + " (esperado: 1)");
        System.out.println("Total de servidores: " + Servidor.getTotalServidores() + " (esperado: 3)");
    }
}