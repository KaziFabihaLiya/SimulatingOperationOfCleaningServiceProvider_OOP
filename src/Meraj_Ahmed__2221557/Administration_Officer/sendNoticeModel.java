/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Meraj_Ahmed__2221557.Administration_Officer;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;


public class sendNoticeModel  implements Serializable{
   private String noticeName,noticeSubject;
   private LocalDate noticeDate;
   private ArrayList<String> noticeDescription;

    public sendNoticeModel(String noticeName, String noticeSubject, LocalDate noticeDate, ArrayList<String> noticeDescription) {
        this.noticeName = noticeName;
        this.noticeSubject = noticeSubject;
        this.noticeDate = noticeDate;
        this.noticeDescription = noticeDescription;
    }

    public String getNoticeName() {
        return noticeName;
    }

    public String getNoticeSubject() {
        return noticeSubject;
    }

    public LocalDate getNoticeDate() {
        return noticeDate;
    }

    public ArrayList<String> getNoticeDescription() {
        return noticeDescription;
    }
   
}
