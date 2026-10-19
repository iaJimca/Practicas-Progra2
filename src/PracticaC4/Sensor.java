package PracticaC4;

public class Sensor {

    // Atributos privados
    private String nombre;
    private double lectura;
    private double valorMinimo;
    private double valorMaximo;

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getLectura() {
        return lectura;
    }

    public double getValorMinimo() {
        return valorMinimo;
    }

    public double getValorMaximo() {
        return valorMaximo;
    }

    // Setters con validaciones
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacío.");
        }
    }

    public void setValorMinimo(double valorMinimo) {
        if (valorMinimo <= this.valorMaximo) {
            this.valorMinimo = valorMinimo;
        } else {
            System.out.println("Error: el valor mínimo (" + valorMinimo
                    + ") no puede ser mayor que el máximo (" + this.valorMaximo + ").");
        }
    }

    public void setValorMaximo(double valorMaximo) {
        if (valorMaximo >= this.valorMinimo) {
            this.valorMaximo = valorMaximo;
        } else {
            System.out.println("Error: el valor máximo (" + valorMaximo
                    + ") no puede ser menor que el mínimo (" + this.valorMinimo + ").");
        }
    }

    // La lectura solo se acepta si está dentro del rango del sensor
    public void setLectura(double lectura) {
        if (lectura >= this.valorMinimo && lectura <= this.valorMaximo) {
            this.lectura = lectura;
        } else {
            System.out.println("Error: lectura " + lectura + " fuera del rango ["
                    + this.valorMinimo + ", " + this.valorMaximo + "].");
        }
    }

    public void actualizarLectura(double nuevaLectura) {
        double anterior = this.lectura;
        setLectura(nuevaLectura);
        if (this.lectura != anterior || nuevaLectura == anterior) {
            System.out.println(nombre + ": lectura actualizada a " + this.lectura);
        }
    }
}
