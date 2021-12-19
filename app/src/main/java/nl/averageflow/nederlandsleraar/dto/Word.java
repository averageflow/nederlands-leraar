package nl.averageflow.nederlandsleraar.dto;

public class Word {
    protected String lidwoord;

    protected String word;


    public Word(String lidwoord, String word) {
        this.lidwoord = lidwoord;
        this.word = word;
    }

    public String getLidwoord() {
        return lidwoord;
    }

    public String getWord() {
        return word;
    }
}
