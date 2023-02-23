package Lab4;

import javafx.scene.Node;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class MySquare extends Shape {
    private int size;

    public MySquare(int x, int y, Color color, int size) {
        super(x, y, color);
        this.size = size;
    }

    @Override
    public void drawYourself(GraphicsContext gc) {
        gc.setFill(getColor());
        gc.setFont(Font.font(50));
        gc.fillRect(x, y, size, size);
    }

    public Node getNode() {
        Rectangle rectangle = new Rectangle(x, y, size, size);
        rectangle.setFill(myColor);
        return rectangle;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }
}
