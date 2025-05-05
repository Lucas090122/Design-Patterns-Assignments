import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChatAppLauncher extends Application {
    private ChatRoomMediator mediator = new ChatRoomMediator();

    @Override
    public void start(Stage primaryStage) throws Exception {
        launchClient("Alice");
        launchClient("Bob");
        launchClient("Charlie");
    }

    private void launchClient(String username) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ChatClient.fxml"));
        Scene scene = new Scene(loader.load());
        ChatClientController controller = loader.getController();
        controller.initialize(username, mediator);
        Stage stage = new Stage();
        stage.setTitle("Chat - " + username);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
