package Lab4;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MySquare extends Shape {
    private int sideLength;

    public MySquare(int x, int y, int sideLength, Color color) {
        super(x, y, color);
        this.sideLength = sideLength;
    }

    @Override
    public void drawYourself(GraphicsContext gc) {
        gc.setFill(myColor);
        gc.fillRect(x - sideLength/2, y - sideLength/2, sideLength, sideLength);
    }
}