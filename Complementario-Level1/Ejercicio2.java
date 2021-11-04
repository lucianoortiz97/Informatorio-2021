import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un entero: ");
        int n1 = Integer.parseInt(in.nextLine());
        System.out.print("Ingrese otro entero: ");
        int n2 = Integer.parseInt(in.nextLine());

        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
        if (n2 == 0) {
            System.out.println("No se puede dividir por 0.");
        } else {
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
            System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
        }

        in.close();
    }
}