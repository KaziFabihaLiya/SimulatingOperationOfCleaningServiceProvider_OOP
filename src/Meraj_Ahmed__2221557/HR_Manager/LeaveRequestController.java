/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.HR_Manager;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class LeaveRequestController implements Initializable {

    @FXML
    private TableView<leaveRequestPermissionModel> leaveRequestsTableView;
    @FXML
    private TableColumn<leaveRequestPermissionModel, Integer> codeTableColumn;
    @FXML
    private TableColumn<leaveRequestPermissionModel, String> nameTableColumn;
    @FXML
    private TableColumn<leaveRequestPermissionModel, String> departmentTableColumn;
    @FXML
    private TableColumn<leaveRequestPermissionModel, Integer> leaveDaysTableColumn;
    @FXML
    private TableColumn<leaveRequestPermissionModel, String> reqStatusTableColumn;

    private ObservableList<leaveRequestPermissionModel> reqlist;
    private ObservableList<leaveRequestPermissionModel> updatereqlist;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        reqlist=FXCollections.observableArrayList();
        updatereqlist = FXCollections.observableArrayList();
        
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<leaveRequestPermissionModel, String>("name"));
        codeTableColumn.setCellValueFactory(new PropertyValueFactory<leaveRequestPermissionModel, Integer>("employeeCode"));
        reqStatusTableColumn.setCellValueFactory(new PropertyValueFactory<leaveRequestPermissionModel, String>("reqstatus"));
        departmentTableColumn.setCellValueFactory(new PropertyValueFactory<leaveRequestPermissionModel, String>("department"));
        leaveDaysTableColumn.setCellValueFactory(new PropertyValueFactory<leaveRequestPermissionModel, Integer>("leavedays"));
        
        leaveRequestPermissionModel dummyIns = new leaveRequestPermissionModel(0,"",0,"","", null, "","", "", "", "",null, 0); 
        
        try {
            reqlist = (ObservableList<leaveRequestPermissionModel>) ReadWrite.readObjectToFile("leaveRequestPermissionModel.bin", dummyIns);
        } catch (IOException ex) {
            Logger.getLogger(LeaveRequestController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        leaveRequestsTableView.getItems().addAll(reqlist);

    }
    
    private void refreshTable(){
        updatereqlist.clear();
        leaveRequestsTableView.getItems().clear();
        //updatereqlist = HR_Manager.acceptOrRejectPendingPermission(updatereqlist);//
        leaveRequestsTableView.getItems().addAll(updatereqlist);
        
    }



    @FXML
    private void acceptButtonOnClicked(ActionEvent event) {
        try { 
            if ( leaveRequestsTableView.getSelectionModel().getSelectedItem() == null ){
                throw new RuntimeException("Table Selection cannot be empty.");
            }
            for ( leaveRequestPermissionModel leaveReqData : reqlist ) {
                if ( leaveReqData == leaveRequestsTableView.getSelectionModel().getSelectedItem() ){
                    leaveReqData.setPermissionStatus("Accepted");
                    break;
                }
            }
            refreshTable();
        }
        catch (RuntimeException e){
            GenerateAlerts.unsuccessfulAlert(e.toString());
        }
    }

    @FXML
    private void rejectButtonOnClicked(ActionEvent event) {
        try { 
            if ( leaveRequestsTableView.getSelectionModel().getSelectedItem() == null ){
                throw new RuntimeException("Table Selection cannot be empty.");
            }
            for ( leaveRequestPermissionModel leaveReqData : reqlist ) {
                if ( leaveReqData == leaveRequestsTableView.getSelectionModel().getSelectedItem() ){
                    leaveReqData.setPermissionStatus("Rejected");
                    break;
                }
            }
            refreshTable();
        }
        catch (RuntimeException e){
            GenerateAlerts.unsuccessfulAlert(e.toString());
        }
    }

    @FXML
    private void showTableButtonOnClicked(ActionEvent event) {
    }


}


//(leavedays,reqstatus,employeeCode,department,"", null, name,"", "", "", "",null, 0);
