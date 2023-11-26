/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.AccountOfficer;

import java.io.IOException;
import java.net.URL;
import java.lang.String;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
    
    private ArrayList<Salary> salaryList;
    
    private ObservableList<Salary> salaryL;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        salaryL=FXCollections.observableArrayList();
        
        TaxPercentCombobox.getItems().addAll(5,10,15,20);
        DepartmentCombobox.getItems().addAll("Accounts","Cleaner","Administration","Human Resource");
        salaryList = new ArrayList<Salary>();

        Salary obj = new Salary (0, 0,0, 0, "", "", null, "", "", "", "", "", null, 0);
//        SalaryAmountShow.setText(Integer.toString(a)) ;
         //salaryList.add(obj);
        
    }    

    @FXML
    private void CalculateNetSalaryOnButtonClicked(MouseEvent event) {
        int bonus = Integer.parseInt(BonusTextField.getText());
        int salary =  Integer.parseInt(SalaryAmountShow.getText());
        int tax = TaxPercentCombobox.getValue();
        
        Salary obj = new Salary (salary, bonus,tax, 0, "", "", null, "", "", "", "", "", null, 0);
        
        salaryL.add(obj);
        salaryList.add(obj);
        
        int Total = 0;
        for(Salary y: salaryL){
            Total+= y.getNetSalary();
        }   
        SalaryOutputTextArea.setText( Integer.toString(Total));
        EmployeeNameShow.setText(NameTextField.getText());
    }

    @FXML
    private void SceneSwitchToPieChartButton(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("SalaryPieChart.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Salary Calculator");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
        
                
    }

    @FXML
    private void departmentOnAction(ActionEvent event) {
        String a = DepartmentCombobox.getValue();
                
        if ("Accounts".equals(a)){
            SalaryAmountShow.setText("25000");
        } else if ("Cleaner".equals(a)){
            SalaryAmountShow.setText("10000");
        } else if ("Administration".equals(a)){
            SalaryAmountShow.setText("50000");
        } else if ("Human Resource".equals(a)){
            SalaryAmountShow.setText("30000");
        
        }
    }
    
}
