package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class MainMenuController implements Initializable {
    @FXML
    private VBox mainContainer;

    @FXML
    private Button additemBtn, addmemberBtn, membersBtn;

    @FXML
    void bookview(ActionEvent event) {
        loadPage("Books");
    }

    @FXML
    void movieview(ActionEvent event) {
        loadPage("Movies");
    }

    @FXML
    void publicationview(ActionEvent event) {
        loadPage("Publications");
    }

    @FXML
    void additem(ActionEvent event) {
        loadPage("AddItem");
    }

    @FXML
    void addmember(ActionEvent event) {
        loadPage("AddMember");
    }

    @FXML
    void members(ActionEvent event) {
        loadPage("Members");
    }

    @FXML
    void checkout(ActionEvent event) {
        loadPage("Checkouts");
    }

    @FXML
    void close(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void minimize(ActionEvent event) {
        App.window.setIconified(true);
    }

    @FXML
    void singOut(ActionEvent event) {
        try {
            App.isLibrarian = false;
            App.loggedMember = null;
            Parent page = FXMLLoader.load(getClass().getResource("Login.fxml"));
            App.window.setScene(new Scene(page));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadPage(String pageName) {
        try {
            Parent page = FXMLLoader.load(getClass().getResource(pageName + ".fxml"));
            mainContainer.getChildren().setAll(page);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        additemBtn.managedProperty().bind(additemBtn.visibleProperty());
        addmemberBtn.managedProperty().bind(addmemberBtn.visibleProperty());
        membersBtn.managedProperty().bind(membersBtn.visibleProperty());
        if (!App.isLibrarian) {
            additemBtn.setVisible(false);
            addmemberBtn.setVisible(false);
            membersBtn.setVisible(false);
        }
    }
}
