/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Meraj_Ahmed__2221557.HR_Manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class ViewNoticeController implements Initializable {

    @FXML
    private TableView<?> noticeTableView;
    @FXML
    private TableColumn<?, ?> noticeNameTableColumn;
    @FXML
    private TableColumn<?, ?> noticeDateTableColumn;
    @FXML
    private TableColumn<?, ?> noticeSubjectTableColumn;
    @FXML
    private TextArea loadNoticeTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void loadNoticeButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void downloadPdfButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void refreshButtonOnClick(ActionEvent event) {
    }

    
}
