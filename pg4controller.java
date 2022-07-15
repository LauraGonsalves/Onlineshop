package application;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.ChoiceBox;

import javafx.scene.control.TextField;


public class pg4controller implements Initializable {
	@FXML
	TextField nameTF;
	@FXML
	TextField idTF;
	@FXML
	TextField quantityTF;
	@FXML
	TextField priceTF;
	
	@FXML
	TextField brandTF;

	@FXML	
	public  ChoiceBox<SubCategory> esub;
	
	@FXML	
	public ChoiceBox<Size> size;


	
	public void initialize (URL arg0,ResourceBundle arg1){
				esub.getItems().addAll(SubCategory.values());
				size.getItems().addAll(Size.values());}
			
	// addProduct(String name, String id, int quantity,double price , String b, SubCategory sub, Size size)
	@FXML
	public void add(ActionEvent event){
		String name = nameTF.getText();
		String id=idTF.getText();
		String brand=brandTF.getText();
		double price;
		price =Double.parseDouble(priceTF.getText());
		
		//store.addProduct(name, id, quantity, price, exp, mfg);
		int quantity;
		quantity=Integer.parseInt(quantityTF.getText());
		

		SubCategory e=esub.getValue();
		Size s=size.getValue();
		
			Main.b.addProduct(name, id, quantity, price, brand, e, s);
			DataHandler.saveData(Main.b);
		nameTF.setText(null);
		idTF.setText(null);
		priceTF.setText(null);
		
		quantityTF.setText(null);
		brandTF.setText(null);
		
		}

}
	



