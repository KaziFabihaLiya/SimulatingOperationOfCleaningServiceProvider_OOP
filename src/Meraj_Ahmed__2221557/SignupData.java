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
public class SignupData implements Serializable {
    private long Contact;
    private String name,email,selectUser,password;
    private LocalDate DateofBirth;

    public SignupData(long Contact, String name, String email, String selectUser, String password, LocalDate DateofBirth) {
        this.Contact = Contact;
        this.name = name;
        this.email = email;
        this.selectUser = selectUser;
        this.password = password;
        this.DateofBirth = DateofBirth;
    }

    public long getContact() {
        return Contact;
    }

    public void setContact(long Contact) {
        this.Contact = Contact;
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

    public String getSelectUser() {
        return selectUser;
    }

    public void setSelectUser(String selectUser) {
        this.selectUser = selectUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(LocalDate DateofBirth) {
        this.DateofBirth = DateofBirth;
    }

    @Override
    public String toString() {
        return "SignupData{" + "Contact=" + Contact + ", name=" + name + ", email=" + email + ", selectUser=" + selectUser + ", password=" + password + ", DateofBirth=" + DateofBirth + '}';
    }

}