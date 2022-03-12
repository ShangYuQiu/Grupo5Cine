package cine.model;

import org.json.JSONObject;

public class Pelicula {

	private String titulo;
	private int edadRecom;
	private Genero genero;
	private int duracion;
	private int sala;
	
	private final int TODOS_LOS_PUBLICOS = 0;
	private final int MAS_DE_7 = 7;
	private final int MAS_DE_12 = 12;
	private final int MAS_DE_16 = 16;
	private final int MAS_DE_18 = 18;
	
	public Pelicula (String titulo, int edadRec, Genero genero, int duracion, int sala ) {
		
		if ( titulo == null || edadRecom < 0 || genero == null || duracion < 1 || sala < 1) {
			throw new IllegalArgumentException(" Valor de entrada invalida");
		}
		
		this.titulo = titulo;
		this.edadRecom = edadRec;
		this.genero = genero;
		this.duracion =duracion;
		this.sala = sala;
	}
	private void restriccionEdad(int restriccion) {	//Hago un switch porque las edades son un conjunto discreto, no un continuo
		switch(restriccion) {
		case 0:
			edadRecom = TODOS_LOS_PUBLICOS;
			break;
		case 7:
			edadRecom = MAS_DE_7;
			break;
		case 12:
			edadRecom = MAS_DE_12;
			break;
		case 16:
			edadRecom = MAS_DE_16;
			break;
		case 18:
			edadRecom = MAS_DE_18;
			break;
		default:
			throw new IllegalArgumentException("Restriccion de edad no registrada");
		}
	}
	
	
	// TO-DO
	
	public JSONObject report()
	{
		JSONObject object = new JSONObject();
		
		
		
		return object;
	}	
	public String getTitulo() {
		return titulo;
	}
	
	public int getEdad() {
		return edadRecom;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	
	public int duracion() {
		return duracion;
	}
	
	public int getSala() {
		return sala;
	}
	
	public void restringirEdad(int restriccion) {	//TODO deberia poder verlo solo Pase, quiza con otra interfaz
		restriccionEdad(restriccion);
	}
}
