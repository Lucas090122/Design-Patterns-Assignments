import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ChatClientController {
    private String username;
    private ChatMediator mediator;

    @FXML private TextArea chatArea;
    @FXML private TextField messageField;
    @FXML private ComboBox<String> recipientBox;

    public void initialize(String username, ChatMediator mediator) {
        this.username = username;
        this.mediator = mediator;
        ((ChatRoomMediator) mediator).registerClient(this);
        updateRecipients(); // 加载初始用户列表
    }

    public String getUsername() {
        return username;
    }

    public void receiveMessage(String sender, String message) {
        chatArea.appendText(sender + ": " + message + "\n");
    }

    public void updateRecipients() {
        recipientBox.getItems().setAll(((ChatRoomMediator) mediator).getAllUsernames());
        recipientBox.getItems().remove(username);
    }

    @FXML
    private void sendMessage() {
        String recipient = recipientBox.getValue();
        String message = messageField.getText();
        if (recipient != null && !message.isEmpty()) {
            mediator.sendMessage(username, recipient, message);
            chatArea.appendText("Me to " + recipient + ": " + message + "\n");
            messageField.clear();
        }
    }
}
