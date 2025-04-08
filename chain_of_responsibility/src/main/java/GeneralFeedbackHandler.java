public class GeneralFeedbackHandler extends MessageHandler {
    @Override
    protected boolean canHandle(Message message) {
        return message.getType() == MessageType.GENERAL_FEEDBACK;
    }

    @Override
    protected void process(Message message) {
        System.out.println("Analyzing general feedback: " + message.getContent());
    }
}
