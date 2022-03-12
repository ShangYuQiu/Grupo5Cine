package cine.model;

import java.util.Date;

public class Pase {

	private Pelicula pasePelicula;
	private Sala paseSala;
	private Date fecha;
	private String hora;
	private int precio;
	
	public Pase(Pelicula pasePelicula, Sala paseSala, Date fecha, String hora, int precio) {
		if(pasePelicula == null || paseSala == null || fecha == null || hora == null || precio < 0) {
			throw new IllegalArgumentException("Argumento erroneo en el constructor de Pase");
		}
		else{
		this.pasePelicula = pasePelicula;
		this.paseSala = paseSala;
		this.fecha = fecha;
		this.hora = hora;
		this.precio = precio;
		}
	}
	
}
