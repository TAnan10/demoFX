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

     public Shape getMyShape() {
        return myShape;
    }

    private Canvas createShapeCanvas(Shape shape) {
        Canvas canvas = new Canvas(50, 50);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        double xOffset = (50 - shape.getWidth()) / 2.0;
        double yOffset = (50 - shape.getHeight()) / 2.0;

        gc.setFill(shape.getMyColor());
        gc.translate(xOffset, yOffset);
        shape.drawYourself(gc);

        return canvas;
    }
}

