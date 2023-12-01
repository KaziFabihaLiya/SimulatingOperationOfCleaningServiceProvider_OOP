/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.cleaningCrewMember;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

/**
 * FXML Controller class
 *
 * @author kazif
 */
public class TaskAnalyticsController implements Initializable {

    @FXML
    private PieChart PieChart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void showPieChartOnButtonClicked(ActionEvent event) {
        
        
        
        
        ObservableList<PieChart.Data> piechartData = FXCollections.observableArrayList(
                new PieChart.Data("Accounts",  25000),
                new PieChart.Data("Cleaning Crew",  10000),
                new PieChart.Data("Human Resource",  30000),
                new PieChart.Data("Administration",  50000));
                
        //pieChartSalary.setData(piechartData);
        //pieChartSalary.setTitle("User's Salary Pie Chart");

        
        
    }
    
}
