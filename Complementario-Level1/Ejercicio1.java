import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = in.nextLine();
        System.out.println("HOLA " + nombre + "!!!");
        in.close();
    }
}
