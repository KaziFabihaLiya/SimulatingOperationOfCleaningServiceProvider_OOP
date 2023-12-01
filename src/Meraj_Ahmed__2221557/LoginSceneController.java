/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557;

import Meraj_Ahmed__2221557.SceneSwitching;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class LoginSceneController implements Initializable {

    @FXML
    private TextField getEmailTextfield;
    @FXML
    private TextField getPasswordTextField;
    @FXML
    private ComboBox<String> selectUserComboBox;
    @FXML
    private ImageView ImageView;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectUserComboBox.getItems().addAll("Administration Officer",
                "HR Manager", "Accounts Officer", "Cleaning Crew Member", "Client");
        Image background = new Image("/Icons/BackgroundImageLogin.jpg");
        ImageView.setImage(background);
        
    }

    @FXML
    private void logInButtonOnClick(ActionEvent event) throws IOException {
        String user = selectUserComboBox.getValue();
        SignupData signup = new SignupData(0, "", "", "", "", LocalDate.of(2023, 03, 10));
        ObservableList<SignupData> signupList = (ObservableList<SignupData>) ReadWrite.readObjectToFile("SignupData.bin", signup);
        for (SignupData xy : signupList) {
            //System.out.println(xy.toString());
            if (xy.getEmail().equals(getEmailTextfield.getText()) && xy.getPassword().equals(getPasswordTextField.getText())) {
                if (user.equals("HR Manager")) {
                   
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    SceneSwitching newScene = new SceneSwitching();
                    newScene.sceneSwitchingWithoutDataPassing(stage,"/Meraj_Ahmed__2221557/HR_Manager/HR_Manager_DashBoard.fxml");
                }
                else if (user.equals("Administration Officer")) {
                   
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    SceneSwitching newScene = new SceneSwitching();
                    newScene.sceneSwitchingWithoutDataPassing(stage,"/Meraj_Ahmed__2221557/Administration_Officer/Administration_Officer_Dashboard.fxml");  
                }
                else if (user.equals("Accounts Officer")) {
                   
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    SceneSwitching newScene = new SceneSwitching();
                    newScene.sceneSwitchingWithoutDataPassing(stage,"/KaziFabihaGolamLiya_2222156/AccountOfficer/AccOfficerDashboard.fxml");  
                }
                else if (user.equals("Cleaning Crew Member")) {
                   
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    SceneSwitching newScene = new SceneSwitching();
                    newScene.sceneSwitchingWithoutDataPassing(stage,"/KaziFabihaGolamLiya_2222156/cleaningCrewMember/CleaningCrewMemberDashboard.fxml");  
                }
                else if (user.equals("Client")) {
                   
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    SceneSwitching newScene = new SceneSwitching();
                    newScene.sceneSwitchingWithoutDataPassing(stage,"/KaziFabihaGolamLiya_2222156/DummyMeaw/PlaceWashOrder.fxml");  
                }
            }

        }
    }

    @FXML
    private void signUpButtonOnClick(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        SceneSwitching newScene = new SceneSwitching();
        newScene.sceneSwitchingWithoutDataPassing(stage, "Signup.fxml");
    }

    @FXML
    private void forgetPasswordButtonOnClick(ActionEvent event) {
    }

}
