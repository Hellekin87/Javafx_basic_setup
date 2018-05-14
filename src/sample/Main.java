package sample;

import javafx.animation.FadeTransition;
import javafx.animation.Transition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;
import java.io.IOException;

public class Main extends Application {

    static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));


        stage.setTitle("Main");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }

    public static void changeScene(String sceneName) throws IOException{

        Parent newRoot = FXMLLoader.load(Main.class.getResource(sceneName));
        stage.setScene(new Scene(newRoot, stage.getMaxWidth(), stage.getMaxHeight()));

    }

    public static void newScene(){

    }
    public static void main(String[] args) {
        launch(args);
    }
}
