package Lab4;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    protected int x;
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
}