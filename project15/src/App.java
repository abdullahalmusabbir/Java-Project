import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lib.Company;
import lib.DataHandler;
import lib.Employee;
 
public class App extends Application {
    public static Employee loggedemployee=null;
    public static Company company=null;
    public static Boolean isadmin=false;
    public static Stage window=null;
    public static void main(String[] args) {
        company= DataHandler.loadData();
        company= new Company("University of Asia Pacific");
        DataHandler.saveData(company);
        
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        try {
   
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle(" University of Asia Pacific");
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.setOnCloseRequest(event -> DataHandler.saveData(company));
            window=primaryStage;
           } catch(Exception e) {
            e.printStackTrace();
           }
    }
}