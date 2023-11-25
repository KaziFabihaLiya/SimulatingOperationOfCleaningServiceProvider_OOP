/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.AccountOfficer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author kazif
 */
public class EmployeeSalaryCalculatorController implements Initializable {

    @FXML
    private TextField EmpIDTextField;
    @FXML
    private TextField NameTextField;
    @FXML
    private TextField BonusTextField;
    @FXML
    private ComboBox<Integer> TaxPercentCombobox;
    @FXML
    private TextArea SalaryOutputTextArea;
    @FXML
    private ComboBox<String> DepartmentCombobox;
    @FXML
    private Text EmployeeNameShow;
    @FXML
    private Text SalaryAmountShow;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void CalculateNetSalaryOnButtonClicked(MouseEvent event) {
    }
    
}
