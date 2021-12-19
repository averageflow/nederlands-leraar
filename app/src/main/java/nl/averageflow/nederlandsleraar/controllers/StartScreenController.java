package nl.averageflow.nederlandsleraar.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import nl.averageflow.nederlandsleraar.dto.Word;

import java.util.Locale;
import java.util.Random;

public class StartScreenController {

    @FXML
    protected VBox startScreenMainContainer;

    @FXML
    protected Text gameWordText;

    @FXML
    protected Button buttonDe;

    @FXML
    protected Button buttonHet;

    protected Word currentWord ;

    protected String niceGreen = "#adff2f";
    protected String niceRed = "#ff0000";

    protected Word[] gameWords = {
            new Word("het", "paard"),
            new Word("de", "eend"),
            new Word("het", "bier"),
            new Word("de", "wijn"),
            new Word("de", "bank"),
            new Word("de", "auto"),
            new Word("het", "toetje"),
            new Word("het", "feest"),
            new Word("de", "auto-monteur"),
    };

    public StartScreenController(){
        this.currentWord = this.getRandomWord();
    }

    @FXML
    protected void onClickButtonDe() {
        if (!this.buttonDe.getText().equalsIgnoreCase(this.currentWord.getLidwoord())) {
            this.setButtonColor(this.niceRed);
        } else {
            this.setButtonColor(this.niceGreen);
        }

        this.setNextWord();
    }

    @FXML
    protected void onClickButtonHet() {
        if (!this.buttonHet.getText().equalsIgnoreCase(this.currentWord.getLidwoord())) {
            this.setButtonColor(this.niceRed);
        } else {
            this.setButtonColor(this.niceGreen);
        }

        this.setNextWord();
    }

    protected void setButtonColor(String hexColorCode){
        this.buttonHet.setTextFill(Paint.valueOf(hexColorCode));
        this.buttonDe.setTextFill(Paint.valueOf(hexColorCode));
    }

    protected void setNextWord() {
        this.currentWord = this.getRandomWord();

        this.gameWordText.setText(this.currentWord.getWord());
    }

    protected Word getRandomWord() {
        int rnd = new Random().nextInt(this.gameWords.length);
        return this.gameWords[rnd];
    }


}