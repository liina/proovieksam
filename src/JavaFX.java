import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista ring, mille suurust saab kasutaja Slideriga muuta
 */
public class JavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        int x = 30;
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);
        Slider slider = new Slider();
        slider.setMin(10);
        slider.setMax(300);
        slider.setValue(x);
        Circle ring = new Circle(x);
        slider.valueProperty().addListener((observable, vanaVaartus, uusVaartus) -> {
            ring.setRadius(uusVaartus.intValue());
        });

        stack.getChildren().addAll(ring,slider);

        primaryStage.show();
    }
}
