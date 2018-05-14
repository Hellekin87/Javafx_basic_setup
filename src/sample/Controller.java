package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;



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
        System.out.println(location);
        System.out.println("Hello");
    }

    @FXML
    void starthandle(ActionEvent event) throws Exception{
        System.out.println("Button clicked");
        System.out.println("Textfield value: "+tf.getText());
        System.out.println("Textfield value 2: "+tf_2.getText());
        System.out.println("Checkbox state: "+cb.isSelected());
        //Parent root = FXMLLoader.load(Main.class.getResource("sample.fxml"));
        //System.out.println(root);
        SceneManager.changeScene("SecondView.fxml");

    }

}
