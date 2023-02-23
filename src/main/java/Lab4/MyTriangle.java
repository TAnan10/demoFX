package Lab4;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyTriangle extends Shape {
    private int sideLength;

    public MyTriangle(int x, int y, int sideLength, Color color) {
        super(x, y, color);
        this.sideLength = sideLength;
    }

    @Override
    public void drawYourself(GraphicsContext gc) {
        gc.setFill(myColor);
        gc.fillPolygon(new double[]{x, x - sideLength / 2, x + sideLength / 2}, new double[]{y - sideLength / 2, y + sideLength / 2, y + sideLength / 2}, 3);
    }
}