import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class EditnmbrController {

    @FXML
    private TextField employeeID;

    @FXML
    private TextField phNmbr;

    @FXML
    void back(ActionEvent event) throws IOException{
        Parent addPart = FXMLLoader.load(getClass().getResource("Employee.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void update(ActionEvent event) {
        String id=employeeID.getText();
        String nmbr=phNmbr.getText();

        App.loggedemployee.setPhoneNum(nmbr);
    }

}
