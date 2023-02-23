package Lab4;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
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

        for (ColorButton button : cButtons) {
            button.setOnAction(e -> model.setColor(button.getMyColor()));
            getChildren().add(button);
        }

        sButtons = new ShapeButton[]{
                new ShapeButton(new MyCircle(0, 0, 20, Color.BLACK)),
                new ShapeButton(new MySquare(0, 0, 40, Color.BLACK)),
                new ShapeButton(new MyTriangle(0, 0, 40, Color.BLACK))
        };

        for (ShapeButton button : sButtons) {
            button.setOnAction(e -> model.setShape(button.getMyShape()));
            getChildren().add(button);
        }
    }
}
