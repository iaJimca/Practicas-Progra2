package PracticaC3;

public class Main {
    public static void main(String[] args) {

        Motor motor1 = new Motor();
        Motor motor2 = new Motor();
        Motor motor3 = new Motor();

        motor1.nombre = "Motor Cinta A";
        motor1.potencia = 5.5;
        motor1.velocidad = 1750;

        motor2.nombre = "Motor Bomba";
        motor2.potencia = 7.5;
        motor2.velocidad = 3000;

        motor3.nombre = "Motor Ventilador";
        motor3.potencia = 2.2;
        motor3.velocidad = 1200;

        System.out.println("=== Información inicial ===");
        motor1.mostrarInformacion();
        System.out.println();
        motor2.mostrarInformacion();
        System.out.println();
        motor3.mostrarInformacion();

        // Se enciende y se apaga solamente el motor 1
        System.out.println("\n=== Encender motor 1 ===");
        motor1.encender();
        motor1.mostrarEstado();
        motor2.mostrarEstado();
        motor3.mostrarEstado();

        System.out.println("\n=== Apagar motor 1 ===");
        motor1.apagar();
        motor1.mostrarEstado();
        motor2.mostrarEstado();
        motor3.mostrarEstado();
    }
}