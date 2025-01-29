package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import library.DataHandler;
import library.Library;
import library.Member;

public class App extends Application {
    public static Library library = null;
    public static Stage window = null;
    public static Member loggedMember = null;
    public static Boolean isLibrarian = false;

    public static void main(String[] args) {
        try {
            library = DataHandler.loadData();
        } catch (ClassNotFoundException | IOException e) {
            library = new Library("Khan Library");
        }
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Khan Books");
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.setOnCloseRequest(event -> DataHandler.saveData(library));
            window = primaryStage;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}