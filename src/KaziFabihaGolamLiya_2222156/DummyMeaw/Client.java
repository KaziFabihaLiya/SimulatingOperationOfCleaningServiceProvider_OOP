/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.DummyMeaw;

import Meraj_Ahmed__2221557.User
        ;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author kazif
 */
public class Client extends User implements Serializable {
    String washType;

    LocalDate OrderPlacingDate;

    public Client(String washType, LocalDate OrderPlacingDate, String name, String gender, String email, String userType, String password, LocalDate dateOfBirth, long contact) {
        super(name, gender, email, userType, password, dateOfBirth, contact);
        this.washType = washType;
        this.OrderPlacingDate = OrderPlacingDate;
    }



    public String getWashType() {
        return washType;
    }

    public void setWashType(String washType) {
        this.washType = washType;
    }

    public LocalDate getOrderPlacingDate() {
        return OrderPlacingDate;
    }

    public void setOrderPlacingDate(LocalDate OrderPlacingDate) {
        this.OrderPlacingDate = OrderPlacingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Client{" + "washType=" + washType + ", OrderPlacingDate=" + OrderPlacingDate + '}';
    }
    
    
    
    
}
