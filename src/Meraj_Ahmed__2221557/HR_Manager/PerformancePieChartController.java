/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.HR_Manager;

import Meraj_Ahmed__2221557.ReadWrite;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class PerformancePieChartController implements Initializable {

    @FXML
    private PieChart performancePieChart;
    @FXML
    private TextArea performanceTextArea;
    @FXML
    private TextField performanceNameTextField;
    @FXML
    private ComboBox<Integer> PerformanceScoreCombobox;
    private ObservableList<timePerformanceModel> readperfList;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        readperfList = FXCollections.observableArrayList();
        PerformanceScoreCombobox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // TODO
    }

    @FXML
    private void showPieChartButtonOnClicked(ActionEvent event) {
        String name = performanceNameTextField.getText();
        int score = PerformanceScoreCombobox.getValue();

        PieChart.Data perfpiechartData= new PieChart.Data(name,score);
        
        performancePieChart.getData().add(perfpiechartData);
        performancePieChart.setTitle("Performance Pie Chart");
        
        performanceNameTextField.clear();
        PerformanceScoreCombobox.setValue(null);
    }

    @FXML
    private void showPerformanceScoreButtonOnClicked(ActionEvent event) throws IOException {
        timePerformanceModel performancedummy = new timePerformanceModel("", "", "", 0, 0);

        readperfList = (ObservableList<timePerformanceModel>) ReadWrite.readObjectToFile("PerformanceList.bin", performancedummy);

        //System.out.println(readperfList.size());
        String add = "";
        for (timePerformanceModel perf : readperfList) {
            //System.out.println(perf.toString());
            add += perf.toString();

        }
        performanceTextArea.appendText(add);
    }


}
