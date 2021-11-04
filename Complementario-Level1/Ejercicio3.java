import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese un entero: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }

        in.close();
    }
}