package cine.model;


import java.util.List;

public class Cine {

	private Container container;
	
	public Cine () {
		
		container = new Container();
	}
	
	public void addFilm(Pelicula p) {
		if (p != null) {
		container.addFilm(p);
		}
	}
	
	
	public void executeEvent(Event e) {
		
		e.execute(container);
	}
	public void removeFilm (Pelicula p) {
		if ( p != null) {
			container.removeFilm(p);
		}
	}
	public List<Pelicula> getList(){
		return container.getFilmList();
	}	
	public int getContainerSize() {
		return container.getSize();
	}
	
}
