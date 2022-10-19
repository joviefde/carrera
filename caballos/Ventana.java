import java.awt.TextArea;
import javax.swing.*;
class Ventana{
	private JFrame Ventana = new JFrame();
	private TextArea texto_ventana = new TextArea();
	
	Ventana(String nombre, int x, int y){
		Ventana.setName(nombre);
		Ventana.setTitle(nombre);
		Ventana.setSize(400, 400);
		Ventana.setVisible(true);
		Ventana.add(texto_ventana);
		Ventana.setLocation(x, y);
	}
	
	public void escribecadena(String cadena){
		texto_ventana.setText(texto_ventana.getText() + cadena);
	}
	
}