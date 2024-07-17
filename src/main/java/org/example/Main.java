package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Render render = new Render(data);
        Scanner sc = new Scanner(System.in);

        while(!data.getIsEndGame()) {
            render.drawMenu();
            int select = sc.nextInt();
            if(select == 1) {
                Game game = new Game(render, data);
                game.playGame();
            }
            else if(select == 2) data.setIsEndGame(true);
        }
    }
}