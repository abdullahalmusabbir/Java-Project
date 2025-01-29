import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lib.DailyRecord;
import lib.Employee;
import lib.InvalidEmployeeException;
import lib.PartTimeEmployee;

public class viewMrecordController {

    @FXML
    private ChoiceBox<String> choicebox;

    @FXML
    private TextField id;

    @FXML
    private TextArea output;

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
        Boolean isHourly=true;
        String ids=id.getText();
        Employee emp=App.company.findEmployee(ids);
        if (emp instanceof PartTimeEmployee) {
                PartTimeEmployee ptEmp = (PartTimeEmployee) emp;
                ArrayList<DailyRecord> records = ptEmp.getDailyRecords();
                double totalHoursOrSales = 0.0;
                for (DailyRecord record : records) {
                    totalHoursOrSales += record.getHour_Or_Sale();
                }
                String type = isHourly ? "hourly" : "commission";
                // System.out.println("Total " + type + " record: " + totalHoursOrSales);
                output.setText("Total " + type + " record: " + totalHoursOrSales);
            } else {
                System.out.println("This employee is not a part-time employee.");
            }
    }

}
