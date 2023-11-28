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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private ObservableList<qualityModel> readqualityList;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        departmentCombobox.getItems().addAll("Accounts", "Cleaner", "Human Resource", "Administration");
        qualityList = new ArrayList<>();
        readqualityList= FXCollections.observableArrayList();
    }    

    @FXML
    private void doneButtonOnClicked(ActionEvent event) {
        String dept = departmentCombobox.getValue();
        LocalDate sDate = selectDate.getValue();
        
        qualityModel insList = new qualityModel(dept, sDate);
        qualityList.add(insList);
        ReadWrite.writeObjectToFile("quality.bin", insList);
        
        

        
        departmentCombobox.setValue(null);
        selectDate.setValue(null);
    }

    @FXML
    private void showButtonOnClicked(ActionEvent event) throws IOException {
        qualityModel dummyquality = new qualityModel("",LocalDate.of(2023, 02, 02));
        ObservableList<qualityModel> readqualityList = (ObservableList<qualityModel>) ReadWrite.readObjectToFile("quality.bin", dummyquality);
        
        String add = "";
        for (qualityModel q : readqualityList) {
            add += q.toString();
        }
        showTextArea.setText(add);
    }
}