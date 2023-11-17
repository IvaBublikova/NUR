package nur.Displays.pre;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import nur.Displays.buttons.BackButton;
import nur.Displays.buttons.HomeButton;
import nur.Displays.buttons.SettingButton;

public class C_Save extends BorderPane {
    private VBox vBox = new VBox(); //levá lišta
    private HBox hBox = new HBox(); // horní lišta
    private HBox main = new HBox(); //vnitřek
    private VBox body = new VBox(); //abych  mohla dat oba hbox vedle vbox
    private SettingButton settingButton = new SettingButton();
    private BackButton backButton = new BackButton();
    private HomeButton homeButton = new HomeButton();
    private Label info = new Label(" \n  Name: Dr. Kocourek \n  ID: 55684 \n \n Nemocnice Motol");
    private Label t2dwi = new Label(" IMG type ");
    private Label preprocess = new Label(" PREPROCESING ");
    private Label choose = new Label(" Choose IMG ");
    private Label fce = new Label(" Application \n of functions ");
    private Label output = new Label(" Save output ");
    private GridPane grid = new GridPane();
    private Label imgDirL = new Label("Select a directory to save image* : ");  //-asi bych se nedělala s průzkumníkem souborů,, NĚJAK NAZNAČIT MANDATORY
    private TextField imgDir = new TextField();
    private Label templDirL = new Label("Do you want to save as template? ");
    private CheckBox checkBox = new CheckBox("Yes please.");
    private Label dirL = new Label("How would you like to save it? ");
    private TextField tempDir = new TextField();  //pokud by to šlo, udělat to zašedivělé a zkativovat po zaškrtnutí checkbox
    private Button saveButton = new Button("SAVE");  //mohl by hodit nějakou hlásku, "uspěšně ulozeno" apod, odkáže na homwpage

    public C_Save(){
        //levá lista
        info.setAlignment(Pos.TOP_CENTER);
        info.setMinHeight(100);
        info.setMinWidth(100);
        info.setStyle("-fx-border-color: grey; -fx-background-color: gray; -fx-text-fill: white; ");

        t2dwi.setAlignment(Pos.CENTER);
        t2dwi.setMinHeight(80);
        t2dwi.setMinWidth(110);
        t2dwi.setPrefWidth(110);
        t2dwi.setStyle("-fx-font-size: 18px; " +
                "-fx-font-weight: bold; " +
                "-fx-text-fill: lightgrey; " +
                "-fx-background-color: mediumseagreen; " +
                "-fx-border-radius: 5px;");

        choose.setAlignment(Pos.CENTER);
        choose.setMinHeight(80);
        choose.setStyle("-fx-font-size: 18px; " +
                "-fx-font-weight: bold; " +
                "-fx-text-fill: lightgrey; " +
                "-fx-background-color: mediumseagreen; " +
                "-fx-border-radius: 5px;");

        fce.setAlignment(Pos.CENTER);
        fce.setMinHeight(80);
        fce.setStyle("-fx-font-size: 18px; " +
                "-fx-font-weight: bold; " +
                "-fx-text-fill: lightgrey; " +
                "-fx-background-color: mediumseagreen; " +
                "-fx-border-radius: 5px;");

        output.setAlignment(Pos.CENTER);
        output.setMinHeight(80);
        output.setStyle("-fx-font-size: 18px; " +
                "-fx-font-weight: bold; " +
                "-fx-text-fill: lightgrey; " +
                "-fx-background-color: dodgerblue; " +
                "-fx-border-radius: 5px;");

        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setMinWidth(100);
        vBox.setSpacing(50);
        vBox.setPrefHeight(1000);
        vBox.getChildren().addAll(info, t2dwi,  choose, fce, output, settingButton);
        vBox.setStyle("-fx-background-color: lightgrey");
        vBox.setFillWidth(true);

        //horní lista

        preprocess.setAlignment(Pos.CENTER);
        preprocess.setMinWidth(150);
        preprocess.setStyle(("-fx-font-size: 22px; " +
                "-fx-font-weight: bold; " +
                "-fx-text-fill: lightgrey; " +
                "-fx-background-color: grey; " +
                "-fx-padding: 10px; " +
                "-fx-border-radius: 5px;"));

        hBox.setAlignment(Pos.CENTER_LEFT);
        hBox.setMaxHeight(100);
        hBox.setSpacing(185);
        hBox.getChildren().addAll(backButton, preprocess, homeButton);
        hBox.setStyle("-fx-background-color: gray");
        hBox.setFillHeight(true);


        //main

        imgDirL.setAlignment(Pos.CENTER);
        imgDirL.setMinHeight(20);
        imgDirL.setStyle(" -fx-text-fill: white; -fx-font-size: 17px;");

        imgDir.setAlignment(Pos.CENTER);
        imgDir.setMinWidth(100);
        imgDir.setMinHeight(15);

        templDirL.setAlignment(Pos.CENTER);
        templDirL.setMinHeight(20);
        templDirL.setStyle(" -fx-text-fill: white; -fx-font-size: 17px;");

        dirL.setAlignment(Pos.CENTER);
        dirL.setMinHeight(20);
        dirL.setStyle(" -fx-text-fill: white; -fx-font-size: 17px;");

        saveButton.setPrefWidth(50);
        saveButton.setPrefWidth(80);
        saveButton.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 14px; -fx-padding: 10px 20px; -fx-border-radius: 5px;");
        saveButton.setOnMouseEntered(e -> saveButton.setStyle("-fx-background-color: lightblue; -fx-text-fill: white; -fx-font-size: 14px; -fx-padding: 10px 20px; -fx-border-radius: 5px;"));
        saveButton.setOnMouseExited(e -> saveButton.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 14px; -fx-padding: 10px 20px; -fx-border-radius: 5px;"));

        grid.setAlignment(Pos.CENTER);
        grid.setVgap(50);
        grid.setHgap(20);
        grid.add(imgDirL, 0,0);
        grid.add(imgDir, 1, 0);
        grid.add(templDirL, 0, 1);
        grid.add(checkBox, 1, 1);
        grid.add(dirL, 0, 2);
        grid.add(tempDir, 1, 2);
        grid.add(saveButton, 2, 5);
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
