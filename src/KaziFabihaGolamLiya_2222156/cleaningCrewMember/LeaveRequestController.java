/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.cleaningCrewMember;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kazif
 */
public class LeaveRequestController implements Initializable {

    @FXML
    private TextField EmployeeNameTextField;
    @FXML
    private TextField EmployeeCodeTextField;
    @FXML
    private ComboBox<Integer> LeaveDaysSelectionComboBox;
    @FXML
    private TextArea textAreaToShow;
    @FXML
    private ComboBox<String> TypeCombobox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       LeaveDaysSelectionComboBox.getItems().addAll(1,2,3,4,5,6,7);
       TypeCombobox.getItems().addAll("Ironer","Washer","Dryer","Householder","Cleaner");
       
       
    }    

    @FXML
    private void leaveRequestSubmissionButton(ActionEvent event) {
    }

    @FXML
    private void ShowButton(ActionEvent event) {
        textAreaToShow.setText("Employee Name : " + EmployeeNameTextField.getText() + "\n Code : "+ EmployeeCodeTextField.getText() + "\nWorker Type : " + TypeCombobox.getValue() + " \nis is requesting to leave for " + LeaveDaysSelectionComboBox.getValue() + " days ");
    }
    
}
