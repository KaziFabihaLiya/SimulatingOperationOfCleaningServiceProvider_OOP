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
public class SendNoticeController implements Initializable {

    @FXML
    private TextField noticeNameTextField;
    @FXML
    private TextField subjectTextField;
    @FXML
    private TextField descriptionTextField;
    @FXML
    private DatePicker noticeDate;
    @FXML
    private TextArea descriptionShowTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addDescriptionButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void sendNoticeButtonOnClicked(ActionEvent event) {
    }
    
}
