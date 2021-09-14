package ejercicioN3;

public class Vehiculo {
	
	protected String marca;
	protected String modelo;
	protected Double precio;
	
	public Vehiculo(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public String getDatosVehiculos() {
		String datos = "marca  : " + marca + "\n"
					 + "modelo : " + modelo + "\n"
					 + "precio : " + precio + "\n"
					 + "-------------------";
		return datos;
	}
	
}
