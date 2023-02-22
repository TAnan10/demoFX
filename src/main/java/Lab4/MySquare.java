package Lab4;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MySquare extends Shape {
    // Instance Variables
    private int sideLength;
    private Color color;

    // Constructor
    public MySquare(int x, int y, int sideLength, Color color) {
        super(x, y, color);
        this.sideLength = sideLength;
    }

    // Method
    public void drawYourself(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillRect(getX() - sideLength/2, getY() - sideLength/2, sideLength, sideLength);
    }
}
