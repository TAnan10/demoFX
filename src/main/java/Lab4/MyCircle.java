package Lab4;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyCircle extends Shape {
    private int radius;

    public MyCircle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void drawYourself(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}