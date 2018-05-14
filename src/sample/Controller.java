package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    TextField tf;

    @FXML
    TextField tf_2;

    @FXML
    CheckBox cb;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        System.out.println("Hello");

    }

    @FXML
    void starthandle(ActionEvent event) {
        System.out.println("Button clicked");
        System.out.println("Textfield value: "+tf.getText());
        System.out.println("Textfield value 2: "+tf_2.getText());
        System.out.println("Checkbox state: "+cb.isSelected());

        if(cb.isSelected()){
            System.out.println("gg");
        }
    }



}
