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
    
    int empSalary, bonus;
    int taxPercent;

    public Salary(int empSalary, int bonus, int taxPercent, int employeeCode, String department, String address, LocalDate dateOfJoining, String name, String gender, String email, String userType, String password, LocalDate dateOfBirth, long contact) {
        super(employeeCode, department, address, dateOfJoining, name, gender, email, userType, password, dateOfBirth, contact);
        this.empSalary = empSalary;
        this.bonus = bonus;
        this.taxPercent = taxPercent;
    }
    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(int taxPercent) {
        this.taxPercent = taxPercent;
    }
    
    public int getNetSalary() {
        int a = (empSalary+ bonus - (empSalary*taxPercent/100));
                return a;
    }
    }

