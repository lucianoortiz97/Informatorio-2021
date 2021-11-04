import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Propuesto3 {
    public static void main(String[] args) {
        /*
         * Crear una lista que contenga como elementos la numeración de cartas de una
         * baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList
         * (en orden), imprimir, imprimir en orden inverso (reverse), desordenar
         * (mezclar) el arrayList y volver a imprimir.
         */

        List<Integer> baraja = new ArrayList<>();
        for (int i = 1; i < 14; i++) {
            baraja.add(i);
        }
        for (int i = 0; i < baraja.size(); i++) {
            System.out.print(baraja.get(i) + " ");
        }
        System.out.println("");

        for (int i = (baraja.size() - 1); i > -1; i--) {
            System.out.print(baraja.get(i) + " ");
        }
        System.out.println("");

        Collections.shuffle(baraja);

        for (Integer carta : baraja) {
            System.out.print(carta + " ");
        }
    }
}
