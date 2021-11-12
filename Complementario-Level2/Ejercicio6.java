package ejerciciosComplementariosLevel2;

import java.util.*;

public class propuesto6 {
	public static void main(String[] args) {
		Set<Empleado> empleados = new HashSet<>();
        Map<Integer, Integer> sueldoCalcu = new HashMap<Integer, Integer>();
        empleados.add(new Empleado(40702570, "Luciano Ortiz", 8, 400));
        empleados.add(new Empleado(38768166, "Adriana Valdes", 10, 400));
        empleados.add(new Empleado(20686958, "Mario Londrra", 15, 600));
        empleados.add(new Empleado(40985157, "Natalia Peluso", 20, 800));

        for (Empleado i:empleados){
            int sueldo = i.getpagoxHrs() * i.gethrsTrabj();
            sueldoCalcu.put(i.getDni(), sueldo);
            System.out.println("Empleado: " + i.getnombyape() + " - DNI: " + i.getDni() + " - Sueldo: " + sueldo);
        }
    }

    static class Empleado{
        private int dni;
        private String nombyape;
        private int hrsTrabj;
        private int pagoxHrs;

        public Empleado(int dni, String nombre, int horasTrabajadas, int valorHora){
            this.dni = dni;
            this.nombyape = nombre;
            this.hrsTrabj = horasTrabajadas;
            this.pagoxHrs = valorHora;
        }

        public int getDni() {
            return dni;
        }

        public String getnombyape() {
            return nombyape;
        }
        
        public int gethrsTrabj() {
            return hrsTrabj;
        }

        public int getpagoxHrs() {
            return pagoxHrs;
        }
    }
}