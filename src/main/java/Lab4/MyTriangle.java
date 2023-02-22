package Lab4;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyTriangle extends Shape {
    // Instance Variables
    private int sideLength;
    private Color color;

    // Constructor
    public MyTriangle(int x, int y, int sideLength, Color color) {
        super(x, y, color);
        this.sideLength = sideLength;
    }

    // Method
    public void drawYourself(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillPolygon(new double[]{getX(), getX() - sideLength/2, getX() + sideLength/2},
                new double[]{getY() - sideLength/2, getY() + sideLength/2, getY() + sideLength/2}, 3);
    }
}
