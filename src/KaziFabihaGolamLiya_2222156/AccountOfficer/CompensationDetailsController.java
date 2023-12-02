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

       Request dummyIns = new Request("",0,""); 
        
        try {
            reqlist = (ObservableList<Request>) ReadWrite.readObjectToFile("ApplyLeave.bin", dummyIns);
        } catch (IOException ex) {
            Logger.getLogger(CompensationDetailsController.class.getName()).log(Level.SEVERE, null, ex);
        }
       ///for ( HRLeaveModel xv : reqlist  ){
            //System.out.println(xv.toString());
        //}
        
        compensationTableView.getItems().addAll(reqlist);
    }

    @FXML
    private void approveButton(ActionEvent event) {
          try { 
            if ( compensationTableView.getSelectionModel().getSelectedItem() == null ){
                throw new RuntimeException("Table Selection cannot be empty.");
            }
            for ( Request ReqData : reqlist ) {
                if(ReqData.equals(reqlist.get(0))){
                    ReadWrite.overWriteObjectToFile("request.bin", ReqData);
                    //System.out.println(leaveReqData);
                }
                else if ( ReqData == compensationTableView.getSelectionModel().getSelectedItem() ){
                     ReqData.setStatus("Approved");
                   ReadWrite.writeObjectToFile("request.bin", ReqData);
                    //System.out.println(leaveReqData);
                }
                else{
                    ReadWrite.writeObjectToFile("request.bin", ReqData);
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
    private void rejectButton(ActionEvent event) {
        
       try { 
            if ( compensationTableView.getSelectionModel().getSelectedItem() == null ){
                throw new RuntimeException("Table Selection cannot be empty.");
            }
            for ( Request ReqData : reqlist ) {
                if(ReqData.equals(reqlist.get(0))){
                    ReadWrite.overWriteObjectToFile("request.bin", ReqData);
                    //System.out.println(leaveReqData);
                }
                else if ( ReqData == compensationTableView.getSelectionModel().getSelectedItem() ){
                     ReqData.setStatus("Rejected");
                   ReadWrite.writeObjectToFile("request.bin", ReqData);
                    //System.out.println(leaveReqData);
                }
                else{
                    ReadWrite.writeObjectToFile("request.bin", ReqData);
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
    private void readFromBin(ActionEvent event) throws IOException {
        
//                timePerformanceModel performancedummy = new timePerformanceModel("", "", "", 0, 0);
//
//        readperfList = (ObservableList<timePerformanceModel>) ReadWrite.readObjectToFile("PerformanceList.bin", performancedummy);
//
//        //System.out.println(readperfList.size());
//        String add = "";
//        for (timePerformanceModel perf : readperfList) {
//            //System.out.println(perf.toString());
//            add += perf.toString();
//
//        }
       // performanceTextArea.appendText(add);
        
        Request dummyReq = new Request("",0, "Pending");
        reqlist = (ObservableList<Request>) ReadWrite.readObjectToFile("request.bin", dummyReq);
        
        compensationTableView.getItems().addAll(reqlist);
        
        
    }
    private void refreshTable(){
        // updatereqlist.clear();
        compensationTableView.getItems().clear();
        //updatereqlist = HR_Manager.acceptOrRejectPendingPermission(updatereqlist);//
        compensationTableView.getItems().addAll(reqlist);
        
    }

}
