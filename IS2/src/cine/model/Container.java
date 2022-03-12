package cine.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Container {

	private List<Pelicula> listFilm;
	private List<Sala> listSalas;
	
	public Container() {
		listFilm = new ArrayList<Pelicula>();
	}
	
	public void addFilm(Pelicula film) {
		listFilm.add(film);
	}
	
	public void removeFilm(Pelicula film) {
		listFilm.remove(film);
	}
	
	public int getSize() {
		return listFilm.size();
	}
	
	public List<Pelicula> getFilmList(){
		return Collections.unmodifiableList(listFilm);
	}
}
