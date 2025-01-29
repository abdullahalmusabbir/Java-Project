package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import library.Member;

public class MembersController implements Initializable {

   @FXML
   private TableView<Member> table;

   @FXML
   private TableColumn<Member, String> memberId, memberName;

   @Override
   public void initialize(URL location, ResourceBundle resources) {
      memberId.setCellValueFactory(new PropertyValueFactory<>("id"));
      memberName.setCellValueFactory(new PropertyValueFactory<>("name"));

      ObservableList<Member> members = FXCollections.observableArrayList();
      members.addAll(App.library.getMembers());
      if (!members.isEmpty()) {
         table.setItems(members);
      }
   }
}
