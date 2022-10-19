class EjecutorHilos extends Thread {
	private int num_hilo;
	private Ventana ventana_hilo;
	private final int meta = 50;
	private ControlResultado res;
	private int numCarrera;
	
	EjecutorHilos(int i, ControlResultado res, int numCarrera){
		this.num_hilo = i;
		ventana_hilo = new Ventana("Jowke " + num_hilo, i*300, i);
		this.res = res;
		this.numCarrera = numCarrera-1;
	}
	
	public void run(){
		String cadena = new String();
		int metros = 1;
		int i = 1;
		while (metros < meta){
			cadena="Soy el jowke " + num_hilo + " es mi sprint " + i +  " y hemos recorrido mi caballo y yo " + metros + " m\n"; //Guardo cadena
			ventana_hilo.escribecadena(cadena); //Imprimo cadena en ventana
			try{
				sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("FIN DEL HILO");
			}
			
			i++; //Sumo sprint
			metros = metros + (int) (Math.random() * 20); //Sumo metros aleatorios
		}
		res.carrera[numCarrera][num_hilo-1]=i;
		
		System.out.println("Soy el jowke, con caballo "+ num_hilo +" he FINALIZADO"); //Imprimo en consola
		cadena="Soy el jowke con caballo" + num_hilo + " he FINALIZADO"; //Guardo cadena
		ventana_hilo.escribecadena(cadena); //Imprimo cadena
		
	}
	
}
