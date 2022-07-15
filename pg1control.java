package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class pg1control {

	
    @FXML
    void clothadd(ActionEvent event) throws IOException{
		System.out.println("Done");

		  Stage primaryStage = new Stage();
		  Parent root = FXMLLoader.load(getClass().getResource("page04.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Online Store");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }

    @FXML
    void clothsale(ActionEvent event) throws IOException{
		System.out.println("Done");

		  Stage primaryStage = new Stage();
		  Parent root = FXMLLoader.load(getClass().getResource("page05.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Online Store");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }
	  
		

    @FXML
    void elecsale(ActionEvent event) throws IOException{
		System.out.println("Done");
	
		  Stage primaryStage = new Stage();
		  Parent root = FXMLLoader.load(getClass().getResource("page07.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Online Store");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }
	  
		

    @FXML
    void elesadd(ActionEvent event) throws IOException{
    	System.out.println("Done");
	
		  Stage primaryStage = new Stage();
		  Parent root = FXMLLoader.load(getClass().getResource("page06.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Online Store");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }
	  
		

    @FXML
    void foodadd(ActionEvent event) throws IOException{
		System.out.println("Done");

		  Stage primaryStage = new Stage();
		  Parent root = FXMLLoader.load(getClass().getResource("page02.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Online Store");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }
	  
		

    @FXML
    void foodsale(ActionEvent event) throws IOException{
		System.out.println("Done");
		
		  Stage primaryStage = new Stage();
		  Parent root = FXMLLoader.load(getClass().getResource("page03.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Online Store");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }
	  
		

    @FXML
    void viewall(ActionEvent event) throws IOException{
		System.out.println("Done");
		
		  Stage primaryStage = new Stage();
		  Parent root = FXMLLoader.load(getClass().getResource("page8.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Online Store");
			primaryStage.setScene(scene);
			primaryStage.show();
			Main.b.viewProducts(true);
	  }
	 
    @FXML
    void addtocart(ActionEvent event) throws IOException{
		System.out.println("Done");
	
		  Stage primaryStage = new Stage();
		  Parent root = FXMLLoader.load(getClass().getResource("page9.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
		primaryStage.setTitle("Online Store");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }
    @FXML
    void removeproduct(ActionEvent event) throws IOException{
		System.out.println("Done");
	
		  Stage primaryStage = new Stage();
		  Parent root = FXMLLoader.load(getClass().getResource("page10.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Online Store");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }
    @FXML
    void updateproduct(ActionEvent event) throws IOException{
		System.out.println("Done");
		
		  Stage primaryStage = new Stage();
		  Parent root = FXMLLoader.load(getClass().getResource("page11.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Online Store");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }
    @FXML
    void viewcart(ActionEvent event) throws IOException{
		System.out.println("Done");
		  
		  Stage primaryStage = new Stage();
		  Parent root = FXMLLoader.load(getClass().getResource("page12.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Online Store");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }
    
    
}

