import java.util.Scanner;

public class Caballo {
	static int numCarreras;
	private static ControladorHilos corredor[]; //Array de carreras
	private static int numCorredores;
	public static void jugarCarrera() {
		int jowkes = pedirPlayer();
		numCarreras = jowkes;
		numCorredores = numCarreras;
        ControlResultado res = new ControlResultado(numCorredores, numCarreras);
		corredor = new ControladorHilos[numCarreras];
		
		//Realizo varias carreras una a continuación de la otra
		for (int i = 0; i < 1; i++) {
			corredor[i] = new ControladorHilos(i+1, res, numCarreras); //A cada hilo le paso su contador y el almacén
			corredor[i].start(); //Empiezo el hilo
			
			System.out.println("La Carrera " + (i+1) +" ha comenzado... Hagan sus apuestas...");
			try {
				corredor[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//Muestra los resultados de cada carrera, a ver qué corredor tarda menos sprints en llegar a la meta
		System.out.println("La carrera han finalizado... Han llegado los " + numCarreras + " corredores");
		res.getControlResultado();
		for (int t = 0; t < 1; t++) {
			for (int i = 0; i < numCorredores; i++)
				System.out.print(res.cadena[t][i]);
			
			System.out.println("cccCccCCCCCCCccccccccccCCCccCCCCCCcccccCCcCCccccCccccccCCCccCcCccCCCccccCCCcCCCC");
		}
	}
	public static int pedirPlayer() {
		Scanner scanner = new Scanner(System.in);
		int c, player;
		do {
			System.out.println("Introduzca el núemero de jowkes para la carrera de caballos, como mucho hay 8 calles");
			player = scanner.nextInt();
			c = player;
		} while (c > 8);

		return player;
	}
}