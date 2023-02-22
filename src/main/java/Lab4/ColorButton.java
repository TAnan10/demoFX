package Lab4;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class ColorButton extends Button {
    private Color myColor;

    public ColorButton(Color color) {
        super();
        myColor = color;
        setPrefSize(50, 50);
        setStyle("-fx-background-color: #" + myColor.toString().substring(2, 8) + ";");
    }

    public Color getMyColor() {
        return myColor;
    }
}