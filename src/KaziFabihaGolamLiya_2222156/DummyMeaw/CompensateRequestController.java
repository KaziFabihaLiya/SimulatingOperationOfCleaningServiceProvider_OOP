<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.DummyMeaw;

import Meraj_Ahmed__2221557.ReadWrite;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;



/**
 * FXML Controller class
 *
 * @author kazif
 */
public class CompensateRequestController implements Initializable {

    @FXML
    private TextField CompensationReason;
    @FXML
    private TextField statusTextField;
    @FXML
    private TextField CompenAmountTextField;
    
    private ObservableList<Request> reqList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        reqList = FXCollections.observableArrayList();
        

    }    

    @FXML
    private void BinCreatingButton(ActionEvent event) {
        statusTextField.setText("Pending");
        statusTextField.visibleProperty();
        String reason = CompensationReason.getText();
        String status = statusTextField.getText();
        int Amt = Integer.parseInt(CompenAmountTextField.getText());
        
        Request one = new Request(reason,Amt,status);
        
        reqList.add(one);
        
        ReadWrite.writeObjectToFile("request.bin", one);
        
        CompensationReason.clear();
        statusTextField.clear();
        CompenAmountTextField.clear();
        
    }
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.DummyMeaw;

import Meraj_Ahmed__2221557.ReadWrite;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;



/**
 * FXML Controller class
 *
 * @author kazif
 */
public class CompensateRequestController implements Initializable {

    @FXML
    private TextField CompensationReason;
    @FXML
    private TextField statusTextField;
    @FXML
    private TextField CompenAmountTextField;
    
    private ObservableList<Request> reqList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        reqList = FXCollections.observableArrayList();
        

    }    

    @FXML
    private void BinCreatingButton(ActionEvent event) {
        statusTextField.setText("Pending");
        statusTextField.visibleProperty();
        String reason = CompensationReason.getText();
        String status = statusTextField.getText();
        int Amt = Integer.parseInt(CompenAmountTextField.getText());
        
        Request one = new Request(reason,Amt,status);
        
        reqList.add(one);
        
        ReadWrite.writeObjectToFile("request.bin", one);
        
        CompensationReason.clear();
        statusTextField.clear();
        CompenAmountTextField.clear();
        
    }
    
}
>>>>>>> origin/simulating_operations_of_chain_cleaning_service_provider
