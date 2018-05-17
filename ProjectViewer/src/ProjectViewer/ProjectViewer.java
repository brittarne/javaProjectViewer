import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

package ProjectViewer;

public class ProjectViewer extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Better Project Viewer");
        primaryStage.setScene(new Scene(root, 920, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
