import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un entero: ");
        int n = in.nextInt();
        int acumulador = 1;

        for (int i = 1; i <= n; i++) {
            acumulador = acumulador * i;
        }

        System.out.println(acumulador);
        in.close();
    }
}