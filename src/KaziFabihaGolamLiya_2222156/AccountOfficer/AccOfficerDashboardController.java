/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.AccountOfficer;

import Meraj_Ahmed__2221557.SceneSwitching;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kazif
 */
public class AccOfficerDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void switchToTransactionButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Transaction.fxml"));
        Scene TranScene = new Scene (root);
        
        Stage newWin = new Stage ();
        
        newWin.setScene(TranScene);
        newWin.setTitle("Transaction Panel");
        newWin.show();
    }

    @FXML
    private void switchToProfileScalingButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProfitScaling.fxml"));
        Scene TranScene = new Scene (root);
        
        Stage newWin = new Stage ();
        
        newWin.setScene(TranScene);
        newWin.setTitle("Profit Statistic Panel");
        newWin.show();
    }

    @FXML
    private void switchToVendorpanelButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Vendor.fxml"));
        Scene VendorScene = new Scene (root);
        
        Stage newWin = new Stage ();
        
        newWin.setScene(VendorScene);
        newWin.setTitle("Vendor Panel");
        newWin.show();
    }

    @FXML
    private void switchToLoginSceneButton(ActionEvent event) {
    }
}