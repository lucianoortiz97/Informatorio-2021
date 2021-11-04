import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int resultado = 0;

        for (int i = 0; i < n2; i++) {
            resultado = resultado + n1;
        }

        System.out.println(resultado);

        in.close();
    }
}