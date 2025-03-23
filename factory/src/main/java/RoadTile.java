public class RoadTile implements Tile {
    @Override
    public String getCharacter() {
        return "R";
    }

    @Override
    public String getType() {
        return "road";
    }

    @Override
    public void getDescription() {
        System.out.println("You are on a road. It is dusty and well-traveled.");
    }

    @Override
    public void action() {
        // Do something specific to a road tile
    }
}
