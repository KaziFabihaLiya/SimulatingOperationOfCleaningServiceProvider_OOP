/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.Administration_Officer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class DevelopementPlanController implements Initializable {

    @FXML
    private TextField planTextField;
    @FXML
    private TextArea publishShowTextArea;
    @FXML
    private DatePicker dateOfIssue;
    @FXML
    private TextField budgetTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void donePublishButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void downloadPdfButtonOnClicked(ActionEvent event) {
    }
    
}
