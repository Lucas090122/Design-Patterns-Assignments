public class Main {
    public static void main(String[] args) {
        Printer Printer = new BasicPrinter();
        Printer.print("Hello, World!");

        Printer Printer2 = new XMLPrinter();
        Printer2.print("Hello, XML!");

        Printer Printer3 = new EncryptedPrinter();
        Printer3.print("Hello, Encrypted World!");
    }
}
