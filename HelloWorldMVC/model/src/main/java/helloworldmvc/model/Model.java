package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Model implements IModel {

	@Override
	public String getMessage() throws IOException {
		FileReader fr = new FileReader(Model.class.getResource("message.txt").getFile());
		BufferedReader br = new BufferedReader(fr);
		return br.readLine();
	}

}
