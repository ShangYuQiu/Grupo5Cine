package cine.model;

public class NewFilmEvent extends Event{

	private String titulo;
	private int edadRecom;
	private Genero genero;
	private int duracion;
	private int sala;
	
	public NewFilmEvent() {
		// TODO Auto-generated constructor stub
	}
	
	public NewFilmEvent(String titulo, int edadRec, Genero genero, int duracion, int sala) {
		this.titulo = titulo;
		this.edadRecom = edadRec;
		this.genero = genero;
		this.duracion =duracion;
		this.sala = sala;
	}
	@Override
	public void execute(Container cont) {
		
		Pelicula p = new Pelicula(titulo, edadRecom, genero, duracion, sala);
		cont.addFilm(p);
	}

}
