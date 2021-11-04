import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Propuesto4 {
    public static void main(String[] args) {
        /*
         * Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
         * en 3 cursos (3 arrayList) e imprimir dichos cursos.
         */

        List<String> estudiantes = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        cargarEstudiantes(estudiantes, in);
        List<String> cursoUno = estudiantes.subList(0, 4);
        List<String> cursoDos = estudiantes.subList(4, 8);
        List<String> cursoTres = estudiantes.subList(8, 12);

        mostrarEstudiantes(cursoUno, 1);
        mostrarEstudiantes(cursoDos, 2);
        mostrarEstudiantes(cursoTres, 3);

        in.close();
    }

    private static void cargarEstudiantes(List<String> estudiantes, Scanner in) {
        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese el nombre: ");
            estudiantes.add(in.nextLine());
        }
    }

    private static void mostrarEstudiantes(List<String> curso, int n) {
        System.out.println("\nEstudiantes del grupo " + n + ": ");
        for (String estudiante : curso) {
            System.out.println(estudiante);
        }
    }
}
