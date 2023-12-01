/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.DummyMeaw;

import Meraj_Ahmed__2221557.ReadWrite;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
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
public class PlaceWashOrderController implements Initializable {

    @FXML
    private TextField clientNameTextField;
    @FXML
    private TextField clientEmailTextField;
    @FXML
    private CheckBox ironingCheckBox;
    @FXML
    private CheckBox LaundryCheckBox;
    @FXML
    private CheckBox stainCheckBox;
    @FXML
    private CheckBox dryCleanCheckBoc;
    @FXML
    private CheckBox wedCheckBox;
    @FXML
    private TableView<Task> orderInfoTableView;
    @FXML
    private TableColumn<Task, String> clientNameCol;
    @FXML
    private TableColumn<Task, String> emailCol;
    @FXML
    private TableColumn<Task, LocalDate> dateCol;
    @FXML
    private TableColumn<Task, Integer> contactCol;
    @FXML
    private TableColumn<Task, String> washTypeCol;
    @FXML
    private DatePicker placingDate;
    @FXML
    private TextField contactNoTextField;
    
    //Used List
    
    private ObservableList<Task> clientOrderList;
    private ObservableList<Task> updateList;
    
    private ObservableList<Client> placeOrderList;

    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        clientOrderList = FXCollections.observableArrayList();
        placeOrderList = FXCollections.observableArrayList();
        updateList = FXCollections.observableArrayList();
        
        clientNameCol.setCellValueFactory(new PropertyValueFactory <Task, String> ("clientName"));
        emailCol.setCellValueFactory(new PropertyValueFactory <Task, String> ("email"));
        dateCol.setCellValueFactory(new PropertyValueFactory <Task, LocalDate> ("orderDate"));
        contactCol.setCellValueFactory(new PropertyValueFactory <Task, Integer > ("Contact"));
        washTypeCol.setCellValueFactory(new PropertyValueFactory <Task, String> ("washType"));

    }

    @FXML
    private void binCreatingButton(ActionEvent event) throws FileNotFoundException, IOException {

    }

    @FXML
    private void placeAnOrderButtonOnClicked(ActionEvent event) {
        orderInfoTableView.getItems().clear();
        
        String name = clientNameTextField.getText();
        String emailClient = clientEmailTextField.getText();
        
        String washType = ironingCheckBox.getText();
        String washType1 = LaundryCheckBox.getText();
        String washType2 = stainCheckBox.getText();
        String washType3 = dryCleanCheckBoc.getText();
        String washType4 = wedCheckBox.getText();
        
        LocalDate dateOforder = placingDate.getValue();
        int contactNo = Integer.parseInt(contactNoTextField.getText());
        
        String wash = "";
        if (ironingCheckBox.isSelected()) {
            wash +=  ironingCheckBox.getText();        
        } else if (LaundryCheckBox.isSelected()) {
            wash +=  LaundryCheckBox.getText();
        } else if (stainCheckBox.isSelected()) {
            wash +=  stainCheckBox.getText();
        } else if (dryCleanCheckBoc.isSelected()) {
            wash +=  dryCleanCheckBoc.getText();
        } else if (wedCheckBox.isSelected()) {
            wash +=  wedCheckBox.getText();
        }
   
        
        Task placeTask = new Task(name, emailClient, wash, contactNo, dateOforder);

        ReadWrite.writeObjectToFile("PlaceTask.bin", placeTask);
        clientOrderList.add(placeTask);
        updateList.add(placeTask);
        
        orderInfoTableView.getItems().addAll(clientOrderList);
        
        
        ironingCheckBox.isDisabled();
        LaundryCheckBox.isDisabled();
        stainCheckBox.isDisabled();
        dryCleanCheckBoc.isDisabled();
        wedCheckBox.isDisabled();
        placingDate.setValue(null);
        clientNameTextField.clear();
        clientEmailTextField.clear();
        contactNoTextField.clear();
    }

    @FXML
    private void doneButtononClicked(ActionEvent event) throws IOException {   
        Task dummyTask = new Task("", "", "", 0, LocalDate.of(2023, 02, 02));
        ObservableList<Task> updateList = (ObservableList<Task>) ReadWrite.readObjectToFile("PlaceTask.bin", dummyTask);

        orderInfoTableView.getItems().addAll(updateList);
    }
    
}
