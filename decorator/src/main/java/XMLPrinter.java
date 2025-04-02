public class XMLPrinter extends BasicPrinter {
    @Override
    public void print(String message) {
        String xmlMessage = "<message>" + message + "</message>";
        System.out.println(xmlMessage);
    }
}
