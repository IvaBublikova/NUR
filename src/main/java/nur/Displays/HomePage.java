package nur.Displays;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class HomePage extends BorderPane {

    private VBox vBox = new VBox(); //levá lišta
    private HBox hBox = new HBox(); // horní lišta
    private HBox main = new HBox(); //vnitřek ...snad

    private VBox body = new VBox(); //abych  mohla dat oba hbox vedle vbox

    private Button settingButton = new Button(); //odkaz na stránku Settings
    private Image setting = new Image(getClass().getResourceAsStream("/nur/images/setting.png"));
    // private Button newProject = new Button(); //odkaz na stránku nového projektu - nakonec asi nebude?
    private Button templates = new Button(); //odkaz na stránku Templates
    private Button preprocess = new Button(); //odkaz na první stránku preprocess
    private Button postprocess = new Button(); //odkaz na první stránku postprocess
    private Label info = new Label(" \n  Name: Dr. Kocourek \n  ID: 55684 \n \n Nemocnice Motol");

    public HomePage() {

        //levá lista
        info.setAlignment(Pos.TOP_CENTER);
        info.setMinHeight(100);
        info.setMinWidth(100);
        info.setStyle("-fx-border-color: grey; -fx-background-color: gray; -fx-text-fill: white; ");

        ImageView image = new ImageView(setting);
        image.setFitHeight(80);
        image.setFitWidth(80);
        image.setStyle("-fx-alignment: center");
        settingButton.setAlignment(Pos.BOTTOM_CENTER);
        settingButton.setGraphic(image);
        settingButton.setMaxWidth(150);
        settingButton.setMaxHeight(150);

        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setMinWidth(100);
        vBox.setSpacing(600);
        vBox.setPrefHeight(1000);
        vBox.getChildren().addAll(info, settingButton);
        vBox.setStyle("-fx-background-color: lightgrey");
        vBox.setFillWidth(true);

        //horni lista
        templates.setAlignment(Pos.CENTER);
        templates.setMinWidth(100);
        templates.setMinHeight(100);
        templates.setText("Choose Template");

        hBox.setAlignment(Pos.TOP_LEFT);
        hBox.setMaxHeight(100);
        hBox.getChildren().addAll(templates);
        hBox.setStyle("-fx-background-color: gray");
        hBox.setFillHeight(true);



        //main
        preprocess.setMinWidth(150);
        preprocess.setMinHeight(100);
        preprocess.setText("Preprocessing");
        preprocess.setAlignment(Pos.CENTER);
        preprocess.setStyle("-fx-background-color: dodgerblue; " +
                "-fx-text-fill: white; " +
                "-fx-font-size: 14px; " +
                "-fx-font-family: 'Calibri'; "+
                "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.6), 10, 0, 0, 0);" +
                "-fx-padding: 10px 20px; " +
                "-fx-border-radius: 5px;");
        preprocess.setOnMouseEntered(e -> preprocess.setStyle("-fx-background-color: lightblue; " +
                "-fx-text-fill: white; " +
                "-fx-font-size: 14px; " +
                "-fx-font-family: 'Calibri'; "+
                "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.6), 10, 0, 0, 0);" +
                "-fx-padding: 10px 20px; " +
                "-fx-border-radius: 5px;"));
        preprocess.setOnMouseExited(e -> preprocess.setStyle("-fx-background-color: dodgerblue; " +
                "-fx-text-fill: white; " +
                "-fx-font-size: 14px; " +
                "-fx-font-family: 'Calibri'; "+
                "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.6), 10, 0, 0, 0);" +
                "-fx-padding: 10px 20px; " +
                "-fx-border-radius: 5px;"));

        postprocess.setMinWidth(150);
        postprocess.setMinHeight(100);
        postprocess.setText("Postprocessing");
        postprocess.setAlignment(Pos.CENTER);
        postprocess.setStyle("-fx-background-color: dodgerblue; " +
                "-fx-text-fill: white; " +
                "-fx-font-size: 14px; " +
                "-fx-padding: 10px 20px; " +
                "-fx-font-family: 'Calibri'; "+
                "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.6), 10, 0, 0, 0);" +
                "-fx-border-radius: 5px;");
        postprocess.setOnMouseEntered(e -> postprocess.setStyle("-fx-background-color: lightblue; " +
                "-fx-text-fill: white; " +
                "-fx-font-size: 14px; " +
                "-fx-padding: 10px 20px; " +
                "-fx-font-family: 'Calibri'; "+
                "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.6), 10, 0, 0, 0);" +
                "-fx-border-radius: 5px;"));
        postprocess.setOnMouseExited(e -> postprocess.setStyle("-fx-background-color: dodgerblue; " +
                "-fx-text-fill: white; " +
                "-fx-font-size: 14px; " +
                "-fx-padding: 10px 20px; " +
                "-fx-font-family: 'Calibri'; "+
                "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.6), 10, 0, 0, 0);" +
                "-fx-border-radius: 5px;"));

        main.getChildren().addAll(preprocess, postprocess);
        main.setAlignment(Pos.CENTER);
        main.setSpacing(50);
        main.setPrefHeight(1000);
        main.setFillHeight(true);
        main.setStyle("-fx-background-color: orange");

        body.getChildren().addAll(hBox, main);

        setLeft(vBox);
        setCenter(body);


    }
}
