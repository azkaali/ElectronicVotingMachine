package application;

import java.io.FileInputStream;
import java.util.ArrayList;

import BI.Party;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Submit extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		arg0.setTitle("Electronic Voting Machine");
		ArrayList<Party> parties=new ArrayList<Party>();

		 FXMLLoader f=new FXMLLoader();
		 String path="C:\\Users\\S F\\eclipse-workspace\\NewUI\\src\\application\\Scene0.fxml";
		 FileInputStream f1=new FileInputStream(path);
		 AnchorPane a=(AnchorPane)f.load(f1);
		 Scene s=new Scene(a);
		 arg0.setScene(s);
		 arg0.show();
	}
	
	
	 public static void main(String[] args) {
		 
	        launch(args);
	    }

}
