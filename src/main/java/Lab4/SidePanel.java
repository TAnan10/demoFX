package Lab4;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class SidePanel extends VBox {
    private ColorButton[] cButtons;
    private ShapeButton[] sButtons;

    public SidePanel(Model model) {
        setPadding(new Insets(10));
        setSpacing(10);
        setAlignment(Pos.CENTER);

        cButtons = new ColorButton[]{
                new ColorButton(Color.RED),
                new ColorButton(Color.ORANGE),
                new ColorButton(Color.YELLOW),
                new ColorButton(Color.GREEN),
                new ColorButton(Color.BLUE),
                new ColorButton(Color.INDIGO),
                new ColorButton(Color.VIOLET),
                new ColorButton(Color.BLACK)
        };

        Label colorLabel = new Label("Färg");
        colorLabel.setAlignment(Pos.CENTER);
        getChildren().add(colorLabel);

        for (ColorButton button : cButtons) {
            button.setOnAction(e -> {
                model.setColor(button.getMyColor());
            });
            getChildren().add(button);
        }

        Label shapesLabel = new Label("Shapes");
        shapesLabel.setAlignment(Pos.CENTER);
        getChildren().add(shapesLabel);

        sButtons = new ShapeButton[]{
                new ShapeButton(new MyCircle(0, 0, 20, Color.BLACK)),
                new ShapeButton(new MySquare(0, 0, 40, Color.BLACK)),
                new ShapeButton(new MyTriangle(0, 0, 40, Color.BLACK))
        };

        for (ShapeButton button : sButtons) {
            button.setOnAction(e -> {
                model.setShape(button.getMyShape());
                for (ShapeButton b : sButtons) {
                    b.setStyle("-fx-background-color: transparent;");
                }
                button.setStyle("-fx-background-color: lightgray;");
            });
            getChildren().add(button);
        }
    }
}