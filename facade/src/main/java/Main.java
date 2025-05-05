public class Main {
    public static void main(String[] args) {
        ApiFacade apiFacade = new ApiFacade();

        // 示例 1：Chuck Norris 笑话
        try {
            String joke = apiFacade.getAttributeValueFromJson(
                    "https://api.chucknorris.io/jokes/random", "value");
            System.out.println("Chuck Norris joke: " + joke);
        } catch (Exception e) {
            System.err.println("Error fetching joke: " + e.getMessage());
        }

        // 示例 2：汇率（你可以替换成任何返回 JSON 的公共 API）
        try {
            String base = apiFacade.getAttributeValueFromJson(
                    "https://open.er-api.com/v6/latest/USD", "base_code");
            System.out.println("Base currency: " + base);
        } catch (Exception e) {
            System.err.println("Error fetching exchange rate info: " + e.getMessage());
        }
    }
}
