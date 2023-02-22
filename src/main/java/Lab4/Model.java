package Lab4;

import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public class Model {
    private Shape[] contents;
    private Shape currentShape;
    private Color currentColor;

    public Model() {
        contents = new Shape[0];
        currentShape = null;
        currentColor = Color.BLACK;
    }

    public void setCurrentColor(Color color) {
        currentColor = color;
    }

    public void setCurrentShape(Shape shape) {
        currentShape = shape;
    }

    public Shape[] getContents() {
        return contents;
    }

    public void clear() {
        contents = new Shape[0];
    }

    public void addShape(double x, double y) {
        Shape newShape = currentShape;
        newShape.setFill(currentColor);
        newShape.setLayoutX(x);
        newShape.setLayoutY(y);
        contents = append(contents, newShape);
    }

    private static Shape[] append(Shape[] arr, Shape element) {
        Shape[] newArr = new Shape[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = element;
        return newArr;
    }
}