import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Game extends Application {

    @Override
    public void start(Stage primaryStage) {
        CityMap map = new CityMap();
        map.createTile();

        int tileSize = 32;
        int columns = 5;
        int rows = (int) Math.ceil(map.getSize() / (double) columns);

        Canvas canvas = new Canvas(columns * tileSize, rows * tileSize);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        map.render(gc);  // 调用你刚才添加的方法

        Group root = new Group(canvas);
        Scene scene = new Scene(root);
        primaryStage.setTitle("RPG Map Rendering");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
