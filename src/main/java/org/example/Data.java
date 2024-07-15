package org.example;

public class Data {

    private String [][] field = new String [Constants.WIDTH] [Constants.HEIGHT];
    private boolean isEndGame = false;

    public void setIsEndGame(boolean isEndGame) {
        this.isEndGame = isEndGame;
    }
    public boolean getIsEndGame() {
        return isEndGame;
    }
    public String getSymbol(int n) {
        return Constants.SYMBOLS[n];
    }
    public int getHeight() {
        return Constants.HEIGHT;
    }
    public int getWidth() {
        return Constants.WIDTH;
    }
    public String [][] getField() {
            return field;
    }
    public void setField(String [][] field) {
        this.field = field;
    }
}
