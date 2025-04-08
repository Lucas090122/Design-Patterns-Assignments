public class ContactRequestHandler extends MessageHandler {
    @Override
    protected boolean canHandle(Message message) {
        return message.getType() == MessageType.CONTACT_REQUEST;
    }

    @Override
    protected void process(Message message) {
        System.out.println("Forwarding contact request to customer service: " + message.getContent());
    }
}
