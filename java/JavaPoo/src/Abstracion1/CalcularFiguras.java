package Abstracion1;

public class CalcularFiguras {
	
	public static void main(String[] args) {
		
		// Calcular el �rea del cuadrado
		
		Cuadrado cuadrado = new Cuadrado("Azul", 5);
		
		System.out.println("El color de la figura es: " + cuadrado.getColor());
		System.out.println("El �rea de la figura es: " + cuadrado.getArea());
		System.out.println("El per�metro de la figura es: " + cuadrado.getPerimetro());
		
		
		// Calcular el �rea del rect�ngulo
		
		float baseR = 12.6f;
		float alturaR = 5.6f;
		
		
		Rectangulo rectangulo = new Rectangulo("Celeste", baseR, alturaR);
		
		System.out.println(" ");
		System.out.println("El color de la figura es: " + rectangulo.getColor());
		System.out.println("El �rea de la figura es: " + rectangulo.getArea());
		System.out.println("El per�metro de la figura es: " + rectangulo.getPerimetro());
		
	}

}
