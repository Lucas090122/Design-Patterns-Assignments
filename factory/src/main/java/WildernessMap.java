import java.util.ArrayList;
import java.util.Random;

public class WildernessMap extends Map {
    private ArrayList<Tile> wildernessMap;

    public WildernessMap() {
        wildernessMap = new ArrayList<Tile>();
    }

    public void createTile() {
        Random random = new Random();
        int mapSize = random.nextInt(10) + 1;
        for (int i = 0; i < mapSize; i++) {
            int randomInt = random.nextInt(3);
            Tile tile = switch (randomInt) {
                case 0 -> new WaterTile();
                case 1 -> new ForestTile();
                case 2 -> new SwampTile();
                default -> null;
            };
            wildernessMap.add(tile);
        }
    }

    public void display() {
        for (Tile tile : wildernessMap) {
            System.out.print(tile.getCharacter());
        }
    }
}
