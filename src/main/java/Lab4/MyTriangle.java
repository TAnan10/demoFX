package Lab4;

import javafx.scene.Node;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;

public class MyTriangle extends Shape {
    private int size;

    public MyTriangle(double x, double y, Color color, int size) {
        super(x, y, color);
        this.size = size;
    }

    @Override
    public void drawYourself(GraphicsContext gc) {
        gc.setFill(myColor);
        gc.setFont(Font.font(50));
        gc.fillPolygon(new double[]{x, x + size, x + size / 2.0},
                new double[]{y, y, y - size * Math.sqrt(3) / 2.0},
                3);
    }

    public Node getNode() {
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(
                x, y,
                x + size, y,
                x + size / 2.0, y - size * Math.sqrt(3) / 2.0
        );
        polygon.setFill(myColor);
        return polygon;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }
}