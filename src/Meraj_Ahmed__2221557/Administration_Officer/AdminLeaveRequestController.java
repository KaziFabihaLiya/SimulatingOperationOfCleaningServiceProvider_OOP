/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.Administration_Officer;

import Meraj_Ahmed__2221557.HR_Manager.HRLeaveModel;
import Meraj_Ahmed__2221557.ReadWrite;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class AdminLeaveRequestController implements Initializable {

    @FXML
    private TextField statusTextField;
    @FXML
    private ComboBox<Integer> daysCombobox;
    @FXML
    private TextField nameTextField;
    @FXML
    private ComboBox<String> departmentCombobox;
    @FXML
    private TextField codeTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        daysCombobox.getItems().addAll(1,2,3,4,5,6,7,14,30);
       departmentCombobox.getItems().addAll("Accounts", "Cleaner", "Human Resource", "Administration");  
    }    

    @FXML
    private void applyLeaveButtonOnClicked(ActionEvent event) {
                int days =  daysCombobox.getValue();
        String name = nameTextField.getText();
        int code = Integer.parseInt(codeTextField.getText());
        String dept =departmentCombobox.getValue();
        String stat = "Pending";
        
        HRLeaveModel leave = new HRLeaveModel(name,dept,stat,code,days);
        
        ReadWrite.writeObjectToFile("ApplyLeave.bin", leave);
        statusTextField.setText("Pending"); // for showing output pending.
    }
    
}
