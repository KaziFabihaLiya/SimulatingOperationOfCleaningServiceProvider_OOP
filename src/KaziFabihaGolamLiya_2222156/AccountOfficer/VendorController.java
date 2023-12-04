/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.AccountOfficer;

import KaziFabihaGolamLiya_2222156.DummyMeaw.GeneratePDFModelClass;
import Meraj_Ahmed__2221557.GenerateAlerts;
import Meraj_Ahmed__2221557.ReadWrite;
import static java.awt.SystemColor.text;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

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

        vendorList = FXCollections.observableArrayList();

        categoryCombBox.getItems().addAll("Specialized Vendors", "Chemical Vendors", "Detergent Vendors", "Garments Vendor");

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

        Vendor person1 = new Vendor(vendorNam, email, vendorType, 0, statusVendor, dateofRegistraion, "", "", "", "", "", null, 0);
        vendorList.add(person1);

    }

    @FXML
    private void deleteExistingInfoButton(ActionEvent event) {
        ObservableList<Vendor> selectedRows, allPeople;
        allPeople = vendorTableView.getItems();
        selectedRows = vendorTableView.getSelectionModel().getSelectedItems();

        for (Vendor p : selectedRows) {
            allPeople.remove(p);
        }
    }

    @FXML
    private void switchToBackButton(ActionEvent event) throws IOException {

        Parent scene2Parent = FXMLLoader.load(getClass().getResource("AccOfficerDashboard.fxml"));
        Scene scene2 = new Scene(scene2Parent);

        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void loadButtononClicked(ActionEvent event) {
        
        vendorTableView.getItems().clear();

        vendorTableView.getItems().addAll(vendorList);

    }

    @FXML
    private void binFileCreateButton(ActionEvent event) throws IOException {

        String vendorNam = nameTextField.getText();
        String email = emailTextField.getText();
        String vendorType = categoryCombBox.getValue();
        Boolean statusVendor = activeIinactiveCheckbox.isSelected();
        LocalDate dateofRegistraion = datePicker.getValue();

        Vendor person1 = new Vendor(vendorNam, email, vendorType, 0, statusVendor, dateofRegistraion, "", "", "", "", "", null, 0);
        vendorList.add(person1);

        ReadWrite.writeObjectToFile("vendor.bin", person1);
        ObservableList<Vendor> vendorList = (ObservableList<Vendor>) ReadWrite.readObjectToFile("vendor.bin", person1);

        String s = "";
        s = "";
        for (Vendor v : vendorList) {
            System.out.println(v.toString());
            s += v.toString();

        }

    }

    @FXML
    private void DownloadPDFButton(ActionEvent event) {
        
        String status = "";
        if (activeIinactiveCheckbox.isSelected()) {
            status += "Active";
        } else {
            status += "Inactive";
        }
        
        
        
        String AllVendorInfo = ("Name of the Vendor is : " + nameTextField.getText() + "\n"
                + "Email : " + emailTextField.getText() + "\n"
                + "Vendor's Type is : " + categoryCombBox.getValue() + "\n"
                + "Is the Vendor Inactive or Active ? --- " + status + "\n" + 
                "Date of registration : " + datePicker.getValue());
               
        GeneratePDFModelClass.generatePdf(AllVendorInfo,"Vendor Information");
    }
}
