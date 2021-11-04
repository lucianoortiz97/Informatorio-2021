import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        /*
         * Crear una aplicación que solicite de entrada
         * los datos de una persona en este orden:
         * Nombre y Apellido
         * Edad
         * Dirección
         * Ciudad
         * Luego imprimirá el siguiente mensaje:
         * {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
        */

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese su nombre y apellido: ");
        String nomApe = leer.nextLine();
        System.out.print("Ingrese su Edad: ");
        String edad = leer.nextLine();
        System.out.print("Ingrese su direccion: ");
        String direccion = leer.nextLine();
        System.out.print("Ingrese su ciudad: ");
        String ciudad = leer.nextLine();

        System.out.println(ciudad + " - " + direccion + " - " + edad + " años - " + nomApe);
        
        leer.close();
    }
}