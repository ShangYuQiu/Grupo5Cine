package cine.model;

public class Cliente extends Usuario{
	// comentario
	private String id;
	private int edad;
	
	public Cliente(String id , int edad) {
		super(id);
		// TODO Auto-generated constructor stub
		if ( edad < 1) {
			throw new IllegalArgumentException(" Valor de entrada invalida");
		}
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}
	
}
