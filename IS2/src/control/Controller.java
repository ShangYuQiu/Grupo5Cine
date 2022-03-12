package control;

import java.io.InputStream;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import factory.*;
import cine.model.Cine;
import cine.model.Event;


public class Controller {

	private Factory <Event> eventFact;
	private Cine cine;
	private Scanner scanner;
	
	public Controller (Cine cine,Factory <Event> eventFact , Scanner scanner) {
		
		if (cine == null || eventFact == null) { // comprueba las entradas
			throw new IllegalArgumentException(" Entradas invalidas, no pueden ser nulos");
		}
		
		this.eventFact = eventFact;
		this.cine = cine;
		this.scanner = scanner;
	}
	
	
	public void load (InputStream input) {
		JSONObject jo = new JSONObject(new JSONTokener(input));
		JSONArray e=jo.getJSONArray("events");
		
		for(int i=0;i<e.length();i++) {// recoge las informaciones de input y crea los eventos
	    	 Event ev = eventFact.createInstance(e.getJSONObject(i));
	    	 cine.executeEvent(ev);
	     }
		
		
	}
	
	public void run() {
		
		boolean refresh = true;
		
		while ( refresh) {
			
			menu();
			System.out.println("Introduce opcion");
			int i = scanner.nextInt();
			
			if ( i == 0) {
				refresh = false;
			}
			else {
			Command command = Command.parse(i);
			command.excute(cine);
			}
		}
		
	}
	
	public void menu() {
        System.out.println("----------------\n"
        					+"1. Ver cartelera.\n"
                            + "2. Buscar pelicula.\n"
                            +"3. Buscar pelicula por genero.\n"
                            +"----------------");
    }
}
