/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.cleaningCrewMember;

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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author kazif
 */
public class InventoryTrackingAndReportingBackController implements Initializable {

    @FXML
    private TextField ItemQuantityTextField;
    @FXML
    private ComboBox<String> ItemNameComboBox;
    @FXML
    private DatePicker IssueDatePicker;
    @FXML
    private TableColumn<Inventory, String> ItemNeededCol;
    @FXML
    private TableColumn<Inventory, Integer> ItemQuantityCol;
    @FXML
    private TableColumn<Inventory, LocalDate> IssueDateCol;

    private ObservableList<Inventory> InventoryList;
    private ObservableList<Inventory> updateList;
    @FXML
    private TableView<Inventory> tableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        InventoryList = FXCollections.observableArrayList();
        updateList = FXCollections.observableArrayList();

        ItemNameComboBox.getItems().addAll("Detergent", "Garments", "Chemical", "Bleach", "Stain Remover");

        ItemNeededCol.setCellValueFactory(new PropertyValueFactory<Inventory, String>("ItemNeeded"));
        ItemQuantityCol.setCellValueFactory(new PropertyValueFactory<Inventory, Integer>("ItemQuantity"));
        IssueDateCol.setCellValueFactory(new PropertyValueFactory<Inventory, LocalDate>("dateOfReporting"));

    }

    @FXML
    private void ReportToAdminButtonOnClicked(ActionEvent event) throws IOException {
        Inventory dummyInventory = new Inventory("",  0, LocalDate.of(2023, 02, 02));
        ObservableList<Inventory> updateList = (ObservableList<Inventory>) ReadWrite.readObjectToFile("Inventory.bin", dummyInventory);

        tableView.getItems().addAll(updateList);
    }

    @FXML
    private void SubmitButtonHover(MouseEvent event) {

    }

    @FXML
    private void SubmitButtonOnClicked(ActionEvent event) {
        
        String itemName = ItemNameComboBox.getValue();
        int itemQuantity = Integer.parseInt(ItemQuantityTextField.getText());
        LocalDate date = IssueDatePicker.getValue();

        Inventory demo = new Inventory(itemName, itemQuantity, date);
        
        
        ReadWrite.writeObjectToFile("Inventory.bin", demo);
        
        updateList.add(demo);
        InventoryList.add(demo);
        
        ItemNameComboBox.setValue(null);
        ItemQuantityTextField.clear();
        IssueDatePicker.setValue(null);
        
        

    }

}
