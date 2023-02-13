package tareas;

import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿El trabajador ha cuidado los procedimientos de seguridad? (si/no)");
        String cuidadoSeguridad = sc.nextLine();
        
        System.out.println("¿El trabajador ha leído el manual de seguridad interno? (si/no)");
        String leidoManual = sc.nextLine();
        
        System.out.println("¿El trabajador ha sufrido algún incidente? (si/no)");
        String incidente = sc.nextLine();
        
        boolean haCuidadoSeguridad = cuidadoSeguridad.equalsIgnoreCase("si");
        boolean haLeidoManual = leidoManual.equalsIgnoreCase("si");
        boolean haSufridoIncidente = incidente.equalsIgnoreCase("si");
        
        if(!haCuidadoSeguridad || !haLeidoManual || haSufridoIncidente) {
            System.out.println("no siguio los procedimientos de seguridad y/o no se ha leído el manual de seguridad interno.");
        } else {
            System.out.println("Se ha seguido todos los procedimientos de seguridad y ha leido el manual de seguridad interno.");
        }
        
        sc.close();
    }
}
