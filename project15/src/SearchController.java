import java.io.IOException;

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

public class SearchController {

    @FXML
    private TextField employeeid;

    @FXML
    private TextField name;

    @FXML
    private TextArea output;

    @FXML
    void back(ActionEvent event) throws IOException{
        Parent addPart = FXMLLoader.load(getClass().getResource("Employee.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void search(ActionEvent event) throws InvalidEmployeeException {
        String id=employeeid.getText();
        Employee s=App.company.findEmployee(id);
        output.setText(s.toString(true));
    }

}
