/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.AccountOfficer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kazif
 */
public class ProfitScalingController implements Initializable {

    @FXML
    private BarChart<String, Number> barChartProfit;
    @FXML
    private CategoryAxis xAxisMonth;
    @FXML
    private TextField costTextField;
    private TextField RevenueTextField;
    @FXML
    private ComboBox<String> monthComboBox;
    @FXML
    private NumberAxis yAxisNumber;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        monthComboBox.getItems().addAll("January","February","March","April","May","June","July","August","September","November","December");
        
        xAxisMonth.setLabel("Month");
        yAxisNumber.setLabel("Amount");
        

        
        

    }    

    @FXML
    private void loadBarChartButton(ActionEvent event) {
        
        int cost = Integer.parseInt(costTextField.getText());
        int rev = Integer.parseInt(RevenueTextField.getText());
        String month = monthComboBox.getValue();
        
        
         XYChart.Series<String,Number> series = new XYChart.Series<String,Number>();
        series.getData().add(new XYChart.Data<String,Number>(month,cost));
        series.getData().add(new XYChart.Data<String,Number>(month,cost));
        series.getData().add(new XYChart.Data<String,Number>(month,cost));
        series.getData().add(new XYChart.Data<String,Number>(month,cost));
        series.setName("Profit Scaling");
        barChartProfit.getData().add(series);
        
    }
    
}
