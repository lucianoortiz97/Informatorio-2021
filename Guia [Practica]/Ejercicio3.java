import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        mostrarNota();
    }

    static void mostrarNota() {
        int control = 1;
        int nota;

        do {
            nota = leerInt("Ingrese una nota: ");
            if (nota > 92) {
                System.out.println("Excelente");
            } else if (nota > 84) {
                System.out.println("Sobresaliente");
            } else if (nota > 74) {
                System.out.println("Distinguido");
            } else if (nota > 59) {
                System.out.println("Bueno");
            } else {
                System.out.println("Desaprobado");
            }

            control = leerInt("¿Desea continuar con la ejecucion?\n1 - SI\n2 - NO");
        } while (control == 1);
    }

    static int leerInt(String s) {
        Scanner scan = new Scanner(System.in);
        System.out.print(s);
        int n = scan.nextInt();
        scan.close();
        return n;
    }
}