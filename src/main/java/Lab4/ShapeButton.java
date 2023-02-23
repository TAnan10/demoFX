package Lab4;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;

public class ShapeButton extends Button {
    private Shape myShape;

    public ShapeButton(Shape shape) {
        super();
        myShape = shape;
        setPrefSize(50, 50);
        setGraphic(createShapeCanvas(shape));
    }

    private Canvas createShapeCanvas(Shape shape) {
        Canvas canvas = new Canvas(50, 50);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(shape.getMyColor());

        if (shape instanceof MyCircle) {
            gc.fillOval(5, 5, 40, 40);
        } else if (shape instanceof MySquare) {
            gc.fillRect(5, 5, 40, 40);
        } else if (shape instanceof MyTriangle) {
            double[] xPoints = {25, 5, 45};
            double[] yPoints = {5, 45, 45};
            gc.fillPolygon(xPoints, yPoints, 3);
        }

        return canvas;
    }

    public Shape getMyShape() {
        return myShape;
    }
}
