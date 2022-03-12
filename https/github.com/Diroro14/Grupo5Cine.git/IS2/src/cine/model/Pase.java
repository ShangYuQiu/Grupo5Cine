package cine.model;

import java.util.Date;

public class Pase implements Edicion{

	private Pelicula pasePelicula;
	private Sala paseSala;
	private Date fecha;
	private String hora;
	private double precio;
	private final int MIERCOLES = 3;
	private final Date TODAY = new Date();	//Por defecto la fecha de hoy
	
	private Pase(Pelicula pasePelicula, Sala paseSala, Date fecha, String hora, double precio) {
		if(pasePelicula == null || paseSala == null || fecha == null || hora == null || precio < 0 || fecha.before(TODAY)) {
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
	
	public double getPrecio() {
		return precio;
	}
	
	@Override
	public void cambiarSala(Sala sala) {
		paseSala = sala;
	}

	@Override
	public void cambiarFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public void cambiarHora(String hora) {
		this.hora = hora;
		
	}

	@Override
	public void cambiarPelicula(Pelicula pelicula) {
		pasePelicula = pelicula;
	}

	public Pase compra(Cliente cliente, Pelicula pelicula, Sala sala, Date fecha, String hora) {
		if(cliente.getMinusvalia()) {
			return new Pase(pelicula, sala, fecha, hora, Adquisicion.PRECIO_MINUSVALIDO);
		}
		else if (cliente.getFamiliaNumerosa()) {
			return new Pase(pelicula, sala, fecha, hora, Adquisicion.PRECIO_FAMILIA_NUMEROSA);
		}
		else if(fecha.getDay() == MIERCOLES) {	//Parece que la funcion esta obsoleta
			return new Pase(pelicula, sala, fecha, hora, Adquisicion.PRECIO_DIA_ESPECTADOR);
		}
		else {
			return new Pase(pelicula, sala, fecha, hora, Adquisicion.PRECIO_ESTANDAR);
		}
	}


	@Override
	public void restringirEdad(Pelicula pelicula, int restriccion) {
		pelicula.restringirEdad(restriccion);
	}
	
}
