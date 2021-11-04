import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Propuesto1 {

    public static void main(String[] args) {
        /*
         * Crear un ArrayList y cargarlo con tus ciudades 
         * favoritas de Argentina, luego imprimir 
         * por pantalla el ranking.
        */
        List<String> ciudades = new ArrayList<>();
        agregarCiudades(ciudades);
        int i = 1;
        for (String ciudad: ciudades) {
            System.out.println("#" + i + ": " + ciudad);
            i++;
        }
        
    }

    static void agregarCiudades(List<String> ciudades) {
        Scanner scan = new Scanner(System.in);
        String ciudad;
        // char control;
        do {
            System.out.print("Ingrese la ciudad: ");
            ciudad = scan.nextLine();
            ciudades.add(ciudad);
            System.out.print("Continuar agregando ciudades (si/no): ");
            // control = scan.nextLine().charAt(0);
            if(scan.nextLine().charAt(0) == 'n') {
                break;
            }
        } while(true);

        scan.close();
    }
}
