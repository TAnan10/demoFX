package Lab4;

import javafx.scene.Node;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public class MyCircle extends Shape {
    private int radius;
    private static Color myColor;
    private static int x;
    private static int y;

    public MyCircle(int x, int y, Color color, int radius) {
        super(x, y, color);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Color getMyColor() {
        return myColor;
    }

    @Override
    public void drawYourself(GraphicsContext gc) {
        gc.setFill(getMyColor());
        gc.setFont(Font.font(50));
        gc.fillOval(getX() - radius, getY() - radius, radius * 2, radius * 2);
    }

    @Override
    public void setX(double x) {

    }

    @Override
    public void setY(double y) {

    }

    public Node getNode() {
        return new Circle(radius, myColor);
    }

    public static class CircleButton extends ShapeButton {
        public CircleButton(MyCircle circle) {
            super(circle);
        }

        @Override
        protected Pane createShape() {
            MyCircle circle = (MyCircle) getMyShape();
            Circle graphic = new Circle(20);
            graphic.setFill(circle.getMyColor());
            return new Pane(graphic);
        }

        @Override
        protected void setShape() {
            MyCircle circle = (MyCircle) getMyShape();
            MyCanvas.getInstance().setShape(circle);
        }
    }
}
