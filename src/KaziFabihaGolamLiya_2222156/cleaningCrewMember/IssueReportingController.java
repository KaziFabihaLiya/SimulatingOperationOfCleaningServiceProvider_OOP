/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.cleaningCrewMember;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author kazif
 */
public class IssueReportingController implements Initializable {

    @FXML
    private TextField employeeNameTextField;
    @FXML
    private ComboBox<String> workerTypeCombobox;
    @FXML
    private TextField employeeCodeTextField;
    @FXML
    private ComboBox<String> pendingTaskCombobox;
    @FXML
    private TextArea DescribeIssueTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SendingToHRManagerButton(ActionEvent event) {
    }
    
}
