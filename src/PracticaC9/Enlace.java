package PracticaC9;

public class Enlace {

    // Atributos de instancia
    private int id;
    private String origen;
    private String destino;
    private double velocidadMbps;
    private boolean activo;

    // Atributos de clase (compartidos)
    private static int totalEnlaces = 0;
    private static int enlacesActivos = 0;

    // Constructor: recibe origen, destino y velocidad
    public Enlace(String origen, String destino, double velocidadMbps) {
        totalEnlaces++;
        this.id = totalEnlaces;
        this.origen = origen;
        this.destino = destino;
        this.velocidadMbps = velocidadMbps;
        this.activo = false;            // cada enlace comienza inactivo
        // No se modifica enlacesActivos
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public double getVelocidadMbps() {
        return velocidadMbps;
    }

    public boolean isActivo() {
        return activo;
    }

    public void activar() {
        if (!activo) {
            activo = true;
            enlacesActivos++;
        }
    }

    public void desactivar() {
        if (activo) {
            activo = false;
            enlacesActivos--;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Enlace #" + id + " | " + origen + " -> " + destino
                + " | " + velocidadMbps + " Mbps | Activo: " + activo);
    }

    // Métodos static
    public static int getTotalEnlaces() {
        return totalEnlaces;
    }

    public static int getEnlacesActivos() {
        return enlacesActivos;
    }
}
