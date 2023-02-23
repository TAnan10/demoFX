package Lab4;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class PaintSurface extends Canvas {
    private Model model;
    private GraphicsContext gc;

    public PaintSurface(Model model, double width, double height) {
        super(width, height);
        this.model = model;
        this.gc = getGraphicsContext2D();

        setOnMousePressed(this::startDrawing);
        setOnMouseDragged(this::draw);
    }

    private void startDrawing(MouseEvent event) {
        gc.beginPath();
        gc.moveTo(event.getX(), event.getY());
        gc.setStroke(model.getCurrentColor());
    }

    private void draw(MouseEvent event) {
        gc.lineTo(event.getX(), event.getY());
        gc.stroke();
    }

    public void clear() {
        gc.clearRect(0, 0, getWidth(), getHeight());
    }
}
