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
public class timePerformanceModel  implements Serializable {
    public String name ,perfDept,month ;
    public int code,score;

    public timePerformanceModel(String name, String perfDept, String month, int code, int score) {
        this.name = name;
        this.perfDept = perfDept;
        this.month = month;
        this.code = code;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerfDept() {
        return perfDept;
    }

    public void setPerfDept(String perfDept) {
        this.perfDept = perfDept;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "" + "The Employee from the " + perfDept + " department" + "\n" + " with the name of " + name + " and code of " + code + " has performance score " + score + "on the month of "+ month+ "\n" + "\n";
    }
    
}

    
  

    
