package cine.model;

public class Usuario {

	private String id;
	
	public Usuario ( String id) {
		
		if ( id == null) {
			throw new IllegalArgumentException(" Valor de entrada invalida");
		}
		else{
			this.id = id;
		}
	}
	
	
	public String getId() {
		return id;
	}
}
