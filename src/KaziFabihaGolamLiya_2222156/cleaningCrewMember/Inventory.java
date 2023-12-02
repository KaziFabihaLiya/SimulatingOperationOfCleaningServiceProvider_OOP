/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.cleaningCrewMember;

import java.time.LocalDate;

/**
 *
 * @author kazif
 */
public class Inventory {
    
            String ItemNeeded;
            int ItemQuantity;
            LocalDate dateOfReporting;

    public Inventory(String ItemNeeded, int ItemQuantity, LocalDate dateOfReporting) {
        this.ItemNeeded = ItemNeeded;
        this.ItemQuantity = ItemQuantity;
        this.dateOfReporting = dateOfReporting;
    }

    public String getItemNeeded() {
        return ItemNeeded;
    }

    public void setItemNeeded(String ItemNeeded) {
        this.ItemNeeded = ItemNeeded;
    }

    public int getItemQuantity() {
        return ItemQuantity;
    }

    public void setItemQuantity(int ItemQuantity) {
        this.ItemQuantity = ItemQuantity;
    }

    public LocalDate getDateOfReporting() {
        return dateOfReporting;
    }

    public void setDateOfReporting(LocalDate dateOfReporting) {
        this.dateOfReporting = dateOfReporting;
    }
    
}
