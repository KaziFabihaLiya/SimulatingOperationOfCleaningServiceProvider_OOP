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
public class Salary extends Employee implements Serializable {
    
    int EmployeeSalary;
    String empDepartment;

    public Salary(int EmployeeSalary, String empDepartment, int employeeCode, String department, String address, LocalDate dateOfJoining, String name, String gender, String email, String userType, String password, LocalDate dateOfBirth, long contact) {
        super(employeeCode, department, address, dateOfJoining, name, gender, email, userType, password, dateOfBirth, contact);
        this.EmployeeSalary = EmployeeSalary;
        this.empDepartment = empDepartment;
    }

    public int getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(int EmployeeSalary) {
        this.EmployeeSalary = EmployeeSalary;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }
    public int EmployeeSalary(String empDepartment){
        
        switch (empDepartment) {
            case "Accounts":
                return (EmployeeSalary=25000);
            case "Cleaning Crew":
                return (EmployeeSalary=10000);
            case "Administration":
                return (EmployeeSalary=50000);
            default:
                return (EmployeeSalary=30000);
        }
    
    }
    
    

}