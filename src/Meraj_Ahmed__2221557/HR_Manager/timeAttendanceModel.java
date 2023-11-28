/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Meraj_Ahmed__2221557.HR_Manager;

import java.time.LocalDate;

/**
 *
 * @author ahmed
 */
public class timeAttendanceModel {
    public String name, department;
    public int checkin,checkout, code, workhours;
    LocalDate doe;

    public timeAttendanceModel(String name, String department, int checkin, int checkout, int code, int workhours, LocalDate doe) {
        this.name = name;
        this.department = department;
        this.checkin = checkin;
        this.checkout = checkout;
        this.code = code;
        this.workhours = workhours;
        this.doe = doe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
        return "" + "Name : " + name + "        Department : " + department + "          Employee Code : " + code + "       Date Of Entry : " + doe +  "\n" + 
                 "                                Check in : " + checkin + "                  Check out : " + checkout + "                Work Hours : " + workhours + "\n"+ "\n";           
    }
    
    
    
    
    
}
