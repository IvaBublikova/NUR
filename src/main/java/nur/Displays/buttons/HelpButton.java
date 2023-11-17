package nur.Displays.buttons;

import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelpButton extends Button {

    public HelpButton(String tooltipText) {
        String imagePath = "/nur/images/help.png";

        // Vytvoření obrázku a tlačítka
        Image helpImage = new Image(getClass().getResourceAsStream(imagePath));
        ImageView imageView = new ImageView(helpImage);
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);

        setGraphic(imageView);
        setStyle("-fx-background-radius: 100%; -fx-max-width: 30px; -fx-max-height: 30px;");

        // Přidání tooltipu
        Tooltip tooltip = new Tooltip(tooltipText);
        Tooltip.install(this, tooltip);
    }
}