package nur.Displays.pre;

import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import nur.Displays.buttons.BackButton;
import nur.Displays.buttons.HelpButton;
import nur.Displays.buttons.HomeButton;
import nur.Displays.buttons.SettingButton;

import java.util.Objects;

public class B_Functions extends BorderPane {
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

    private Label checkuseL = new Label("Do you want to use it?");
    private CheckBox chcekFSLmaths = new CheckBox();
    private CheckBox chcekBet = new CheckBox();
    private CheckBox chcekEddy = new CheckBox();
    private CheckBox chcekFast = new CheckBox();
    private CheckBox chcekApplyTopUp = new CheckBox();

    private Label funcnameL = new Label("Function: ");
    private Label fslmathsL = new Label(" FSLMaths ");
    private Label betL = new Label( " BET ");
    private Label eddyL = new Label(" EDDY ");
    private Label fastL = new Label(" FAST ");
    private Label applyTopUpL = new Label(" ApplyTopUp ");

    private Label helpL = new Label("Help: ");
    private Image help = new Image(getClass().getResourceAsStream("/nur/nur_2/images/help.png"));
    private HelpButton buttonFSLmaths = new HelpButton("Tool tip for FSL");
    private HelpButton buttonBet = new HelpButton("Tool tip for Bet");
    private HelpButton buttonFEddy = new HelpButton("Tool tip for Eddy");
    private HelpButton buttonFast = new HelpButton("Tool tip for Fast" );
    private HelpButton buttonApplyTopUp = new HelpButton("Tool tip for ApplyTopUp");

    private Label paramL = new Label("Parameters: ");
    ////není hotovo
    private TextField fsl = new TextField();
    private TextField bet = new TextField();
    private TextField eddy = new TextField();
    private TextField fast = new TextField();
    private TextField applytopup = new TextField();

    private Label doneL = new Label("Status: ");  //nejdříve bude šedivý a podkliknutí startButton by zezelenali s casovou prodlevou??
    private CheckBox doneFSLmaths = new CheckBox();
    private CheckBox doneBet = new CheckBox();
    private CheckBox doneEddy = new CheckBox();
    private CheckBox doneFast = new CheckBox();
    private CheckBox doneApplyTopUp = new CheckBox();


    public B_Functions(){
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
                "-fx-background-color: dodgerblue; " +
                "-fx-border-radius: 5px;");

        output.setAlignment(Pos.CENTER);
        output.setMinHeight(80);
        output.setStyle("-fx-font-size: 18px; " +
                "-fx-font-weight: bold; " +
                "-fx-text-fill: lightgrey; " +
                "-fx-background-color: indianred; " +
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

        ////checkbox
        checkuseL.setStyle(" -fx-text-fill: white; -fx-font-size: 17px;-fx-max-width: 180px;");

        ///nazev
        funcnameL.setStyle(" -fx-text-fill: white; -fx-font-size: 17px;-fx-max-width: 150px;-fx-font-family: 'Calibri'; ");
        fslmathsL.setStyle(" -fx-text-fill: white; -fx-font-size: 14px;-fx-max-width: 90px;-fx-font-family: 'Calibri'; ");
        betL.setStyle(" -fx-text-fill: white; -fx-font-size: 14px;-fx-max-width: 90px;-fx-font-family: 'Calibri'; ");
        fastL.setStyle(" -fx-text-fill: white; -fx-font-size: 14px;-fx-max-width: 90px;-fx-font-family: 'Calibri'; ");
        applyTopUpL.setStyle(" -fx-text-fill: white; -fx-font-size: 14px;-fx-max-width: 90px;-fx-font-family: 'Calibri'; ");
        eddyL.setStyle(" -fx-text-fill: white; -fx-font-size: 14px;-fx-max-width: 90px;-fx-font-family: 'Calibri'; ");

        ///help
        helpL.setStyle(" -fx-text-fill: white; -fx-font-size: 17px;-fx-max-width: 150px;");


        ////Param
        paramL.setStyle(" -fx-text-fill: white; -fx-font-size: 17px;-fx-max-width: 150px;");
        //musí se ještě dodělat
        bet.setStyle("-fx-max-width: 50px;");
        fast.setStyle("-fx-max-width: 50px;");
        eddy.setStyle("-fx-max-width: 50px;");
        applytopup.setStyle("-fx-max-width: 50px;");
        fsl.setStyle("-fx-max-width: 50px;");

        ////Done?
        doneL.setStyle(" -fx-text-fill: gray; -fx-font-size: 17px;-fx-max-width: 150px;");

        grid.setAlignment(Pos.CENTER);
        grid.setVgap(20);
        grid.setHgap(30);
        grid.addRow(0, checkuseL, funcnameL, helpL, paramL, doneL);
        grid.addRow( 1, chcekFSLmaths, fslmathsL, buttonFSLmaths, fsl, doneFSLmaths);
        grid.addRow( 2, chcekBet, betL, buttonBet, bet, doneBet);
        grid.addRow( 3, chcekFast, fastL, buttonFast, fast, doneFast);
        grid.addRow( 4, chcekEddy, eddyL, buttonFEddy, eddy, doneEddy);
        grid.addRow( 5, chcekApplyTopUp, applyTopUpL, buttonApplyTopUp, applytopup, doneApplyTopUp);
        grid.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/nur/nur_2/styles/grid-pane.css")).toExternalForm());




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

/*

        grid.add(checkuseL, 0, 0);
        grid.add(funcnameL, 1, 0);
        grid.add(helpL, 2, 0);
        grid.add(paramL, 3, 0);
        grid.add(doneL, 4, 0);

        grid.add(chcekFSLmaths, 0, 1);
        grid.add(fslmathsL, 1, 1);
        grid.add(buttonFSLmaths, 2, 1);
        //grid.add();
        grid.add(doneFSLmaths, 4, 1);

        grid.add(chcekBet, 0, 2);
        grid.add(betL, 1, 2);
        grid.add(buttonBet, 2, 2);
        //grid.add();
        grid.add(doneBet, 4, 2);

        grid.add(chcekFast, 0, 3);
        grid.add(fastL, 1, 3);
        grid.add(buttonFast, 2, 3);
        //grid.add();
        grid.add(doneFast, 4, 3);

        grid.add(chcekEddy, 0, 4);
        grid.add(eddyL, 1, 4);
        grid.add(buttonFEddy, 2, 4);
        //grid.add();
        grid.add(doneEddy, 4, 4);

        grid.add(chcekApplyTopUp, 0, 5);
        grid.add(applyTopUpL, 1, 5);
        grid.add(buttonApplyTopUp, 2, 5);
        //grid.add();
        grid.add(doneApplyTopUp, 4, 5);
*/