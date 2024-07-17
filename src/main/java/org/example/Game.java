package org.example;

import java.util.Scanner;

public class Game {
    Render render;
    Data data;
    Scanner input;

    public void playGame() {
        data.newGame();
        boolean isGame = true;
        int countPos = 0;
        int countNeg = 0;
        String symbolInWord;
        String word = data.getWord();
        String[] secret = data.getSecret();
        input = new Scanner(System.in);

        while(isGame) {
            render.drawField();
            if(countPos >= word.length()) {
                isGame = false;
                System.out.println("WIN");
            }
            if(countNeg >= 6) {
                isGame = false;
                System.out.println("LOOSE");
            }
            boolean isFind = false;
            symbolInWord = Character.toString(input.next().charAt(0));
            for(int i = 0; i < word.length(); i++) {
                if(symbolInWord.equalsIgnoreCase(Character.toString(word.charAt(i)))){
                    if(secret[i].equals("_")) secret[i] = Character.toString(word.charAt(i));
                    isFind = true;
                }
            }
            if(isFind) {
                data.setSecret(secret);
                countPos++;
            } else countNeg++;
        }
    }

    Game(Render render, Data data) {
        this.render = render;
        this.data = data;
    }
}
