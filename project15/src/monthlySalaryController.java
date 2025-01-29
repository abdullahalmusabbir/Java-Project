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
import lib.InvalidEmployeeException;

public class monthlySalaryController {

    @FXML
    private TextField id;

    @FXML
    private TextArea textarea;

    @FXML
    void back(ActionEvent event) throws IOException{
        Parent addPart = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void view(ActionEvent event) throws InvalidEmployeeException {
        String ids=id.getText();
        double g=App.company.getSalary(ids);
        String value=String.valueOf(g);
        textarea.setText(value);
    }

}
