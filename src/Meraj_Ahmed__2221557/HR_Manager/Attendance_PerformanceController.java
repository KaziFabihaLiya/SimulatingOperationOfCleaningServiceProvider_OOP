/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.HR_Manager;

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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class Attendance_PerformanceController implements Initializable {

    @FXML
    private TextField nametextField;
    @FXML
    private TextField codeTextField;
    @FXML
    private ComboBox<Integer> checkInCombobox;
    @FXML
    private ComboBox<Integer> checkOutCombobox;
    @FXML
    private DatePicker dateOfEntry;
    @FXML
    private TextArea attendanceTextArea;
    @FXML
    private TextField performanceNameTextField;
    @FXML
    private TextField performanceCodeTextField;
    @FXML
    private ComboBox<Integer> PerformanceScoreCombobox;
    @FXML
    private TextArea performanceTextArea;
    @FXML
    private ComboBox<String> departmentCombobox;
    @FXML
    private ComboBox<String> PerformanceDepartmentCombobox;

    private ArrayList<timePerformanceModel> timeList;
    private ArrayList<timePerformanceModel> perfList;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        departmentCombobox.getItems().addAll("Accounts", "Cleaner", "Human Resource", "Administration");
        PerformanceDepartmentCombobox.getItems().addAll("Accounts", "Cleaner", "Human Resource", "Administration");
        PerformanceScoreCombobox.getItems().addAll(1,2,3,4,5,6,7,8,9,10);
        checkInCombobox.getItems().addAll(9,10,11,12,13,14,15,16,17);
        checkOutCombobox.getItems().addAll(10,11,12,13,14,15,16,17,18,19,20,21,22);
        perfList = new ArrayList<>();
        timeList = new ArrayList<>();
    }    


    @FXML
    private void showPerformanceScoreButtonOnClicked(ActionEvent event) {
        String add = "";
        add = "";
        for (timePerformanceModel perf : perfList) {
            //System.out.println(perf.toString());
            add += perf.toString2();

        }
        performanceTextArea.setText(add);

    }


    @FXML
    private void sendButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void addShowButtonOnClicked(ActionEvent event) {
         String name = nametextField.getText(); 
         int code =Integer.parseInt(codeTextField.getText());
         int chkin =checkInCombobox.getValue();
         int chkout =checkOutCombobox.getValue();
         String dept = departmentCombobox.getValue(); 
         LocalDate entry = dateOfEntry.getValue();
         int work =  chkout - chkin;                           //Integer.parseInt(workingHoursTextField.getText());
         
        timePerformanceModel Attendance = new timePerformanceModel("",chkin,chkout,0,work,entry,code, dept, "address", null, name, "gender", "email", "Employee", "password", null, 0);
        timeList.add(Attendance);
        String addTime = "";
        addTime="";
        for (timePerformanceModel time : timeList) {
            //System.out.println(perf.toString());
            addTime += time.toString();
            
            nametextField.clear();
            codeTextField.clear();
            checkInCombobox.setValue(null);
            checkOutCombobox.setValue(null);
            departmentCombobox.setValue(null);
            dateOfEntry.setValue(null);

        }
        
        attendanceTextArea.setText(addTime);
         
    }

    @FXML
    private void addPerformanceScoreButtonOnClicked(ActionEvent event) {
        String name = performanceNameTextField.getText();
        int code = Integer.parseInt(performanceCodeTextField.getText());
        String pdept= PerformanceDepartmentCombobox.getValue();
        int score= PerformanceScoreCombobox.getValue();
        
        
        timePerformanceModel performance = new timePerformanceModel(pdept,0,0,score,0,null,code, "", "address", null, name, "gender", "email", "Employee", "password", null, 0);
        perfList.add(performance);
        
        
        
        performanceNameTextField.clear();
        performanceCodeTextField.clear();
        PerformanceDepartmentCombobox.setValue(null);
        PerformanceScoreCombobox.setValue(null);
    }
    
}
