package control;

import cine.model.Cine;

public class ShowFilmCommand extends Command{

	public ShowFilmCommand() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void excute(Cine c) {
		
		for (int i = 0; i < c.getContainerSize();i++) {
			
			int ind = i +1;
			System.out.println( ind +". " + c.getList().get(i).getTitulo());
		}
	}

}
