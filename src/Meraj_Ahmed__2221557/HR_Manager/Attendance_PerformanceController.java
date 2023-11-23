/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.HR_Manager;

import java.net.URL;
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
    private TextField workingHoursTextField;
    @FXML
    private ComboBox<?> checkInCombobox;
    @FXML
    private ComboBox<?> checkOutCombobox;
    @FXML
    private DatePicker dateOfEntry;
    @FXML
    private TextArea attendanceTextArea;
    @FXML
    private TextField performanceNameTextField;
    @FXML
    private TextField performanceCodeTextField;
    @FXML
    private ComboBox<?> PerformanceScoreCombobox;
    @FXML
    private TextArea performanceTextArea;
    @FXML
    private ComboBox<?> departmentCombobox;
    @FXML
    private ComboBox<?> PerformanceDepartmentCombobox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void doneShowButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void showPerformanceScoreButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void addButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void sendButtonOnClicked(ActionEvent event) {
    }
    
}
