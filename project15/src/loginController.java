import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import lib.Employee;
import lib.InvalidEmployeeException;

public class loginController {

    @FXML
    private TextField password;

    @FXML
    private TextField username;

    

    @FXML
    void back(ActionEvent event) throws IOException{
        System.exit(0);
    }

    @FXML
    void login(ActionEvent event) throws IOException{
        String id = username.getText();
        String pass = password.getText();

        if (id.equals("admin") && pass.equals("admin")) {
            App.isadmin = true;
            openMainPage();
        } else {
            try {
                Employee employee = App.company.findEmployee(id);
                App.loggedemployee = employee;
                App.isadmin = false;
                openMainPages();
            } catch (InvalidEmployeeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void openMainPage() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Admin.fxml"));
            App.window.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void openMainPages() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("employee.fxml"));
            App.window.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

