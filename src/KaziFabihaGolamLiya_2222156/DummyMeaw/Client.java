/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.DummyMeaw;

import Meraj_Ahmed__2221557.Employee;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author kazif
 */
public class Client extends Employee implements Serializable {
    String washType;

    public Client(String washType, int employeeCode, String department, String address, LocalDate dateOfJoining, String name, String gender, String email, String userType, String password, LocalDate dateOfBirth, long contact) {
        super(employeeCode, department, address, dateOfJoining, name, gender, email, userType, password, dateOfBirth, contact);
        this.washType = washType;
    }
    
}
