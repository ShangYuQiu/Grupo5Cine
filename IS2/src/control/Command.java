package control;


import cine.model.Cine;

public abstract class Command {

	//private int op;
	
	public Command() {
		
	}

	public static Command parse(int op) {
		
		switch (op) {
		
		case 1:
			return new ShowFilmCommand();
			
		default:
			throw new IllegalArgumentException("Opcion Invalida");
		
		}
		
		
	}
	
	public abstract void excute(Cine c);
	
}
