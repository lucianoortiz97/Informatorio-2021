import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /*
         * Dado un String de entrada (frase, texto, etc)
         * calcular la cantidad de veces que aparece una letra dada.
        */

        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el String: ");
        String text = read.nextLine();
        char[] chars = text.toCharArray();
        System.out.println("Ingrese la letra: ");
        char letra = read.nextLine().charAt(0);
        int acu = 0;


        //System.out.println("prueba: " + chars);
        
        for (int i = 0; i < chars.length; i++) {
            if(letra == chars[i]) {
                acu++;
            }
        }

        System.out.println("La letra aparece " + acu + " veces.");
        read.close();
    }
}
