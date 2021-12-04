package application;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

	@FXML
	public TextField txt1;
	@FXML
	public void selectVoter(ActionEvent e) throws IOException {
	
       Stage primaryStage=new Stage();
		
		FXMLLoader loader = new FXMLLoader();
        // Path to the FXML File
        String fxmlDocPath = "C:\\Users\\S F\\eclipse-workspace\\NewUI\\src\\application\\Scene1.fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
         
        // Create the Pane and all Details
        AnchorPane root = (AnchorPane) loader.load(fxmlStream);
         
        // Create the Scene
        Scene scene = new Scene(root);
        // Set the Scene to the Stage
        primaryStage.setScene(scene);
        // Set the Title to the Stage
        primaryStage.setTitle("Vote Casting");
        // Display the Stage
        primaryStage.show();
		
		
	}
	
public void selectAdmin(ActionEvent e) throws IOException {
		
		txt1=new TextField();
		txt1.getText();
		System.out.println(txt1.getText());
	
       Stage primaryStage=new Stage();
		
		FXMLLoader loader = new FXMLLoader();
        // Path to the FXML File
        String fxmlDocPath = "C:\\Users\\S F\\eclipse-workspace\\NewUI\\src\\application\\AdminLogin.fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
         
        // Create the Pane and all Details
        AnchorPane root = (AnchorPane) loader.load(fxmlStream);
         
        // Create the Scene
        Scene scene = new Scene(root);
        // Set the Scene to the Stage
        primaryStage.setScene(scene);
        // Set the Title to the Stage
        primaryStage.setTitle("Admin Menu");
        // Display the Stage
        primaryStage.show();
		
		
	}
public void addParty(ActionEvent e) throws IOException
{
	Stage primaryStage=new Stage();
	
	FXMLLoader loader = new FXMLLoader();
    // Path to the FXML File
    String fxmlDocPath = "C:\\Users\\S F\\eclipse-workspace\\NewUI\\src\\application\\Scene1.fxml";
    FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
     
    // Create the Pane and all Details
    AnchorPane root = (AnchorPane) loader.load(fxmlStream);
     
    // Create the Scene
    Scene scene = new Scene(root);
    // Set the Scene to the Stage
    primaryStage.setScene(scene);
    // Set the Title to the Stage
    primaryStage.setTitle("Adding New Party");
    // Display the Stage
    primaryStage.show();
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
