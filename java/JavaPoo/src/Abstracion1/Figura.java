package Abstracion1;

public abstract class Figura {
	
	private String color;
	
	public Figura(String color) {
		this.color = color;
	}
	
	public abstract float getArea();
	
	public abstract float getPerimetro();
	
	public String getColor() {
		return color;
	}
	
}