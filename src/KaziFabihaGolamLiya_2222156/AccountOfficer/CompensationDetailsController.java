/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.AccountOfficer;

import KaziFabihaGolamLiya_2222156.DummyMeaw.Request;
import Meraj_Ahmed__2221557.GenerateAlerts;
import Meraj_Ahmed__2221557.ReadWrite;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author kazif
 */
public class CompensationDetailsController implements Initializable {

    @FXML
    private TableView<Request> compensationTableView;
    @FXML
    private TableColumn<Request, String> reasonCol;
    @FXML
    private TableColumn<Request, Integer> amountCol;
    @FXML
    private TableColumn<Request, Boolean> statusCol;

    private ObservableList<Request> reqlist;
    private ObservableList<Request> updatereqlist;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        reqlist = FXCollections.observableArrayList();
        updatereqlist = FXCollections.observableArrayList();

        reasonCol.setCellValueFactory(new PropertyValueFactory<Request, String>("CompensationReason"));
        amountCol.setCellValueFactory(new PropertyValueFactory<Request, Integer>("amountReq"));
        statusCol.setCellValueFactory(new PropertyValueFactory<Request, Boolean>("status"));

        Request ReqOne = new Request("", 0, "Pending");

        try {
            ObservableList<Request>reqlist= (ObservableList<Request>) ReadWrite.readObjectToFile("request.bin", ReqOne);
        } catch (IOException ex) {
            Logger.getLogger(CompensationDetailsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Request req : reqlist) {
            compensationTableView.getItems().addAll(reqlist);
        }

    }

    @FXML
    private void approveButton(ActionEvent event) {

          try { 
                for (Request ReqData : reqlist) {

                    if (ReqData == compensationTableView.getSelectionModel().getSelectedItem()) {

                        ReqData.setStatus("Approved");

                        break;

                    }

                }
        }
        catch (RuntimeException e){
            GenerateAlerts.unsuccessfulAlert(e.toString());
        }
    }

    @FXML
    private void rejectButton(ActionEvent event) {
        
        for (Request ReqData : reqlist) {
            
            if (ReqData == compensationTableView.getSelectionModel().getSelectedItem()) {
                
                ReqData.setStatus("Rejected");
                
                break;
            }
            
        }
        
    }

}
