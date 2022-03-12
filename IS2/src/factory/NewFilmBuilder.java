package factory;

import org.json.JSONObject;

import cine.model.Event;
import cine.model.Genero;
import cine.model.NewFilmEvent;


public class NewFilmBuilder extends Builder<Event>{

	public NewFilmBuilder() {
		super("new_film");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Event createTheInstance(JSONObject data) {
		// TODO Auto-generated method stub
		if(data.isEmpty()) {
            throw new IllegalArgumentException("data vacia");
        }

        else {
        	return new NewFilmEvent(data.getString("titulo"), data.getInt("edadRec"), 
        			Genero.valueOf(data.getString("genero")), data.getInt("duracion"), data.getInt("sala"));
        }
	}

}
