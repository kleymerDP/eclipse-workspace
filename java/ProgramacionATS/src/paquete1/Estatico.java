package paquete1;

public class Estatico {
	
	// static type attributes
	private static String frase = "Primera Frase";
	
	// static type method
	public static int sumar(int num1, int num2) {
		int suma = num1 + num2;
		return suma;
	}
	
	public static void main(String[] args) {
		System.out.println(Estatico.frase);
		
		System.out.println("La suma es: " + Estatico.sumar(0, 0));
	}
	
}
