import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParser {
    public String getAttributeValue(String jsonString, String attributeName) throws IllegalArgumentException {
        try {
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(jsonString);

            Object value = obj.get(attributeName);
            if (value == null) {
                throw new IllegalArgumentException("Attribute '" + attributeName + "' not found in JSON.");
            }
            return value.toString();
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid JSON format.", e);
        }
    }
}
