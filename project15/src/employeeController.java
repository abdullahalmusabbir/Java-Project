import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class employeeController {

    @FXML
    void editnumber(ActionEvent event) throws IOException{
        Parent addPart = FXMLLoader.load(getClass().getResource("editnmbr.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void enterdailyrecord(ActionEvent event) throws IOException{
        Parent addPart = FXMLLoader.load(getClass().getResource("Employee.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void search(ActionEvent event) throws IOException{
        Parent addPart = FXMLLoader.load(getClass().getResource("Search.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void switchrole(ActionEvent event) throws IOException{
        Parent addPart = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void viewprofile(ActionEvent event) throws IOException{
        Parent addPart = FXMLLoader.load(getClass().getResource("ProfileView.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

}
