package nur;

import nur.Displays.HomePage;
import nur.Displays.Settings;
import nur.Displays.Templates;
import javafx.scene.Scene;
import javafx.stage.Stage;
import nur.Displays.pre.A_ChooseIMG;
import nur.Displays.pre.B_Functions;
import nur.Displays.pre.C_Save;
import nur.Displays.pre.T2_DWI;

public class Application extends javafx.application.Application {

    private LogIn loginScreen = new LogIn();
    private HomePage homePage = new HomePage();
    private Settings settings = new Settings();
    private Templates templates = new Templates();
    private T2_DWI t2_dwi = new T2_DWI();
    private A_ChooseIMG chooseIMG = new A_ChooseIMG();
    private B_Functions functions = new B_Functions();
    private C_Save save = new C_Save();
    private Stage primaryStage;

    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        showLoginScreen();
    }

    // Metoda pro zobrazení přihlašovací obrazovky
    public void showLoginScreen() {
        Scene scene = new Scene(loginScreen,900, 800);
        //Scene scene = new Scene(homePage,900, 800);
        //Scene scene = new Scene(settings,900, 800);
        //Scene scene = new Scene(templates,900, 800);
        //Scene scene = new Scene(t2_dwi,900, 800);
        //Scene scene = new Scene(chooseIMG,900, 800);
        //Scene scene = new Scene(functions,900, 800);
        //Scene scene = new Scene(save,900, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Naše skvělá aplikace");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}