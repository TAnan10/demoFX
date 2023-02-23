package Lab4;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class BottomPanel extends HBox {
    private Button clearButton;
    private Button exitButton;

    public BottomPanel() {
        setPadding(new Insets(10));
        setSpacing(10);

        clearButton = new Button("Clear");
        exitButton = new Button("Exit");

        getChildren().addAll(clearButton, exitButton);
    }

    public Button getClearButton() {
        return clearButton;
    }

    public Button getExitButton() {
        return exitButton;
    }
}
