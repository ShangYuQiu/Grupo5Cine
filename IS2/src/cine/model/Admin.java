package cine.model;

import java.util.Date;

public class Admin extends Usuario{

	private String id;
	
	public Admin(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public void editarSala(Pase pase, Sala sala) {
		pase.cambiarSala(sala);
	}
	
	public void editarPelicula(Pase pase, Pelicula pelicula) {
		pase.cambiarPelicula(pelicula);
	}
	
	public void editarFecha(Pase pase, Date fecha) {
		pase.cambiarFecha(fecha);
	}
	
	public void editarHora(Pase pase, String hora) {
		pase.cambiarHora(hora);
	}
	
	public void crearPase(Pelicula pelicula, Sala sala, Date fecha, String hora) {
		
	}
}
