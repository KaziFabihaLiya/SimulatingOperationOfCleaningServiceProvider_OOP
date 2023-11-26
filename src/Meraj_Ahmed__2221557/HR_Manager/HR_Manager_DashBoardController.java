/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.HR_Manager;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class HR_Manager_DashBoardController implements Initializable {

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
    private void employeeInformationMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("employeeInformation.fxml"));
        borderPaneId.setCenter(parent);
    }

    @FXML
    private void trainingWorkshopMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("training_workshops.fxml"));
        borderPaneId.setCenter(parent);
    }

    @FXML
    private void paySalariesMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("paySalaries.fxml"));
        borderPaneId.setCenter(parent);
    }

    @FXML
    private void jobRecruitmentMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("recruitEmployee.fxml"));
        borderPaneId.setCenter(parent);
    }

    @FXML
    private void leaveApproveMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("leaveRequestPermission.fxml"));
        borderPaneId.setCenter(parent);
    }

    @FXML
    private void complaintsMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("employeeInformation.fxml"));
        borderPaneId.setCenter(parent);
    }

    @FXML
    private void timeAttendanceMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("Attendance_Performance.fxml"));
        borderPaneId.setCenter(parent);
    }

    @FXML
    private void performanceMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("Attendance_Performance.fxml"));
        borderPaneId.setCenter(parent);
    }

    @FXML
    private void logOutMenuItemOnClick(ActionEvent event) {

    }

    @FXML
    private void helpMenuItemOnClick(ActionEvent event) {
    }

}