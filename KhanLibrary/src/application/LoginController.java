package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import library.InvalidMemberException;
import library.Member;

public class LoginController {

    @FXML
    private TextField idField;

    @FXML
    private PasswordField passwordField;

    @FXML
    void close(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void login(ActionEvent event) {
        String id = idField.getText();
        String password = passwordField.getText();

        if (id.equals("admin") && password.equals("admin")) {
            App.isLibrarian = true;
            openMainPage();
        } else {
            try {
                Member member = App.library.findMember(id);
                App.loggedMember = member;
                App.isLibrarian = false;
                openMainPage();
            } catch (InvalidMemberException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void openMainPage() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
            App.window.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
