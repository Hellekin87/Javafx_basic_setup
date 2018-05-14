package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneManager {
    public static Stage stage;

    SceneManager(Stage stage){
        this.stage = stage;
    }

    static public void changeScene(String sceneName) throws IOException {
        Parent newRoot = FXMLLoader.load(Main.class.getResource(sceneName));
        stage.setHeight(stage.getHeight());
        stage.setWidth(stage.getWidth());
        stage.setScene(new Scene(newRoot));

    }
}
