public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addUnprotectedDocument("doc1", "2024-01-01", "Public content");
        lib.addProtectedDocument("doc2", "2024-02-01", "Secret content");

        User alice = new User("alice");
        User bob = new User("bob");

        AccessControlService.getInstance().allowAccess("alice", "doc2");

        try {
            System.out.println(lib.getDocument("doc1").getContent(bob));
            System.out.println(lib.getDocument("doc2").getContent(alice));
            System.out.println(lib.getDocument("doc2").getContent(bob));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
