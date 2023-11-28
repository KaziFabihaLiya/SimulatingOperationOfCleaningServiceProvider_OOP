/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.AccountOfficer;

/**
 *
 * @author kazif
 */
public class Compensation {
    
    String reasonData;
    int amount;
    Boolean status;

    public Compensation(String reasonData, int amount, Boolean status) {
        this.reasonData = reasonData;
        this.amount = amount;
        this.status = status;
    }

    public String getReasonData() {
        return reasonData;
    }

    public void setReasonData(String reasonData) {
        this.reasonData = reasonData;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    
}
