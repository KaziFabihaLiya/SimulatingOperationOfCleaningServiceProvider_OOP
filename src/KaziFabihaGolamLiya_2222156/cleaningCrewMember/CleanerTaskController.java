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
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TableView<Client> tableViewUnassignedTask;
    @FXML
    private TableColumn<Client, LocalDate> OrderDateCol;

    private ObservableList<Cleaner> CleanerList;
    @FXML
    private TableView<Cleaner> ReadBinToTableView;
    @FXML
    private TableColumn<Cleaner, String> workerNameCol;
    @FXML
    private TableColumn<Cleaner, Integer> workerCodeCol;
    @FXML
    private TableColumn<Cleaner, String> doneUndoneStatusCol;
    @FXML
    private TableColumn<Cleaner, String> TaskCodeCol;

    private ObservableList<Client> orderlist;
    @FXML
    private TableView<Client> TableViewUnassignedTask;
    @FXML
    private TableColumn<Client, String> ClientNameCol;
    @FXML
    private TableColumn<Client, String> ClientEmailCol;
    @FXML
    private TableColumn<Client, Integer> ContactCol;
    @FXML
    private TableColumn<Client, String> WashTypeCol;

    private ObservableList<Cleaner> submissionList;
    private ObservableList<Cleaner> updateList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        CleanerList = FXCollections.observableArrayList();
        orderlist = FXCollections.observableArrayList();
        updateList = FXCollections.observableArrayList();
        submissionList = FXCollections.observableArrayList();

        unassignedTaskCombobox.getItems().addAll("Ironing two clothes", "washing curtains", "Drying a dress", "Repairing torn cloth", "Stain removal");
        selectWorkerTypeComboBox.getItems().addAll("Cleaner", "Washer", "Dryer", "Ironer", "Householder");
        workerTypeSubmissionComboBox.getItems().addAll("Cleaner", "Washer", "Dryer", "Ironer", "Householder");
        pendingTaskListCombobox.getItems().addAll("Ironing two clothes", "washing curtains", "Drying a dress", "Repairing torn cloth", "Stain removal");

        ClientNameCol.setCellValueFactory(new PropertyValueFactory<Client, String>("name"));
        ClientEmailCol.setCellValueFactory(new PropertyValueFactory<Client, String>("email"));
        ContactCol.setCellValueFactory(new PropertyValueFactory<Client, Integer>("contact"));
        WashTypeCol.setCellValueFactory(new PropertyValueFactory<Client, String>("washType"));
        OrderDateCol.setCellValueFactory(new PropertyValueFactory<Client, LocalDate>("OrderPlacingDate"));

        workerTypeCol.setCellValueFactory(new PropertyValueFactory<Cleaner, String>("workerType"));
        workerNameCol.setCellValueFactory(new PropertyValueFactory<Cleaner, String>("name"));
        workerCodeCol.setCellValueFactory(new PropertyValueFactory<Cleaner, Integer>("employeeCode"));
        doneUndoneStatusCol.setCellValueFactory(new PropertyValueFactory<Cleaner, String>("statusOfWork"));
        TaskCodeCol.setCellValueFactory(new PropertyValueFactory<Cleaner, String>("taskName"));

    }

    @FXML
    private void TaskLoaderOFUnassignedTaskButton(ActionEvent event) throws IOException {
        Client dummyReq = new Client("", LocalDate.of(2000, 01, 01), "", " ", "", "", "", LocalDate.of(2000, 01, 01), 0);
        orderlist = (ObservableList<Client>) ReadWrite.readObjectToFile("Place Order.bin", dummyReq);

        tableViewUnassignedTask.getItems().addAll(orderlist);

    }

    @FXML
    private void TaskSubmitButton(ActionEvent event) throws IOException {

        String name = workerName.getText();
        int code = Integer.parseInt(workerCode.getText());
        String type = workerTypeSubmissionComboBox.getValue();
        //Boolean status = checkBoxOfTaskSubmission.isSelected();
        String taskName1 = TaskCodeCol.getText();
        String DoneUndone = "";
        if (checkBoxOfTaskSubmission.isSelected()) {
            DoneUndone += "Done";
        } else if (!checkBoxOfTaskSubmission.isSelected()) {
            DoneUndone += "Undone";

        }

        Cleaner worker = new Cleaner(type, DoneUndone, taskName1, code, "", "", LocalDate.of(2023, 02, 02), name, "", "", "", "", LocalDate.of(2023, 02, 02), 0);

        ReadWrite.writeObjectToFile("TaskSubmissionDetails.bin", worker);

        updateList.add(worker);
        submissionList.add(worker);

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

        Cleaner dummy = new Cleaner("", "", "", 0, "", "", LocalDate.of(2023, 02, 02), "", "", "", "", "", LocalDate.of(2023, 02, 02), 0);
        ObservableList<Cleaner> submissionList = (ObservableList<Cleaner>) ReadWrite.readObjectToFile("TaskSubmissionDetails.bin", dummy);

        ReadBinToTableView.getItems().addAll(submissionList);

    }

}
