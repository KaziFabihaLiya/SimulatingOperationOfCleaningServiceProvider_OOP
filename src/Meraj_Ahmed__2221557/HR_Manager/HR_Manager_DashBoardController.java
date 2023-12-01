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
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

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
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("employeeInformation.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();

        newWindow.setTitle("Employee Information");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void trainingWorkshopMenuItemOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("training_workshops.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();

        newWindow.setTitle("Training/Workshops");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void paySalariesMenuItemOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("paySalaries.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();

        newWindow.setTitle("Pay Salaries");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void jobRecruitmentMenuItemOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("recruitEmployee.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();

        newWindow.setTitle("Add Job Recruitment");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void leaveApproveMenuItemOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("leaveRequestPermission.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();

        newWindow.setTitle("Approve leave");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void complaintsMenuItemOnClick(ActionEvent event) throws IOException {
    }

    @FXML
    private void timeAttendanceMenuItemOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("Attendance_Performance.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();

        newWindow.setTitle("Attendance");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void logOutMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("HRlogOut.fxml"));
        borderPaneId.setBottom(parent);
    }

    @FXML
    private void applyLeaveMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("HRleave.fxml"));
        borderPaneId.setRight(parent);
    }

    @FXML
    private void viewNoticeMenuItemOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("viewNotice.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();

        newWindow.setTitle("View Notice");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void issueComplaintsMenuItemOnClick(ActionEvent event) {
    }

}
