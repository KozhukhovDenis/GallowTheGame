package org.example;

public class Render {
    private final int height;
    private final int width;

    Data data;
    String [][] gameField;

    private void clearScreen() {
        System.out.print("\033[H\033[J");
    }

    public void drawField() {
        clearScreen();
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                if(i == 0 || i == height - 1) System.out.print(data.getSymbol(1));
                else if(j == 0 || j == width - 1) System.out.print(data.getSymbol(2));
                else System.out.print(data.getSymbol(0));
            }
            System.out.println();
        }
    }

    public void drawMenu() {
        clearScreen();
        System.out.print(Constants.MENU);

    }

    Render(Data data) {
        this.data = data;
        this.height = data.getHeight();
        this.width = data.getWidth();
        this.gameField = data.getField();
    }
}
