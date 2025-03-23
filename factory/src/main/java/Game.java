import java.util.Random;

public class Game {
    private MapType mapType;

    public Game(MapType mapType) {
        this.mapType = mapType;
    }

    public void createMap() {
        Map map = switch (mapType) {
            case CITY -> new CityMap();
            case WILDERNESS -> new WildernessMap();
        };
        map.createTile();
        map.display();
    }

    public static void main(String[] args) {
        MapType[] mapTypes = MapType.values();
        Random random = new Random();
        MapType mapType = mapTypes[random.nextInt(mapTypes.length)];

        Game game = new Game(mapType);
        game.createMap();
    }
}
