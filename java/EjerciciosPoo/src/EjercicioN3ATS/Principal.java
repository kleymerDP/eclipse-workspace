package EjercicioN3ATS;

import java.util.Scanner;

public class Principal {
	
	public static int indiceCocheBarato(Vehiculo coches[]) {
		float precio;
		int indice = 0;
		
		precio = coches[0].getPrecio();
		for (int i = 1; i < coches.length; i++) {
			if (coches[i].getPrecio() < precio) {
				precio = coches[i].getPrecio();
				indice = i;
			}
		}
		
		return indice;
	}
	
	
	public static void main(String[] args) {
		
		//Scanner
		Scanner entrada = new Scanner(System.in);
		
		String marca, modelo;
		float precio;
		int numeroVehiculos, indiceCocheBarato;
		
		System.out.println("Digite la cantidad de vehiculos: ");
		numeroVehiculos = entrada.nextInt();
		
		// array of objects
		// we create the objects for the cars
		Vehiculo coches[] = new Vehiculo[numeroVehiculos];
		
		for (int i = 0; i < coches.length; i++ ) {
			
			entrada.nextLine();
			
			System.out.println("Digite las caracteristicas del coche " + (i + 1) + ":");
			
			System.out.println("Introduzca Marca: ");
			marca = entrada.nextLine();
			
			System.out.println("Introduzca Modelo: ");
			modelo = entrada.nextLine();
			
			System.out.println("Introduzca Precio: ");
			precio = entrada.nextFloat();
			
			coches[i] = new Vehiculo(marca, modelo, precio);
		}
		
		indiceCocheBarato = indiceCocheBarato(coches);
		System.out.println("\nEl coche más barato es: ");
		System.out.println(coches[indiceCocheBarato].getDatos());
		
	}

}