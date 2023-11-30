/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.AccountOfficer;

import Meraj_Ahmed__2221557.GenerateAlerts;
import Meraj_Ahmed__2221557.SceneSwitching;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class AcLogOutController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logOutButtonOnClicked(ActionEvent event) throws IOException {
        SceneSwitching newscene = new SceneSwitching();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        if ( GenerateAlerts.confirmationAlert() ) {
        newscene.logOutSceneSwitching(stage);
        GenerateAlerts.successfulAlert("You can always work more!" + "\n" + "Please visit Again"); }
    }
    
}
