package cine.model;

public class Cliente extends Usuario{
	
	private String id;
	private int edad;
	private boolean familiaNumerosa;
	private boolean minusvalia;
	public Cliente(String id , int edad) {
		super(id);
		// TODO Auto-generated constructor stub
		if ( edad < 1) {
			throw new IllegalArgumentException(" Valor de entrada invalida");
		}
		this.edad = edad;
	}

	
	public void esMinusvalido() {
		minusvalia = true;
	}
	
	public void esFamiliaNumerosa() {
		familiaNumerosa = true;
	}
	public int getEdad() {
		return edad;
	}
	
	public boolean getFamiliaNumerosa() {
		return familiaNumerosa;
	}

	public boolean getMinusvalia() {
		return minusvalia;
	}
	
}
