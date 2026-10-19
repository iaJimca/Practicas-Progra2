package PracticaC5;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        // Datos válidos
        cliente1.setNombre("Camila Torres");
        cliente1.setCorreo("camila@correo.com");
        cliente1.setEdad(25);
        cliente1.setSaldo(150.75);

        cliente2.setNombre("Andrés Molina");
        cliente2.setCorreo("andres@correo.com");
        cliente2.setEdad(31);
        cliente2.setSaldo(80);

        System.out.println("=== Datos válidos ===");
        System.out.println("Cliente 1: " + cliente1.getNombre() + " | " + cliente1.getCorreo()
                + " | edad " + cliente1.getEdad() + " | saldo " + cliente1.getSaldo());
        System.out.println("Cliente 2: " + cliente2.getNombre() + " | " + cliente2.getCorreo()
                + " | edad " + cliente2.getEdad() + " | saldo " + cliente2.getSaldo());

        // Pruebas con valores inválidos sobre el cliente 1
        System.out.println("\n=== Pruebas con valores inválidos ===");
        cliente1.setEdad(-5);
        cliente1.setSaldo(-100);
        cliente1.setNombre("");
        cliente1.setCorreo("   ");

        // Se comprueba con los getters que no se almacenaron
        System.out.println("\n=== Verificación con getters ===");
        System.out.println("Edad: " + cliente1.getEdad() + " (debe seguir siendo 25)");
        System.out.println("Saldo: " + cliente1.getSaldo() + " (debe seguir siendo 150.75)");
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Correo: " + cliente1.getCorreo());

        // El cliente 2 no se ve afectado
        System.out.println("\nCliente 2 sigue igual: edad " + cliente2.getEdad()
                + " | saldo " + cliente2.getSaldo());
    }
}
