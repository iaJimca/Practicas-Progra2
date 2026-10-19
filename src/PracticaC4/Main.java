package PracticaC4;

public class Main {
    public static void main(String[] args) {

        Sensor sensor1 = new Sensor();
        Sensor sensor2 = new Sensor();

        // Importante: se define primero el máximo y luego el mínimo,
        // porque ambos valores inician en 0.0
        sensor1.setNombre("Temperatura Horno");
        sensor1.setValorMaximo(120);
        sensor1.setValorMinimo(-10);
        sensor1.setLectura(25);

        sensor2.setNombre("Presión Caldera");
        sensor2.setValorMaximo(10);
        sensor2.setValorMinimo(0);
        sensor2.setLectura(4.5);

        System.out.println("=== Configuración inicial ===");
        System.out.println(sensor1.getNombre() + ": rango [" + sensor1.getValorMinimo()
                + ", " + sensor1.getValorMaximo() + "], lectura " + sensor1.getLectura());
        System.out.println(sensor2.getNombre() + ": rango [" + sensor2.getValorMinimo()
                + ", " + sensor2.getValorMaximo() + "], lectura " + sensor2.getLectura());

        System.out.println("\n=== Actualizaciones ===");
        sensor1.actualizarLectura(80);     // válida
        sensor1.actualizarLectura(150);    // fuera de rango
        System.out.println("Lectura actual sensor 1: " + sensor1.getLectura());

        System.out.println("\n=== Rango inválido ===");
        sensor1.setValorMinimo(200);       // mínimo > máximo
        sensor1.setValorMaximo(-50);       // máximo < mínimo
        System.out.println("Rango sensor 1: [" + sensor1.getValorMinimo()
                + ", " + sensor1.getValorMaximo() + "]");

        System.out.println("\nLectura sensor 2 sin cambios: " + sensor2.getLectura());
    }
}
