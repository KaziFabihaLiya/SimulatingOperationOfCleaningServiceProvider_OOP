/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Meraj_Ahmed__2221557;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author ahmed
 */
public abstract class User implements Serializable {
    protected String name, gender, email, userType,password;
    protected LocalDate dateOfBirth ;
    protected long contact;
    protected final String laundryname = "Laundry Cheese";

    public User(String name, String gender, String email, String userType, String password, LocalDate dateOfBirth, long contact) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.userType = userType;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.contact = contact;
    }
    

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", gender=" + gender + ", email=" + email + ", userType=" + userType + ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", contact=" + contact + '}';
    }


}
