/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.Administration_Officer;

import Meraj_Ahmed__2221557.GenerateAlerts;
import Meraj_Ahmed__2221557.ReadWrite;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class SendNoticeController implements Initializable {

    @FXML
    private TextField noticeNameTextField;
    @FXML
    private TextField subjectTextField;
    @FXML
    private TextField descriptionTextField;
    @FXML
    private DatePicker noticeDate;
    @FXML
    private TableView<sendNoticeModel> noticeTableView;
    @FXML
    private TableColumn<sendNoticeModel, String> noticeNameTableColumn;
    @FXML
    private TableColumn<sendNoticeModel, LocalDate> noticeDateTableColumn;
    @FXML
    private TableColumn<sendNoticeModel, String> noticeSubjectTableColumn;

    private ArrayList<String> noticeDescList;

    private ObservableList<sendNoticeModel> noticeList;
    @FXML
    private TextArea descriptionShowTextArea;
    @FXML
    private TextArea loadNoticeTextArea;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        noticeDescList = new ArrayList<String>();

        noticeNameTableColumn.setCellValueFactory(new PropertyValueFactory<sendNoticeModel, String>("noticeName"));
        noticeSubjectTableColumn.setCellValueFactory(new PropertyValueFactory<sendNoticeModel, String>("noticeSubject"));
        noticeDateTableColumn.setCellValueFactory(new PropertyValueFactory<sendNoticeModel, LocalDate>("noticeDate"));
        
        sendNoticeModel notice = new sendNoticeModel("", "",  null, new ArrayList<String>());
        
        try {
            noticeList = (ObservableList<sendNoticeModel>) ReadWrite.readObjectToFile("LCNotice.bin", notice);
        } catch (IOException ex) {
            Logger.getLogger(SendNoticeController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        noticeTableView.getItems().addAll(noticeList);

    }

    @FXML
    private void sendNoticeButtonOnClicked(ActionEvent event) {
        try{
            String name = noticeNameTextField.getText();
            String subj=subjectTextField.getText();
            LocalDate date = noticeDate.getValue();

            sendNoticeModel newNotice = new sendNoticeModel(name, subj, date, noticeDescList );
            if ( GenerateAlerts.confirmationAlert() ) {
                AdministrationOfficer.sendTheNotice(newNotice);
            }
            
        }
        catch ( Exception e ){
            GenerateAlerts.unsuccessfulAlert("Please Fill all the Information Carefully and try again.");
        }
            noticeDescList.clear();
            noticeNameTextField.clear();
            subjectTextField.clear();
            noticeDate.setValue(null);
            descriptionShowTextArea.clear();
        
    }


    @FXML
    private void loadNoticeButtonOnClicked(ActionEvent event) {
        try{
            // Throwing an Exception if Table row is not Selected.
            if ( noticeTableView.getSelectionModel().getSelectedItem() == null ) throw new RuntimeException("Exception");
                loadNoticeTextArea.clear();

            for ( sendNoticeModel tmp : noticeList ){
                if ( tmp == noticeTableView.getSelectionModel().getSelectedItem() ){
                    
                    for ( String data : tmp.getNoticeDescription()){
                        loadNoticeTextArea.appendText(data + "\n");
                }
            }
        }
        }
        catch( RuntimeException e ) {
            GenerateAlerts.unsuccessfulAlert("Please Select the File from Table to Load.");
        }
    }

    @FXML
    private void downloadPdfButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void addDescriptionButtonOnClicked(ActionEvent event) {
        try{
            if (descriptionTextField.getText().isEmpty() ) throw new RuntimeException("Notice description cannot be empty.");
            else noticeDescList.add(descriptionTextField.getText());
            descriptionShowTextArea.appendText(descriptionTextField.getText() + "\n");
            descriptionTextField.clear();
        }
        catch ( RuntimeException e){
            GenerateAlerts.unsuccessfulAlert("Please write Notice Description.");
        }
    }

    @FXML
    private void refreshButtonOnClick(ActionEvent event) throws IOException {
        ObservableList<sendNoticeModel> noticeNewList = (ObservableList<sendNoticeModel>) ReadWrite.readObjectToFile("LCNotice.bin", noticeList.get(0));
        noticeTableView.getItems().clear();
        noticeList.clear();
        noticeList.addAll(noticeNewList);
        noticeTableView.getItems().addAll(noticeNewList);
    }

    @FXML
    private void deleteNoticeButtonOnClicked(ActionEvent event) throws IOException {
         try{
            if ( noticeTableView.getSelectionModel().getSelectedItem() == null ) throw new RuntimeException("Exception");
            if ( GenerateAlerts.confirmationAlert() ){
                ObservableList<sendNoticeModel> updateNoticeList = AdministrationOfficer.deleteNotice(noticeTableView.getSelectionModel().getSelectedItem());
                noticeTableView.getItems().clear();
                noticeTableView.getItems().addAll(updateNoticeList);
                descriptionTextField.clear();
                
            }
        }
        catch(RuntimeException ee){
            GenerateAlerts.unsuccessfulAlert("Please Select the File from Table to Load.");
        }
    }

}