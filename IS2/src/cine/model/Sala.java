package cine.model;

public class Sala {

	private int numero;
	private int aforo;
	private int capacidad;
	
	
	public Sala (int numero, int aforo ,int capacidad) {
		
		if ( numero < 1 || aforo < 1 || capacidad < 1) {
			throw new IllegalArgumentException(" Valor de entrada invalida");
		}
		
		this.numero = numero;
		this.aforo = aforo;
		this.capacidad = capacidad;
	}
	
	
	public int getNum() {
		return numero;
	}
	
	public int getAforo() {
		return aforo;
	}
	
	public int getCap() {
		return capacidad;
	}
}
