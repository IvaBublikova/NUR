package nur;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class LogIn extends VBox {
    private TextField emailField= new TextField();
    private Label emailLabel = new Label();
    private Label passwordLabel = new Label();
    private TextField passwordField = new TextField();
    private Button loginButton = new Button("Login");
    private Label infoLabel = new Label("Login successful!");
    Image logo = new Image(getClass().getResourceAsStream("/nur/images/logo.png"));

    public LogIn() {

        ImageView imageView = new ImageView(logo);
        imageView.setFitWidth(150); // Set the width of the ImageView
        imageView.setFitHeight(150);
        HBox hbox = new HBox(imageView);
        hbox.setAlignment(Pos.CENTER); // Set alignment to center
        hbox.setPadding(new Insets(10));


        emailLabel.setText("E-mail: ");
        emailLabel.setStyle("-fx-font-family: 'Calibri Light'; -fx-text-fill: blue");

        emailField.setMaxWidth(150);
        emailField.setAlignment(Pos.CENTER);
        emailField.setStyle("-fx-padding: 15px; -fx-border-color: orange; -fx-border-radius: 5px");

        passwordLabel.setText("Heslo:");
        passwordLabel.setStyle("-fx-font-family: 'Calibri Light'; -fx-text-fill: blue ");

        passwordField.setMaxWidth(150);
        passwordField.setAlignment(Pos.CENTER);
        passwordField.setStyle("-fx-padding: 15px; -fx-border-color: orange; -fx-border-radius: 5px");

        loginButton.setStyle("-fx-background-color: blue; -fx-text-fill: white; -fx-font-size: 16px; -fx-padding: 10px 20px; -fx-border-radius: 5px; -fx-background-radius: 5px");

        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll( emailLabel, emailField, passwordLabel, passwordField, loginButton);
        vBox.setSpacing(12);

        getChildren().addAll(hbox,vBox);
        setStyle("-fx-background-color: orange;");
        setAlignment(Pos.CENTER);
        setSpacing(30);
    }

}
