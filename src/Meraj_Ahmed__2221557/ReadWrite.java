/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Meraj_Ahmed__2221557;

import KaziFabihaGolamLiya_2222156.DummyMeaw.Request;
import Meraj_Ahmed__2221557.Administration_Officer.bestEmployeeModel;
import Meraj_Ahmed__2221557.Administration_Officer.developementModel;
import Meraj_Ahmed__2221557.Administration_Officer.monthlyMaintenanceModel;
import Meraj_Ahmed__2221557.Administration_Officer.qualityModel;
import Meraj_Ahmed__2221557.Administration_Officer.sendNoticeModel;
import Meraj_Ahmed__2221557.HR_Manager.HRLeaveModel;
import Meraj_Ahmed__2221557.HR_Manager.jobRecruitModel;
import Meraj_Ahmed__2221557.HR_Manager.timeAttendanceModel;
import Meraj_Ahmed__2221557.HR_Manager.timePerformanceModel;
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
        ObservableList<sendNoticeModel> noticeData = FXCollections.observableArrayList();
        ObservableList<HRLeaveModel> leaveData = FXCollections.observableArrayList();
        ObservableList<timePerformanceModel> performanceData = FXCollections.observableArrayList();
        ObservableList<timeAttendanceModel> AttendanceData = FXCollections.observableArrayList();
        ObservableList<bestEmployeeModel> bestempData = FXCollections.observableArrayList();
        ObservableList<developementModel> devplanData = FXCollections.observableArrayList();
        ObservableList<monthlyMaintenanceModel> monthlymaintainData = FXCollections.observableArrayList();
        ObservableList<qualityModel> qualityData = FXCollections.observableArrayList();
        ObservableList<jobRecruitModel> recruitData = FXCollections.observableArrayList();
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Meraj_Ahmed__2221557;

import KaziFabihaGolamLiya_2222156.DummyMeaw.Request;
import Meraj_Ahmed__2221557.Administration_Officer.bestEmployeeModel;
import Meraj_Ahmed__2221557.Administration_Officer.developementModel;
import Meraj_Ahmed__2221557.Administration_Officer.monthlyMaintenanceModel;
import Meraj_Ahmed__2221557.Administration_Officer.qualityModel;
import Meraj_Ahmed__2221557.Administration_Officer.sendNoticeModel;
import Meraj_Ahmed__2221557.HR_Manager.HRLeaveModel;
import Meraj_Ahmed__2221557.HR_Manager.jobRecruitModel;
import Meraj_Ahmed__2221557.HR_Manager.timeAttendanceModel;
import Meraj_Ahmed__2221557.HR_Manager.timePerformanceModel;
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
        ObservableList<sendNoticeModel> noticeData = FXCollections.observableArrayList();
        ObservableList<HRLeaveModel> leaveData = FXCollections.observableArrayList();
        ObservableList<timePerformanceModel> performanceData = FXCollections.observableArrayList();
        ObservableList<timeAttendanceModel> AttendanceData = FXCollections.observableArrayList();
        ObservableList<bestEmployeeModel> bestempData = FXCollections.observableArrayList();
        ObservableList<developementModel> devplanData = FXCollections.observableArrayList();
        ObservableList<monthlyMaintenanceModel> monthlymaintainData = FXCollections.observableArrayList();
        ObservableList<qualityModel> qualityData = FXCollections.observableArrayList();
        ObservableList<jobRecruitModel> recruitData = FXCollections.observableArrayList();

        ObservableList<Employee> empInfoData = FXCollections.observableArrayList();
=======


