package Tarea2;

import java.util.Scanner;	

public class Tarea2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Instancia de clase Scanner
		
		
		System.out.print("¿la persona Ha salido del pais? (True/False :");		
		boolean haSalido = scan.nextBoolean();
		
		System.out.print("¿La persona presenta contagios cercanos? (true/false): ");
        boolean presentaContagios = scan.nextBoolean();

        boolean enObservacion = haSalido;
        boolean haraPCR = false;
        boolean enCuarentena = false;

        if (!haSalido && !presentaContagios) {
            haraPCR = true;
        }

        if (!haSalido && !presentaContagios) {
            enCuarentena = true;
        }

        scan.close(); // Cerrado de clase Scanner
        
        System.out.println("En observación: " + enObservacion);
        System.out.println("Hacerá PCR: " + haraPCR);
        System.out.println("En cuarentena: " + enCuarentena);
    }

		
	}


