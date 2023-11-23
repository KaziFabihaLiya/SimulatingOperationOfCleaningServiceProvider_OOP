/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Meraj_Ahmed__2221557.HR_Manager;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author ahmed
 */
public class trainingModelClass implements Serializable  {
    protected String title,name,ampm;
    protected int code,startTime;
    protected LocalDate tDate;

    public trainingModelClass(String title, String name, String ampm, int code, int startTime, LocalDate tDate) {
        this.title = title;
        this.name = name;
        this.ampm = ampm;
        this.code = code;
        this.startTime = startTime;
        this.tDate = tDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmpm() {
        return ampm;
    }

    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public LocalDate gettDate() {
        return tDate;
    }

    public void settDate(LocalDate tDate) {
        this.tDate = tDate;
    }

    @Override
    public String toString() {
        return "Employee name : " + name +  " Employee code :  " + code;
    }
    
    
}
