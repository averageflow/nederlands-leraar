package nl.averageflow.nederlandsleraar.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import nl.averageflow.nederlandsleraar.NederlandsLeraar;

import java.io.IOException;

public class StartScreenController {

    @FXML
    protected VBox startScreenMainContainer;

    @FXML
    protected void onClickButtonMetZonderE() {
       // welcomeText.setText("Welkom op Nederlands Leraar");
    }

    @FXML
    protected void onClickButtonLidwoorden() throws IOException {
        Stage stage = (Stage) startScreenMainContainer.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(NederlandsLeraar.class.getResource("LidwoordenScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        stage.setTitle("Lidwoord Spelletje");
        stage.setScene(scene);
        stage.show();

    }
}