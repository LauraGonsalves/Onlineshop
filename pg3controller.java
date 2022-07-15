package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class pg3controller {
	@FXML
	TextField expireTF;
	@FXML
	TextField saleTF;

	@FXML
    void home(ActionEvent event) throws IOException{
		System.out.println("Done");
		  //To hide the current window
		  Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  stage.hide();
		
		  Stage primaryStage = new Stage();
		  Parent root = FXMLLoader.load(getClass().getResource("page01.fxml"));
			
			Scene scene = new Scene(root);
			primaryStage.setTitle("Online Store");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }

	@FXML
	public void add(ActionEvent event){
		
		
		int expire;
		expire=Integer.parseInt(expireTF.getText());
	
		int noC;
		noC=Integer.parseInt(saleTF.getText());
		
		
		Main.b.putOnSaleFood(expire,noC);
		//DataHandler.saveData(Main.b);
		expireTF.setText(null);
		saleTF.setText(null);
		
		}
		
}
	
	

