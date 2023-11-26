/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.Administration_Officer;

import Meraj_Ahmed__2221557.ReadWrite;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class DevelopementPlanController implements Initializable {

    @FXML
    private TextField planTextField;
    @FXML
    private TextArea publishShowTextArea;
    @FXML
    private DatePicker dateOfIssue;
    @FXML
    private TextField budgetTextField;

    private ArrayList<developementModel> devList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        devList = new ArrayList<>();

    }

    @FXML
    private void donePublishButtonOnClicked(ActionEvent event) throws IOException {
        String plan = planTextField.getText();
        long budget = Long.parseLong(budgetTextField.getText());
        LocalDate doi = dateOfIssue.getValue();

        developementModel newdev = new developementModel(plan, budget, doi);

        devList.add(newdev);
        ReadWrite.writeObjectToFile("dev.bin", newdev);
        ObservableList<developementModel> planlist = (ObservableList<developementModel>)ReadWrite.readObjectToFile("dev.bin", newdev);

        
        String add = "";
        for (developementModel d : devList) {
            add += d.toString();
        }
        publishShowTextArea.setText(add);
        

        planTextField.clear();
        budgetTextField.clear();
        dateOfIssue.setValue(null);

    }

    @FXML
    private void downloadPdfButtonOnClicked(ActionEvent event) {
    }

}
