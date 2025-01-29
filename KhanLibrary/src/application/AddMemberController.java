package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddMemberController {

   @FXML
   private TextField nameField, idField;

   @FXML
   void addMember(ActionEvent event) {
      String name = nameField.getText();
      String id = idField.getText();
      App.library.addMember(id, name);
   }

}
