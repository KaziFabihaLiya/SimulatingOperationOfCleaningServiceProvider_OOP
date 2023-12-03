/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.Administration_Officer;

import KaziFabihaGolamLiya_2222156.cleaningCrewMember.Inventory;
import Meraj_Ahmed__2221557.ReadWrite;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class OrderSuppliesController implements Initializable {

    @FXML
    private TextField ItemQuantityTextField;
    @FXML
    private ComboBox<String> ItemNameComboBox;
    @FXML
    private TableView<Inventory> tableView;
    @FXML
    private TableColumn<Inventory, String> ItemNeededCol;
    @FXML
    private TableColumn<Inventory, Integer> ItemQuantityCol;
    @FXML
    private TableColumn<Inventory, LocalDate> IssueDateCol;
    @FXML
    private TextArea OrderOutputTextArea;
    private ObservableList<Inventory> updateList;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        updateList = FXCollections.observableArrayList();
        ItemNameComboBox.getItems().addAll("Detergent", "Garments", "Chemical", "Bleach", "Stain Remover");

        ItemNeededCol.setCellValueFactory(new PropertyValueFactory<Inventory, String>("ItemNeeded"));
        ItemQuantityCol.setCellValueFactory(new PropertyValueFactory<Inventory, Integer>("ItemQuantity"));
        IssueDateCol.setCellValueFactory(new PropertyValueFactory<Inventory, LocalDate>("dateOfReporting"));
    }

    @FXML
    private void showTableButtonOnClicked(ActionEvent event) throws IOException {
        Inventory dummyInventory = new Inventory("",  0, LocalDate.of(2023, 02, 02));
        ObservableList<Inventory> updateList = (ObservableList<Inventory>) ReadWrite.readObjectToFile("Inventory.bin", dummyInventory);

        tableView.getItems().addAll(updateList);
    }

    @FXML
    private void doneButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void sendBillButtonOnClick(ActionEvent event) {
    }

}
