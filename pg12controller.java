package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
//import javafx.scene.control.ScrollBar;
import javafx.stage.Stage;

public class pg12controller implements Initializable {
;
	
	 
	 @FXML
		private ListView<Product>allDetails;
	 @FXML
		public ListView<Double>f;
		public void initialize(URL arg0, ResourceBundle arg1){
		allDetails.getItems().addAll(Main.b.viewProductsFromCart());
		f.getItems().addAll(Main.b.Bill());
		}
		
		

	 @FXML
	 void clear(ActionEvent event){
		 
		 Main.b.clearCart();
//		 allDetails.getItems().addAll(Main.b.viewProductsFromCart());
		
	 }
	 @FXML
	 void bill(ActionEvent event){
		 Main.b.payBill();
	 }
	 
	 
}








