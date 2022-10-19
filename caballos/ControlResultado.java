import java.awt.TextArea;
import javax.swing.*;
class ControlResultado{
	int[][] carrera;
	int[] carreras;
	String[][] cadena;

	ControlResultado(int numCorredores, int numCarrera) {
		this.carrera = new int[numCarrera][numCorredores];
		this.carreras = new int[numCarrera];
		this.cadena = new String[numCarrera] [numCorredores];
	}

	void getControlResultado() {
		
		for(int t = 0; t < carreras.length; t++) {
			for(int i = 0; i < carrera.length; i++) {
				this.cadena[t][i] = "Carrera " + this.carreras[t] + ": El jowke " + (i+1) + " ha tardado: " + this.carrera[t][i] + " sprints\n";
			}
		}
	}
}
