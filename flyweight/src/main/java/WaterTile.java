public class WaterTile implements Tile {
    @Override
    public String getCharacter() {
        return "W";
    }

    @Override
    public String getType() {
        return "water";
    }

    @Override
    public void getDescription() {
        System.out.println("You are in a body of water. It is cold and wet.");
    }

    @Override
    public void action() {
        // Do something specific to a water tile
    }
}
