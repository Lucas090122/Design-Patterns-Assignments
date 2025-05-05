import java.util.HashMap;
import java.util.Map;

public class ChatRoomMediator implements ChatMediator {
    private Map<String, ChatClientController> clients = new HashMap<>();

    @Override
    public void registerClient(ChatClientController client) {
        clients.put(client.getUsername(), client);
    }

    @Override
    public void sendMessage(String sender, String recipient, String message) {
        ChatClientController receiver = clients.get(recipient);
        if (receiver != null) {
            receiver.receiveMessage(sender, message);
        }
    }

    public String[] getAllUsernames() {
        return clients.keySet().toArray(new String[0]);
    }
}
