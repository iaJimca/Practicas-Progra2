package PracticaC2;

public class Tarea {

    // Atributos public
    public String titulo;
    public String responsable;

    // Atributos con acceso por defecto (sin modificador)
    double horasEstimadas;
    boolean completada;

    // Métodos public
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Responsable: " + responsable);
        System.out.println("Horas estimadas: " + horasEstimadas);
        System.out.println("Completada: " + completada);
    }

    public void completar() {
        completada = true;
    }

    // Métodos con acceso por defecto
    void mostrarResponsable() {
        System.out.println("Responsable de \"" + titulo + "\": " + responsable);
    }

    void mostrarEstado() {
        if (completada) {
            System.out.println("\"" + titulo + "\" está completada.");
        } else {
            System.out.println("\"" + titulo + "\" está pendiente.");
        }
    }
}
