import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

public class HttpRequestHandler {
    public HttpURLConnection createGetConnection(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        return con;
    }
}
