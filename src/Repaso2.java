//DIBUJAR UN RECTANGULO EN EL CENTRO DE LA PANTALLA, EN EL LADO SUPERIOR
import acm.graphics.*;
public class Repaso2 extends acm.program.GraphicsProgram {
	//declaro una variable de instancia para almacenar
	//el rectangulo, como es de instancia se ve desde init y run
	GRect rectangulo;
	
	//declaro otra variable de instanica que gardara el punto x de la pantalla
	// en el que empezara a pintarse el rectangulo
	int distanciaX;
	
	public void init(){
		//cambio el tama�o de la pantalla
		setSize(800,600);
		
		//creo el rectangulo de 120 de ancho por 80 de alto
		rectangulo = new GRect(120,80);
		add(rectangulo);
		
		
	}
	public void run(){
		//divido el ancho de la pantalla en 2 para saber donde esta la mitad exacta de la pantalla
		distanciaX = getWidth()/2;
		rectangulo.setLocation(distanciaX,0);
	}

}
