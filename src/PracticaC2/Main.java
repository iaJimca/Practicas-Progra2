package PracticaC2;

public class Main {
    public static void main(String[] args) {

        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();

        tarea1.titulo = "Diseñar pantalla de login";
        tarea1.responsable = "Ana";
        tarea1.horasEstimadas = 6.5;
        tarea1.completada = false;

        tarea2.titulo = "Crear base de datos";
        tarea2.responsable = "Luis";
        tarea2.horasEstimadas = 10;
        tarea2.completada = false;

        tarea3.titulo = "Escribir pruebas unitarias";
        tarea3.responsable = "María";
        tarea3.horasEstimadas = 8;
        tarea3.completada = false;

        System.out.println("=== Estado inicial ===");
        tarea1.mostrarInformacion();
        System.out.println();
        tarea2.mostrarInformacion();
        System.out.println();
        tarea3.mostrarInformacion();

        // Solo se completa la tarea 2
        tarea2.completar();

        System.out.println("\n=== Después de completar solo la tarea 2 ===");
        tarea1.mostrarEstado();
        tarea2.mostrarEstado();
        tarea3.mostrarEstado();

        System.out.println("\n=== Responsables ===");
        tarea1.mostrarResponsable();
        tarea2.mostrarResponsable();
        tarea3.mostrarResponsable();
    }
}
