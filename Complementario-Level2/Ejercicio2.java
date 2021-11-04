import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Propuesto2 {
    public static void main(String[] args) {
        /*
         * Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número
         * entero al principio de la lista y otro al final. Por último, iterar e
         * imprimir los elementos de la lista y el tamaño de la misma (antes y después
         * de agregar a en la primera y última posición).
        */
        List<Integer> enteros = new ArrayList<>();
        addInts(enteros);

    }

    static void addInts(List<Integer> enteros) {
        Scanner scan = new Scanner(System.in);
        int entero;
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un entero: ");
            entero = scan.nextInt();
            enteros.add(entero);
        }
        showInts(enteros);
        System.out.print("Ingrese un entero: ");
        entero = scan.nextInt();
        enteros.add(0, entero);
        System.out.print("Ingrese un entero: ");
        entero = scan.nextInt();
        enteros.add(entero);
        showInts(enteros);
        scan.close();
    }

    static void showInts(List<Integer> enteros) {
        for (int entero : enteros) {
            System.out.print(entero + " ");
        }
        System.out.println("");
    }
}
