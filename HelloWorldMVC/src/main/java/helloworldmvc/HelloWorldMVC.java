package helloworldmvc;

import java.io.IOException;

import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class HelloWorldMVC {
	
	public static void main(String args[]) throws IOException {
		Controller c=new Controller(new Model(), new View());
		c.run();
	}
}
