/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Meraj_Ahmed__2221557;

import java.io.Serializable;
import java.time.LocalDate;


public class Employee extends User implements Serializable {
    protected int employeeCode,year;
    protected long salary;
    protected String department;
    protected String address;
    protected String month;
    protected LocalDate dateOfJoining;

    public Employee(int employeeCode, int year, long salary, String department, String address, String month, LocalDate dateOfJoining, String name, String gender, String email, String userType, String password, LocalDate dateOfBirth, long contact) {
        super(name, gender, email, userType, password, dateOfBirth, contact);
        this.employeeCode = employeeCode;
        this.year = year;
        this.salary = salary;
        this.department = department;
        this.address = address;
        this.month = month;
        this.dateOfJoining = dateOfJoining;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeCode=" + employeeCode + ", year=" + year + ", salary=" + salary + ", department=" + department + ", address=" + address + ", month=" + month + ", dateOfJoining=" + dateOfJoining + '}';
    }

}    