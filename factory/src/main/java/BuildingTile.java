public class BuildingTile implements Tile {
    @Override
    public String getCharacter() {
        return "B";
    }

    @Override
    public String getType() {
        return "building";
    }

    @Override
    public void getDescription() {
        System.out.println("You are in a building. It is dark and musty.");
    }

    @Override
    public void action() {
        // Do something specific to a building tile
    }
}
