package cine.model;

import java.util.Date;

public interface Edicion {
	
	final static double PRECIO_ESTANDAR = 6.5; 
	
	public void cambiarSala(Sala sala);
	public void cambiarFecha(Date Fecha);
	public void cambiarHora(String hora);
	public void cambiarPelicula(Pelicula pelicula);
	public void restringirEdad(Pelicula pelicula, int restriccion);
}
