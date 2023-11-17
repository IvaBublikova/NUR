package nur.Displays;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import nur.Displays.buttons.BackButton;
import nur.Displays.buttons.SettingButton;

public class Settings extends BorderPane {
    private VBox vBox = new VBox(); //levá lišta
    private HBox hBox = new HBox(); // horní lišta
    private HBox main = new HBox(); //vnitřek

    private VBox body = new VBox(); //abych  mohla dat oba hbox vedle vbox

    private SettingButton settingButton = new SettingButton();
    private BackButton backButton = new BackButton();

    private Label info = new Label(" \n  Name: Dr. Kocourek \n  ID: 55684 \n \n Nemocnice Motol");
    private Label delSablony = new Label("Choose a template for deleting: ");
    ListView<String> sablony = new ListView<>();
    private Label workDirL = new Label("Select a path to image directory: ");  //-------- za mě takhle stačí, asi bych se nedělala s průzkumníkem souborů
    private TextField workDir = new TextField();
    private Label atlasDirL = new Label("Select a path to atlas directory: ");
    private TextField atlasDir = new TextField();
    private Label passL = new Label("Change a password: ");
    private TextField pass = new TextField();

    private GridPane grid = new GridPane();
    private Button saveButton = new Button("SAVE");  //mohl by hodit nějakou hlásku, "uspěšně ulozeno" apod
    public Settings(){
        //levá lista
        info.setAlignment(Pos.TOP_CENTER);
        info.setMinHeight(100);
        info.setMinWidth(100);
        info.setStyle("-fx-border-color: grey; -fx-background-color: gray; -fx-text-fill: white; ");

        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setMinWidth(100);
        vBox.setSpacing(600);
        vBox.setPrefHeight(1000);
        vBox.getChildren().addAll(info, settingButton);
        vBox.setStyle("-fx-background-color: lightgrey");
        vBox.setFillWidth(true);

        //horní lista
        hBox.setAlignment(Pos.TOP_LEFT);
        hBox.setMaxHeight(100);
        hBox.setSpacing(650);
        hBox.getChildren().addAll(backButton);
        hBox.setStyle("-fx-background-color: gray");
        hBox.setFillHeight(true);


        //main
        //pro popisky
        workDirL.setAlignment(Pos.CENTER);
        workDirL.setMinHeight(20);
        workDirL.setStyle(" -fx-text-fill: white; -fx-font-size: 17px;");

        atlasDirL.setAlignment(Pos.CENTER);
        atlasDirL.setMinHeight(20);
        atlasDirL.setStyle("-fx-text-fill: white;-fx-font-size: 17px; ");

        passL.setAlignment(Pos.CENTER);
        passL.setMinHeight(10);
        passL.setStyle("-fx-text-fill: white; -fx-font-size: 17px;");

        delSablony.setAlignment(Pos.CENTER);
        delSablony.setMinHeight(50);
        delSablony.setStyle("-fx-text-fill: white; -fx-font-size: 17px;");

        //pro pole

        workDir.setAlignment(Pos.CENTER);
        workDir.setMinWidth(100);
        workDir.setMinHeight(15);

        atlasDir.setAlignment(Pos.CENTER);
        atlasDir.setMinWidth(100);
        atlasDir.setMinHeight(15);

        pass.setAlignment(Pos.CENTER);
        pass.setMinWidth(100);
        pass.setMinHeight(10);

        ComboBox<String> sablony = new ComboBox<>();
        ObservableList<String> items = FXCollections.observableArrayList(
                "Sablona 1", "Sablona 2", "Sablona 3", "Sablona 4");
        sablony.setItems(items);
        sablony.setPrefSize(150, 30);

        // Apply custom styles using setStyle method
        sablony.setStyle("-fx-background-color: #f0f0f0; " +
                "-fx-border-color: #999999; " +
                "-fx-border-radius: 5;");
        sablony.setOnHiding(event -> sablony.setStyle("-fx-background-color: lightblue; " +
                "-fx-border-color: #999999;"));


        saveButton.setPrefWidth(80);
        saveButton.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 14px; -fx-padding: 10px 20px; -fx-border-radius: 5px;");
        saveButton.setOnMouseEntered(e -> saveButton.setStyle("-fx-background-color: lightblue; -fx-text-fill: white; -fx-font-size: 14px; -fx-padding: 10px 20px; -fx-border-radius: 5px;"));
        saveButton.setOnMouseExited(e -> saveButton.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 14px; -fx-padding: 10px 20px; -fx-border-radius: 5px;"));

        grid.setAlignment(Pos.CENTER);
        grid.add(workDirL, 0,0);
        grid.add(workDir, 1, 0);
        grid.add(atlasDirL, 0, 1);
        grid.add(atlasDir, 1, 1);
        grid.add(passL, 0, 2);
        grid.add(pass, 1, 2);
        grid.add(delSablony, 0, 3);
        grid.add(sablony, 1, 3);
        grid.add(saveButton, 2, 5);
        grid.setVgap(50);
        grid.setHgap(20);

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
