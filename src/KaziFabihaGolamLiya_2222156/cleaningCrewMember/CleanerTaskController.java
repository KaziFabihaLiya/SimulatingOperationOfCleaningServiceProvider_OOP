/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.cleaningCrewMember;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kazif
 */
public class CleanerTaskController implements Initializable {

    @FXML
    private ComboBox<?> unassignedTaskCombobox;
    @FXML
    private Button applyForTaskButton;
    @FXML
    private TextField employeeName;
    @FXML
    private TextField employeeCode;
    @FXML
    private ComboBox<?> selectWorkerTypeComboBox;
    @FXML
    private TableColumn<?, ?> taskDatacol;
    @FXML
    private TableColumn<?, ?> workerTypeCol;
    @FXML
    private TableColumn<?, ?> submissionDateCol;
    @FXML
    private CheckBox checkBoxOfTaskSubmission;
    @FXML
    private ComboBox<?> workerTypeSubmissionComboBox;
    @FXML
    private ComboBox<?> pendingTaskListCombobox;
    @FXML
    private TextField workerName;
    @FXML
    private TextField workerCode;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void TaskLoaderOFUnassignedTaskButton(ActionEvent event) {
    }

    @FXML
    private void TaskSubmitButton(ActionEvent event) {
    }
    
}
