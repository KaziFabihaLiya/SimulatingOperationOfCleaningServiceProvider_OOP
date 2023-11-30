/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.cleaningCrewMember;

import KaziFabihaGolamLiya_2222156.DummyMeaw.Client;
import Meraj_Ahmed__2221557.AppendableObjectOutputStream;
import Meraj_Ahmed__2221557.ReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kazif
 */
public class CleanerTaskController implements Initializable {

    @FXML
    private ComboBox<String> unassignedTaskCombobox;
    @FXML
    private TextField employeeName;
    @FXML
    private TextField employeeCode;
    @FXML
    private ComboBox<String> selectWorkerTypeComboBox;
    @FXML
    private TableColumn<Cleaner, String> taskDatacol;
    @FXML
    private TableColumn<Cleaner, String> workerTypeCol;
    @FXML
    private CheckBox checkBoxOfTaskSubmission;
    @FXML
    private ComboBox<String> workerTypeSubmissionComboBox;
    @FXML
    private ComboBox<String> pendingTaskListCombobox;
    @FXML
    private TextField workerName;
    @FXML
    private TextField workerCode;
    @FXML
    private TableView<Client> tableViewUnassignedTask;
    @FXML
    private TableColumn<Cleaner, LocalDate> OrderDateCol;

    ObservableList<Cleaner> CleanerList;
    @FXML
    private TableView<Cleaner> ReadBinToTableView;
    @FXML
    private TableColumn<Cleaner, String> workerNameCol;
    @FXML
    private TableColumn<Cleaner, Integer> workerCodeCol;
    @FXML
    private TableColumn<Cleaner, String> doneUndoneStatusCol;
    @FXML
    private TableColumn<Cleaner, Integer> TaskCodeCol;
    
    private ObservableList<Client> orderlist;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        CleanerList = FXCollections.observableArrayList();
        orderlist = FXCollections.observableArrayList();

        unassignedTaskCombobox.getItems().addAll();
        selectWorkerTypeComboBox.getItems().addAll("Cleaner", "Washer", "Dryer", "Ironer", "Householder");
        workerTypeSubmissionComboBox.getItems().addAll("Cleaner", "Washer", "Dryer", "Ironer", "Householder");
        pendingTaskListCombobox.getItems().addAll();

    }

    @FXML
    private void TaskLoaderOFUnassignedTaskButton(ActionEvent event) throws IOException {
                Client dummyReq = new Client("" , null , "", " ", "", "", "", null, 0);
                orderlist = (ObservableList<Client>) ReadWrite.readObjectToFile("Place Order.bin", dummyReq);
        
                tableViewUnassignedTask.getItems().addAll(orderlist);
    }

    @FXML
    private void TaskSubmitButton(ActionEvent event) throws IOException {
        
        
        
        String name = workerName.getText();
        int code = Integer.parseInt(workerCode.getText());
        String type = workerTypeSubmissionComboBox.getValue();
        //Boolean status = checkBoxOfTaskSubmission.isSelected();

        String DoneUndone = "";
        if (checkBoxOfTaskSubmission.isSelected()) {
            DoneUndone += "Done";
        } else if (!checkBoxOfTaskSubmission.isSelected()) {
            DoneUndone += "Undone";

        }

        Cleaner worker = new Cleaner(type, DoneUndone, code, "Cleaners ", "", null, name, "", "", "", "", null, 0);

        CleanerList.add(worker);
        workerName.setText(null);
        workerCode.setText(null);
        workerTypeSubmissionComboBox.setValue(null);
        checkBoxOfTaskSubmission.isDisabled();
        

    }

    @FXML
    private void applyForTaskButton(ActionEvent event) {
    }

    @FXML
    private void readFromBinTOTableView(ActionEvent event) throws IOException {

             
    }
    
}