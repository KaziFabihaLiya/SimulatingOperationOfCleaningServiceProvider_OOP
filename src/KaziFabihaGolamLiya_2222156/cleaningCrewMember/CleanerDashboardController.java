/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.cleaningCrewMember;

import Meraj_Ahmed__2221557.SceneSwitching;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kazif
 */
public class CleanerDashboardController implements Initializable {

    @FXML
    private TextArea dashBoardTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO
    }    

    @FXML
    private void GoToApplyBtn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CleanerTask.fxml"));
        Scene rootScene = new Scene(root);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();

        newWindow.setTitle("Apply for Task");
        newWindow.setScene(rootScene);
        newWindow.show();
    }

    @FXML
    private void GoToUnassignedTaskBTN(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CleanerTask.fxml"));
        Scene rootScene = new Scene(root);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();

        newWindow.setTitle("Apply for Task");
        newWindow.setScene(rootScene);
        newWindow.show();
    }

    @FXML
    private void GoToTaskAnalyticsBtn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TaskAnalytics.fxml"));
        Scene rootScene = new Scene(root);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();

        newWindow.setTitle("Task Analytics");
        newWindow.setScene(rootScene);
        newWindow.show();
    }

    @FXML
    private void taskSUbmitBTn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CleanerTask.fxml"));
        Scene rootScene = new Scene(root);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();

        newWindow.setTitle("Task Submission");
        newWindow.setScene(rootScene);
        newWindow.show();
    }

    @FXML
    private void goToNoticeBoradBTN(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("NoticeBoardForCleaners.fxml"));
        Scene rootScene = new Scene(root);

        Stage newWindow = new Stage();

        newWindow.setTitle("Cleaners Notice Board");
        newWindow.setScene(rootScene);
        newWindow.show();
    }

    @FXML
    private void goBacktoLogInInterfaceButton(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
        Scene rootScene = new Scene(root);

        Stage newWindow = new Stage();

        newWindow.setTitle("Laundry Cheese");
        newWindow.setScene(rootScene);
        newWindow.show();
        
    }
    
}
