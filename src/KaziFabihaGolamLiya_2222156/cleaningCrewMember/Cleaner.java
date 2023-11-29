/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.cleaningCrewMember;

import Meraj_Ahmed__2221557.Employee;

import java.io.Serializable;
import java.time.LocalDate;

//Liya changes made*****


/**
 *
 * @author kazif
 */
public class Cleaner extends Employee implements Serializable {
    
    String workerType;
    String statusOfWork;

    public Cleaner(String workerType, String statusOfWork, int employeeCode, String department, String address, LocalDate dateOfJoining, String name, String gender, String email, String userType, String password, LocalDate dateOfBirth, long contact) {
        super(employeeCode, department, address, dateOfJoining, name, gender, email, userType, password, dateOfBirth, contact);
        this.workerType = workerType;
        this.statusOfWork = statusOfWork;
    }

    public String getWorkerType() {
        return workerType;
    }

    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    public String getStatusOfWork() {
        return statusOfWork;
    }

    public void setStatusOfWork(String statusOfWork) {
        this.statusOfWork = statusOfWork;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    
    
    
    
}
