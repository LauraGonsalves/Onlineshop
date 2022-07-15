package application;

import java.io.IOException;
import java.time.LocalDate;

import javax.swing.JOptionPane;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class pg2controller {
	@FXML
	TextField nameTF;
	@FXML
	TextField idTF;
	@FXML
	TextField quantityTF;
	@FXML
	TextField priceTF;
@FXML
	TextField expireTF;
	
	@FXML
    void confirm(ActionEvent event) throws IOException{
		System.out.println("Done");
		  //To hide the current window
		  Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  stage.hide();
		  //New Window
		  Stage primaryStage = new Stage();
		  Parent root = FXMLLoader.load(getClass().getResource("page01.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Online Store");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }
	@FXML
	public void add(ActionEvent event){
		String name = nameTF.getText();
		String id=idTF.getText();
		double price;
		price =Double.parseDouble(priceTF.getText());
		int expire;
		expire=Integer.parseInt(expireTF.getText());
		int noC;
		LocalDate mfg = LocalDate.now();
		LocalDate exp = mfg.plusDays(expire)	;			
		try{
		noC=Integer.parseInt(quantityTF.getText());
		Main.b.addProduct(name, id,noC,price,exp,mfg);
		DataHandler.saveData(Main.b);
		nameTF.setText(null);
		idTF.setText(null);
		priceTF.setText(null);
		expireTF.setText(null);
		quantityTF.setText(null);
		}
		catch(NumberFormatException e){
		JOptionPane.showMessageDialog(null,"Need a number for quantity");
		}} 
}
