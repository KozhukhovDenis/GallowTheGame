package org.example;

public class Render {
    private final int height;
    private final int width;

    Data data;

    private void clearScreen() {
        System.out.print("\033[H\033[J");
    }

    public void drawField() {
        clearScreen();
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                System.out.print(data.getFieldPole(i, j));
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
    }
}
