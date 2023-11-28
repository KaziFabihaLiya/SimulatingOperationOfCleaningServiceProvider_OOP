/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.Administration_Officer;

import Meraj_Ahmed__2221557.HR_Manager.Attendance_PerformanceController;
import Meraj_Ahmed__2221557.HR_Manager.timePerformanceModel;
import Meraj_Ahmed__2221557.ReadWrite;
import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class BestEmployeeController implements Initializable {

    @FXML
    private TextArea performanceTextArea;
    @FXML
    private TextField announceTextField;
    @FXML
    private TextArea ShowBestemployeeTextArea;
    private ArrayList<bestEmployeeModel> bestList;
    private ObservableList<bestEmployeeModel> bestemp;
    @FXML
    private TextField announceCodeTextField;
    @FXML
    private ComboBox<String> departmentCombobox;
    private ObservableList<timePerformanceModel> readperfList;
    private ObservableList<bestEmployeeModel> readbestList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        departmentCombobox.getItems().addAll("Accounts", "Cleaner", "Human Resource", "Administration");
        bestList = new ArrayList<>();
        bestemp = FXCollections.observableArrayList();
        readperfList = FXCollections.observableArrayList();
        readbestList = FXCollections.observableArrayList();
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
    }

    @FXML
    private void doneShowButtonOnClicked(ActionEvent event) throws IOException {
        ShowBestemployeeTextArea.clear();
        String name = announceTextField.getText();
        String dept = departmentCombobox.getValue();
        int code = Integer.parseInt(announceCodeTextField.getText());

        bestEmployeeModel announce = new bestEmployeeModel(name, dept, code);
        ReadWrite.writeObjectToFile("Best Employee.bin", announce);
        bestemp.add(announce);
        bestList.add(announce);

        
        bestEmployeeModel announcedummy = new bestEmployeeModel("", "", 0);

        readbestList = (ObservableList<bestEmployeeModel>) ReadWrite.readObjectToFile("Best Employee.bin", announcedummy);

        //System.out.println(readperfList.size());
        String add = "";
        for (bestEmployeeModel b : readbestList) {
            //System.out.println(perf.toString());
            add += b.toString();

        }
        ShowBestemployeeTextArea.appendText(add);


        
        announceTextField.clear();
        departmentCombobox.setValue(null);
        announceCodeTextField.clear();

    }

}
