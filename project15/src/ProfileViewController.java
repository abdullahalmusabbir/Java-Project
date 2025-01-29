import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lib.Employee;
import lib.InvalidEmployeeException;

public class ProfileViewController {

    @FXML
    private TextArea textarea;

    @FXML
    private TextField EID;

    @FXML
    void view(ActionEvent event) {
        String id=EID.getText();
        try {
            Employee sd = App.company.findEmployee(id);
            textarea.setText(sd.toString(true));
        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
        
    }

    @FXML
    void back(ActionEvent event) throws IOException {
        Parent addPart = FXMLLoader.load(getClass().getResource("Employee.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    
}



