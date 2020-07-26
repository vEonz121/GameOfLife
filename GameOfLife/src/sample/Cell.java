package sample;

import javafx.scene.shape.Rectangle;

public class Cell extends Rectangle {
    int posX;
    int posY;

    //conditions added later

    public Cell(int x, int y,int w,int h){
        setPosX(x);
        setPosY(y);
        setWidth(w);
        setHeight(h);

    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

}
