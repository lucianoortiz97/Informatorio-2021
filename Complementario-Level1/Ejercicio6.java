import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int acu = n1;

        for (int i = 1; i < n2; i++) {
            acu = acu * n1;
        }

        System.out.println(acu);

        in.close();
    }
}
