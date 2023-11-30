/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.Administration_Officer;

import Meraj_Ahmed__2221557.ReadWrite;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class Monthly_maintenance_programController implements Initializable {

    @FXML
    private ComboBox<String> maintenanceOptionCombobox;
    @FXML
    private DatePicker expectedDate;
    @FXML
    private TableView<monthlyMaintenanceModel> maintenanceTableView;
    @FXML
    private TableColumn<monthlyMaintenanceModel, String> maintenanceNeedTableColumn;
    @FXML
    private TableColumn<monthlyMaintenanceModel, LocalDate> expectedDateTableColumn;
    private ObservableList<monthlyMaintenanceModel> tableList;
    private ObservableList<monthlyMaintenanceModel> readtableList;
    @FXML
    private ComboBox<String> maintenanceOptionCombobox1;
    @FXML
    private TextField budgetTextField;
    @FXML
    private BarChart<String, Number> barChart;
    @FXML
    private NumberAxis budgetYAxis;
    @FXML
    private CategoryAxis maintenaceXaxis;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        maintenanceOptionCombobox.getItems().addAll("Plumbing", "Electrical", "Pump", "Generator", "Elevator");
        maintenanceOptionCombobox1.getItems().addAll("Plumbing", "Electrical", "Pump", "Generator", "Elevator");
        tableList = FXCollections.observableArrayList();
        readtableList = FXCollections.observableArrayList();
        maintenanceNeedTableColumn.setCellValueFactory(new PropertyValueFactory<monthlyMaintenanceModel, String>("maintenanceneeded"));
        expectedDateTableColumn.setCellValueFactory(new PropertyValueFactory<monthlyMaintenanceModel, LocalDate>("expectedDate"));
        maintenaceXaxis.setLabel("Maintenance Needed");
        budgetYAxis.setLabel("Allocated budget");
    }

    @FXML
    private void postButtonOnClicked(ActionEvent event) {
        String maintain = maintenanceOptionCombobox.getValue();
        LocalDate edate = expectedDate.getValue();

        monthlyMaintenanceModel mlist = new monthlyMaintenanceModel(maintain, edate);
        
        tableList.add(mlist);
        ReadWrite.writeObjectToFile("MonthlyMaintenance.bin", mlist);
        
        maintenanceTableView.setItems(tableList);
        
        
        maintenanceOptionCombobox.setValue(null);
        expectedDate.setValue(null);
    }

    @FXML
    private void showButtonOnClicked(ActionEvent event) throws IOException {
       monthlyMaintenanceModel dummymaintain = new monthlyMaintenanceModel("", LocalDate.of(2023, 02, 02));
       ObservableList<monthlyMaintenanceModel>readtableList= (ObservableList<monthlyMaintenanceModel>) ReadWrite.readObjectToFile("MonthlyMaintenance.bin", dummymaintain);
 
    
        for (monthlyMaintenanceModel mm : readtableList) {
            maintenanceTableView.setItems(readtableList);
        }
        
        
    }

    @FXML
    private void ShowBarChartButtonOnClicked(ActionEvent event) {
        String maintain = maintenanceOptionCombobox1.getValue();
        int budget = Integer.parseInt(budgetTextField.getText());
        
        
         XYChart.Series<String,Number> series = new XYChart.Series<String, Number>();
        series.getData().add(new XYChart.Data<String, Number>(maintain,budget));
        series.getData().add(new XYChart.Data<String, Number>(maintain,budget));
        series.getData().add(new XYChart.Data<String, Number>(maintain,budget));
        series.getData().add(new XYChart.Data<String, Number>(maintain,budget));
        series.getData().add(new XYChart.Data<String, Number>(maintain,budget));
        series.setName(maintain);
        barChart.getData().add(series);
    }

}
