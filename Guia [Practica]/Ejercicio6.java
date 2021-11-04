import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int continuar = 1;
        int nro;

        do {
            System.out.print("Por favor, ingrese un numero: ");
            nro = in.nextInt();
            System.out.println("El numero ingresado es: " + nro);

            System.out.println("Si deseo continuar presione 1, sino cualquier otro numero");
            continuar = in.nextInt();
        } while (continuar == 1);

        in.close();
    }
}
