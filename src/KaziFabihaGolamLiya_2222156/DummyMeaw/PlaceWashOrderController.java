/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.DummyMeaw;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kazif
 */
public class PlaceWashOrderController implements Initializable {

    @FXML
    private TextField clientNameTextField;
    @FXML
    private TextField clientEmailTextField;
    @FXML
    private CheckBox ironingCheckBox;
    @FXML
    private CheckBox LaundryCheckBox;
    @FXML
    private CheckBox stainCheckBox;
    @FXML
    private CheckBox dryCleanCheckBoc;
    @FXML
    private CheckBox wedCheckBox;
    @FXML
    private TableView<Client> orderInfoTableView;
    @FXML
    private TableColumn<Client, String> clientNameCol;
    @FXML
    private TableColumn<Client, String> emailCol;
    @FXML
    private TableColumn<Client, LocalDate> dateCol;
    @FXML
    private TableColumn<Client, Integer> contactCol;
    @FXML
    private TableColumn<Client, String> washTypeCol;
    @FXML
    private TableColumn<Client, Integer> TotalAmountCol;
    @FXML
    private DatePicker placingDate;
    @FXML
    private TextField contactNoTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void checkButtononClicked(ActionEvent event) {
    }

    @FXML
    private void binCreatingButton(ActionEvent event) {
    }

    @FXML
    private void sendToCleanersButton(ActionEvent event) {
    }
    
}
