package application;

import javafx.scene.control.*;
import java.io.FileInputStream;
import java.io.IOException;

import BI.Voter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LogIn {
	//MySQLHandler m=new MySQLHandler();
	Voter v=new Voter();
	@FXML
	public TextField txt1;
	@FXML
	public Button ok;
	public RadioButton r;
	public RadioButton r1;
	public Label myLabel; 
	public Boolean exists=false;
	@FXML
	public void LoggedIn(ActionEvent e) throws IOException {
		
		
		txt1.getText();
		//txt1.setText();
		 
		//txt1.getText();
		
		System.out.println("This: " + txt1.getText());
		String cnic=txt1.getText();
		if(cnic.length()==13)
		{
			if(exists==false)
			{
				v.addVoter(cnic);
				Stage primaryStage=new Stage();
				
				FXMLLoader loader = new FXMLLoader();
		        // Path to the FXML File
		        String fxmlDocPath = "C:\\Users\\S F\\eclipse-workspace\\NewUI\\src\\application\\Scene2.fxml";
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
			else
			{
						
			}
		}
		else
		{
			//loginFailed(e);
			System.out.println("CNIC INVALID");
			Stage primaryStage=new Stage();
			
			FXMLLoader loader = new FXMLLoader();
	        // Path to the FXML File
	        String fxmlDocPath = "C:\\Users\\S F\\eclipse-workspace\\NewUI\\src\\application\\cnicInvalid.fxml";
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
        
		
		
	}
	
	public void addingVotes(ActionEvent e )
	{
		if(r.isSelected()) {
			   myLabel.setText(r.getText());
			   System.out.println(r.getText());
			   String j=r.getText();
			  }
			  else if(r1.isSelected()) {
			   myLabel.setText(r1.getText());
			   System.out.println(r1.getText());
			   String p=r1.getText();

			  }
			 
	}
	
	
	public void toVoteSuccess(ActionEvent e) throws IOException {
		//txt1=new TextField();

		//String cnic=txt1.getText();
	//	System.out.println(txt1.getText());
		
	///	if(cnic.length()==13)
	//	{
			
	//	}
		
Stage primaryStage=new Stage();
		
		FXMLLoader loader = new FXMLLoader();
        // Path to the FXML File
        String fxmlDocPath = "C:\\Users\\S F\\eclipse-workspace\\NewUI\\src\\application\\VoteSuccess.fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
         
        // Create the Pane and all Details
        AnchorPane root = (AnchorPane) loader.load(fxmlStream);
         
        // Create the Scene
        Scene scene = new Scene(root);
        // Set the Scene to the Stage
        primaryStage.setScene(scene);
        // Set the Title to the Stage
        primaryStage.setTitle("Vote Success");
        // Display the Stage
        primaryStage.show();

	}

	public void loginFailed(ActionEvent e) throws IOException
	{
		
		Stage stage=(Stage) ok.getScene().getWindow();
	    // do what you have to do
	    stage.close();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
