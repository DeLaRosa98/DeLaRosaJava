package holamundo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Agenda {

	//Consultar, añadir, consultar todos, borrar, vaciar
	//mientras la respuesta sea diferente de 1 y 2 y 3 y 4 y 5
	
	
	private HashMap <String, String> agenda;
	
	public Agenda(){
		agenda = new HashMap<>();
		
		
	}
	
	public void añadir(String nombre, String numero){
		agenda.put(nombre, numero);
		
		//long t = System.currentTimeMillis();
	}
	
	public String consultar(String nombre){
		return agenda.get(nombre);
	}
	
	public void consultarTodos() {
		Set<String> keySet = agenda.keySet();
		for (String s : keySet){
			System.out.println(s + " : "+ agenda.get(s));
		}
	}
		
	public String borrar(String nombre) {
		return agenda.remove(nombre);	
	}
	
	public void borrarTodos(){
		agenda.clear();
	}
}
