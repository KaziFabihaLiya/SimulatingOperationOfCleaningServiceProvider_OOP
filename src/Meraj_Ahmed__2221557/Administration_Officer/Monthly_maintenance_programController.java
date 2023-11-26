/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.Administration_Officer;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        maintenanceOptionCombobox.getItems().addAll("Plumbing", "Electrical", "Pump", "Generator", "Elevator");
        tableList = FXCollections.observableArrayList();
        maintenanceNeedTableColumn.setCellValueFactory(new PropertyValueFactory<monthlyMaintenanceModel, String>("maintenanceneeded"));
        expectedDateTableColumn.setCellValueFactory(new PropertyValueFactory<monthlyMaintenanceModel, LocalDate>("expectedDate"));

    }

    @FXML
    private void showPostButtonOnClicked(ActionEvent event) {
        String maintain = maintenanceOptionCombobox.getValue();
        LocalDate edate = expectedDate.getValue();

        monthlyMaintenanceModel mlist = new monthlyMaintenanceModel(maintain, edate);
        
        tableList.add(mlist);
        maintenanceTableView.setItems(tableList);
        
        
        maintenanceOptionCombobox.setValue(null);
        expectedDate.setValue(null);
    }

}
