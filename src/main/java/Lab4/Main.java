package Lab4;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Model model = new Model();

        PaintSurface surface = new PaintSurface(model, 500, 500);
        BottomPanel bottomPanel = new BottomPanel();
        bottomPanel.getClearButton().setOnAction(e -> surface.clear());
        bottomPanel.getExitButton().setOnAction(e -> Platform.exit());
        SidePanel sidePanel = new SidePanel(model);

        BorderPane pane = new BorderPane();
        pane.setCenter(surface);
        pane.setBottom(bottomPanel);
        pane.setRight(sidePanel);
        pane.setPadding(new Insets(10));

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("Paint Program");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
