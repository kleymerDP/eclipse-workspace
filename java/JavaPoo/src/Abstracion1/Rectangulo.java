package Abstracion1;

public class Rectangulo extends Figura {
	
	private float base;
	private float altura;
	
	public Rectangulo(String color, float base, float altura) {
		super(color);
		this.altura = altura;
		this.base = base;
		// this.altura = (float) altura;
		// this.base = (float) base;
	}
	
	public float getArea() {
		return this.base * this.altura;
	}
	
	public float getPerimetro() {
		return (this.base + this.altura) * 2;
	}
}
