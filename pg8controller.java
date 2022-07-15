package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class pg8controller implements Initializable {
	@FXML
	private ListView<Product>allDetails;
	public void initialize(URL arg0, ResourceBundle arg1){
	allDetails.getItems().addAll(Main.b.products);
	}
	
	
}