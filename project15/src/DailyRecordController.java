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

public class DailyRecordController {

    @FXML
    private TextField ID;

    @FXML
    private TextField hourorsale;

    @FXML
    private TextArea textarea;

    @FXML
    void addailyrecord(ActionEvent event) throws InvalidEmployeeException {
        String ids=ID.getText();
        double hour=Double.parseDouble(hourorsale.getText());
        App.company.addRecord(ids,hour);
    }

    @FXML
    void back(ActionEvent event) throws IOException {
        Parent addPart = FXMLLoader.load(getClass().getResource("employee.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

}
