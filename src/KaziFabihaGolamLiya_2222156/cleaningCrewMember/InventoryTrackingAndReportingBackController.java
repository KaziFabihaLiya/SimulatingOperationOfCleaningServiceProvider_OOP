/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.cleaningCrewMember;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
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
    private ComboBox<?> ItemNameComboBox;
    @FXML
    private DatePicker IssueDatePicker;
    @FXML
    private TableColumn<?, ?> ItemNeededCol;
    @FXML
    private TableColumn<?, ?> ItemQuantityCol;
    @FXML
    private TableColumn<?, ?> IssueDateCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ReportToAdminButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void SubmitButtonHover(MouseEvent event) {
    }

    @FXML
    private void SubmitButtonOnClicked(ActionEvent event) {
    }
    
}
