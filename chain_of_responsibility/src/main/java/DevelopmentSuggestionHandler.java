public class DevelopmentSuggestionHandler extends MessageHandler {
    @Override
    protected boolean canHandle(Message message) {
        return message.getType() == MessageType.DEVELOPMENT_SUGGESTION;
    }

    @Override
    protected void process(Message message) {
        System.out.println("Logging development suggestion: " + message.getContent());
    }
}
