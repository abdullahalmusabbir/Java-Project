import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lib.InvalidEmployeeException;

public class incrsSalaryController {

    @FXML
    private TextField amount;

    @FXML
    private TextField id;

    @FXML
    void back(ActionEvent event) throws IOException{
        Parent addPart = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void increase(ActionEvent event) throws InvalidEmployeeException {
        String ids=id.getText();
        String am=amount.getText();
        double amt=Double.parseDouble(am);
        App.company.increaseSalary(ids, amt);

    }

}
