package Lab4;

import javafx.scene.Node;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    protected double x;
    protected double y;
    protected Color myColor;

    public Shape(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        this.myColor = color;
    }

    public abstract void drawYourself(GraphicsContext gc);

    public abstract Node getNode();

    public abstract void setX(double x);

    public abstract void setY(double y);

    public void setColor(Color color) {
        this.myColor = color;
    }

    protected Color getColor() {
        return myColor;
    }
}