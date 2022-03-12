package cine.model;

import java.util.Date;

public class Adquisicion { 	//TODO revisar la finalidad de esta clase
	final static double PRECIO_ESTANDAR = 6.5; 
	final static double PRECIO_DIA_ESPECTADOR = 5;
	final static double PRECIO_FAMILIA_NUMEROSA = 5;
	final static double PRECIO_MINUSVALIDO = 3;
	final static double ENTRADA_GRATUITA = 0;
	
	private Pase pase;
	
	public Adquisicion() {
	}
	
	public void compra(Cliente cliente, Pelicula pelicula, Sala sala, Date fecha, String hora) {
		pase.compra(cliente, pelicula, sala, fecha, hora);
	}
	
	public double getPrecio() {
		return pase.getPrecio();
	}
	
}
