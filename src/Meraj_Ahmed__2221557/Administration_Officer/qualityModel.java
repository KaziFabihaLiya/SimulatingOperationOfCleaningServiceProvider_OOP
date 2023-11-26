/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Meraj_Ahmed__2221557.Administration_Officer;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author ahmed
 */
public class qualityModel  implements Serializable{
    protected String department;
    protected LocalDate selectDate;

    public qualityModel(String department, LocalDate selectDate) {
        this.department = department;
        this.selectDate = selectDate;
    }

    public String getDepartment() {
        return department;
    }

    public LocalDate getSelectDate() {
        return selectDate;
    }

    @Override
    public String toString() {
        return "" + "There will be inspection on " + department + " Department." + "\n"+
                "Date of inspection : " + selectDate + "\n"+"\n";
    }
    
    
}
