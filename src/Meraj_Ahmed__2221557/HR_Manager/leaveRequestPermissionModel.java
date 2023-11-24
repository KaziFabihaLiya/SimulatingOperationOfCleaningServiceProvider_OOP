/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Meraj_Ahmed__2221557.HR_Manager;

import Meraj_Ahmed__2221557.Employee;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author ahmed
 */
public class leaveRequestPermissionModel extends Employee implements Serializable {
    protected int leavedays;
    protected String reqstatus;

    public leaveRequestPermissionModel(int leavedays, String reqstatus, int employeeCode, String department, String address, LocalDate dateOfJoining, String name, String gender, String email, String userType, String password, LocalDate dateOfBirth, long contact) {
        super(employeeCode, department, address, dateOfJoining, name, gender, email, userType, password, dateOfBirth, contact);
        this.leavedays = leavedays;
        this.reqstatus = "Pending";
    }

    public int getLeavedays() {
        return leavedays;
    }

    public void setLeavedays(int leavedays) {
        this.leavedays = leavedays;
    }

    public String getReqstatus() {
        return reqstatus;
    }

    public void setReqstatus(String reqstatus) {
        this.reqstatus = reqstatus;
    }

    @Override
    public String toString() {
        return "leaveRequestPermissionModel{" + "leavedays=" + leavedays + ", reqstatus=" + reqstatus + '}';
    }

    void setPermissionStatus(String accepted) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
