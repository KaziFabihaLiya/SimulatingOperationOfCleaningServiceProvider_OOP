/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Meraj_Ahmed__2221557;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ahmed
 */
public class SceneSwitching {
    
    public void sceneSwitchingWithoutDataPassing(Stage stage, String sceneName) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource(sceneName)); 
    
        Parent root = loader.load();
        
        Scene scene = new Scene(root);
        
        //Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }
    
    /*public <T> void sceneSwitchingWithDataPassing(Stage stage, String sceneName, String userClassName, T instance) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource(sceneName)); 
    
        Parent root = loader.load();
        
        Scene scene = new Scene(root);
        
        if ( userClassName.equals("Resident") ) {
            ResidentDashboardController loadController = loader.getController();
            loadController.helperOfDataPassing((signUpData) instance);
        }
        
        stage.setScene(scene);
        stage.show();
    }*/
    
    public <T> void logOutSceneSwitching(Stage stage) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Meraj_Ahmed__2221557/LoginScene.fxml")); 
    
        Parent root = loader.load();
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void windowSwitchingWithoutDataPassing(String sceneName) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource(sceneName)); 
    
        Parent root = loader.load();
        
        Scene scene = new Scene(root);
        
        //Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage stage = new Stage();
        stage.setScene(scene);
        
//        //Changes made by Liya
//        iconTitleclass sp = new iconTitleclass();
//        sp.setIconAndTitle(stage);
        
        stage.show();
    }
    
    /*public <T> void windowSwitchingWithDataPassing( String sceneName, String userClassName, T instance) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource(sceneName)); 
    
        Parent root = loader.load();
        
        Scene scene = new Scene(root);

        if ( userClassName.equals("Maintainance") ) {
            SignUpSceneController loadController = loader.getController();
            loadController.helperOfDataPassing((signUpData) instance, "Maintainance");
        }
        
        Stage stage = new Stage();
        stage.setScene(scene);
        
        iconTitleclass sp = new iconTitleclass();
        sp.setIconAndTitle(stage);
        
        stage.show();
    }*/
}
