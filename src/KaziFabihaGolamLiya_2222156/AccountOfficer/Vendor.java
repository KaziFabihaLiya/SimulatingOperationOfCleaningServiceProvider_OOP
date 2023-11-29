/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.AccountOfficer;

import Meraj_Ahmed__2221557.User;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author kazif
 */
public class Vendor extends User implements Serializable {
    String VendorName, VendorEmail, category;
    long contactNo;
    boolean status;
    LocalDate registrationDate;

    public Vendor(String VendorName, String VendorEmail, String category, long contactNo, boolean status, LocalDate registrationDate, String name, String gender, String email, String userType, String password, LocalDate dateOfBirth, long contact) {
        super(name, gender, email, userType, password, dateOfBirth, contact);
        this.VendorName = VendorName;
        this.VendorEmail = VendorEmail;
        this.category = category;
        this.contactNo = contactNo;
        this.status = status;
        this.registrationDate = registrationDate;
    }



    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String VendorName) {
        this.VendorName = VendorName;
    }

    public String getVendorEmail() {
        return VendorEmail;
    }

    public void setVendorEmail(String VendorEmail) {
        this.VendorEmail = VendorEmail;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "Vendor{" + "VendorName=" + VendorName + ", VendorEmail=" + VendorEmail + ", category=" + category + ", contactNo=" + contactNo + ", status=" + status + ", registrationDate=" + registrationDate + '}';
    }

}