package Lab4;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class PaintSurface extends Canvas {
    private Model myModel;

    public PaintSurface(Model model, double width, double height) {
        super(width, height);
        myModel = model;
        setOnMousePressed(e -> handleMousePress(e.getX(), e.getY()));
    }

    public void clear() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.clearRect(0, 0, getWidth(), getHeight());
        myModel.clear();
    }

    private void handleMousePress(double x, double y) {
        Shape shape = myModel.getCurrentShape();
        if (shape != null) {
            shape = createNewShape(x, y);
            myModel.addShape(shape);
            redraw();
        }
    }

    private Shape createNewShape(double x, double y) {
        Shape shape = myModel.getCurrentShape();
        String shapeClassName = shape.getClass().getSimpleName();

        if (shapeClassName.equals("MyCircle")) {
            shape = new MyCircle((int) x, (int) y, 20, myModel.getCurrentColor());
        } else if (shapeClassName.equals("MySquare")) {
            shape = new MySquare((int) x, (int) y, 40, myModel.getCurrentColor());
        } else if (shapeClassName.equals("MyTriangle")) {
            shape = new MyTriangle((int) x, (int) y, 40, myModel.getCurrentColor());
        }
        return null;
    }

    private void redraw() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.clearRect(0, 0, getWidth(), getHeight());
        for (Shape shape : myModel.getContents()) {
            shape.drawYourself(gc);
        }
    }
}
