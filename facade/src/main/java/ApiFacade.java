import java.io.IOException;
import java.net.HttpURLConnection;

public class ApiFacade {
    private final HttpRequestHandler requestHandler = new HttpRequestHandler();
    private final HttpResponseHandler responseHandler = new HttpResponseHandler();
    private final JsonParser jsonParser = new JsonParser();

    public String getAttributeValueFromJson(String urlString, String attributeName)
            throws IllegalArgumentException, IOException {
        HttpURLConnection connection = requestHandler.createGetConnection(urlString);
        String json = responseHandler.getResponseBody(connection);
        return jsonParser.getAttributeValue(json, attributeName);
    }
}
