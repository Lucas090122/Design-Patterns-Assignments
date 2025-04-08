public abstract class MessageHandler {
    protected MessageHandler nextHandler;

    public void setNextHandler(MessageHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Message message) {
        if (canHandle(message)) {
            process(message);
        } else if (nextHandler != null) {
            nextHandler.handle(message);
        } else {
            System.out.println("Unhandled message: " + message.getContent());
        }
    }

    protected abstract boolean canHandle(Message message);
    protected abstract void process(Message message);
}
