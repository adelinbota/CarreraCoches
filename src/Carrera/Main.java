package Carrera;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Coche coche1 = new Coche("Faced", 17);
		Coche coche2 = new Coche("Adelin", 10);
		coche2.setDistancia_carrera(2000);
		coche1.setDistancia_carrera(2000);
		System.out.println("");
		System.out.println("¡BIENVENIDOS A ESTA CARRERA CONTRARELOJ DE DOS JUGADRORES, QUE GANE EL MEJOR!");
		System.out.println("");
		System.out.println("La carrera tiene " + coche1.getDistancia_carrera() + " kilometros");
		System.out.println("");
		int opcion1 = 0;
		int opcion2 = 0;
		Scanner leer_opcion = new Scanner(System.in);

		
		//Repetir hasta que la carrera se acabe
		do {
			
			
			// Pintar el menu
			opcion1 = Menu.menuJugador();

			// Segun la opcion actuar

			switch (opcion1) {
			case 1:
				coche1.arrancar();
				break;

			case 2:
				coche1.acelerar();
				break;
			case 3:
				
				break;
			case 4:

				break;
			}
			
			
			
		}while(coche1.getKm_recorridos()>=coche1.getDistancia_carrera());
		
	
		
		
		

		while ((coche2.getKm_recorridos() < coche2.getDistancia_carrera())
				&& (coche1.getKm_recorridos() < coche1.getDistancia_carrera())) {
			switch (opcion1) {
			case 0:
				System.out.println("Pulse 1 para arrancar y empezar la carrera");
				System.out.println("Pulse 2 para acelerar");
				System.out.println("Pulse 3 para frenar");
				System.out.println("Pulse 4 para volver a arrancar tras un accidente");
				System.out.println(
						"No supere los 200 km/h o pulse una tecla distinta a las propuestas o acabara accidentado");
				System.out.println("Estado del coche : " + coche1.getEstado_coche() + ", velocidad actual : "
						+ coche1.getVelocidad() + ", km recorridos : " + coche1.getKm_recorridos() + ", km restantes : "
						+ (coche1.getDistancia_carrera() - coche1.getKm_recorridos()));
				opcion2 = leer_opcion.nextInt();
				break;
			case 1:
				coche1.arrancar();
				System.out.println("acelerar : 2");
				System.out.println("frenar : 3");
				System.out.println("volver a arrancar tras accidente : 4");
				System.out.println(
						"no supere los 200 km/h o pulse una tecla distinta a las propuestas o acabara accidentado");
				System.out.println("estado del coche : " + coche1.getEstado_coche() + ", velocidad actual : "
						+ coche1.getVelocidad() + ", km recorridos : " + coche1.getKm_recorridos() + ", km restantes : "
						+ (coche1.getDistancia_carrera() - coche1.getKm_recorridos()));
				opcion2 = leer_opcion.nextInt();
				break;
			case 2:
				coche1.acelerar();
				System.out.println("acelerar : 2");
				System.out.println("frenar : 3");
				System.out.println("volver a arrancar tras accidente : 4");
				System.out.println(
						"no supere los 200 km/h o pulse una tecla distinta a las propuestas o acabara accidentado");
				System.out.println("estado del coche : " + coche1.getEstado_coche() + ", velocidad actual : "
						+ coche1.getVelocidad() + ", km recorridos : " + coche1.getKm_recorridos() + ", km restantes : "
						+ (coche1.getDistancia_carrera() - coche1.getKm_recorridos()));
				opcion2 = leer_opcion.nextInt();
				break;
			case 3:
				coche1.frenar();
				System.out.println("acelerar : 2");
				System.out.println("frenar : 3");
				System.out.println("volver a arrancar tras accidente : 4");
				System.out.println(
						"no supere los 200 km/h o pulse una tecla distinta a las propuestas o acabara accidentado");
				System.out.println("estado del coche : " + coche1.getEstado_coche() + ", velocidad actual : "
						+ coche1.getVelocidad() + ", km recorridos : " + coche1.getKm_recorridos() + ", km restantes : "
						+ (coche1.getDistancia_carrera() - coche1.getKm_recorridos()));
				opcion2 = leer_opcion.nextInt();
				break;
			case 4:
				if (coche1.getEstado_coche().equalsIgnoreCase("accidentado")
						|| coche1.getEstado_coche().equalsIgnoreCase("parado")) {
					coche1.arrancar();
					System.out.println("acelerar : 2");
					System.out.println("frenar : 3");
					System.out.println("volver a arrancar tras accidente : 4");
					System.out.println(
							"no supere los 200 km/h o pulse una tecla distinta a las propuestas o acabara accidentado");
					System.out.println("estado del coche : " + coche1.getEstado_coche() + ", velocidad actual : "
							+ coche1.getVelocidad() + ", km recorridos : " + coche1.getKm_recorridos()
							+ ", km restantes : " + (coche1.getDistancia_carrera() - coche1.getKm_recorridos()));
					opcion2 = leer_opcion.nextInt();
				}
				break;
			default:
				if (coche2.getEstado_coche().equalsIgnoreCase("accidentado")) {
					coche2.arrancar();
					System.out.println("acelerar : 2");
					System.out.println("frenar : 3");
					System.out.println("volver a arrancar tras accidente : 4");
					System.out.println(
							"no supere los 200 km/h o pulse una tecla distinta a las propuestas o acabara accidentado");
					System.out.println("estado del coche : " + coche1.getEstado_coche() + ", velocidad actual : "
							+ coche1.getVelocidad() + ", km recorridos : " + coche1.getKm_recorridos()
							+ ", km restantes : " + (coche1.getDistancia_carrera() - coche1.getKm_recorridos()));
					opcion2 = leer_opcion.nextInt();
				}
				break;
			}
			switch (opcion2) {
			case 1:
				coche2.arrancar();
				System.out.println("acelerar : 2");
				System.out.println("frenar : 3");
				System.out.println("volver a arrancar tras accidente : 4");
				System.out.println(
						"no supere los 200 km/h o pulse una tecla distinta a las propuestas o acabara accidentado");
				System.out.println("estado del coche : " + coche2.getEstado_coche() + ", velocidad actual : "
						+ coche2.getVelocidad() + ", km recorridos : " + coche2.getKm_recorridos() + ", km restantes : "
						+ (coche2.getDistancia_carrera() - coche2.getKm_recorridos()));
				opcion1 = leer_opcion.nextInt();
				break;
			case 2:
				coche2.acelerar();
				System.out.println("acelerar : 2");
				System.out.println("frenar : 3");
				System.out.println("volver a arrancar tras accidente : 4");
				System.out.println(
						"no supere los 200 km/h o pulse una tecla distinta a las propuestas o acabara accidentado");
				System.out.println("estado del coche : " + coche2.getEstado_coche() + ", velocidad actual : "
						+ coche2.getVelocidad() + ", km recorridos : " + coche2.getKm_recorridos() + ", km restantes : "
						+ (coche2.getDistancia_carrera() - coche2.getKm_recorridos()));
				opcion1 = leer_opcion.nextInt();
				break;
			case 3:
				coche2.frenar();
				System.out.println("acelerar : 2");
				System.out.println("frenar : 3");
				System.out.println("volver a arrancar tras accidente : 4");
				System.out.println(
						"no supere los 200 km/h o pulse una tecla distinta a las propuestas o acabara accidentado");
				System.out.println("estado del coche : " + coche2.getEstado_coche() + ", velocidad actual : "
						+ coche2.getVelocidad() + ", km recorridos : " + coche2.getKm_recorridos() + ", km restantes : "
						+ (coche2.getDistancia_carrera() - coche2.getKm_recorridos()));
				opcion1 = leer_opcion.nextInt();
				break;
			case 4:
				if (coche2.getEstado_coche().equalsIgnoreCase("accidentado")
						|| coche2.getEstado_coche().equalsIgnoreCase("parado")) {
					coche2.arrancar();
					System.out.println("acelerar : 2");
					System.out.println("frenar : 3");
					System.out.println("volver a arrancar tras accidente : 4");
					System.out.println(
							"no supere los 200 km/h o pulse una tecla distinta a las propuestas o acabara accidentado");
					System.out.println("estado del coche : " + coche2.getEstado_coche() + ", velocidad actual : "
							+ coche2.getVelocidad() + ", km recorridos : " + coche2.getKm_recorridos()
							+ ", km restantes : " + (coche2.getDistancia_carrera() - coche2.getKm_recorridos()));
					opcion1 = leer_opcion.nextInt();
				}
				break;
			default:
				if (coche2.getEstado_coche().equalsIgnoreCase("accidentado")) {
					coche2.arrancar();
					System.out.println("acelerar : 2");
					System.out.println("frenar : 3");
					System.out.println("volver a arrancar tras accidente : 4");
					System.out.println(
							"no supere los 200 km/h o pulse una tecla distinta a las propuestas o acabara accidentado");
					System.out.println("estado del coche : " + coche2.getEstado_coche() + ", velocidad actual : "
							+ coche2.getVelocidad() + ", km recorridos : " + coche2.getKm_recorridos()
							+ ", km restantes : " + (coche2.getDistancia_carrera() - coche2.getKm_recorridos()));
					opcion1 = leer_opcion.nextInt();
				}
				break;
			}
		}
		System.out.println("FELICIDADES HAS TERMINADO LA CARRERA");
	}

	

}
