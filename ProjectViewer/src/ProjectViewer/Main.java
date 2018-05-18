package ProjectViewer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Better Project Viewer");
        primaryStage.setScene(new Scene(root, 920, 400));
        primaryStage.show();


        //final test to put comment into master
    }


    public static void main(String[] args) {
        launch(args);
    }
}
