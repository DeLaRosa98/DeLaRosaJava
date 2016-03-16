package holamundo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args){
		
		/*Persona p1 = new Persona(17, 0, "Pablo");
		
		
		Persona p2 = new Persona(32, 10000, "Antonio");
		p2.mostrarInfo();
		System.out.println();
		p1.mostrarInfo();*/
		
		Persona[] personas = new Persona[10];
		
		personas[0] = new Persona(12, 0, "Juan");
		
			
		ArrayList<Persona> personasLista = new ArrayList<>();
		
		
		Persona p1 = new Persona(0, 0, "p1");
		personasLista.add(p1);
		personasLista.add(new Persona(0, 0, "p2"));
		personasLista.add(new Persona(0, 0, "p3"));
		personasLista.add(new Persona(0, 0, "p4"));
		//personasLista.get(0).mostrarInfo();
		
		
		//personasLista.set(0, new Persona(0, 0, "p2"));
		//personasLista.get(1).mostrarInfo();
		
	
		
		//personasLista.get(0).mostrarInfo();
		//personasLista.get(1).mostrarInfo();
		//personasLista.get(2).mostrarInfo();
		//personasLista.get(3).mostrarInfo();
		
		
		/*HashMap<String, Persona> diccionario = new HashMap<>();
		
		diccionario.put("p1", p1);
		diccionario.get("p1").mostrarInfo();*/
	
		HashMap<String, String> agenda = new HashMap<>();
		
		
		agenda.put("p1", "n1");
		agenda.put("p2", "n2");
		agenda.put("p3", "n3");
		
		Set<String> keySet = agenda.keySet();
		
		for(String s : keySet){
			System.out.println(s + ": " + agenda.get(s));
			
		}
		
		/*for(int i =0; i<3; i++){
			agenda.put(JOptionPane.showInputDialog("¿Cuál es el nombre del nuevo contacto?"), JOptionPane.showInputDialog("¿Cuál es el número de teléfono del contacto?"));
			
		}
		String numero = agenda.get(JOptionPane.showInputDialog("¿De qué contacto quieres saber el telefono?"));	
			System.out.println(numero);*/
		
		
		
		Agenda ag  = new Agenda();
		String respuesta = JOptionPane.showInputDialog("¿Qué función quieres llevar a cabo?\nterminar \nañadir \nconsultar \nborrar \nborrar todos \nconsultar todos ");
				
		while(!respuesta.equals("terminar")){
			if(respuesta.equals("añadir")){
				ag.añadir(JOptionPane.showInputDialog("¿Cuál es el nombre de la persona a añadir?"), JOptionPane.showInputDialog("¿Cuál es el numero de la persona?"));
			}
			else if(respuesta.equals("consultar")){
				ag.consultar(JOptionPane.showInputDialog("¿De qué persona quieres consultar el número?"));
			}
			
			else if(respuesta.equals("borrar")){
				ag.borrar(JOptionPane.showInputDialog("¿De qué persona quieres borrar el número?"));
			}
			else if(respuesta.equals("consultar todos")){
				ag.consultarTodos();
			}
			else if(respuesta.equals("borrar todos")){
				ag.borrarTodos();
			}
			respuesta = JOptionPane.showInputDialog("¿Qué función quieres llevar a cabo?");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
