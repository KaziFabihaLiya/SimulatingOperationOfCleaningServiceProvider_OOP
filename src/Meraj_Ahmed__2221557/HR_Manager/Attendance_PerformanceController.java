/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.HR_Manager;

import Meraj_Ahmed__2221557.ReadWrite;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

    private ObservableList<timeAttendanceModel> timeList;
    private ObservableList<timePerformanceModel> perfList;
    private ObservableList<timePerformanceModel> readperfList;
    private ObservableList<timeAttendanceModel> readtimeList;
    
    @FXML
    private ComboBox<String> monthComboBox;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        departmentCombobox.getItems().addAll("Accounts", "Cleaner", "Human Resource", "Administration");
        PerformanceDepartmentCombobox.getItems().addAll("Accounts", "Cleaner", "Human Resource", "Administration");
        PerformanceScoreCombobox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        checkInCombobox.getItems().addAll(9, 10, 11, 12, 13, 14, 15, 16, 17);
        checkOutCombobox.getItems().addAll(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22);
        monthComboBox.getItems().addAll("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        perfList = FXCollections.observableArrayList();
        timeList = FXCollections.observableArrayList();
        readperfList = FXCollections.observableArrayList();
        readtimeList = FXCollections.observableArrayList();

    }

    @FXML
    private void showPerformanceScoreButtonOnClicked(ActionEvent event) throws IOException {
        timePerformanceModel performancedummy = new timePerformanceModel("", "", "", 0, 0);

        readperfList = (ObservableList<timePerformanceModel>) ReadWrite.readObjectToFile("PerformanceList.bin", performancedummy);

        //System.out.println(readperfList.size());
        String add = "";
        for (timePerformanceModel perf : readperfList) {
            //System.out.println(perf.toString());
            add += perf.toString();

        }
        performanceTextArea.appendText(add);

        //ReadWrite.readObjectToFile("PerformanceList", performance);
    }

    @FXML
    private void sendButtonOnClicked(ActionEvent event) throws IOException {
        timeAttendanceModel Attendancedummy = new timeAttendanceModel("","",0,0,0,0,LocalDate.of(2023, 02, 02));
            ObservableList<timeAttendanceModel> readtimeList = (ObservableList<timeAttendanceModel>) ReadWrite.readObjectToFile("AttendanceList.bin", Attendancedummy);
             String addTime = "";
        for (timeAttendanceModel time : readtimeList) {
            //System.out.println(perf.toString());
            addTime += time.toString();
        }
                attendanceTextArea.appendText(addTime);

    }

    @FXML
    private void addShowButtonOnClicked(ActionEvent event) throws IOException {
        String name = nametextField.getText();
        int code = Integer.parseInt(codeTextField.getText());
        int chkin = checkInCombobox.getValue();
        int chkout = checkOutCombobox.getValue();
        String dept = departmentCombobox.getValue();
        LocalDate entry = dateOfEntry.getValue();
        int work = chkout - chkin;      //Integer.parseInt(workingHoursTextField.getText());

        timeAttendanceModel Attendance = new timeAttendanceModel(name, dept, chkin, chkout, code, work, entry);
        ReadWrite.writeObjectToFile("AttendanceList.bin", Attendance);
        timeList.add(Attendance);
       

            



        nametextField.clear();
        codeTextField.clear();
        checkInCombobox.setValue(null);
        checkOutCombobox.setValue(null);
        departmentCombobox.setValue(null);
        dateOfEntry.setValue(null);

    }

    @FXML
    private void addPerformanceScoreButtonOnClicked(ActionEvent event) throws IOException {
        performanceTextArea.clear();
        String name = performanceNameTextField.getText();
        int code = Integer.parseInt(performanceCodeTextField.getText());
        String pdept = PerformanceDepartmentCombobox.getValue();
        int score = PerformanceScoreCombobox.getValue();
        String mon = monthComboBox.getValue();

        timePerformanceModel performance = new timePerformanceModel(name, pdept, mon, code, score);
        //System.out.println(performance.toString2());
        ReadWrite.writeObjectToFile("PerformanceList.bin", performance);

        perfList.add(performance);

        performanceNameTextField.clear();
        performanceCodeTextField.clear();
        PerformanceDepartmentCombobox.setValue(null);
        PerformanceScoreCombobox.setValue(null);
        monthComboBox.setValue(null);
    }

    @FXML
    private void pieChartButtonOnClicked(ActionEvent event) {       
    }

}
