/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.cleaningCrewMember;

import KaziFabihaGolamLiya_2222156.DummyMeaw.Client;
import KaziFabihaGolamLiya_2222156.DummyMeaw.Task;
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

    //Apply For Task 
    @FXML
    private ComboBox<String> unassignedTaskCombobox;
    @FXML
    private TextField employeeName;
    @FXML
    private TextField employeeCode;
    @FXML
    private ComboBox<String> selectWorkerTypeComboBox;

    //Unassigned Task Loading
    @FXML
    private TableView<Task> TableViewUnassignedTask;
    @FXML
    private TableColumn<Task, String> ClientNameCol;
    @FXML
    private TableColumn<Task, String> ClientEmailCol;
    @FXML
    private TableColumn<Task, Integer> ContactCol;
    @FXML
    private TableColumn<Task, String> WashTypeCol;
    @FXML
    private TableColumn<Task, LocalDate> OrderDateCol;

    // Task Submission 
    @FXML
    private TextField workerNameSubTextField;
    @FXML
    private TextField workerCodeSubTextField;
    @FXML
    private ComboBox<String> workerTypeSubmissionComboBox;
    @FXML
    private ComboBox<String> pendingTaskListSubCombobox;

    //Table View Of Completed Task
    @FXML
    private TableView<TaskSubmissionModelClass> CompletedTaskTableView;
    @FXML
    private TableColumn<TaskSubmissionModelClass, String> workerNameSubCol;
    @FXML
    private TableColumn<TaskSubmissionModelClass, Integer> workerCodeSubCol;
    @FXML
    private TableColumn<TaskSubmissionModelClass, String> workerTypeSubCol;
    @FXML
    private TableColumn<TaskSubmissionModelClass, String> TaskSubCol;

    //private ObservableList<Cleaner> CleanerList;

    private ObservableList<Task> orderlist;
    private ObservableList<TaskSubmissionModelClass> submissionList;
    private ObservableList<TaskSubmissionModelClass> updateList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

//        CleanerList = FXCollections.observableArrayList();
        orderlist = FXCollections.observableArrayList();
        updateList = FXCollections.observableArrayList();
        submissionList = FXCollections.observableArrayList();

        unassignedTaskCombobox.getItems().addAll("Ironing two clothes", "washing curtains", "Drying a dress", "Repairing torn cloth", "Stain removal");
        selectWorkerTypeComboBox.getItems().addAll("Cleaner", "Washer", "Dryer", "Ironer", "Householder");
        workerTypeSubmissionComboBox.getItems().addAll("Cleaner", "Washer", "Dryer", "Ironer", "Householder");
        pendingTaskListSubCombobox.getItems().addAll("Ironing two clothes", "washing curtains", "Drying a dress", "Repairing torn cloth", "Stain removal");

        ClientNameCol.setCellValueFactory(new PropertyValueFactory<Task, String>("clientName"));
        ClientEmailCol.setCellValueFactory(new PropertyValueFactory<Task, String>("email"));
        ContactCol.setCellValueFactory(new PropertyValueFactory<Task, Integer>("Contact"));
        WashTypeCol.setCellValueFactory(new PropertyValueFactory<Task, String>("washType"));
        OrderDateCol.setCellValueFactory(new PropertyValueFactory<Task, LocalDate>("orderDate"));

        workerNameSubCol.setCellValueFactory(new PropertyValueFactory<TaskSubmissionModelClass, String>("cleanerName"));
        workerCodeSubCol.setCellValueFactory(new PropertyValueFactory<TaskSubmissionModelClass, Integer>("cleanerCode"));
        workerTypeSubCol.setCellValueFactory(new PropertyValueFactory<TaskSubmissionModelClass, String>("cleanerType"));
        TaskSubCol.setCellValueFactory(new PropertyValueFactory<TaskSubmissionModelClass, String>("taskName"));

    }

    @FXML
    private void TaskLoaderOFUnassignedTaskButton(ActionEvent event) throws IOException {

        Task dummyReq = new Task("", "", "", 0, LocalDate.of(2023, 02, 02));
        orderlist = (ObservableList<Task>) ReadWrite.readObjectToFile("PlaceTask.bin", dummyReq);

        TableViewUnassignedTask.getItems().addAll(orderlist);

    }


    @FXML
    private void applyForTaskButton(ActionEvent event) {
    }

    @FXML
    private void TaskSubmitButtonOnClicked(ActionEvent event) {
        
        CompletedTaskTableView.getItems().clear();
        
        String name = workerNameSubTextField.getText();
        int code = Integer.parseInt(workerCodeSubTextField.getText());
        String type = workerTypeSubmissionComboBox.getValue();
        String taskName1 = pendingTaskListSubCombobox.getValue();

        TaskSubmissionModelClass taskSubmit = new TaskSubmissionModelClass(name, code,type, taskName1);

        ReadWrite.writeObjectToFile("TaskSubmissionDetails.bin", taskSubmit);

        submissionList.add(taskSubmit);
        updateList.add(taskSubmit);

        workerCodeSubTextField.clear();
        workerNameSubTextField.clear();
        workerTypeSubmissionComboBox.setValue(null);
        pendingTaskListSubCombobox.setValue(null);
        

        
    }

    @FXML
    private void CompletedTaskTableView(ActionEvent event) throws IOException {
        TaskSubmissionModelClass dummySub = new TaskSubmissionModelClass("", 0, "", "" );
        ObservableList<TaskSubmissionModelClass> updateList = (ObservableList<TaskSubmissionModelClass>) ReadWrite.readObjectToFile("TaskSubmissionDetails.bin", dummySub);

        CompletedTaskTableView.getItems().addAll(updateList);
        
        //CompletedTaskTableView.getItems().addAll(submissionList);
        
    }

}
