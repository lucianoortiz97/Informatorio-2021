import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int control = 1;
        int n = 0;

        while (control == 1) {
            System.out.print("Ingrese un entero: ");
            n = scan.nextInt();
            mostrarDia(n);
            System.out.println("¿Desea continuar con la ejecucion?\n1 - SI\n2 - NO");
            control = scan.nextInt();
        }

        scan.close();
    }

    static void mostrarDia(int num) {
        switch (num) {
            case 1:
                System.out.println("Domingo\n");
                break;
            case 2:
                System.out.println("Lunes\n");
                break;
            case 3:
                System.out.println("Martes\n");
                break;
            case 4:
                System.out.println("Miercoles\n");
                break;
            case 5:
                System.out.println("Jueves\n");
                break;
            case 6:
                System.out.println("Viernes\n");
                break;
            case 7:
                System.out.println("Sabado\n");
                break;
            default:
                System.out.println("Fuera de Rango\n");
                break;
        }
    }

}
