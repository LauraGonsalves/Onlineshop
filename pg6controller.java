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
import javafx.scene.control.ChoiceBox;

import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class pg6controller implements Initializable  {
	@FXML
	TextField nameTF;

	@FXML
	TextField idTF;

	@FXML
	TextField quantityTF;
	
	@FXML
	TextField priceTF;
	@FXML	
	ChoiceBox<ElectCategory> subCategory;
	
	@FXML
	TextField manufacturerTF;
	

	@FXML
    void elesadd(ActionEvent event) throws IOException{
		System.out.println("Done");
		  //To hide the current window
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

	
	public void initialize (URL arg0,ResourceBundle arg1){
	subCategory.getItems().addAll(ElectCategory.values());

	
	}

	//ddProduct(String name, String id, int quantity, double price, String manufacturer, ElectCategory sub)
	@FXML
	public void add(ActionEvent event){
		String name = nameTF.getText();
		String id=idTF.getText();
		double price;
		price =Double.parseDouble(priceTF.getText());
		String manufacturer= manufacturerTF.getText();

		ElectCategory cat=subCategory.getValue();
		
		int noC;
		
		noC=Integer.parseInt(quantityTF.getText());
		
		Main.b.addProduct(name, id,noC,price,manufacturer,cat);
		//DataHandler.saveData(Main.b);

		nameTF.setText(null);
		idTF.setText(null);
		priceTF.setText(null);
		manufacturerTF.setText(null);
		quantityTF.setText(null);
		}
		}

