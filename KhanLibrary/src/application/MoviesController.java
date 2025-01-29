package application;

import library.Item;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MoviesController implements Initializable {

   @FXML
   private TableView<Item> table;

   @FXML
   private TableColumn<Item, String> title, category;

   @FXML
   private TableColumn<Item, String[]> directors;

   @FXML
   private TableColumn<Item, Integer> releaseYear;

   @Override
   public void initialize(URL location, ResourceBundle resources) {
      title.setCellValueFactory(new PropertyValueFactory<>("title"));
      category.setCellValueFactory(new PropertyValueFactory<>("category"));
      directors.setCellValueFactory(new PropertyValueFactory<>("directors"));
      releaseYear.setCellValueFactory(new PropertyValueFactory<>("releaseYear"));

      ObservableList<Item> movies = FXCollections.observableArrayList();
      movies.addAll(App.library.findItems("Movie"));
      if (!movies.isEmpty()) {
         table.setItems(movies);
      }
   }
}
