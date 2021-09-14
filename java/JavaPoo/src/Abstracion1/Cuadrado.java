package Abstracion1;

public class Cuadrado extends Figura {
	
	private float lado;
	
	public Cuadrado(String color, float lado) {
		super(color);
		this.lado = lado;
	}
	
	public float getArea() {
		return (float) Math.pow(this.lado, 2);
	}
	
	public float getPerimetro() {
		return this.lado * 4;
	}

}
