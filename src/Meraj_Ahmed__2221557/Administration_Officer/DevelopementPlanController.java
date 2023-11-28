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
import javafx.collections.FXCollections;
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

    private ObservableList<developementModel> devList;
    private ObservableList<developementModel> readdevList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        devList = FXCollections.observableArrayList();
        readdevList = FXCollections.observableArrayList();

    }

    @FXML
    private void doneButtonOnClicked(ActionEvent event) {
        String plan = planTextField.getText();
        long budget = Long.parseLong(budgetTextField.getText());
        LocalDate doi = dateOfIssue.getValue();

        developementModel newdev = new developementModel(plan, budget, doi);

        devList.add(newdev);
        ReadWrite.writeObjectToFile("dev.bin", newdev);

        planTextField.clear();
        budgetTextField.clear();
        dateOfIssue.setValue(null);
    }

    @FXML
    private void publishButtonOnClicked(ActionEvent event) throws IOException {
        developementModel dummydev = new developementModel("", 0l, LocalDate.of(2023, 02, 02));
        ObservableList<developementModel> readdevList = (ObservableList<developementModel>) ReadWrite.readObjectToFile("dev.bin", dummydev);

        String add = "";
        for (developementModel d : readdevList) {
            add += d.toString();
        }
        publishShowTextArea.setText(add);

    }

}
