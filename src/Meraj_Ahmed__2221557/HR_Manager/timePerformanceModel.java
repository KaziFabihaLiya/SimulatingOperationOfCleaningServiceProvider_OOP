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
public class timePerformanceModel  extends Employee implements Serializable {
    protected String perfDept;
    protected int checkin, checkout,score, workhours;
    protected LocalDate doe;

    public timePerformanceModel(String perfDept, int checkin, int checkout, int score, int workhours, LocalDate doe, int employeeCode, String department, String address, LocalDate dateOfJoining, String name, String gender, String email, String userType, String password, LocalDate dateOfBirth, long contact) {
        super(employeeCode, department, address, dateOfJoining, name, gender, email, userType, password, dateOfBirth, contact);
        this.perfDept = perfDept;
        this.checkin = checkin;
        this.checkout = checkout;
        this.score = score;
        this.workhours = workhours;
        this.doe = doe;
    }

    public String getPerfDept() {
        return perfDept;
    }

    public void setPerfDept(String perfDept) {
        this.perfDept = perfDept;
    }

    public int getCheckin() {
        return checkin;
    }

    public void setCheckin(int checkin) {
        this.checkin = checkin;
    }

    public int getCheckout() {
        return checkout;
    }

    public void setCheckout(int checkout) {
        this.checkout = checkout;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getWorkhours() {
        return workhours;
    }

    public void setWorkhours(int workhours) {
        this.workhours = workhours;
    }

    public LocalDate getDoe() {
        return doe;
    }

    public void setDoe(LocalDate doe) {
        this.doe = doe;
    }

  

    @Override
    public String toString() {
        return "" + "Name : " + name + "        Department : " + department + "          Employee Code : " + employeeCode + "       Date Of Entry : " + doe +  "\n" + 
                 "                                Check in : " + checkin + "                  Check out : " + checkout + "                Work Hours : " + workhours + "\n"+ "\n";                           
    }

  
    public String toString2() {
        return "" + "The Employee from the " + perfDept + " department" + "\n" + " with the name of " + name + " and code of " + employeeCode + " has performance score " + score + "\n" + "\n" ;
    }
}
