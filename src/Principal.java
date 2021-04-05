import processing.core.PApplet;

public class Principal extends PApplet{

	public static void main(String[] args) {
		PApplet.main ("Principal");
	}

	@Override
	public void settings() {
		size(500,500);
	}
	
	Cuadrado[] cuadrados;
	
	
	@Override
	public void setup() {
		
	
		cuadrados = new Cuadrado[8];
		for (int i = 0; i < cuadrados.length; i++) {
			cuadrados[i] = new Cuadrado(32 + (i*55),225);
		
			if (i==0 || i==1 || i==4 || i==5) {
				cuadrados[i].setColor(0);
			}else {
				cuadrados[i].setColor(255);
			}
		
	}
			 
			
			
	}	
	
	
	@Override
	public void draw() {
		background(255);
		
		for (int i = 0; i < cuadrados.length; i++) {
			cuadrados[i].pintar(this);
		
			
		}
	
	}
	

	
}
 