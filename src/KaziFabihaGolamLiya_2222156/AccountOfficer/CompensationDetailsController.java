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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author kazif
 */
public class CompensationDetailsController implements Initializable {

    @FXML
    private TableView<Compensation> compensationTableView;
    @FXML
    private TableColumn<Compensation, String> reasonCol;
    @FXML
    private TableColumn<Compensation, Integer> amountCol;
    @FXML
    private TableColumn<Compensation, Boolean> statusCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void approveButton(ActionEvent event) {
        //compensationTableView.se;
    }
    
}
