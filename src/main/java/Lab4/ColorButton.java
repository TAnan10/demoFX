package Lab4;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class ColorButton extends Button {
    private Color myColor;
    private boolean selected;

    public ColorButton(Color color) {
        myColor = color;
        setStyle("-fx-background-color: #" + color.toString().substring(2, 8));
        setMinWidth(30);
        setMaxWidth(30);
        setMinHeight(30);
        setMaxHeight(30);

        selected = false;
        updateStyle();
    }

    public Color getMyColor() {
        return myColor;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        updateStyle();
    }

    private void updateStyle() {
        if (selected) {
            setStyle("-fx-background-color: #" + myColor.toString().substring(2, 8) + "; -fx-border-color: gray; -fx-border-width: 4px;");
        } else {
            setStyle("-fx-background-color: #" + myColor.toString().substring(2, 8) + ";");
        }
    }
}
