/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.AccountOfficer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class TransactionController implements Initializable {

    @FXML
    private ScrollPane displayTransactionRecord;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField codeTextField;
    @FXML
    private ComboBox<?> causeOfBill;
    @FXML
    private TextField billAmount;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showTransactionButton(ActionEvent event) {
    }

    @FXML
    private void addToTransactionRecord(ActionEvent event) {
    }
    
}
