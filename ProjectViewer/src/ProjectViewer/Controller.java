package ProjectViewer;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;


public class Controller {
    //Trying to add a checkbox
    @FXML
    private CheckBox checkBox1;

    public void initialize(){
        System.out.println(checkBox1.isSelected());
    }

}
