package application;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import java.util.ArrayList;
import java.util.Arrays;

public class AddItemController {

   @FXML
   private TextField booktitle, bookauthor, bookcat, bookpbname, bookpbyear;

   @FXML
   private TextField movieTitle, movieCat, movieRelease, moviedirector;

   @FXML
   private TextField pubtitle, pubcat, pubauthor, pubname, pubyear;

   @FXML
   private ToggleGroup isJournal;

   @FXML
   void bookAdd(ActionEvent event) {
      App.library.addItem(
            booktitle.getText(),
            bookcat.getText(),
            new ArrayList<>(Arrays.asList(bookauthor.getText().split(", "))),
            Integer.parseInt(bookpbyear.getText()),
            bookpbname.getText());
   }

   @FXML
   void movieAdd(ActionEvent event) {
      App.library.addItem(
            movieTitle.getText(),
            movieCat.getText(),
            new ArrayList<>(Arrays.asList(moviedirector.getText().split(", "))),
            Integer.parseInt(movieRelease.getText()));

   }

   @FXML
   void pubAdd(ActionEvent event) {
      App.library.addItem(
            pubtitle.getText(),
            pubcat.getText(),
            new ArrayList<>(Arrays.asList(pubauthor.getText().split(", "))),
            Integer.parseInt(pubyear.getText()),
            isJournal.getSelectedToggle().toString().contains("YES"),
            pubname.getText());
   }
}
