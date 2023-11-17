package nur.Displays.buttons;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BackButton extends Button {
    public BackButton() {
        String imagePath = "/nur/images/back.png";

        // Vytvoření obrázku a tlačítka
        Image homeImage = new Image(getClass().getResourceAsStream(imagePath));
        ImageView imageView = new ImageView(homeImage);
        imageView.setFitHeight(80);
        imageView.setFitWidth(80);

        setGraphic(imageView);
        setStyle("-fx-alignment: center");
        setAlignment(Pos.BOTTOM_CENTER);
        setMinHeight(100);
        setMinWidth(100);
    }

}
