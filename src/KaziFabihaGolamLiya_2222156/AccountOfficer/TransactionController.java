/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.AccountOfficer;

import KaziFabihaGolamLiya_2222156.DummyMeaw.GeneratePDFModelClass;
import Meraj_Ahmed__2221557.ReadWrite;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author kazif
 */
public class TransactionController implements Initializable {

    @FXML
    private TableColumn<TransactionModelClass, String> EmployeeNameCol;
    @FXML
    private TableColumn<TransactionModelClass, Integer> EmployeeCodeCol;
    @FXML
    private TableColumn<TransactionModelClass, String> BillTitleCol;
    @FXML
    private TableColumn<TransactionModelClass, Integer> BillAmountCol;
    @FXML
    private TableColumn<TransactionModelClass, LocalDate> DateofBillCol;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField codeTextField;
    @FXML
    private ComboBox<String> causeOfBill;
    @FXML
    private TextField billAmount;
    @FXML
    private TableView<TransactionModelClass> TransactionTableView;
    @FXML
    private DatePicker BillingDateForAdd;

    //private ObservableList<TransactionModelClass> Transaction;
    private ObservableList<TransactionModelClass> TransactionList;
    private ObservableList<TransactionModelClass> readTransactionList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //Transaction = FXCollections.observableArrayList();
        TransactionList = FXCollections.observableArrayList();
        readTransactionList = FXCollections.observableArrayList();

        causeOfBill.getItems().addAll("Vendor Payment", "Maintanence Fee", "Salary Payment", "Promotional Fee", "Extra Expenses");

        EmployeeNameCol.setCellValueFactory(new PropertyValueFactory<TransactionModelClass, String>("name"));
        EmployeeCodeCol.setCellValueFactory(new PropertyValueFactory<TransactionModelClass, Integer>("employeeCode"));
        BillTitleCol.setCellValueFactory(new PropertyValueFactory<TransactionModelClass, String>("BillName"));
        BillAmountCol.setCellValueFactory(new PropertyValueFactory<TransactionModelClass, Integer>("BillAmount"));
        DateofBillCol.setCellValueFactory(new PropertyValueFactory<TransactionModelClass, LocalDate>("BillingDate"));
    }

    @FXML
    private void showTransactionButton(ActionEvent event) throws IOException {


        TransactionModelClass dummytransaction = new TransactionModelClass(LocalDate.of(2023, 02, 02), "", 0, 0, " ", " ", LocalDate.of(2023, 02, 02), "", "", "", "", "", LocalDate.of(2023, 02, 02), 0L);
        ObservableList<TransactionModelClass> readTransactionList = (ObservableList<TransactionModelClass>) ReadWrite.readObjectToFile("Transaction.bin", dummytransaction);

        TransactionTableView.getItems().addAll(readTransactionList);

    }


    @FXML
    private void addToTransactionRecord(ActionEvent event) {
        TransactionTableView.getItems().clear();
        String empName = nameTextField.getText();
        int empCode = Integer.parseInt(codeTextField.getText());
        String billName = causeOfBill.getValue();
        int bill = Integer.parseInt(billAmount.getText());
        LocalDate billDate = BillingDateForAdd.getValue();

        TransactionModelClass Employee1 = new TransactionModelClass(billDate, billName, bill, empCode, " ", " ", null, empName, "", "", "", "", null, 0);

        //Transaction.add(Employee1);
        ReadWrite.writeObjectToFile("Transaction.bin", Employee1);
        
        TransactionList.add(Employee1);
        readTransactionList.add(Employee1);
        
        causeOfBill.setValue(null);
        billAmount.clear();
        BillingDateForAdd.setValue(null);
        nameTextField.clear();
        codeTextField.clear();

    }

    @FXML
    private void createPDFButtonOnClick(ActionEvent event) {
        
                String Bill = ("Name of the Employee is : " + nameTextField.getText() + "\n"
                + "Email : " + codeTextField.getText() + "\n"
                + "Cause of Bill : " + causeOfBill.getValue() + "\n"
                + "Bill Amount " + billAmount.getText() + "\n" + 
                "Date of billing : " + BillingDateForAdd.getValue());
                
                GeneratePDFModelClass.generatePdf(Bill,"Bill Information\b");
    }

}
