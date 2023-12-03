/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.DummyMeaw;

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
public class ClientDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GoToPlaceWashOrderButtonOnCLicked(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("PlaceWashOrder.fxml"));
        Scene wash = new Scene(root);

        Stage newWin = new Stage();

        newWin.setScene(wash);
        newWin.setTitle("Order Place");
        newWin.show();
        
    }

    @FXML
    private void GoToCompensationButtonOnClicked(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("CompensateRequest.fxml"));
        Scene com = new Scene(root);

        Stage newWin = new Stage();

        newWin.setScene(com);
        newWin.setTitle("Compensate Request Panel");
        newWin.show();
    }

    @FXML
    private void LogoutSceneSwitch(ActionEvent event) {
    }
    
}
