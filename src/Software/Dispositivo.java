package Software;

public class Dispositivo {

    // Atributos de instancia
    private String nombre;
    private String tipo;
    private boolean activo;
    private int id;

    // Atributo de clase (compartido)
    private static int contador = 0;

    // Constructor: nombre y tipo se reciben; el dispositivo inicia apagado
    public Dispositivo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.activo = false;

        contador++;
        this.id = contador;      // Desafío: ID automático
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isActivo() {
        return activo;
    }

    public int getId() {
        return id;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Método static
    public static int getTotalCreados() {
        return contador;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Activo: " + activo);
    }
}
