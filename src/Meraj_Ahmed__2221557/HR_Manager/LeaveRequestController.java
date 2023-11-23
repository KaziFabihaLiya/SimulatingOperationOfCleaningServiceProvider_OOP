/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.HR_Manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class LeaveRequestController implements Initializable {

    @FXML
    private TableColumn<?, ?> codeTableColumn;
    @FXML
    private TableColumn<?, ?> nameTableColumn;
    @FXML
    private TableColumn<?, ?> departmentTableColumn;
    @FXML
    private TableColumn<?, ?> leaveDaysTableColumn;
    @FXML
    private TableColumn<?, ?> reqStatusTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void dashboardButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void acceptButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void rejectButtonOnClicked(ActionEvent event) {
    }
    
}
