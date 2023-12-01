/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.DummyMeaw;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author kazif
 */
public class Task implements Serializable {
    String clientName, email, washType;
    int Contact;
    LocalDate orderDate;

    public Task(String clientName, String email, String washType, int Contact, LocalDate orderDate) {
        this.clientName = clientName;
        this.email = email;
        this.washType = washType;
        this.Contact = Contact;
        this.orderDate = orderDate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWashType() {
        return washType;
    }

    public void setWashType(String washType) {
        this.washType = washType;
    }

    public int getContact() {
        return Contact;
    }

    public void setContact(int Contact) {
        this.Contact = Contact;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    
    
}
