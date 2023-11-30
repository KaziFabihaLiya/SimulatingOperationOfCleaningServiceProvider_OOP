/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Meraj_Ahmed__2221557;

import KaziFabihaGolamLiya_2222156.AccountOfficer.TransactionModelClass;
import KaziFabihaGolamLiya_2222156.DummyMeaw.Client;
import KaziFabihaGolamLiya_2222156.DummyMeaw.Request;
import KaziFabihaGolamLiya_2222156.cleaningCrewMember.Cleaner;
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
        ObservableList<Employee> employeeinfoData = FXCollections.observableArrayList();
        ObservableList<TransactionModelClass> transactionData = FXCollections.observableArrayList();
        ObservableList<Request> reqData = FXCollections.observableArrayList();
        ObservableList<Client> orderData = FXCollections.observableArrayList();
        ObservableList<Cleaner> taskSubmissionData = FXCollections.observableArrayList();

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
            else if (instance instanceof sendNoticeModel) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        noticeData.add((sendNoticeModel) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Meraj Send Notice exe");
                }
                //  System.out.println("Meraj");               
            }
            else if (instance instanceof HRLeaveModel) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        leaveData.add((HRLeaveModel) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Meraj Leave exe");
                }
                //  System.out.println("Meraj");               
            }
                        else if (instance instanceof timePerformanceModel) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        performanceData.add((timePerformanceModel) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Meraj Performance exe");
                }
                //  System.out.println("Meraj");               
            }
            else if (instance instanceof timeAttendanceModel) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        AttendanceData.add((timeAttendanceModel) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Meraj Attendance exe");
                }
                //  System.out.println("Meraj");               
            }   
            else if (instance instanceof bestEmployeeModel) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        bestempData.add((bestEmployeeModel) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Meraj Attendance exe");
                }
                //  System.out.println("Meraj");               
            }
            else if (instance instanceof developementModel) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        devplanData.add((developementModel) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Meraj devplan exe");
                }
                //  System.out.println("Meraj");               
            }   
            else if (instance instanceof monthlyMaintenanceModel) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        monthlymaintainData.add((monthlyMaintenanceModel) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Meraj maintennace exe");
                }
                //  System.out.println("Meraj");               
            }
            else if (instance instanceof qualityModel) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        qualityData.add((qualityModel) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Meraj quality exe");
                }
                //  System.out.println("Meraj");               
            }
            else if (instance instanceof jobRecruitModel) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        recruitData.add((jobRecruitModel) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Meraj recruit exe");
                }
                //  System.out.println("Meraj");               
            }
            else if (instance instanceof Employee) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        employeeinfoData.add((Employee) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Meraj employeeinfo exe");
                }
                //  System.out.println("Meraj");               
            }
            else if (instance instanceof TransactionModelClass) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        transactionData.add((TransactionModelClass) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Leah Transaction exe");
                }
                //  System.out.println("Meraj");               
            }
            else if (instance instanceof Request) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        reqData.add((Request) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Leah Compensation Request exe");
                }
                //  System.out.println("Meraj");               
            }
            else if (instance instanceof Client) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        orderData.add((Client) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Leah Order Request exe");
                }
                //  System.out.println("Meraj");               
            }
            else if (instance instanceof Cleaner) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        taskSubmissionData.add((Cleaner) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Leah Submit Order Request exe");
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
        else if ( instance instanceof sendNoticeModel ) return noticeData;
        else if ( instance instanceof HRLeaveModel ) return leaveData;
        else if ( instance instanceof timePerformanceModel ) return performanceData;
        else if ( instance instanceof timeAttendanceModel ) return AttendanceData;
        else if ( instance instanceof bestEmployeeModel ) return bestempData;
        else if ( instance instanceof developementModel ) return devplanData;
        else if ( instance instanceof monthlyMaintenanceModel ) return monthlymaintainData;
        else if ( instance instanceof qualityModel ) return qualityData;
        else if ( instance instanceof jobRecruitModel ) return recruitData;
        else if ( instance instanceof Employee ) return employeeinfoData;
        else if ( instance instanceof TransactionModelClass ) return transactionData;
        else if ( instance instanceof Request ) return reqData;
        else if ( instance instanceof Client ) return orderData;
        else if ( instance instanceof Cleaner ) return taskSubmissionData;
        
        return SData;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static <T> Boolean overWriteObjectToFile(String fileName, T instance){
        ObjectOutputStream oos = null;
        FileOutputStream fos = null;
        File f = null;
        try{
            f = new File(fileName);
            if (f.exists() ){
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            try {
                oos.writeObject(instance);
                oos.close();
                return true;
            }
            catch(IOException ex){
                GenerateAlerts.unsuccessfulAlert("Error while writing the File." + "\n" +
                                                "Please Check your Storage Efficiency, File type and name.");
            }
        }
        catch (Exception e){
            GenerateAlerts.unsuccessfulAlert("Data is Vulnerable." + "\n" + "Please try again rechecking your data" + 
                                                "If you can't solve the issue. Contact Software maintainer.");
        }
        finally {
            try{
                if ( oos != null){
                    oos.close();
                }
            }
            catch (IOException ex){
                GenerateAlerts.unsuccessfulAlert("Error while closing the Binary File.");
                return false;
            }
        } 
        return false;
        
    }
}
        
