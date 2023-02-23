package Lab4;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public abstract class ShapeButton extends Button {
    private Shape myShape;

    public ShapeButton(Shape shape) {
        myShape = shape;
        setGraphic(createShape());
        setOnAction(e -> setShape());
    }

    protected abstract Pane createShape();

    protected abstract void setShape();

    public Shape getMyShape() {
        return myShape;
    }
}


