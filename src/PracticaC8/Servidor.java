package PracticaC8;

public class Servidor {

    // Atributos de instancia
    private int id;
    private String nombre;
    private String direccionIP;
    private boolean activo;

    // Atributos de clase (compartidos)
    private static int totalServidores = 0;
    private static int servidoresActivos = 0;

    // Constructor: recibe solo nombre y direccionIP
    public Servidor(String nombre, String direccionIP) {
        totalServidores++;
        this.id = totalServidores;
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.activo = false;            // comienza apagado
        // No se toca servidoresActivos: el servidor inicia apagado
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public boolean isActivo() {
        return activo;
    }

    // Desafío: el contador cambia solo si el estado realmente cambia
    public void activar() {
        if (!activo) {
            activo = true;
            servidoresActivos++;
            System.out.println(nombre + " activado.");
        } else {
            System.out.println(nombre + " ya estaba activo.");
        }
    }

    public void desactivar() {
        if (activo) {
            activo = false;
            servidoresActivos--;
            System.out.println(nombre + " desactivado.");
        } else {
            System.out.println(nombre + " ya estaba apagado.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Servidor #" + id + " | " + nombre + " | IP: " + direccionIP
                + " | Activo: " + activo);
    }

    // Métodos static
    public static int getTotalServidores() {
        return totalServidores;
    }

    public static int getServidoresActivos() {
        return servidoresActivos;
    }
}