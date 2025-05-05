public interface ChatMediator {
    void sendMessage(String sender, String recipient, String message);
    void registerClient(ChatClientController client);
}
