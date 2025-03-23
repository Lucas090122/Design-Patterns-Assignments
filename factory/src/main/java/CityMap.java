import java.util.ArrayList;
import java.util.Random;

public class CityMap extends Map {
    private ArrayList<Tile> cityMap;

    public CityMap() {
        cityMap = new ArrayList<Tile>();
    }

    @Override
    public void createTile() {
        Random random = new Random();
        int mapSize = random.nextInt(10) + 1;
        for (int i = 0; i < mapSize; i++) {
            int randomInt = random.nextInt(3);
            Tile tile = switch (randomInt) {
                case 0 -> new BuildingTile();
                case 1 -> new ForestTile();
                case 2 -> new RoadTile();
                default -> null;
            };
            cityMap.add(tile);
        }
    }

    @Override
    public void display() {
        for (Tile tile : cityMap) {
            System.out.print(tile.getCharacter());
        }
    }
}
