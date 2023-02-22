package Lab4;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    // Instance Variables
    protected int x;
    protected int y;
    protected Color color;

    // Constructor
    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // Methods
    public abstract void drawYourself(GraphicsContext gc);

    // Getters and Setters for integer x and y
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
