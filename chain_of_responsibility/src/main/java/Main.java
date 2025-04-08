public class Main {
    public static void main(String[] args) {
        // 创建责任链
        MessageHandler handlerChain = new CompensationClaimHandler();
        handlerChain.setNextHandler(new ContactRequestHandler());
        handlerChain.nextHandler.setNextHandler(new DevelopmentSuggestionHandler());
        handlerChain.nextHandler.nextHandler.setNextHandler(new GeneralFeedbackHandler());

        // 模拟几条反馈
        Message[] messages = {
                new Message(MessageType.COMPENSATION_CLAIM, "Requesting refund for damaged product.", "alice@example.com"),
                new Message(MessageType.CONTACT_REQUEST, "Please call me regarding my last order.", "bob@example.com"),
                new Message(MessageType.DEVELOPMENT_SUGGESTION, "Add dark mode to the app.", "charlie@example.com"),
                new Message(MessageType.GENERAL_FEEDBACK, "Great service!", "diana@example.com")
        };

        // 发送反馈
        for (Message msg : messages) {
            handlerChain.handle(msg);
            System.out.println("-----");
        }
    }
}
