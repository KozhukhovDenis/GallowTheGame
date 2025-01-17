package org.example;

import java.util.Arrays;

public class Data {

    private String[][] field;
    private String[] secret;
    private boolean isEndGame;
    private String word;

    private final int height;
    private final int width;
    private final String[] symbols;

    private void initGame() {
        field = new String[height][width];
        secret = new String[word.length()];
        Arrays.fill(secret, "_");
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++) {
                if(i == 0 || i == height - 1) field[i][j] = symbols[1];
                else if(j == 0 || j == width - 1 || (i == 3 && j == 15)) field[i][j] = symbols[3];
                else if(j == 20) field[i][j] = symbols[7];
                else field[i][j] = symbols[0];
            }
        }
        for(int i = 3; i <= 8; i++) field[i][5] = symbols[3];
        for(int j = 5; j <= 15; j += 2) field[2][j] = symbols[6];
        System.arraycopy(symbols, 2, field[9], 4, 3);
        System.arraycopy(secret, 0, field[7], 23, secret.length);
    }

    public void setIsEndGame(boolean isEndGame) {
        this.isEndGame = isEndGame;
    }
    public boolean getIsEndGame() {
        return isEndGame;
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public String getFieldPole(int i, int j) {
        return field[i][j];
    }
     public String getWord() {
        return word;
    }
    public void setSecret(String[] secret) {
        this.secret = secret;
        System.arraycopy(this.secret, 0, field[7], 23, secret.length);
    }
    public String[] getSecret() {
        return secret;
    }
    public void newGame () {
        newWord();
        initGame();
    }
    public void newWord() {
        word = Constants.WORDS[(int) (Math.random() * Constants.WORDS.length)];
    }
    public void setCorpse(int num) {
        switch (num) {
            case 1:
                field[4][15] = symbols[5];
                break;
            case 2:
                field[5][15] = symbols[3];
                break;
            case 3:
                field[5][14] = symbols[2];
                break;
            case 4:
                field[5][16] = symbols[4];
                break;
            case 5:
                field[6][14] =symbols[2];
                break;
            case 6:
                field[6][16] = symbols[4];
                break;
            default:
                break;
        }
    }
    Data() {
        this.height = Constants.HEIGHT;
        this.width = Constants.WIDTH;
        //this.word = Constants.WORD;
        this.symbols = Constants.SYMBOLS;
        this.isEndGame = false;
        newWord();
        initGame();
    }
}
