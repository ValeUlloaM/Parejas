import processing.core.PApplet;

public class Cuadrado {

	

	private int x,y;
	private int diametro;
	private int color;
	
	public Cuadrado() {
	}
	
	public Cuadrado(int x, int y) {
		
		this.x = x;
		this.y = y;
		diametro = 50;
		color = 255;
	}
	
	public void pintar(PApplet app) {
		app.fill(color);
		app.rect(x, y, diametro, diametro);
	}
	
	public void setColor(int color) {
		this.color = color;
}

}


