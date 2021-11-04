import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int control = 1;

        do {
            System.out.print("Ingrese un entero: ");
            n = scan.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + n * i);
            }

            System.out.println("\n¿Desea continuar con la ejecucion?\n1 - SI\n2 - NO");
            control = scan.nextInt();
        } while (control == 1);

        scan.close();
    }
}
