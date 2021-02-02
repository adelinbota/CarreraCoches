package Carrera;

import java.util.Scanner;

public class Carrera {
	private String nombre;
	private Coche vCoches[];
	private int distanciaCarrera;
	
	public Carrera(String nombre, int distanciaCarrera) {
		super();
		this.nombre = nombre;
		this.vCoches = new Coche[10];
		this.distanciaCarrera = distanciaCarrera;
	}
	
	public void addCoche() {
		Scanner leer_String = new Scanner(System.in);
		Scanner leer_int = new Scanner(System.in);
		int dorsal=0;
		String nombrepiloto;
		//Pedir datos del coche
		System.out.println("Dime el nombre del piloto");
		nombrepiloto = leer_String.nextLine();
		System.out.println("Dime el dorsal del piloto");
		dorsal = leer_int.nextInt();
		//Dorsal no se puede repetir
		if (dorsalRepetido(dorsal)) {
		//Guardar nuevo coche en el vector
			Coche uno = new Coche(nombrepiloto, dorsal);
		}else {
			System.out.println("no se puede repetir un dorsal");
		}
		
	}

	private boolean dorsalRepetido(int dorsal) {
		
		return false;
	}
	
	
	
	
	

}
