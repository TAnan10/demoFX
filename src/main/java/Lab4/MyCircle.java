package Lab4;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyCircle extends Shape {
    // Instance Variables
    private int radius;
    private Color color;

    // Constructor
    public MyCircle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    // Method
    public void drawYourself(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillOval(getX() - radius, getY() - radius, radius * 2, radius * 2);
    }
}
