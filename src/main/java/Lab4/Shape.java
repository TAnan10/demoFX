package Lab4;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    private int x;
    protected int y;
    protected Color myColor;

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.myColor = color;
    }

    public Color getMyColor() {
        return myColor;
    }

    public void setMyColor(Color myColor) {
        this.myColor = myColor;
    }

    public abstract void drawYourself(GraphicsContext gc);

    public int getWidth() {
        return x;
    }

    public int getHeight() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}