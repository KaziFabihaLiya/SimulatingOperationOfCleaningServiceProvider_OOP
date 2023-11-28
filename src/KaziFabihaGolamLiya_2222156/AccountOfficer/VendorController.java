/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.AccountOfficer;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author kazif
 */
public class VendorController implements Initializable {

    @FXML
    private TableView<Vendor> vendorTableView;
    @FXML
    private TableColumn<Vendor, String> VendorNameCol;
    @FXML
    private TableColumn<Vendor, String> VendorEmailCol;
    @FXML
    private TableColumn<Vendor, String> CategoryCol;
    @FXML
    private TableColumn<Vendor, Boolean> statusCol;
    @FXML
    private TableColumn<Vendor, LocalDate> DateCol;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private ComboBox<String> categoryCombBox;
    @FXML
    private DatePicker datePicker;
    private ObservableList<Vendor> vendorList;
    @FXML
    private CheckBox activeIinactiveCheckbox;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        vendorList=FXCollections.observableArrayList();
        
        categoryCombBox.getItems().addAll("Specialized Vendors","Chemical Vendors", "Detergent Vendors","Garments Vendor");
        
        VendorNameCol.setCellValueFactory(new PropertyValueFactory<Vendor, String>("VendorName"));
        VendorEmailCol.setCellValueFactory(new PropertyValueFactory<Vendor, String>("VendorEmail"));
        CategoryCol.setCellValueFactory(new PropertyValueFactory<Vendor, String>("category"));
        statusCol.setCellValueFactory(new PropertyValueFactory<Vendor, Boolean>("status"));
        DateCol.setCellValueFactory(new PropertyValueFactory<Vendor, LocalDate>("registrationDate"));      

        // TODO
    }    

    @FXML
    private void addingVendorButtonOnCLicked(ActionEvent event) {
        String vendorNam = nameTextField.getText();
        String email = emailTextField.getText();
        String vendorType = categoryCombBox.getValue();
        Boolean statusVendor = activeIinactiveCheckbox.isSelected();
        LocalDate dateofRegistraion = datePicker.getValue();
        
        Vendor person1 = new Vendor(vendorNam, email, vendorType, 0, statusVendor, dateofRegistraion, "", "","", "", "", null, 0);
        vendorList.add(person1);
        
    }

    @FXML
    private void deleteExistingInfoButton(ActionEvent event) {
    }

    @FXML
    private void switchToBackButton(ActionEvent event) {
        
    }

    @FXML
    private void loadButtononClicked(ActionEvent event) {
        
        vendorTableView.getItems().addAll(vendorList);
        
    }
    
}
