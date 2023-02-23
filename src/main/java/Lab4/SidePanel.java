package Lab4;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class SidePanel extends VBox {
    private Color[] colors = {
            Color.RED,
            Color.ORANGE,
            Color.YELLOW,
            Color.GREEN,
            Color.BLUE,
            Color.INDIGO,
            Color.VIOLET,
            Color.BLACK
    };
    private Shape[] shapes = {
            new MyCircle(0, 0, Color.GREEN, 50),
            new MySquare(0, 0, Color.GREEN, 50),
            new MyTriangle(0, 0, Color.INDIGO, 50)
    };

    public SidePanel(Model model) {
        setPadding(new Insets(10));
        setSpacing(10);
        setAlignment(Pos.CENTER);

        for (Color color : colors) {
            Button button = new Button();
            button.setPrefSize(40, 40);
            button.setStyle("-fx-background-color: " + toRGBCode(color) + ";");
            button.setOnAction(e -> model.setColor(color));
            getChildren().add(button);
        }

        for (Shape shape : shapes) {
            Button button = new Button();
            button.setPrefSize(40, 40);
            button.setGraphic(shape.getNode());
            button.setOnAction(e -> model.setShape(shape));
            getChildren().add(button);
        }
    }

    private static String toRGBCode(Color color) {
        return String.format("#%02X%02X%02X",
                (int) (color.getRed() * 255),
                (int) (color.getGreen() * 255),
                (int) (color.getBlue() * 255));
    }
}
