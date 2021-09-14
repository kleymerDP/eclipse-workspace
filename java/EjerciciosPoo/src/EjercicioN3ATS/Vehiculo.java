package EjercicioN3ATS;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private float precio;
	
	// Constructor
	public Vehiculo(String marca, String modelo, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	// method getPrecio();
	public float getPrecio() {
		return precio;
	}
	
	public String getDatos() {
		return "Marca  : " + marca + "\n"
				+ "Modelo : " + modelo + "\n"
				+ "Precio : $" + precio + "\n";
	}

}
