package Lab4;

import javafx.scene.paint.Color;

public class Model {
    private Shape currentShape;
    private Color currentColor;
    private Shape[] contents;

    private static final Model INSTANCE = new Model();

    public Model() {
        contents = new Shape[0];
    }

    public static Model getInstance() {
        return INSTANCE;
    }

    public void setColor(Color color) {
        currentColor = color;
    }

    public void setShape(Shape shape) {
        currentShape = shape;
    }

    public Shape getCurrentShape() {
        return currentShape;
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public Shape[] getContents() {
        return contents;
    }

    public void addShape(Shape shape) {
        Shape[] newContents = new Shape[contents.length + 1];
        for (int i = 0; i < contents.length; i++) {
            newContents[i] = contents[i];
        }
        newContents[contents.length] = shape;
        contents = newContents;
    }

    public void clear() {
        contents = new Shape[0];
    }
}
