<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.DummyMeaw;

import java.io.Serializable;

/**
 *
 * @author kazif
 */
public class Request implements Serializable {
    
    String CompensationReason;
    int amountReq;
    String status;

    public Request(String CompensationReason, int amountReq, String status) {
        this.CompensationReason = CompensationReason;
        this.amountReq = amountReq;
        this.status = status;
    }

    public String getCompensationReason() {
        return CompensationReason;
    }

    public void setCompensationReason(String CompensationReason) {
        this.CompensationReason = CompensationReason;
    }

    public int getAmountReq() {
        return amountReq;
    }

    public void setAmountReq(int amountReq) {
        this.amountReq = amountReq;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    @Override
    public String toString() {
        return "Requesting for Compensation\b" + 
                "\n Compensation Reason - " + CompensationReason + 
                "\n Amount that needed to be paid :" + amountReq + ""
                + "\n status " + status ;
    }
    
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.DummyMeaw;

import java.io.Serializable;

/**
 *
 * @author kazif
 */
public class Request implements Serializable {
    
    String CompensationReason;
    int amountReq;
    String status;

    public Request(String CompensationReason, int amountReq, String status) {
        this.CompensationReason = CompensationReason;
        this.amountReq = amountReq;
        this.status = status;
    }

    public String getCompensationReason() {
        return CompensationReason;
    }

    public void setCompensationReason(String CompensationReason) {
        this.CompensationReason = CompensationReason;
    }

    public int getAmountReq() {
        return amountReq;
    }

    public void setAmountReq(int amountReq) {
        this.amountReq = amountReq;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    @Override
    public String toString() {
        return "Requesting for Compensation\b" + 
                "\n Compensation Reason - " + CompensationReason + 
                "\n Amount that needed to be paid :" + amountReq + ""
                + "\n status " + status ;
    }
    
    
}
>>>>>>> origin/simulating_operations_of_chain_cleaning_service_provider
