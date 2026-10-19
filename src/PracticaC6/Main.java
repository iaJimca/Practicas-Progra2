package PracticaC6;

public class Main {
    public static void main(String[] args) {

        Proyecto proyecto1 = new Proyecto();
        Proyecto proyecto2 = new Proyecto();

        proyecto1.setNombre("Sistema de Inventario");
        proyecto1.setResponsable("Ana Pérez");
        proyecto1.setProgreso(40);

        proyecto2.setNombre("App Móvil de Reservas");
        proyecto2.setResponsable("Luis Mora");
        proyecto2.setProgreso(10);

        System.out.println("=== Estado inicial ===");
        proyecto1.mostrarInformacion();
        System.out.println();
        proyecto2.mostrarInformacion();

        System.out.println("\n=== Avanzar proyecto 1 en 30% ===");
        proyecto1.avanzar(30);
        System.out.println("Progreso: " + proyecto1.getProgreso() + "%");

        System.out.println("\n=== Avanzar proyecto 1 en 50% (no debe superar 100) ===");
        proyecto1.avanzar(50);
        System.out.println("Progreso: " + proyecto1.getProgreso() + "%");
        System.out.println("Terminado: " + proyecto1.isTerminado());

        System.out.println("\n=== Valores inválidos ===");
        proyecto2.setProgreso(150);
        proyecto2.setProgreso(-20);
        proyecto2.avanzar(-10);
        System.out.println("Progreso proyecto 2: " + proyecto2.getProgreso() + "% (sin cambios)");
        System.out.println("Terminado proyecto 2: " + proyecto2.isTerminado());
    }
}
