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
        gc.setFill(getMyColor());
        gc.fillPolygon(new double[]{getX(), getX() - sideLength / 2, getX() + sideLength / 2}, new double[]{getY() - sideLength / 2, getY() + sideLength / 2, getY() + sideLength / 2}, 3);
    }
}