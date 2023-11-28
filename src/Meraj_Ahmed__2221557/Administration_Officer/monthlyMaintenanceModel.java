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
public class monthlyMaintenanceModel  implements Serializable {
    protected String maintenanceneeded;
    protected LocalDate expectedDate;

    public monthlyMaintenanceModel(String maintenanceneeded, LocalDate expectedDate) {
        this.maintenanceneeded = maintenanceneeded;
        this.expectedDate = expectedDate;
    }

    public String getMaintenanceneeded() {
        return maintenanceneeded;
    }

    public void setMaintenanceneeded(String maintenanceneeded) {
        this.maintenanceneeded = maintenanceneeded;
    }

    public LocalDate getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(LocalDate expectedDate) {
        this.expectedDate = expectedDate;
    }

    @Override
    public String toString() {
        return "monthlyMaintenanceModel{" + "maintenanceneeded=" + maintenanceneeded + ", expectedDate=" + expectedDate + '}';
    }
    
    
}
