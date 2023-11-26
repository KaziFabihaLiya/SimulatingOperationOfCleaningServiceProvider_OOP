/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.Administration_Officer;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class QualityControlController implements Initializable {

    @FXML
    private ComboBox<String> departmentCombobox;
    @FXML
    private DatePicker selectDate;
    @FXML
    private TextArea showTextArea;

    private ArrayList<qualityModel> qualityList;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        departmentCombobox.getItems().addAll("Accounts", "Cleaner", "Human Resource", "Administration");
        qualityList = new ArrayList<>();
    }    

    @FXML
    private void doneButtonOnClicked(ActionEvent event) {
        String dept = departmentCombobox.getValue();
        LocalDate sDate = selectDate.getValue();
        
        qualityModel insList = new qualityModel(dept, sDate);
        qualityList.add(insList);
        
        String add = "";
        for (qualityModel q : qualityList) {
            System.out.println(q.toString());
            add += q.toString();
        }
        showTextArea.setText(add);
        
        departmentCombobox.setValue(null);
        selectDate.setValue(null);
    }
    
}