/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Meraj_Ahmed__2221557.Administration_Officer;

import Meraj_Ahmed__2221557.GenerateAlerts;
import Meraj_Ahmed__2221557.ReadWrite;
import java.io.IOException;
import java.io.Serializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;



public class AdministrationOfficer implements Serializable {
    
    public static void sendTheNotice(sendNoticeModel notice){
        ReadWrite.writeObjectToFile("LCNotice.bin", notice);
        
        GenerateAlerts.successfulAlert("Notice has been published.");
    }
    
    public static ObservableList<sendNoticeModel> deleteNotice(sendNoticeModel deleteNotice) throws IOException{
        ObservableList<sendNoticeModel> noticeList = (ObservableList<sendNoticeModel>) ReadWrite.readObjectToFile("LCNotice.bin", deleteNotice);
        
        ObservableList<sendNoticeModel> updateNoticeList = FXCollections.observableArrayList();
        
        for ( sendNoticeModel noticeData1 : noticeList  ){
            if ( noticeData1.getNoticeName().equals(deleteNotice.getNoticeName()) && noticeData1.getNoticeSubject().equals(deleteNotice.getNoticeSubject()) ) continue;
            else updateNoticeList.add(noticeData1);
        }
        
        for ( int i = 0; i < updateNoticeList.size(); ++i ){
            if ( i == 0 ) ReadWrite.overWriteObjectToFile("LCNotice.bin", updateNoticeList.get(i));
            else ReadWrite.writeObjectToFile("LCNotice.bin", updateNoticeList.get(i));
        }
        GenerateAlerts.successfulAlert("Deletion has been successful.");
        return updateNoticeList;
    }
    
}
