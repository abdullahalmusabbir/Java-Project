import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import lib.Employee;
import lib.InvalidEmployeeException;

public class viewDetailsController implements Initializable{


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
    void view(ActionEvent event) {
        String ids=id.getText();
        try {
            Employee sd = App.company.findEmployee(ids);
            textarea.setText(sd.toString(true));
        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }


    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        ArrayList<Employee> employees = App.company.getEmployees();
 
        for (Employee emp : employees) {
            textarea.setText(emp.toString(true));
        }
    }

}




