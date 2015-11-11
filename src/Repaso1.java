/*
 * Repaso1: pinta un rectangulo en la esquina superior izquierda
 * 
 *
 */
//importamos la libreria acm oara los objetos graficos
import acm.graphics.*;
public class Repaso1 extends acm.program.GraphicsProgram {

	//declaro una variable instancia para guardar el rectangulo
	GRect rectangulo; 
	//init se inicia antes que el rom
	public void init(){
		setSize(800,600);
		//el primer parametro del rectangulo es el ancho y el segundo el alto
		rectangulo = new GRect(120,80);
		
	}
	public void run(){
	//añado el objeto Grect al lienzo para que se muestre
	//si no especifico la posicion, aparece en 0,0
	add(rectangulo);
	
	}
}
