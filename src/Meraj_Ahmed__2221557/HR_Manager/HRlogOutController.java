/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.HR_Manager;

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
public class HRlogOutController implements Initializable {

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
