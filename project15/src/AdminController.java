import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdminController {

    @FXML
    void addmember(ActionEvent event) throws IOException{
        Parent addPart = FXMLLoader.load(getClass().getResource("Addmmbr.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void insalary(ActionEvent event) throws IOException{
        Parent addPart = FXMLLoader.load(getClass().getResource("incrsSalary.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void switchRole(ActionEvent event) throws IOException{
        Parent addPart = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void viewDetails(ActionEvent event) throws IOException{
        Parent addPart = FXMLLoader.load(getClass().getResource("ViewDetails.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void viewMrecord(ActionEvent event) throws IOException{
        Parent addPart = FXMLLoader.load(getClass().getResource("viewMrecord.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void viewMsalary(ActionEvent event) throws IOException{
        Parent addPart = FXMLLoader.load(getClass().getResource("monthlySalary.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

}
