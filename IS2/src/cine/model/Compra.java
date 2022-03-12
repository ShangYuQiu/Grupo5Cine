package cine.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
	
	private Cliente cliente;
	private List<Adquisicion> carrito;
	private double coste;
	
	public Compra(Cliente cliente) {
		if(cliente == null) {
			throw  new IllegalArgumentException("Cliente no valido en la constructora de Compra");
		}
		else {
			this.cliente = cliente;
			carrito = new ArrayList<Adquisicion>();
			coste = 0;
		}
	}
	
	public void compraPase(Pelicula pelicula, Sala sala, Date fecha, String hora, int cantidad) {	//TODO hay que recisar la clase Adquisicon porque es un poco caos
		for(int i = 0; i < cantidad; i++) {
			Adquisicion ad = new Adquisicion();
			ad.compra(cliente, pelicula, sala, fecha, hora);
			carrito.add(ad);
		}
		actualizaCoste();
	}
	
	public void actualizaCoste() {
		coste = 0;
		for(Adquisicion a : carrito) {
			coste += a.getPrecio();
		}
	}
	
}
