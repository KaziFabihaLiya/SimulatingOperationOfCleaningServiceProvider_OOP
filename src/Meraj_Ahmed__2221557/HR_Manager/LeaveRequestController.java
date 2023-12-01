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
    private TableView<HRLeaveModel> leaveRequestsTableView;
    @FXML
    private TableColumn<HRLeaveModel, Integer> codeTableColumn;
    @FXML
    private TableColumn<HRLeaveModel, String> nameTableColumn;
    @FXML
    private TableColumn<HRLeaveModel, String> departmentTableColumn;
    @FXML
    private TableColumn<HRLeaveModel, Integer> leaveDaysTableColumn;
    @FXML
    private TableColumn<HRLeaveModel, String> reqStatusTableColumn;

    private ObservableList<HRLeaveModel> reqlist;
    private ObservableList<HRLeaveModel> updatereqlist;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        reqlist=FXCollections.observableArrayList();
        updatereqlist = FXCollections.observableArrayList();
        
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<HRLeaveModel, String>("name"));  
        codeTableColumn.setCellValueFactory(new PropertyValueFactory<HRLeaveModel, Integer>("employeecode"));
        reqStatusTableColumn.setCellValueFactory(new PropertyValueFactory<HRLeaveModel, String>("status"));
        departmentTableColumn.setCellValueFactory(new PropertyValueFactory<HRLeaveModel, String>("department"));
        leaveDaysTableColumn.setCellValueFactory(new PropertyValueFactory<HRLeaveModel, Integer>("selectdays"));
        
        HRLeaveModel dummyIns = new HRLeaveModel("","","",0,0); 
        
        try {
            reqlist = (ObservableList<HRLeaveModel>) ReadWrite.readObjectToFile("ApplyLeave.bin", dummyIns);
        } catch (IOException ex) {
            Logger.getLogger(LeaveRequestController.class.getName()).log(Level.SEVERE, null, ex);
        }
       ///for ( HRLeaveModel xv : reqlist  ){
            //System.out.println(xv.toString());
        //}
        
        leaveRequestsTableView.getItems().addAll(reqlist);

    }
    
    private void refreshTable(){
        // updatereqlist.clear();
        leaveRequestsTableView.getItems().clear();
        //updatereqlist = HR_Manager.acceptOrRejectPendingPermission(updatereqlist);//
        leaveRequestsTableView.getItems().addAll(reqlist);
        
    }



    @FXML
    private void acceptButtonOnClicked(ActionEvent event) {
        try { 
            if ( leaveRequestsTableView.getSelectionModel().getSelectedItem() == null ){
                throw new RuntimeException("Table Selection cannot be empty.");
            }
            for ( HRLeaveModel leaveReqData : reqlist ) {
                if(leaveReqData.equals(reqlist.get(0))){
                    ReadWrite.overWriteObjectToFile("ApplyLeave.bin", leaveReqData);
                    //System.out.println(leaveReqData);
                }
                else if ( leaveReqData == leaveRequestsTableView.getSelectionModel().getSelectedItem() ){
                    leaveReqData.setPermissionStatus("Accepted");
                   ReadWrite.writeObjectToFile("ApplyLeave.bin", leaveReqData);
                    //System.out.println(leaveReqData);
                }
                else{
                    ReadWrite.writeObjectToFile("ApplyLeave.bin", leaveReqData);
                    //System.out.println(leaveReqData);
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
            for ( HRLeaveModel leaveReqData : reqlist ) {
                 if(leaveReqData.equals(reqlist.get(0))){
                    ReadWrite.overWriteObjectToFile("ApplyLeave.bin", leaveReqData);
                    //System.out.println(leaveReqData);
                }
                else if ( leaveReqData == leaveRequestsTableView.getSelectionModel().getSelectedItem() ){
                    leaveReqData.setPermissionStatus("Rejected");
                    ReadWrite.writeObjectToFile("ApplyLeave.bin", leaveReqData);
                    //System.out.println(leaveReqData);
                }
                 else{
                    ReadWrite.writeObjectToFile("ApplyLeave.bin", leaveReqData);
                    //System.out.println(leaveReqData);
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
