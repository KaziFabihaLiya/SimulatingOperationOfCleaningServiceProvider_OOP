/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.AccountOfficer;

import Meraj_Ahmed__2221557.Administration_Officer.sendNoticeModel;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class AcViewNoticeController implements Initializable {

    @FXML
    private TableView<sendNoticeModel> noticeTableView;
    @FXML
    private TableColumn<sendNoticeModel, String> noticeNameTableColumn;
    @FXML
    private TableColumn<sendNoticeModel, LocalDate> noticeDateTableColumn;
    @FXML
    private TableColumn<sendNoticeModel, String> noticeSubjectTableColumn;
    @FXML
    private TextArea loadNoticeTextArea;
    private ObservableList<sendNoticeModel> noticeList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        noticeNameTableColumn.setCellValueFactory(new PropertyValueFactory<sendNoticeModel, String>("noticeName"));
        noticeSubjectTableColumn.setCellValueFactory(new PropertyValueFactory<sendNoticeModel, String>("noticeSubject"));
        noticeDateTableColumn.setCellValueFactory(new PropertyValueFactory<sendNoticeModel, LocalDate>("noticeDate"));

        sendNoticeModel notice = new sendNoticeModel("", "", null, new ArrayList<String>());
       
        try {  
            noticeList = (ObservableList<sendNoticeModel>) ReadWrite.readObjectToFile("LCNotice.bin", notice);
        } catch (IOException ex) {
            Logger.getLogger(AcViewNoticeController.class.getName()).log(Level.SEVERE, null, ex);
        }
         noticeTableView.getItems().addAll(noticeList);
    }    

    @FXML
    private void loadNoticeButtonOnClicked(ActionEvent event) {
         try {
            // Throwing an Exception if Table row is not Selected.
            if (noticeTableView.getSelectionModel().getSelectedItem() == null) {
                throw new RuntimeException("Exception");
            }
            loadNoticeTextArea.clear();

            for (sendNoticeModel tmp : noticeList) {
                if (tmp == noticeTableView.getSelectionModel().getSelectedItem()) {

                    for (String data : tmp.getNoticeDescription()) {
                        loadNoticeTextArea.appendText(data + "\n");
                    }
                }
            }
        } catch (RuntimeException e) {
            GenerateAlerts.unsuccessfulAlert("Please Select the File from Table to Load.");
        }
    }

    @FXML
    private void downloadPdfButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void refreshButtonOnClick(ActionEvent event) throws IOException {
        ObservableList<sendNoticeModel> noticeNewList = (ObservableList<sendNoticeModel>) ReadWrite.readObjectToFile("LCNotice.bin", noticeList.get(0));
        noticeTableView.getItems().clear();
        noticeList.clear();
        noticeList.addAll(noticeNewList);
        noticeTableView.getItems().addAll(noticeNewList);
    }
    
}
