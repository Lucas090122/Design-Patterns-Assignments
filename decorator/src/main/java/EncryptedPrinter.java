public class EncryptedPrinter extends BasicPrinter{
    @Override
    public void print(String message) {
        String encryptedMessage = encrypt(message);
        System.out.println(encryptedMessage);
    }

    private String encrypt(String message) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            encrypted.append((char) (c + 1));
        }
        return encrypted.toString();
    }
}
