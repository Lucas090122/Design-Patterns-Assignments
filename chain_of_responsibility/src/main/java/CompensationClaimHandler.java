public class CompensationClaimHandler extends MessageHandler {
    @Override
    protected boolean canHandle(Message message) {
        return message.getType() == MessageType.COMPENSATION_CLAIM;
    }

    @Override
    protected void process(Message message) {
        System.out.println("Processing compensation claim: " + message.getContent());
        System.out.println("Result: Approved. Notification sent to " + message.getSenderEmail());
    }
}
