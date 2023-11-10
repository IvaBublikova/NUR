package nur.nur_2;

import nur.nur_2.Displays.HomePage;
import nur.nur_2.Displays.Settings;
import nur.nur_2.Displays.Templates;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    private LogIn loginScreen = new LogIn();
    private HomePage homePage = new HomePage();
    private Settings settings = new Settings();
    private Templates templates = new Templates();
    private Stage primaryStage;

    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        showLoginScreen();
    }

    // Metoda pro zobrazení přihlašovací obrazovky
    public void showLoginScreen() {
        //Scene scene = new Scene(loginScreen,900, 800);
        //Scene scene = new Scene(homePage,900, 800);
        //Scene scene = new Scene(settings,900, 800);
        Scene scene = new Scene(templates,900, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Naše skvělá aplikace");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}