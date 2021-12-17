package nl.averageflow.nederlandsleraar;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class StartScreenController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welkom op Nederlands Leraar");
    }
}