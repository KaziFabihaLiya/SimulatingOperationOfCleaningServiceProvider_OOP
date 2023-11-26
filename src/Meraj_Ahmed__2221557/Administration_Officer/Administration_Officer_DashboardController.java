/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.Administration_Officer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

//meraj

public class Administration_Officer_DashboardController implements Initializable {

    @FXML
    private BorderPane borderPaneId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void bestEmployeeMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("BestEmployee.fxml"));
        borderPaneId.setCenter(parent);
    }

    @FXML
    private void qualityControlMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("qualityControl.fxml"));
        borderPaneId.setCenter(parent);
    }

    @FXML
    private void developementPlanMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("developementPlan.fxml"));
        borderPaneId.setCenter(parent);
    }

    @FXML
    private void monthlyMaintenanceMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("monthly_maintenance_program.fxml"));
        borderPaneId.setCenter(parent);
    }

    private void senNoticeMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("SendNotice.fxml"));
        borderPaneId.setCenter(parent);
    }

    @FXML
    private void logOutMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void sendNoticeMenuItemOnClick(ActionEvent event) {
    }
    
}
