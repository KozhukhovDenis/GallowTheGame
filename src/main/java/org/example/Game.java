package org.example;

public class Game {
    Render render;
    Data data;

    public void playGame() {
        boolean isGame = true;
        while(isGame) {
            render.drawField();
            isGame = false;
        }
    }

    Game(Render render, Data data) {
        this.render = render;
        this.data = data;
    }
}
