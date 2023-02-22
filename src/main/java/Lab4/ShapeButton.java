package Lab4;

import javafx.scene.control.Button;

public class ShapeButton extends Button {
    private Shape myShape;

    public ShapeButton(Shape shape) {
        myShape = shape;
        setText(shape.getClass().getSimpleName());
        setMinWidth(80);
        setMaxWidth(80);
        setMinHeight(30);
        setMaxHeight(30);
    }

    public Shape getMyShape() {
        return myShape;
    }
}
