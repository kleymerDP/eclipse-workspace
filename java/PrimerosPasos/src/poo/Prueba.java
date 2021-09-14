package poo;

public class Prueba {
	public static void main(String[] args) {
		
		Empleado objEmpleado1 = new Empleado("Carlos");
		Empleado objEmpleado2 = new Empleado("Edzequiel");
		
		System.out.println(objEmpleado1.getDatos());
		
		objEmpleado2.setSeccion("Seguridad");
		System.out.println(objEmpleado2.getDatos());
		
		// ---------------------------------------------
		//System.out.println(objEmpleado1.getDatos() + "\n" + objEmpleado2.getDatos());
		
		// call to method static
		System.out.println(Empleado.getNextId());
	}
}

class Empleado {
	
	private String nombre;
	private String seccion;
	private int Id;
	private static int autoIncrementId = 1;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		
		this.seccion = "Administrador";
		
		this.Id = autoIncrementId;
		autoIncrementId++;
	}
	
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String getDatos() {
		return "Su nombre es: " + nombre + ", su seccion es: " + seccion + ", su ID es: " + Id;
	}
	
	public static String getNextId() {
		return "El id siguiente es: " + autoIncrementId;
	}
	
}
