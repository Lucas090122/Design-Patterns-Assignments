import javafx.scene.image.Image;

public class TileGraphic {
    private final Image image;

    public TileGraphic(String imagePath) {
        this.image = new Image(imagePath);
    }

    public Image getImage() {
        return image;
    }
}