package Lab4;

import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class MyCanvas extends Canvas {

    private static MyCanvas instance;
    private GraphicsContext gc;

    private MyCanvas() {
        super(800, 600);
        gc = getGraphicsContext2D();
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, getWidth(), getHeight());
        setOnMousePressed(onMousePressedEventHandler);
        setOnMouseDragged(onMouseDraggedEventHandler);
    }

    public static MyCanvas getInstance() {
        if (instance == null) {
            instance = new MyCanvas();
        }
        return instance;
    }

    private EventHandler<MouseEvent> onMousePressedEventHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            Shape currentShape = Model.getInstance().getCurrentShape();
            currentShape.setX((int) event.getX());
            currentShape.setY((int) event.getY());
            currentShape.setColor(Model.getInstance().getCurrentColor());
            currentShape.drawYourself(gc);
        }
    };

    private EventHandler<MouseEvent> onMouseDraggedEventHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            Shape currentShape = Model.getInstance().getCurrentShape();
            currentShape.setX((int) event.getX());
            currentShape.setY((int) event.getY());
            currentShape.setColor(Model.getInstance().getCurrentColor());
            currentShape.drawYourself(gc);
        }
    };

    public void clear() {
        gc.clearRect(0, 0, getWidth(), getHeight());
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, getWidth(), getHeight());
    }

    public void setShape(Shape shape) {
        Model.getInstance().setShape(shape);
    }
}
