package cine.model;

import java.util.List;

public class FilmContainer {

	private List<Pelicula> listFilm;
	
	public FilmContainer() {
		
	}
	
	public void add(Pelicula film) {
		listFilm.add(film);
	}
	
	public void remove(Pelicula film) {
		listFilm.remove(film);
	}
}
