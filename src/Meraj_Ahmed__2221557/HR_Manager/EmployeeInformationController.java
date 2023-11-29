/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.HR_Manager;

import Meraj_Ahmed__2221557.Employee;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class EmployeeInformationController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField contactTextField;
    @FXML
    private TextField employeeCodeTextField;
    @FXML
    private DatePicker dateOfBirth;
    @FXML
    private DatePicker dateOfJoining;
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton femaleRadioButton;
    @FXML
    private TableColumn<Employee, String> nameTableColoum;
    @FXML
    private TableColumn<Employee, Long> contactTableColoum;
    @FXML
    private TableColumn<Employee, LocalDate> dateofBirthTableColoum;
    @FXML
    private TableColumn<Employee, LocalDate> dateofJoiningTableColoum;

    private ToggleGroup tg;
    @FXML
    private ComboBox<String> departmentCombobox;
    @FXML
    private TableColumn<Employee, String> departmentTableColoum;
    @FXML
    private TextField emailTextField;
    @FXML
    private TableColumn<Employee, String> addressTableColumn;
    @FXML
    private TableColumn<Employee, String> emailTableColumn;
    @FXML
    private TableView<Employee> empInfoTableView;
    @FXML
    private TableColumn<Employee, Integer> codeTableColoum;
    private ObservableList<Employee> emp;
    private ObservableList<Employee> empList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tg = new ToggleGroup();
        maleRadioButton.setToggleGroup(tg);
        femaleRadioButton.setToggleGroup(tg);
        emp = FXCollections.observableArrayList();
        departmentCombobox.getItems().addAll("Accounts", "Cleaner", "Human Resource", "Administration");
        empList = FXCollections.observableArrayList();

        codeTableColoum.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("employeeCode"));
        nameTableColoum.setCellValueFactory(new PropertyValueFactory<Employee, String>("name"));
        departmentTableColoum.setCellValueFactory(new PropertyValueFactory<Employee, String>("department"));
        contactTableColoum.setCellValueFactory(new PropertyValueFactory<Employee, Long>("contact"));
        dateofBirthTableColoum.setCellValueFactory(new PropertyValueFactory<Employee, LocalDate>("dateOfBirth"));
        dateofJoiningTableColoum.setCellValueFactory(new PropertyValueFactory<Employee, LocalDate>("dateOfJoining"));
        addressTableColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("address"));
        emailTableColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("email"));

    }

    @FXML
    private void showInformationButtonOnClicked(ActionEvent event) throws IOException {
        
        Employee dummyemployeeinfo = new Employee(0,"", "", LocalDate.of(2023, 02, 02),"", "", "", "", "", LocalDate.of(2023, 02, 02), 0L);
        ObservableList<Employee> empList= (ObservableList<Employee>) ReadWrite.readObjectToFile("EmployeeINFO", dummyemployeeinfo);
                
        empInfoTableView.getItems().addAll(empList);
    }

    @FXML
    private void downloadPdfButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void addEmployeeButtonOnClicked(ActionEvent event) {
        String name = nameTextField.getText();
        int code = Integer.parseInt(employeeCodeTextField.getText());
        String address =addressTextField.getText();
        Long contact =Long.parseLong(contactTextField.getText());
        String email= emailTextField.getText();
        String dept = departmentCombobox.getValue();
        LocalDate Dob =dateOfBirth.getValue();
        LocalDate Doj =dateOfJoining.getValue();
        String gender = "";
    if (maleRadioButton.isSelected()) {
        gender = "Male";
    } else if (femaleRadioButton.isSelected()) {
        gender = "Female";
    }
        Employee emplo = new Employee(code,dept, address, Doj, name, gender, email, "Employee", "password", Dob, contact);
        
        emp.add(emplo);

        
        ReadWrite.writeObjectToFile("EmployeeINFO", emplo);
        
        
        nameTextField.clear();
        employeeCodeTextField.clear();
        addressTextField.clear();
        contactTextField.clear();
        emailTextField.clear();
        departmentCombobox.setValue(null);
        dateOfBirth.setValue(null);
        dateOfJoining.setValue(null);
        tg.getSelectedToggle().setSelected(false);
    }

}
