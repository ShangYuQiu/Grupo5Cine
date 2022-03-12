package control;

import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;

public class Controller {

	public void load (InputStream input) {
		JSONObject jo = new JSONObject(new JSONTokener(input));
		
	}
}
