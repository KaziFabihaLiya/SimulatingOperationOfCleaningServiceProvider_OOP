/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.Administration_Officer;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        departmentCombobox.getItems().addAll("Accounts", "Cleaner", "Human Resource", "Administration");
        bestList = new ArrayList<>();
        bestemp = FXCollections.observableArrayList();
    }

    @FXML
    private void showPerformanceScoreButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void doneShowButtonOnClicked(ActionEvent event) {
        String name = announceTextField.getText();
        String dept = departmentCombobox.getValue();
        int code = Integer.parseInt(announceCodeTextField.getText());
        
        bestEmployeeModel announce = new bestEmployeeModel(name,dept,code);
        bestemp.add(announce);
        bestList.add(announce);

        String add = "";
        for (bestEmployeeModel b : bestList) {
            //System.out.println(p.toString());
            add += b.toString();

        }
        ShowBestemployeeTextArea.setText(add);
        
        announceTextField.clear();
        departmentCombobox.setValue(null);
        announceCodeTextField.clear();
    }

}