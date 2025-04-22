public class DocumentProxy implements DocumentInterface {
    private Document realDocument;
    private String id;

    public DocumentProxy(Document realDocument) {
        this.realDocument = realDocument;
        this.id = realDocument.getId();
    }

    @Override
    public String getCreationDate() {
        return realDocument.getCreationDate();
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (AccessControlService.getInstance().isAllowed(user.getUsername(), id)) {
            return realDocument.getContent(user);
        } else {
            throw new AccessDeniedException("Access denied for user " + user.getUsername());
        }
    }
}
