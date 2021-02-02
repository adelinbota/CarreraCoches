package Carrera;

import java.util.Scanner;

public class Menu {

	public static int menuCarrera() {
		return 0;
	}
	
	
	public static int menuJugador() {
		Scanner leer_opcion = new Scanner(System.in);
		int opcion;
		System.out.println("Pulse 1 para arrancar y empezar la carrera");
		System.out.println("Pulse 2 para acelerar");
		System.out.println("Pulse 3 para frenar");
	
		opcion = leer_opcion.nextInt();
		
		return 0;
	}
}
