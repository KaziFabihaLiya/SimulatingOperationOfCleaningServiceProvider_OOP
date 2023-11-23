/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.HR_Manager;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
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
public class RecruitEmployeeController implements Initializable {

    @FXML
    private TextField salaryRangeTextField;
    @FXML
    private TextField descriptionTextField;
    @FXML
    private TextField requirementTextField;
    @FXML
    private TextArea outputTextArea;
    @FXML
    private ComboBox<String> departmentComboBox;

    private ArrayList<jobRecruitModel> recList;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        departmentComboBox.getItems().addAll("Accounts", "Cleaner", "Human Resource", "Administration");
        recList = new ArrayList<jobRecruitModel>();

    }    

    @FXML
    private void showPostButtonOnClicked(ActionEvent event) {
        String add = "";
        add = "";
        for (jobRecruitModel r : recList) {
            System.out.println(r.toString());
            add += r.toString();

        }
        outputTextArea.setText(add);
    }

    @FXML
    private void recruitmentPostButtonOnClicked(ActionEvent event) {
        String desc = descriptionTextField.getText();
        String req = requirementTextField.getText();
        long salary = Long.parseLong(salaryRangeTextField.getText());
        String dept = departmentComboBox.getValue();     
        
        jobRecruitModel recruit = new jobRecruitModel(dept,desc,req, salary);
        recList.add(recruit);
        descriptionTextField.clear();
        requirementTextField.clear();
        salaryRangeTextField.clear();
        departmentComboBox.setValue(null);
       
    }

    @FXML
    private void dashboardButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void downloadPdfButtonOnClicked(ActionEvent event) {
    }
    
}
