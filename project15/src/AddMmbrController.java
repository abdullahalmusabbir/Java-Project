import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class AddMmbrController {

    @FXML
    private TextField cage,cdesignation,cname,cnumber,comisonper,basesalary;

    @FXML
    private TextField hname,hage,hdesignation,hnumber,hourlyrate;

    
    @FXML
    private TextField sage,snumber,sname,smnthlysalary,sdesignation;

    @FXML
    void addcommisionEmployee(ActionEvent event) {
        String cnames=cname.getText();
        int cages=Integer.parseInt(cage.getText());
        String sdesignations=sdesignation.getText();
        String snmbrs=snumber.getText();
        double basesalarys=Double.parseDouble(basesalary.getText());
        double com=Double.parseDouble(comisonper.getText());
        App.company.addCommissionEmployee(cnames, cages, sdesignations, snmbrs, basesalarys, com);
    }

    @FXML
    void addhourlyemployee(ActionEvent event) {
        String hnames=hname.getText();
        int hages=Integer.parseInt(hage.getText());
        String hdesignations=hdesignation.getText();
        String hnmbrs=hnumber.getText();
        double hourlyRates=Double.parseDouble(hourlyrate.getText());
        App.company.addHourlyEmployee(hnames, hages, hdesignations, hnmbrs, hourlyRates);
    }

    @FXML
    void addsalaryemployee(ActionEvent event) {
        String snames=sname.getText();
        int sages=Integer.parseInt(sage.getText());
        String sdesignations=sdesignation.getText();
        String snmbr=snumber.getText();
        double monthly=Double.parseDouble(smnthlysalary.getText());
        App.company.addSalariedEmployee(snames, sages, sdesignations, snmbr, monthly);
    }

        @FXML
        void back(ActionEvent event) throws IOException{
        Parent addPart = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        Scene scene = new Scene(addPart);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

}
