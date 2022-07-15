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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class pg9controller implements Initializable{
	@FXML
TextField countTF;

@FXML
TextField idTF; 

	@FXML
    void elesadd(ActionEvent event) throws IOException{
		System.out.println("Done");
		  Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  stage.hide();
		  Stage primaryStage = new Stage();
		  Parent root = FXMLLoader.load(getClass().getResource("page01.fxml"));
			Scene scene = new Scene(root);
			
			primaryStage.setTitle("online Store");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }
	@FXML
	private ListView<Product>allDetails;
	
	public void initialize(URL arg0, ResourceBundle arg1){
	allDetails.getItems().addAll(Store.products);
	}
	
	 @FXML
		public void add(ActionEvent event){
			
			String id=idTF.getText();
			int expire;
			expire=Integer.parseInt(countTF.getText());
		
			
			
			try {
				Main.b.addProductToCart(id,expire);
				//DataHandler.saveData(Main.b);

			} catch (CloneNotSupportedException e) {
				
				e.printStackTrace();
			}
			countTF.setText(null);
			idTF.setText(null);
			
			}
}
