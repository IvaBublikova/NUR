package nur.nur_2.Displays;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Templates extends BorderPane {
    private VBox vBox = new VBox();
    private HBox hBox = new HBox();
    private HBox main = new HBox();
    private VBox body = new VBox();

    private Button settingButton = new Button(); //odkaz na stránku Settings
    private Image setting = new Image(getClass().getResourceAsStream("/nur/nur_2/images/setting.png"));
    private Button backButton = new Button(); //odkaz na homePage
    private Image back = new Image(getClass().getResourceAsStream("/nur/nur_2/images/back.png"));

    private Label info = new Label(" \n  Name: Dr. Kocourek \n  ID: 55684 \n \n Nemocnice Motol");

    private Label chooseSablony = new Label("Choose a template: ");
    ListView<String> sablony = new ListView<>();

    private Button chooseButton = new Button("CHOOSE");  //odkáze přímo na první okno preprcessingu
    private GridPane grid = new GridPane();

    public Templates(){
        //levá lista
        info.setAlignment(Pos.TOP_CENTER);
        info.setMinHeight(100);
        info.setMinWidth(100);
        info.setStyle("-fx-border-color: grey; -fx-background-color: gray; -fx-text-fill: white; ");

        ImageView imageSett = new ImageView(setting);
        imageSett.setFitHeight(80);
        imageSett.setFitWidth(80);
        imageSett.setStyle("-fx-alignment: center");
        settingButton.setAlignment(Pos.BOTTOM_CENTER);
        settingButton.setGraphic(imageSett);
        settingButton.setMaxWidth(150);
        settingButton.setMaxHeight(150);

        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setMinWidth(100);
        vBox.setSpacing(600);
        vBox.setPrefHeight(1000);
        vBox.getChildren().addAll(info, settingButton);
        vBox.setStyle("-fx-background-color: lightgrey");
        vBox.setFillWidth(true);

        //horní lista
        ImageView imageBack = new ImageView(back);
        imageBack.setFitHeight(80);
        imageBack.setFitWidth(80);
        imageSett.setStyle("-fx-alignment: center");
        backButton.setAlignment(Pos.BOTTOM_CENTER);
        backButton.setGraphic(imageBack);
        backButton.setMinHeight(100);
        backButton.setMinWidth(100);

        hBox.setAlignment(Pos.TOP_LEFT);
        hBox.setMaxHeight(100);
        hBox.setSpacing(650);
        hBox.getChildren().addAll(backButton);
        hBox.setStyle("-fx-background-color: gray");
        hBox.setFillHeight(true);


        //main
        ObservableList<String> items = FXCollections.observableArrayList(
                "Sablona 1", "Sablona 2", "Sablona 3", "Sablona 4");
        sablony.setPrefSize(190, 125);
        sablony.setItems(items);


        chooseSablony.setAlignment(Pos.CENTER);
        chooseSablony.setMinHeight(30);
        chooseSablony.setStyle("-fx-text-fill: white;-fx-font-size: 20px; ");

        chooseButton.setPrefWidth(90);

        grid.setAlignment(Pos.CENTER);
        grid.setVgap(50);
        grid.setHgap(20);
        grid.add(chooseSablony, 0, 0);
        grid.add(sablony, 0, 1);
        grid.add(chooseButton, 1, 2);


        main.getChildren().addAll(grid);
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
