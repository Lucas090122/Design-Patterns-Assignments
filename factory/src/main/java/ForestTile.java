public class ForestTile implements Tile {
    @Override
    public String getCharacter() {
        return "F";
    }

    @Override
    public String getType() {
        return "forest";
    }

    @Override
    public void getDescription() {
        System.out.println("You are in a forest. It is lush and green.");
    }

    @Override
    public void action() {
        // Do something specific to a forest tile
    }
}
