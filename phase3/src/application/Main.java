package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class Main extends Application{
	
	public static void main(String[] args) {
		
	       launch(args);
	   }
	
	public void start(Stage messageStage) {
	    try {
	    	
	    	VBox test = new VBox(10); // 10 is the spacing between elements
	        // This path is classpath-relative. Adjust if your actual path differs.
	        Parent root2 = FXMLLoader.load(getClass().getResource("message.fxml"));

	        

	        Button staff = new Button("Staff");
	        Button patient = new Button("Patient");
	        
	        test.getChildren().add(staff);
	        //test.getChildren().add(patient);
	        
	        
	        Scene scene2 = new Scene(root2, 900, 600);
	        //this is the full scene 
	        Scene scene3 = new Scene(test, 900, 600);
	         
	        
	        Parent root = FXMLLoader.load(getClass().getResource("patientMessage.fxml"));
	        Scene scene = new Scene(root, 900, 600);
	        	        
	      
	        staff.setOnAction(e -> messageStage.setScene(scene2));
	        
	       // patient.setOnAction(e -> messageStage.setScene(scene));
	        
	        
	        
	        messageStage.setScene(scene3);
	        messageStage.show();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public void sendMessage(ActionEvent event) {

			System.out.println("HELLO");
			
	}
}	