package apps;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Driver extends Application{

	@Override
	public void start(Stage primaryStage) {
		try {
//			primaryStage.initStyle(StageStyle.UNDECORATED);
			Parent root = FXMLLoader.load(getClass().getResource("SLKDoc.fxml"));
			
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			String style = getClass().getResource("main.css").toExternalForm();
			scene.getStylesheets().addAll(style);
			primaryStage.setTitle("ToolBox Library Demo");
			primaryStage.setAlwaysOnTop(true);
			primaryStage.setResizable(true
					);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
