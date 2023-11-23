/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Meraj_Ahmed__2221557;

import Meraj_Ahmed__2221557.HR_Manager.trainingModelClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author ahmed
 */
public class ReadWrite {

    public static <T> Boolean writeObjectToFile(String fileName, T instance) {
        ObjectOutputStream oos = null;
        FileOutputStream fos = null;
        File f = null;
        try {
            f = new File(fileName);
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            try {
                oos.writeObject(instance);
                oos.close();
                return true;
            } catch (IOException ex) {
                GenerateAlerts.unsuccessfulAlert("Error while writing the File." + "\n"
                        + "Please Check your Storage Efficiency, File type and name.");
            }
        } catch (Exception e) {
            GenerateAlerts.unsuccessfulAlert("Data is Vulnerable." + "\n" + "Please try again rechecking your data"
                    + "If you can't solve the issue. Contact Software maintainer.");
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                GenerateAlerts.unsuccessfulAlert("Error while closing the Binary File.");
                return false;
            }
        }
        return false;

    }

    public static <T> ObservableList<?> readObjectToFile(String fileName, T instance) throws FileNotFoundException, IOException {
        File f = null;
        FileInputStream fw = null;
        ObjectInputStream ois = null;
        ObservableList<SignupData> SData = FXCollections.observableArrayList();
        ObservableList<trainingModelClass> tmcData = FXCollections.observableArrayList();
        try {
            if (instance instanceof SignupData) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        SData.add((SignupData) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Meraj signup exe");
                }
                //  System.out.println("Meraj");               
            }
            else if (instance instanceof trainingModelClass) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        tmcData.add((trainingModelClass) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Meraj trainingwork exe");
                }
                //  System.out.println("Meraj");               
            }
        }
            catch(Exception e){
            System.out.println("Meraj False");
        }
            finally{
            try {
                if ( ois != null ){
                    ois.close();
                }
            }
            catch(IOException ex){
                
            }
        }
        if ( instance instanceof trainingModelClass ) return tmcData;
        //else if
        return SData;
    }
}
        
