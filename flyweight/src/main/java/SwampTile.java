public class SwampTile implements Tile {
    @Override
    public String getCharacter() {
        return "S";
    }

    @Override
    public String getType() {
        return "swamp";
    }

    @Override
    public void getDescription() {
        System.out.println("You are in a swamp. It is dark and murky.");
    }

    @Override
    public void action() {
        // Do something specific to a swamp tile
    }
}
