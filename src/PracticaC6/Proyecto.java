package PracticaC6;

public class Proyecto {

    // Atributos privados
    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getProgreso() {
        return progreso;
    }

    public String getResponsable() {
        return responsable;
    }

    public boolean isTerminado() {
        return terminado;
    }

    // Setters con validaciones
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacío.");
        }
    }

    public void setResponsable(String responsable) {
        if (responsable != null && !responsable.trim().isEmpty()) {
            this.responsable = responsable;
        } else {
            System.out.println("Error: el responsable no puede estar vacío.");
        }
    }

    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
            this.terminado = (progreso == 100);   // se mantiene coherente con el progreso
        } else {
            System.out.println("Error: el progreso debe estar entre 0 y 100 (" + progreso + ").");
        }
    }

    // Avanza el progreso sin superar nunca 100
    public void avanzar(int porcentaje) {
        if (porcentaje <= 0) {
            System.out.println("Error: el avance debe ser un porcentaje positivo.");
            return;
        }
        int nuevoProgreso = this.progreso + porcentaje;
        if (nuevoProgreso > 100) {
            nuevoProgreso = 100;
        }
        setProgreso(nuevoProgreso);
    }

    public void mostrarInformacion() {
        System.out.println("Proyecto: " + nombre);
        System.out.println("Responsable: " + responsable);
        System.out.println("Progreso: " + progreso + "%");
        System.out.println("Terminado: " + terminado);
    }
}