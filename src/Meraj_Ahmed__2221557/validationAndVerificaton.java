/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Meraj_Ahmed__2221557;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ahmed
 */
public final class validationAndVerificaton {
    public static boolean isValidEmail(String email){
        String emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    public static boolean isValidPassword(String password){
        String pass = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        Pattern pattern = Pattern.compile(pass);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
        public static boolean isValidBirthDate(LocalDate dob){
        LocalDate today =   LocalDate.now();
        int period =  Period.between(dob, today).getYears();

        if ( period >= 12 ) return true;
        return false;
    
        }  
}
