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

public class pg5controller {
	@FXML
	TextField expireTF;

	
	@FXML
	TextField idTF;
	
	@FXML
    void elesadd(ActionEvent event) throws IOException{
		System.out.println("Done");
		  Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  stage.hide();
		  //New Window
		  Stage primaryStage = new Stage();
		  Parent root = FXMLLoader.load(getClass().getResource("page01.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("Online Store");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }
	@FXML
	public void add(ActionEvent event){
		
		String id=idTF.getText();
		int expire;
		expire=Integer.parseInt(expireTF.getText());
	
		
		
		Main.b.putOnSaleCloth(id,expire);
		//DataHandler.saveData(Main.b);

		expireTF.setText(null);
		idTF.setText(null);
		
		}
}
