package nl.averageflow.nederlandsleraar.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import nl.averageflow.nederlandsleraar.dto.Word;

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

    @FXML
    protected Text statusText;

    @FXML
    protected Text amountCorrectDisplay;

    @FXML
    protected Text amountIncorrectDisplay;

    protected Word currentWord;
    protected Integer amountCorrect;
    protected Integer amountIncorrect;

    protected final String niceGreen = "#adff2f";
    protected final String niceRed = "#ff0000";

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

    public StartScreenController() {
        this.amountCorrect = 0;
        this.amountIncorrect = 0;
        this.currentWord = this.getRandomWord();
        //this.setNextWord();
    }

    @FXML
    protected void onClickButtonDe() {
        if (!this.buttonDe.getText().equalsIgnoreCase(this.currentWord.getLidwoord())) {
            this.setStatusTextColor(this.niceRed);
            this.setStatusTextMessage("Niet juist!");
            this.amountIncorrect++;

        } else {
            this.setStatusTextColor(this.niceGreen);
            this.setStatusTextMessage("Juist!");
            this.amountCorrect++;
        }

        this.updateGameScoreDisplay();
        this.setNextWord();
    }

    @FXML
    protected void onClickButtonHet() {
        if (!this.buttonHet.getText().equalsIgnoreCase(this.currentWord.getLidwoord())) {
            this.setStatusTextColor(this.niceRed);
            this.setStatusTextMessage("Niet juist!");
            this.amountIncorrect++;
        } else {
            this.setStatusTextColor(this.niceGreen);
            this.setStatusTextMessage("Juist!");
            this.amountCorrect++;
        }

        this.updateGameScoreDisplay();
        this.setNextWord();
    }

    protected void setStatusTextMessage(String message) {
        this.statusText.setText(message);
    }

    protected void setStatusTextColor(String hexColorCode) {
        this.statusText.setFill(Paint.valueOf(hexColorCode));
    }

    protected void updateGameScoreDisplay(){
        this.amountCorrectDisplay.setText(this.amountCorrect.toString());
        this.amountIncorrectDisplay.setText(this.amountIncorrect.toString());
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