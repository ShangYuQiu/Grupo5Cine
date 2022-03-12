package cine.model;

public class Pelicula {

	private String titulo;
	private int edadRecom;
	private Genero genero;
	private int duracion;
	private int sala;
	
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
	
	
	
	// TO-DO
	
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
}
