/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.cleaningCrewMember;

import KaziFabihaGolamLiya_2222156.DummyMeaw.Task;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author kazif
 */
public class TaskAnalyticsController implements Initializable {

    @FXML
    private PieChart PieChart;
    @FXML
    private TextField NoOfCompletedTaskTextField;
    @FXML
    private TextField NoOfPendingTaskTextField;
;
    @FXML
    private Label LabelOfRatio;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void showPieChartOnButtonClicked(ActionEvent event) {
        
        int numOfCom = Integer.parseInt(NoOfCompletedTaskTextField.getText());
        int numOfPend = Integer.parseInt(NoOfPendingTaskTextField.getText());
        

        
        ObservableList<PieChart.Data> piechartData = FXCollections.observableArrayList(
                new PieChart.Data("Completed Task",  numOfCom),
                new PieChart.Data("Pending Task",  numOfPend));
                
        PieChart.setData(piechartData);
        PieChart.setTitle("Task Analytics has been showed");

        
        
    }

    @FXML
    private void OnHoveredOverArea(MouseEvent event) {
        
        int numOfCom = Integer.parseInt(NoOfCompletedTaskTextField.getText());
        int numOfPend = Integer.parseInt(NoOfPendingTaskTextField.getText());
        
        if (numOfCom>numOfPend){
        
             LabelOfRatio.setText("You have completed more task than the current pending Task");
        } else if (numOfPend>numOfCom) {
            LabelOfRatio.setText("You have more pending more task than the completed Task, Complete more Task !");
        } else {

        }
       
    }
    
}
