package application;

import library.Item;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class BooksController implements Initializable {

   @FXML
   private TableView<Item> table;

   @FXML
   private TableColumn<Item, String> title, category, publisher;

   @FXML
   private TableColumn<Item, String[]> authors;

   @FXML
   private TableColumn<Item, Integer> publishYear;

   @Override
   public void initialize(URL location, ResourceBundle resources) {
      title.setCellValueFactory(new PropertyValueFactory<>("title"));
      category.setCellValueFactory(new PropertyValueFactory<>("category"));
      publisher.setCellValueFactory(new PropertyValueFactory<>("publisherName"));
      authors.setCellValueFactory(new PropertyValueFactory<>("authors"));
      publishYear.setCellValueFactory(new PropertyValueFactory<>("publishYear"));

      ObservableList<Item> books = FXCollections.observableArrayList();
      books.addAll(App.library.findItems("Book"));
      if (!books.isEmpty()) {
         table.setItems(books);
      }
   }
}
