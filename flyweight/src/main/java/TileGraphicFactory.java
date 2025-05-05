import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private static final Map<String, TileGraphic> graphics = new HashMap<>();

    public static TileGraphic getTileGraphic(String tileType) {
        if (!graphics.containsKey(tileType)) {
            String imagePath = "/images/" + tileType.toLowerCase() + ".png";
            TileGraphic graphic = new TileGraphic(imagePath);
            graphics.put(tileType, graphic);
        }
        return graphics.get(tileType);
    }
}