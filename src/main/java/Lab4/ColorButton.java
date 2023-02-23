package Lab4;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class ColorButton extends Button {
    private Color myColor;

    public ColorButton(Color color) {
        myColor = color;
        setStyle("-fx-background-color: #" + color.toString().substring(2, 8));
        setMinWidth(30);
        setMaxWidth(30);
        setMinHeight(30);
        setMaxHeight(30);
    }

    public Color getMyColor() {
        return myColor;
    }
}