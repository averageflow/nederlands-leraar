package nl.averageflow.nederlandsleraar.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class StartScreenController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onClickButtonMetZonderE() {
        welcomeText.setText("Welkom op Nederlands Leraar");
    }

    @FXML
    protected void onClickButtonLidwoorden() {
        welcomeText.setText("Welkom op Nederlands Leraar");
    }
}