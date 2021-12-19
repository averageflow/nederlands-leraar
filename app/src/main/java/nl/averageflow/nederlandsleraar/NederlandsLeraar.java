package nl.averageflow.nederlandsleraar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NederlandsLeraar extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NederlandsLeraar.class.getResource("StartScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        stage.setTitle("Nederlands Leraar Spelletje :)");
        stage.setScene(scene);
        stage.show();
    }
}