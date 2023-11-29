<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.DummyMeaw;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
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
    private TableView<Client> orderInfoTableView;
    @FXML
    private TableColumn<Client, String> clientNameCol;
    @FXML
    private TableColumn<Client, String> emailCol;
    @FXML
    private TableColumn<Client, LocalDate> dateCol;
    @FXML
    private TableColumn<Client, Integer> contactCol;
    @FXML
    private TableColumn<Client, String> washTypeCol;
    @FXML
    private TableColumn<Client, Integer> TotalAmountCol;
    @FXML
    private DatePicker placingDate;
    @FXML
    private TextField contactNoTextField;
    private ObservableList<Client> clientOrderList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        clientOrderList = FXCollections.observableArrayList();
        
        clientNameCol.setCellValueFactory(new PropertyValueFactory <Client, String> ("name"));
        emailCol.setCellValueFactory(new PropertyValueFactory <Client, String> ("email"));
        dateCol.setCellValueFactory(new PropertyValueFactory <Client, LocalDate> ("OrderPlacingDate"));
        contactCol.setCellValueFactory(new PropertyValueFactory <Client, Integer > ("contact"));
        washTypeCol.setCellValueFactory(new PropertyValueFactory <Client, String> ("washType"));
        //TotalAmountCol.setCellValueFactory(new PropertyValueFactory <Client, > ("name"));
        
        // TODO
    }    

    @FXML
    private void checkButtononClicked(ActionEvent event) {
        
        String clientName = clientNameTextField.getText();
        String emailClient = clientEmailTextField.getText();
        String washType = ironingCheckBox.getText();
        String washType1 = LaundryCheckBox.getText();
        String washType2 = stainCheckBox.getText();
        String washType3 = dryCleanCheckBoc.getText();
        String washType4 = wedCheckBox.getText();
        LocalDate dateOforder = placingDate.getValue();
        long No = Long.parseLong(contactNoTextField.getText());
        
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
   
        
        Client customer = new Client(wash , dateOforder , clientName, " ", emailClient, "", "", null, No);
        
        clientOrderList.add(customer);
        
        orderInfoTableView.getItems().addAll(clientOrderList);
        
        
    }

    @FXML
    private void binCreatingButton(ActionEvent event) throws FileNotFoundException, IOException {
        LocalDate dateOforder = placingDate.getValue();
        String washType = ironingCheckBox.getText();
        String washType1 = LaundryCheckBox.getText();
        String washType2 = stainCheckBox.getText();
        String washType3 = dryCleanCheckBoc.getText();
        String washType4 = wedCheckBox.getText();
        
        long date = (placingDate.getValue()).atStartOfDay().toEpochSecond(ZoneOffset.UTC)*1000;
        
        
        Date currentDate = new Date();
        long stamp = currentDate.getTime();
        
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
        
        Client customer = new Client(wash , dateOforder , "", " ", "", "", "", null, 0);
        
        clientOrderList.add(customer);
        
        orderInfoTableView.getItems().addAll(clientOrderList);
        
        FileOutputStream fos = new FileOutputStream("Client.bin",true);
        DataOutputStream dos = new DataOutputStream(fos);
        
        for (Client c: clientOrderList){
            //dos.writeUTF(c.getName());
            //dos.writeUTF(c.getEmail());
           //dos.writeLong(c.date());
            


//SHOMOSSSSHAAAAAA
            
            
          //  dos.writeLong(c. dateFormat.long.parseLong(getOrderPlacingDate()));
            dos.writeUTF(c.getWashType());
        dos.close();
        }
        
    }

    @FXML
    private void sendToCleanersButton(ActionEvent event) {
    }
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.DummyMeaw;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
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
    private TableView<Client> orderInfoTableView;
    @FXML
    private TableColumn<Client, String> clientNameCol;
    @FXML
    private TableColumn<Client, String> emailCol;
    @FXML
    private TableColumn<Client, LocalDate> dateCol;
    @FXML
    private TableColumn<Client, Integer> contactCol;
    @FXML
    private TableColumn<Client, String> washTypeCol;
    @FXML
    private TableColumn<Client, Integer> TotalAmountCol;
    @FXML
    private DatePicker placingDate;
    @FXML
    private TextField contactNoTextField;
    private ObservableList<Client> clientOrderList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        clientOrderList = FXCollections.observableArrayList();
        
        clientNameCol.setCellValueFactory(new PropertyValueFactory <Client, String> ("name"));
        emailCol.setCellValueFactory(new PropertyValueFactory <Client, String> ("email"));
        dateCol.setCellValueFactory(new PropertyValueFactory <Client, LocalDate> ("OrderPlacingDate"));
        contactCol.setCellValueFactory(new PropertyValueFactory <Client, Integer > ("contact"));
        washTypeCol.setCellValueFactory(new PropertyValueFactory <Client, String> ("washType"));
        //TotalAmountCol.setCellValueFactory(new PropertyValueFactory <Client, > ("name"));
        
        // TODO
    }    

    @FXML
    private void checkButtononClicked(ActionEvent event) {
        
        String clientName = clientNameTextField.getText();
        String emailClient = clientEmailTextField.getText();
        String washType = ironingCheckBox.getText();
        String washType1 = LaundryCheckBox.getText();
        String washType2 = stainCheckBox.getText();
        String washType3 = dryCleanCheckBoc.getText();
        String washType4 = wedCheckBox.getText();
        LocalDate dateOforder = placingDate.getValue();
        long No = Long.parseLong(contactNoTextField.getText());
        
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
   
        
        Client customer = new Client(wash , dateOforder , clientName, " ", emailClient, "", "", null, No);
        
        clientOrderList.add(customer);
        
        orderInfoTableView.getItems().addAll(clientOrderList);
        
        
    }

    @FXML
    private void binCreatingButton(ActionEvent event) throws FileNotFoundException, IOException {
        LocalDate dateOforder = placingDate.getValue();
        String washType = ironingCheckBox.getText();
        String washType1 = LaundryCheckBox.getText();
        String washType2 = stainCheckBox.getText();
        String washType3 = dryCleanCheckBoc.getText();
        String washType4 = wedCheckBox.getText();
        
        long date = (placingDate.getValue()).atStartOfDay().toEpochSecond(ZoneOffset.UTC)*1000;
        
        
        Date currentDate = new Date();
        long stamp = currentDate.getTime();
        
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
        
        Client customer = new Client(wash , dateOforder , "", " ", "", "", "", null, 0);
        
        clientOrderList.add(customer);
        
        orderInfoTableView.getItems().addAll(clientOrderList);
        
        FileOutputStream fos = new FileOutputStream("Client.bin",true);
        DataOutputStream dos = new DataOutputStream(fos);
        
        for (Client c: clientOrderList){
            //dos.writeUTF(c.getName());
            //dos.writeUTF(c.getEmail());
           //dos.writeLong(c.date());
            


//SHOMOSSSSHAAAAAA
            
            
          //  dos.writeLong(c. dateFormat.long.parseLong(getOrderPlacingDate()));
            dos.writeUTF(c.getWashType());
        dos.close();
        }
        
    }

    @FXML
    private void sendToCleanersButton(ActionEvent event) {
    }
    
}
>>>>>>> origin/simulating_operations_of_chain_cleaning_service_provider
