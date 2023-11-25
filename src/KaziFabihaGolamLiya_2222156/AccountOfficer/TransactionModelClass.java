/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.AccountOfficer;

import Meraj_Ahmed__2221557.Employee;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author kazif
 */
public class TransactionModelClass extends Employee implements Serializable {
    LocalDate BillingDate;
    String BillName;
    int BillAmount;

    public TransactionModelClass(LocalDate BillingDate, String BillName, int BillAmount, int employeeCode, String department, String address, LocalDate dateOfJoining, String name, String gender, String email, String userType, String password, LocalDate dateOfBirth, long contact) {
        super(employeeCode, department, address, dateOfJoining, name, gender, email, userType, password, dateOfBirth, contact);
        this.BillingDate = BillingDate;
        this.BillName = BillName;
        this.BillAmount = BillAmount;
    }

    public LocalDate getBillingDate() {
        return BillingDate;
    }

    public void setBillingDate(LocalDate BillingDate) {
        this.BillingDate = BillingDate;
    }

    public String getBillName() {
        return BillName;
    }

    public void setBillName(String BillName) {
        this.BillName = BillName;
    }

    public int getBillAmount() {
        return BillAmount;
    }

    public void setBillAmount(int BillAmount) {
        this.BillAmount = BillAmount;
    }

    @Override
    public String toString() {
        return "TransactionModelClass{" + "BillingDate=" + BillingDate + ", BillName=" + BillName + ", BillAmount=" + BillAmount + '}';
    }
    
    
}
