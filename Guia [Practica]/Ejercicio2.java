import java.util.Scanner;

public class Ejercicio2 {

    static Scanner scan = new Scanner(System.in);
    private static final String CADENA = "Ingrese un entero: ";

    public static void main(String[] args) {

        int control = 1;

        while (control == 1) {
            int a = leerInt(CADENA);
            int b = leerInt(CADENA);
            int c = leerInt(CADENA);

            imprimirInt("El primer numero ingresado es: ", a);
            imprimirInt("El segundo numero ingresado es: ", b);
            imprimirInt("El tercer numero ingresado es: ", c);

            control = leerInt("¿Desea continuar con la ejecucion?\n1 - SI\n2 - NO\n");
        }

        scan.close();
    }

    static int leerInt(String s) {
        System.out.print(s);
        return scan.nextInt();
    }

    static void imprimirInt(String s, int n) {
        System.out.println(s + n);
    }
}