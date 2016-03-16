package holamundo;

public class Persona {

	int edad;
	int sueldo;
	String nombre;
	
	public Persona(int edad, int sueldo, String nombre){
		inicializar(edad,sueldo,nombre);
		
	}
	
	public void mostrarInfo(){
		System.out.println("La persona se llama: " + nombre);
		System.out.println("La persona tiene " + edad + " años.");
		System.out.println("La persona cobra: " + sueldo + " euros");
		
	}
	
	
	private void inicializar(int edad, int sueldo, String nombre){
		if(edad < 0){
			throw new RuntimeException("La edad no puede ser negativa");
		}
		this.sueldo = sueldo;
		this.nombre = nombre;
	}
	
}
